package UF1.Projecte;

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
                    qui();
                    break;
                case 2:
                    esport();
                    break;
                case 3:
                    numero();
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
                    System.out.println("Adéu!!");
                    finish=true;
                    break;
            }
        } while (!finish);

        return true;
    }


    boolean qui (){
        //qui ets
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;
        int numero;

        do {
                System.out.print("Escriu un numero del 0 al 100: ");
                numero= scanner.nextInt();

            if(numero%2==0 & numero%3==0){
                System.out.println("No binari");
                finish=true;
            }
            else{
                if(numero%2==0) {
                    System.out.println("Home");
                    finish=true;
                }
                if(numero%3==0) {
                    System.out.println("Dona");
                    finish=true;
                }
            }
//            if(numero<100)numero+=2;
//            else{
//                if (numero>100)numero-=4;
//            }

        }while(!finish);

        return true;
    }

    boolean esport (){
        System.out.print("Introduix un numero del 1 al 10: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
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

        return true;
    }

    boolean numero(){
        System.out.print("Introduix un numero màxim: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i=0;
        String resultat="";
        while (i<num/2){
            resultat+=" "+i;
            i++;
        }
        System.out.println(resultat+" He triat el "+num/2);
        return true;
    }

}