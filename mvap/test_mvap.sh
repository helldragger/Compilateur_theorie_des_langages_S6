grun mvaptp start input > program.mvap
java -cp .:/usr/local/java/antlr-4.4-complete.jar:MVaP.jar MVaPAssembler program.mvap
java -jar MVaP.jar -d program.mvap.cbap