package UF1.Projecte;

import java.util.Objects;
import java.util.Scanner;

public class Simulador {

    public static boolean joel =false;
    public static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
       // Scanner ent = new Scanner(System.in);
        //mirar index de array per la conversa
        int index, joe, casella=0;
        boolean fi=false;
        String conver[];
        boolean finish = false, personatge=false;
        String personConver="";

        joel=Integer.parseInt(ent.nextLine())==0;

        if(!joel)System.out.print("En quants vols conversar <0: ");
        index=Integer.parseInt(ent.nextLine());
        conver=new String[index];
        int i=0;
            do {
                // Escollir amb qui volem conversar
                if(!joel){
                    System.out.println("Trieu una opció");
                    System.out.println("1 - Conversar");
                    System.out.println("2 - Mostrar conversa");
                    System.out.println("3 - Sortir del programa");

                }
                Person person = new Person();
                int opcio;
                do {
                    if(!joel)System.out.print("Opció: ");
                    opcio= Integer.parseInt(ent.nextLine());
                    if(!joel){
                        if (opcio<1 |opcio>3)System.out.println("Opcio incorrecta. Torna-ho a intentar!!");
                    }
                }while(opcio<1 |opcio>3);

                switch (opcio) {
                    case 1:
                        if (i == conver.length){
                            if(!joel) System.out.println("No pots fer mes converses!!");
                            continue;
                        }else {
                            do {
                                // Escollir amb qui volem conversar
                                if (!joel) {
                                    System.out.println("Amb qui vols conversar?");
                                    System.out.println(" - Persona");
                                    System.out.println(" - Animal");
                                    System.out.println(" - Extraterrestre");
                                    System.out.println(" - Ialexia");
                                    System.out.print("Opció: ");
                                }
                                String ente;
                                ente=ent.nextLine();
                                switch (ente) {
                                    case "Persona":
                                        personConver = person.talking();
                                        conver[i] = personConver;
                                        personatge = true;
                                        break;
                                    case "Animal":
                                        Animal animal = new Animal();
                                        break;
                                    case "Extraterrestre":
                                        Alien extraterrestre = new Alien();
                                        break;
                                    case "Ialexia":
                                        Ialexia ialexia = new Ialexia();
                                        ialexia.talking();
                                        personatge = true;
                                        break;
                                    default:
                                        System.out.println("Ens inexistent, prova en un altre!!");
                                }
                            } while (!personatge);
                            break;
                        }
                    case 2:
                        if(conver[0]==null){
                            if(!joel)System.out.println("No hi han conversas a mostrar");
                            continue;
                        }else{
                            if(!joel)System.out.println("Introduix quina conversació vols veure");
                            casella=Integer.parseInt(ent.nextLine());
                            if (casella> conver.length){
                                System.out.println("bai");
                                continue;
                            }else{
//                                conver[casella]=personConver;
                                System.out.println(conver[casella]);
                                break;
                            }
                        }
                    case 3:
                        finish=true;
                        break;
                }
                i++;
                }while (!finish) ;

            }
        }

