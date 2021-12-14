package UF1.Projecte;

import java.util.Scanner;

public class Simulador {

    public static boolean joel =false;
    public static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
       // Scanner ent = new Scanner(System.in);
        int index, joe, casella=0;
        boolean fi=false;
        String conver[];
        boolean finish = false, personatge=false;
        String personConver="";

        System.out.print("Introduix un numero (0/0¹) : ");

        joe=Integer.parseInt(ent.nextLine());
        if (joe==0){
            System.out.println("joel");
//            Person person = new Person();
//            fi = person.joel();
        }else {
        System.out.print("En quants vols conversar <0: ");
        index=Integer.parseInt(ent.nextLine());
        conver=new String[index];

            do {
//                Scanner scan = new Scanner(System.in);
                // Escollir amb qui volem conversar
                System.out.println("Trieu una opció");
                System.out.println("1 - Conversar");
                System.out.println("2 - Mostrar conversa");
                System.out.println("3 - Sortir del programa");
                System.out.print("Opció: ");
                Person person = new Person();
                int opcio=0;
                switch (opcio= Integer.parseInt(ent.nextLine())) {
                    case 1:
                        do {
//                            Scanner scanner = new Scanner(System.in);
                            // Escollir amb qui volem conversar
                            System.out.println("Amb qui vols conversar?");
                            System.out.println(" - Persona");
                            System.out.println(" - Animal");
                            System.out.println(" - Extraterrestre");
                            System.out.println(" - Ialexia");
                            System.out.print("Opció: ");

                            switch (ent.nextLine()) {
                                case "Persona":
                                   personConver=person.talking();
                                    personatge=true;
                                    break;
                                case "Animal":
                                    Animal animal = new Animal();
                                    break;
                                case "Extraterrestre":
                                    Alien extraterrestre = new Alien();
                                    break;
                                case "Ialexia":
                                    Ialexia ialexia = new Ialexia();
                                    finish = ialexia.talking();
                                    break;
                            }
                        } while (!personatge);
                        break;
                    case 2:
                        System.out.println("Introduix quina conversació vols veure");
                        casella=Integer.parseInt(ent.nextLine());
                        conver[casella]=personConver;
                        System.out.println(conver[0]);
                        break;
                    case 3:
                        System.out.println("Adéu!!");
                        finish=true;
                        break;
                }
                }while (!finish) ;

            }
        }
    }

