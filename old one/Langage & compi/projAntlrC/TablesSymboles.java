import java.util.*;

/**
 * Tables des symboles :
 *     _ Une table pour les variables globales; et,
 *     _ une pour les variables locales.
 *
 *     Chaque table donne pour chaque variable sa position, donc son adresse dans la pile.
 *     On recherche d'abord en local, si defini. Comme on manipule des variables typees, on stocke egalement le type.
 *     On utlise ici des tables de hachage stockant des objets AdresseType.
 *
 * Pour autoriser un fonction et une variable de maªme nom, on ajoute aussi :
 *     _ Une Table des etiquettes des fonctions.
 *
 * Note : une pile de tables pourrait aªtre necessaire,
 *        si on voulait pouvoir definir des fonctions dans des fonctions...
 */
class TablesSymboles {
    private TableSymboles _tableGlobale = new TableSymboles();
    private TableSymboles _tableLocale = null;

    public void newTableLocale() {
        _tableLocale = new TableSymboles();
    }
    public void dropTableLocale() {
        _tableLocale = null;
    }
    public void putVar(String s, String t) {
        if (_tableLocale != null)
            _tableLocale.putVar(s,t);
        else
            _tableGlobale.putVar(s,t);
    }
    /**
     * Les adresses des variables locales sont comptees negativement a  partir de fp.
     * Vision de la pile:
     *                                fp
     *                                \/
     *     ...  rr  p1  p2  ... pcr  fp(-1)
     *
     * oa¹ rr est la place pour la valeur retournee par la fonction (eventuellement)
     * et :
     *     p1 est la place du 1er parama¨tre
     *     p2 est la place du 2e parama¨tre
     *     ...
     *     pcr est le compteur de programme (pc) au retour
     *                (la  oa¹ il faut se brancher apra¨s sortie de la fonction)
     *     fp(-1) est la valeur du fp precedent (necessaire pour restaurer l'environnement)
     *     fp est la valeur du fp courant, la  oa¹ est stocke fp(-1)
     *
     * La distance dans la pile separant la place de la variable locale correspondant
     * au premier parama¨tre  de la place pointee par le fp courant est donc egale :
     * au nombre de parama¨tres de la fonction plus 2 (a  cause de pc et fp qui sont empiles par CALL).
     *
     * L'adresse par rapport a  fp d'une variable est toujours negative et se calcule comme :
     * son rang, moins le nombre de parama¨tres, moins 2.
     *
     * Note : on a triche ci-dessus dans l'explication pour faire comme si on avait uniquement des variables de type int qui ne prenne qu'une cellule de la pile.
     * Pour gerer les flottants (qui sont supportes "nativement" par la MVa P), il faut tenir compte des tailles des variables qui compte pour 1 ou pour 2 dans
     * le calcul
     *
     */
    private AdresseType getAdresseTypeLocale(String symbol) {
        if (_tableLocale != null) {
            System.err.println("Recherche de "+ symbol + " dans table locale: " + _tableLocale);
            AdresseType a = _tableLocale.getAdresseType(symbol);
            if (a != null) { // on a trouve
                return new AdresseType(a.adresse - (_tableLocale.getTaille() + 2), a.type);
            }
        }
        System.err.println(symbol + " pas trouve en local");
        return null;
    }

    private AdresseType getAdresseTypeGlobale(String symbol) {
        System.err.println("Recherche de "+ symbol + " dans table globale: " + _tableGlobale
                + " => @"+ _tableGlobale.getAdresseType(symbol));
        return _tableGlobale.getAdresseType(symbol);
    }


    /** donne l'adresse de la variable locale a  une fonction (negative) ou globale (positive) */
    public AdresseType getAdresseType(String symbol) {
        AdresseType a = getAdresseTypeLocale(symbol);
        if (a == null)
            a = getAdresseTypeGlobale(symbol);
        if (a != null)
            return a;

        System.err.println("## Erreur : la variable \"" + symbol + "\" n'existe pas");
        return null; // n'importe quoi, et l'adresse nâ€™existe pas!
    }

    private HashMap<String, AdresseType> _tableFonctions = new HashMap<String, AdresseType>();

    public AdresseType getFonction(String fonction) {
        AdresseType l = _tableFonctions.get(fonction);
        if (l != null)
            return l;
        System.err.println("Appel a  une fonction non definie \""+fonction+"\"");
        return null;
    }

    public boolean nouvelleFonction(String fonction, int label, String t) {
        AdresseType fat = _tableFonctions.get(fonction);
        if ( fat!= null ) {
            System.err.println("Fonction \""+ fonction + "\" deja  definie avec type de retour \"" + fat.type +"\".");
            return false;
        }
        _tableFonctions.put(fonction, new AdresseType(label,t));
        return true;
    }
}
