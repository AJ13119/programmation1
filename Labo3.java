public class ConversionSecondes {

    public static void main(String[] args) {

        //Constantes
        final int SEC_DANS_MINUTE = 60;
        final int SEC_DANS_HEURE = 3600;
        final int SEC_DANS_JOUR = 86400;
        final String NBR_SECONDE = "Entrer un nombre de "
                + "seconde: ";
        final String MSG_SECONDE_MIN = "Entrer un nombre de "
                + "seconde plus grand ou egale a 0";
        final String MSG_FIN = "Fin normale du programme";

        //variable
        int seconde = 0;


        //Decrire system
        System.out.println("Ce programme est concu pour tranformer"
                + " un nombre en senconde");

        //Avoir le nombre de seconde
        System.out.print(NBR_SECONDE);
        seconde = Clavier.lireInt();

        //Commencer le while loop
        while (seconde != 0) {

            if (seconde > 0) {
                int minute = 0;
                int heure = 0;
                int jour = 0;
                if (seconde < SEC_DANS_MINUTE) {
                    seconde = seconde;
                } else if (SEC_DANS_MINUTE <= seconde && seconde < SEC_DANS_HEURE) {
                    minute = seconde / SEC_DANS_MINUTE;
                    seconde = seconde % SEC_DANS_MINUTE;
                } else if (SEC_DANS_HEURE <= seconde & seconde < SEC_DANS_JOUR) {
                    heure = seconde / SEC_DANS_HEURE;
                    minute = (seconde - heure * SEC_DANS_HEURE) / SEC_DANS_MINUTE;
                    seconde = (seconde - heure * SEC_DANS_HEURE - minute * SEC_DANS_MINUTE) % SEC_DANS_MINUTE;
                } else {
                    jour = seconde / SEC_DANS_JOUR;
                    heure = (seconde - jour * SEC_DANS_JOUR) / SEC_DANS_HEURE;
                    minute = (seconde - jour * SEC_DANS_JOUR - heure * SEC_DANS_HEURE) / SEC_DANS_MINUTE;
                    seconde = (seconde - jour * SEC_DANS_JOUR - heure * SEC_DANS_HEURE - minute * SEC_DANS_MINUTE) % SEC_DANS_MINUTE;
                }


                System.out.print(jour + ", " + heure + ", " + minute + ", " + seconde + "\n");
                System.out.print(NBR_SECONDE);
                seconde = Clavier.lireInt();

            } else {
                System.out.print(MSG_SECONDE_MIN + "\n");
                System.out.print(NBR_SECONDE);
                seconde = Clavier.lireInt();

            }

        }
        System.out.println(MSG_FIN);

    }

}
