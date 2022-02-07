package UF1.Projecte;

import javax.swing.*;
import java.util.Scanner;

public class Ialexia {

    // Constructor
    void Person() {
    }

    boolean talking() {
        System.out.println("Hola, soc Ialexia!\n");
        boolean finish = false;

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int z = 0;
        String nomI = "";
        String joc1 = "";
        String joc2 = "";
        String joc3 = "";
        String secreta = "";
        do {
            Scanner scanner = new Scanner(System.in);
            // Questionari
            System.out.println("Qüestionari");
            System.out.println(" 1. Quin tipus d’IA ets?");
            System.out.println(" 2. De que t'agrada parlar");
            System.out.println(" 3. Quin és el teu número favorit entre 0 i ...?");
            System.out.println(" 4. Sabries llistar tots els numeros enters parells e imparells d'un numero?");
            System.out.println(" 5. Voldria jugua al joc, El penjat");
            System.out.println(" 6. Posa-li un nom!");
            System.out.println(" 7. Pots recorda-me la nostra conversa?");
            System.out.println(" 8. Sortir de l’aplicació");
            System.out.print("Opció: ");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Introduex un numero del 1 al 3");
                    num1 = scanner.nextInt();

                    if (num1 == 1) {
                        System.out.println("Pau ");


                    } else {
                        if (num1 == 2) {
                            System.out.println("Guerra ");
                        } else {
                            if (num1 == 3) {
                                System.out.println("Estudi");
                            }
                        }
                    }


                    break;


                case 2:

                    System.out.println("Selecciona un tema del 1 al 10");
                    System.out.println("1. Matemàtiques");
                    System.out.println("2. Flora i fauna");
                    System.out.println("3. Matrius");
                    System.out.println("4. Llenguatge de programació");
                    System.out.println("5. Interacció social");
                    System.out.println("6. L'antic Egipte");
                    System.out.println("7. Llengües del món");
                    System.out.println("8. Medicina legal i forense");
                    System.out.println("9. Geografia");
                    System.out.println("10. Música\n");
                    System.out.print("Opcio");

                    num2 = scanner.nextInt();
                    switch (num2) {
                        case 1:
                            System.out.println("És freqüent trobar qui descriu la matemàtica com una simple extensió dels llenguatges naturals humans,\n" +
                                    " que utilitza una gramàtica i un vocabulari definits amb extrema precisió,\n" +
                                    " el propòsit de la qual és la descripció i exploració de relacions conceptuals i físiques. ");
                            break;
                        case 2:
                            System.out.println("Com a resum, podem dir que la flora és el conjunt d'espècies vegetals que trobem\n" +
                                    " en un lloc concret en un moment concret, mentre que la fauna és el conjunt d'animals\n" +
                                    " que trobem en un lloc concret en un temps específic.");
                            break;
                        case 3:
                            System.out.println("una matriu és una taula rectangular de nombres o, més generalment,\n" +
                                    " d'elements d'una estructura algebraica de forma d'anell. En aquest article,\n" +
                                    " els valors per les matrius són reals o complexos a menys que es digui el contrari.");
                            break;
                        case 4:
                            System.out.println("Un llenguatge de programació és un llenguatge informàtic utilitzat per\n" +
                                    " controlar el comportament d'una màquina, normalment un ordinador. Cada llenguatge\n" +
                                    " té una sèrie de regles sintàctiques i semàntiques estrictes que cal seguir per escriure\n" +
                                    " un programa informàtic, i que en descriuen l'estructura i el significat respectivament.");
                            break;
                        case 5:
                            System.out.println("Concepte articulador entre els àmbits d'anàlisi psicològica i sociològica.\n" +
                                    " Des d'un punt de vista psicosocial, al·ludeix a la relació mútua i intrínseca que es dóna\n" +
                                    " entre el vessant sociològic i el psicològic, entre el que és social i individual, entre l'àmbit\n" +
                                    " objectiu i el subjectiu. És a dir, es parteix de la idea que l'ésser humà és el producte de les\n" +
                                    " seves relacions amb els altres, però també, i en gran mesura, és el creador d'aquestes relaciones.");

                            break;
                        case 6:
                            System.out.println("L'antic Egipte va créixer i es va desenvolupar a les valls del Nil. Cada any inundava\n" +
                                    " 200 o 300 metres per banda. L'avantatge de la inundació era que l'aigua portava un llim negre.\n" +
                                    " Aquest llim fertilitzava la terra cada any i els egipcis es dedicaven a treballar per al faraó\n" +
                                    " durant el temps que no podien conrear. ");
                            break;
                        case 7:
                            System.out.println("El llenguatge és una capacitat de base biològica lligada exclusivament a l’espècie humana.\n" +
                                    " Per això totes les persones “saben” parlar, tenen una llengua que\n" +
                                    "els facilita l’emissió d’informació i la comprensió de les dades emeses pels\n" +
                                    " altres éssers de la mateixa comunitat lingüística.");
                            break;
                        case 8:
                            System.out.println("La Medicina legal i forense és l'especialitat que engloba tota activitat mèdica relacionada\n" +
                                    " amb el poder judicial. Aquesta s'encarrega de la investigació penal i d'altres branques del dret\n" +
                                    " en els seus aspectes mèdics, de la valoració legal dels lesionats físics i dels malalts mentals i discapacitats,\n" +
                                    " i de l'assessorament a jutges, tribunals i fiscals en qüestions mèdiques.");
                            break;

                        case 9:
                            System.out.println("La geografia és la ciència que té per objecte l'estudi de la superfície del planeta Terra,\n" +
                                    " o de qualsevol altre astre, i la distribució espacial i les relacions recíproques dels fenòmens físics,\n" +
                                    " biològics i socials que en ella es manifesten.");
                            break;

                        case 10:
                            System.out.println("La música és l'art que mitjançant l'ordenació dels sons en el temps,\n" +
                                    " produeix un efecte estètic i/o emotiu en l'oient. S'expressa mitjançant la combinació\n" +
                                    " de sons, tenint com a elements constitutius la melodia, l'harmonia, el ritme i el timbre.\n" +
                                    " Es manifesta en l'organització dels sons i els silencis en el temps. ");
                            break;
                    }


                    break;

                case 3:


                    num3 = 0;


                    do {

                        System.out.println("Selecciona un numero del 1 al 10");
                        num3 = scanner.nextInt();


                        if (num3 == 8) {
                            System.out.println("Henorabona es el meu numero favorit ");
                        } else System.out.println("Ho sento, no és el meu número favorit. Tornaho a intentar ");


                    } while (num3 != 8);

                    break;
                case 4:

                    Scanner qua = new Scanner(System.in);
                    z = 0;


                    System.out.println("És clar que sí!! \nSelecciona un numero del 1 al 10");
                    z = qua.nextInt();
                    for (int i = 1; i < z; i++) {
                        if (i % 2 == 0) {
                            System.out.println("El número" + i + " es par");
                        } else {
                            System.out.println("el numero" + i + " es impar");
                        }
                    }


                    break;
                case 5:
                    int intents=0;

                    String paraula3;

                    secreta= JOptionPane.showInputDialog("Introdueix la paraula secreta");
                    do{
                        paraula3 =JOptionPane.showInputDialog("Intenta averiguar la paraula, intent: "+(intents+1));

                    } while (!paraula3.equalsIgnoreCase(secreta) && ++intents<3);
                    if (intents==3){
                        JOptionPane.showMessageDialog(null, "Ho sento, la paraula secreta era: "+secreta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Enhorabona!!");
                    }


                    break;
                case 6:
                    Scanner nom = new Scanner(System.in);


                    System.out.println("Vaig a posarte un nom\nVaiga posarte...");
                    nomI = nom.nextLine();

                    System.out.println("El teu nom sera, " + nomI + ", espero que tagradi ");


                    break;
                case 7:

                    System.out.println("Soc una IA " + num1 + ". M'agrada parlar de " + num2 +
                            ", el meu número favorit és " + num3 + ", Els numero parells i imparells són " + z +
                            ", En el jos as " + secreta + "\n El teu nom és " + nomI + ".");


                    break;
                case 8:
                    System.out.println("Estas segur que vols surtir?");
                    scanner = new Scanner(System.in);
                    String surtir = scanner.nextLine();
                    if (surtir.equals("SI")) {
                        return true;
                    }
                    if (surtir.equals("NO")) {
                        break;
                    }


                    break;
            }
        }
        while (!finish);


        return true;
    }
}

