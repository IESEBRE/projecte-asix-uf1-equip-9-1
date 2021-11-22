package UF1.Projecte;

import java.util.Scanner;

public class Simulador {

    public static void main(String[] args) {

            boolean finish = false;
            do {
                Scanner scanner = new Scanner(System.in);
                // Escollir amb qui volem conversar
                System.out.println("Amb qui vols conversar?");
                System.out.println(" - Persona");
                System.out.println(" - Animal");
                System.out.println(" - Extraterrestre");
                System.out.println(" - Ialexia");
                System.out.print("Opció: ");
                switch (scanner.nextLine()) {
                    case "Persona":
                        Person person = new Person();
                        finish = person.talking();
                        break;
                    case "Animal":
                        Animal animal = new Animal();
                        finish = animal.talking();
                        break;
                    case "Extraterrestre":
                        Alien extraterrestre = new Alien();
                        finish = extraterrestre.talking();
                        break;
                    case "Ialexia":
                        Ialexia ialexia = new Ialexia();
                        finish = ialexia.talking();
                        break;
                }
            } while (!finish);

        }
    }

