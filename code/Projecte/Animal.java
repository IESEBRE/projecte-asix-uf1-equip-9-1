package UF1.Projecte;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Animal {
    //Constructor
    void Animal() {
    }

    boolean talking() {
        Boolean[] Array1 = new Boolean[8];
        for(int i = 0; i < Array1.length; i++){
            Array1[i] = false;
        }
        boolean finish = false;
        Scanner scanner = new Scanner(System.in);
        boolean finishA = false;

        char contador = 0;
        char caracter = 0;
        char animal = 0;
        char jocfavorit = 0;
        String nom="";

        do {

            //Escollir quina pregunta volem fer
            System.out.println("9. Quin tipus d'animal ets?");
            System.out.println("10. A que t'agrada jugar?");
            System.out.println("11. Quin és el teu caràcter favorit?");
            System.out.println("12. Sabries llista tots els caracters amb valor Unicode Parell i menors o iguals a Z resultants de la suma, entre el valor Unicode del primer i segon caracter, on el valor Unicode del primer creixera fins el segon, el segon decreixera fins primer?");
            System.out.println("13. Juguem a fer onomatopeies?");
            System.out.println("14. Posa-li un nom:");
            System.out.println("15. Pots recordar-me la nostra conversa?");
            System.out.println("16. Sortida de l'aplicacio");
            System.out.print("Opció: ");
            switch (scanner.nextInt()) {
                case 9:
                    if (Array1[0] != false) {
                    System.out.println("Has de seguir les opcions en orde i sense repetir. Torna a intentar-ho!");
                    break;
                }
                    scanner = new Scanner(System.in);
                    System.out.println("Defineix quin tipus d'animal ets:");
                    animal = scanner.next().charAt(0);
                    int difG = 'g' - animal;
                    int difS = 's' - animal;

                    if (difG >= -3 || animal <= 'g')
                        System.out.println("Gos");
                    else if (difS <= -3 || animal >= 's')
                        System.out.println("Serp");
                    else System.out.println("Mono");
                    Array1 [0] = true;
                    break;
                case 10:
                    if (Array1 [0] == false) {
                    System.out.println("Has de seguir les opcions en orde i sense repetir. Torna a intentar-ho!");
                    break;
                }
                    scanner = new Scanner(System.in);

                    System.out.println("Tria el teu joc favorit");


                    jocfavorit = scanner.next().charAt(0);

                    if (jocfavorit == 'A')
                        System.out.println("Escondite");
                    else if (jocfavorit == 'B')
                        System.out.println("Les bales");
                    else if (jocfavorit == 'C')
                        System.out.println("La xarranca");
                    else if (jocfavorit == 'D')
                        System.out.println("Carreres de sacs");
                    else if (jocfavorit == 'E')
                        System.out.println("El mocador");
                    else if (jocfavorit == 'F')
                        System.out.println("Estirar la corda");
                    else if (jocfavorit == 'G')
                        System.out.println("Picar cromos");
                    else if (jocfavorit == 'H')
                        System.out.println("Gallineta sega");
                    else if (jocfavorit == 'I')
                        System.out.println("Els vaixells");
                    else if (jocfavorit == 'J')
                        System.out.println("El gat i el ratoli");
                    else
                        System.out.println("Aquesta lletra no hi te cap joc assignat");
                    Array1 [1] = true;
                    break;
                case 11:
                    if (Array1 [1] != false) {
                    System.out.println("Has de seguir les opcions en orde i sense repetir. Torna a intentar-ho!");
                    break;
                }
                    scanner = new Scanner(System.in);
                System.out.println("Disme el teu caracter favorit:");
                caracter = scanner.next().chartAt(0);
                char it = 'A';
                char cou = (char) (((caracter -'A') / 2));
                char finalch= (char) (cou + 'A');

                while (it != (char) (cou + 'A')) {
                    System.out.print(it + " ");
                    ++it;
                }
                System.out.printf(String.valueOf("...He elegit el caracter " + finalch + "!"));
                Array1[2] = true;
                break;

                case 12:
                    if (Array1[2] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                        char l1, l2;
                        System.out.println("Disme una lletra entre la A i la Z");
                        Scanner sca1 = new Scanner(System.in);
                        l1 = sca1.next().charAt(0);
                        System.out.println("Disme una lletra mes gran que l'anterior");
                        Scanner sca2 = new Scanner(System.in);
                        l2 = sca2.next().charAt(0);

                    if ((((l1 - 'A') + (l2 - 'A') + 'A') % 2 == 0) && (((l1 - 'A') + (l2 - 'A') + 'A') <= 'Z')) {
                        for (int contador1 = l1; contador1 < l2; contador1++) {
                            System.out.printf((char) (contador1) + "   ");
                            for (int contador2 = l2; contador2 > contador1; contador2--) {
                                System.out.printf((char) (contador2) + "   ");
                            }
                            System.out.println();
                        }
                    } else System.out.println("Incorrecte!!");

                    Array1[3] = true;
                    break;
                case 13:
                    if (Array1 [3] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!");
                        break;
                    }
                    scanner = new Scanner(System.in);
                    Random r = new Random();
                    System.out.println("Tria un caracter per formar una onomatopeia: ");
                    int numloop = 0;


                    while (numloop != 5) {
                        char V1 = scanner.next().charAt(0);
                        System.out.println("TU:" + V1);
                        char V2 = (char) (r.nextInt(26) + 'A');
                        System.out.println("ELL: " + V2);
                        char V3 = scanner.next().charAt(0);
                        System.out.println("TU: " + V3);
                        String v123 = new StringBuilder().append(V1).append(V2).append(V3).toString();
                        char vocal = v123.charAt(1);
                        if (vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U') {
                            System.out.println("La combinació " + v123 + " es una onomatopeia");
                            ++contador;
                        }
                        else
                            System.out.println("La combinació " + v123 + " no es una onomatopeia");
                        char V4 = (char) (r.nextInt(26) + 'A');
                        System.out.println("ELL: " + V4);
                        char V5 = scanner.next().charAt(0);
                        System.out.println("TU: " + V5);
                        char V6 = (char) (r.nextInt(26) + 'A');
                        System.out.println("ELL: " + V6);
                        String v456 = new StringBuilder().append(V4).append(V5).append(V6).toString();
                        char vocal2 = v456.charAt(1);
                        if (vocal2 == 'A' || vocal2 == 'E' || vocal2 == 'I' || vocal2 == 'O' || vocal2 == 'U') {
                            System.out.println("La combinació " + v456 + " es una onomatopeia");
                            ++contador;
                        }
                        else
                            System.out.println("La combinació " + v456 + " no es una onomatopeia");
                        ++numloop;
                    }
                    System.out.println("Has format onomatopeies "+contador);
                    Array1 [4] = true;
                    break;


                case 14:
                    if (Array1 [4] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!");
                        break;
                    }
                    System.out.println("Quin nom em vols posar?");
                    scanner = new Scanner(System.in);
                    nom = scanner.nextLine();
                    System.out.println(nom + ". Gràcies, m'agrada aquest nom");
                    Array1 [5] = true;
                    break;
                case 15:
                    if (Array1[6] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                    System.out.println("Hem dic "+ nom +" i soc "+ animal +". El meu joc favorit és "+ jocfavorit +". El meu caracter favorit es el "+ caracter +" Hem jugat a onompatopeies i hem conseguit unes "+ contador +" No esta mal!");
                    Array1 [6] = true;
                    break;
                case 16:
                    if (Array1[6] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                    System.out.println("Estas segur que vols surtir?");
                    scanner = new Scanner(System.in);
                    String surtir = scanner.nextLine();
                    if (surtir.equals("SI")) {
                        return true;
                    }
                    if (surtir.equals("NO")) {
                        Array1 [7] = true;
                        break;

                    }

            }


        }
        while (!finish);

        return true;
    }
}





