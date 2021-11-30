package UF1.Projecte;

import java.util.Random;
import java.util.Scanner;

public class Animal {
    //Constructor
    void Animal() {
    }

    boolean talking() {
        boolean finish = false;
        do {
            Scanner scanner = new Scanner(System.in);
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
                    scanner = new Scanner(System.in);
                    System.out.println("Defineix quin tipus d'animal ets:");
                    char animal = scanner.next().charAt(0);
                    int difG = 'g' - animal;
                    int difS = 's' - animal;

                    if (difG >= -3 || animal <= 'g')
                        System.out.println("Gos");
                    else if (difS <= -3 || animal >= 's')
                        System.out.println("Serp");
                    else System.out.println("Mono");
                    break;
                case 10:
                    scanner = new Scanner(System.in);

                    System.out.println("Tria el teu joc favorit");


                    char jocfavorit = scanner.next().chartAt(0);

                    if (jocfavorit == 'a')
                        System.out.println("Escondite");
                    else if (jocfavorit == 'b')
                        System.out.println("Les bales");
                    else if (jocfavorit == 'c')
                        System.out.println("La xarranca");
                    else if (jocfavorit == 'd')
                        System.out.println("Carreres de sacs");
                    else if (jocfavorit == 'e')
                        System.out.println("El mocador");
                    else if (jocfavorit == 'f')
                        System.out.println("Estirar la corda");
                    else if (jocfavorit == 'g')
                        System.out.println("Picar cromos");
                    else if (jocfavorit == 'h')
                        System.out.println("Gallineta sega");
                    else if (jocfavorit == 'i')
                        System.out.println("Els vaixells");
                    else if (jocfavorit == 'j')
                        System.out.println("El gat i el ratoli");
                    else
                        System.out.println("Aquesta lletra no hi te cap joc assignat");
                    break;
                case 11:
                    scanner = new Scanner(System.in);

                    char caracter;
                    int i = 'A';


                    System.out.println("Quin es el teu caracter favorit?");
                    caracter = scanner.next().charAt(0);

                    while (caracter != i - 1) {

                        System.out.println((char) i);
                        i++;
                    }

                    break;

                case 12:
                    // En procés
                    break;

                case 13:
                    Random r = new Random();
                    scanner = new Scanner(System.in);

                    char a;
                    char b;
                    char c;

                    char d;
                    talking();
                    char e;
                    char f;
                    int n = 0;
                    int p = 0;
                    char variable1;
                    char variable2;
                    char variable3;


                    System.out.println("Juguem a fer onomatopeies?");

                    while (p != 5) {
                        a = scanner.next().charAt(0);
                        b = (char) (r.nextInt('Z' - 'A') + 'A');
                        System.out.println(b);
                        c = scanner.next().charAt(0);
                        if (b == 'A') {
                            System.out.println("Aquesta onomatopeia es valida");
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (b == 'E') {
                            System.out.println("Aquesta onomatopeia es valida");
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (b == 'I') {
                            System.out.println("Aquesta onomatopeia es valida");
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (b == 'O') {
                            System.out.println("Aquesta onomatopeia es valida");
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (b == 'U') {
                            System.out.println("Aquesta onomatopeia es valida");
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else System.out.println("Aquesta onomatopeia no es correcta");

                        d = (char) (r.nextInt('Z' - 'A') + 'A');
                        System.out.println(d);
                        e = scanner.next().charAt(0);
                        f = (char) (r.nextInt('Z' - 'A') + 'A');
                        System.out.println(d);

                        if (e == 'A') {
                            System.out.println("Aquesta onomatopeia es valida");
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (e == 'E') {
                            System.out.println("Aquesta onomatopeia es valida");
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (e == 'I') {
                            System.out.println("Aquesta onomatopeia es valida");
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (e == 'O') {
                            System.out.println("Aquesta onomatopeia es valida");
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (e == 'U') {
                            System.out.println("Aquesta onomatopeia es valida");
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else System.out.println("Aquesta onomatopeia no es correcta");

                        p++;
                    }
                    break;
                case 14:
                    scanner = new Scanner(System.in);
                    String nom = scanner.nextLine();
                    System.out.println(nom + ". Gràcies, m'agrada aquest nom");
                    break;
                case 15:
                    System.out.println("Hola soc" + nom + " i soc" + animal + ". El meu joc favorit és " + jocfavorit + " el meu caracter favorit és el" + caracter + "Hem jugat a fer onomatopeies y hem conseguit unes" + p + ", no esta mal!");
                    break;
                case 16:
                    System.out.println("Estas segur que vols surtir?");
                    scanner = new Scanner(System.in);
                    String surtir = scanner.nextLine();
                    if (surtir.equals("SI")) {
                        return true;
                    }
                    if (surtir.equals("NO")) {
                        break;
                    }


            }
            while (!finish) ;
            return finish;
        }
    }
}

