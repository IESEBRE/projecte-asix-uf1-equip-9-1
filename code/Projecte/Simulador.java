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
                }
            } while (!finish);

        do {
            Scanner scanner = new Scanner(System.in);
            // Questionari
            System.out.println("Qüestionari");
            System.out.println(" 1. Quin tipus de persona ets?");
            System.out.println(" 2. Quin esport t'agrada");
            System.out.println(" 3. Quin és el teu número favorit entre 0 i ...?");
            System.out.println(" 4. Sabries llistar tots els nombres parells resultants de la multiplicació entre el valor enter a i b, on el valor de a creixerà fins b");
            System.out.println(" 5. Juguem a pedra papaer i tisora?");
            System.out.println(" 6. Posa-li un nom!");
            System.out.println(" 7. Pots recorda-me la nostra conversa?");
            System.out.println(" 8. Sortir");
            System.out.print("Opció: ");
            switch (scanner.nextInt()) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
            }
        } while (!finish);




        }
    }

