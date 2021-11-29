package UF1.Projecte;

import java.util.Random;
import java.util.Scanner;

public class Person {
    // Constructor
    void Person (){}

    boolean talking () {
        System.out.println ("Hola, que tal!\n");
        boolean finish = false;
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
                    //qui ets
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Escriu un numero del 0 al 100: ");
                    int numero= scan.nextInt();

                    while(true) {
                        if(numero%2==0 && numero%3==0){
                            System.out.println("No binari");
                            break;
                        }
                        else{
                            if(numero%2==0) {
                                System.out.println("Home");
                                break;
                            }else{
                                if(numero%3==0) {
                                    System.out.println("Dona");
                                    break;
                                }else {
                                    if (numero<=100)numero+=2;
                                    else numero-=4;
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.print("Introduix un numero del 1 al 10: ");
                    Scanner entrada = new Scanner(System.in);
                    int num = entrada.nextInt();
                    switch (num) {
                        case 1:
                            System.out.println("Golf");
                            break;
                        case 2:
                            System.out.println("Fútbol americano");
                            break;
                        case 3:
                            System.out.println("Béisbol");
                            break;
                        case 4:
                            System.out.println("Tenis de mesa");
                            break;
                        case 5:
                            System.out.println("Voleibol");
                            break;
                        case 6:
                            System.out.println("Tenis");
                            break;
                        case 7:
                            System.out.println("Hockey sobre césped");
                            break;
                        case 8:
                            System.out.println("Baloncesto");
                            break;
                        case 9:
                            System.out.println("Cricket");
                            break;
                        case 10:
                            System.out.println("Fútbol");
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Introduix un numero màxim: ");
                    Scanner scann = new Scanner(System.in);
                    int nume = scann.nextInt();
                    int i=0;
                    String resultat="";
                    while (i<nume/2){
                        resultat+=" "+i;
                        i++;
                    }
                    System.out.println(resultat+" He triat el "+nume/2);
                    break;
                case 4:

                    break;
                case 5:
                    Scanner s = new Scanner(System.in);
                    boolean joc = false;
                    int usuari,maquina=0, jugador=0;
                    do {
                        int person = (int)(Math.random() * 3) + 1;
                        System.out.println("Tria :    \n 1.pedra\n 2.papel\n 3.tisora ");
                        System.out.print("Ya!!: ");
                        usuari= s.nextInt();
                        switch ( person )
                        {
                            case 1:
                                switch ( usuari )
                                {
                                    case 1:
                                        System.out.println(person+" vs "+ usuari );
                                        System.out.println("Empat! ningú puntua");
                                        break;
                                    case 2:
                                        System.out.println(person+" vs "+ usuari );
                                        jugador++;
                                        System.out.println("Guanyes! tens: "+jugador+" punts");
                                        System.out.println("       te: "+maquina+" punts");
                                        break;
                                    case 3:
                                        System.out.println(person+"vs"+ usuari );
                                        maquina++;
                                        System.out.println("Perds! tens: "+jugador+" punts");
                                        System.out.println("       te: "+maquina+" punts");
                                        break;
                                }
                                break;

                            case 2:

                                switch ( usuari )
                                {
                                    case 1:
                                        System.out.println(person+"vs"+ usuari );
                                        maquina++;
                                        System.out.println("Perds! tens: "+jugador+" punts");
                                        System.out.println("       te: "+maquina+" punts");
                                        break;
                                    case 2:
                                        System.out.println(person+" vs "+ usuari );
                                        System.out.println("Empat! ningú puntua");
                                        break;
                                    case 3:
                                        System.out.println(person+" vs "+ usuari );
                                        jugador++;
                                        System.out.println("Guanyes! tens: "+jugador+" punts");
                                        System.out.println("         te: "+maquina+" punts");
                                        break;
                                }
                                break;

                            case 3:
                                switch ( usuari )
                                {
                                    case 1:
                                        System.out.println(person+" vs "+ usuari );
                                        jugador++;
                                        System.out.println("Guanyes! tens: "+jugador+" punts");
                                        System.out.println("       te: "+maquina+" punts");
                                        break;
                                    case 2:
                                        System.out.println(person+"vs"+ usuari );
                                        maquina++;
                                        System.out.println("Perds! tens: "+jugador+" punts");
                                        System.out.println("       te: "+maquina+" punts");
                                        break;
                                    case 3:
                                        System.out.println(person+" vs "+ usuari );
                                        System.out.println("Empat! ningú puntua");
                                        break;
                                }
                                break;
                        }
                        if (maquina==5) {
                            System.out.println("Perds la partida!!");
                            joc=true;
                        }else{
                            if (jugador ==5){
                                System.out.println("Guanyes la partida!!");
                                joc=true;
                            }
                        }

                    }while(!joc);
                    break;
                case 6:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Escull un nom: ");
                    String nom=sc.nextLine();
                    System.out.println("Gràcies, m’agrada molt el nom de "+ nom);
                    break;
                case 7:
                    //System.out.println("Hem dic "+nom);
                    break;
                case 8:
                    Scanner ent = new Scanner(System.in);
                    System.out.print("Vols sortir? ");
                    String sortir= ent.nextLine();
                    if (sortir.equalsIgnoreCase("no")) {
                        System.out.println("seguim conversant");
                    }else {
                        if (sortir.equalsIgnoreCase("si"))
                            System.out.println("adéu!!");
                        finish=true;
                    }
                    break;
            }
        } while (!finish);

        return true;
    }
}