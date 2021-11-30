package UF1.Projecte;

import java.util.Scanner;

public class Ialexia {

    // Constructor
    void Person() {
    }

    boolean talking() {
        System.out.println("Hola, soc Ialexia!\n");
        boolean finish = false;
        do {
            Scanner scanner = new Scanner(System.in);
            // Questionari
            System.out.println("Qüestionari");
            System.out.println(" 1. Quin tipus d’IA ets?");
            System.out.println(" 2. De que t'agrada parlar");
            System.out.println(" 3. Quin és el teu número favorit entre 0 i ...?");
            System.out.println(" 4. Sabries llistar tots els nombres parells resultants de la multiplicació entre el valor enter a i b, on el valor de a creixerà fins b");
            System.out.println(" 5. Juguem al penjat?");
            System.out.println(" 6. Posa-li un nom!");
            System.out.println(" 7. Pots recorda-me la nostra conversa?");
            System.out.println(" 8. Sortir de l’aplicació");
            System.out.print("Opció: ");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Introduex un numero del 1 al 3");
                    int num1 = scanner.nextInt();

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

                    int num2 = scanner.nextInt();
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


                    int num3 = 0;


                    do {

                        System.out.println("Selecciona un numero del 1 al 10");
                        num3 = scanner.nextInt();


                        if (num3 == 8) {
                            System.out.println("Henorabona es el meu numero favorit ");
                        } else System.out.println("Ho sento, no és el meu número favorit. Tornaho a intentar ");


                    } while (num3 != 8);


//
//
//                        else{
//                            System.out.println(" Ho sento, no és el meu número favorit. Tornaho a intentar");
//
//                }

//

//                    switch (num3) {
//
//                        case 1:
//                            break;
//
//                        case 2:
//
//                            break;
//
//                        case 3:
//
//                            break;
//
//
//                        case 4:
//
//
//                            break;
//
//

//
//
//                            if (numfa == 8) {
//                                System.out.println("Henorabona es el meu numero favorit ");
//
//                                break;
//                                case 3:
//
//                                    if (num3 == 8 | num3 != 8) {
//                        System.out.println("Henorabona es el meu numero favorit ");
//                            System.out.println(" Ho sento, no és el meu número favorit");
//                    int numfa = scanner.nextInt();
//
//                    if (numfa == 8){
//                        System.out.println("Henorabona es el meu numero favorit ");
//
//
//                    }else {
//                        if (numfa != 8) {
//                            System.out.println(" Ho sento, no és el meu número favorit");
//
//
//
//
//                            if (numfa == 8){
//                                break;
//                            }
//                        }
//
//                    }

                    break;
                case 4:


//                            Scanner teclado = new Scanner(System.in);
//
//                            int sumaPares = 0; //Acumular la suma de pares
//                            int contadorImpares = 0; //Contar la cantidad de impares introducidos
//                            int numero = 0;
//
//                            do {
//                                //Pedimos número
//                                System.out.print("Introduce un número (0 para SALIR): ");
//                                numero = teclado.nextInt();
//
//                                //Evaluamos si es par o impar
//                                if (numero %2!= 0) //Es impar
//                                    sumaPares = sumaPares + numero; //Acumulamos suma
//                                else //Es impar
//                                    contadorImpares++; //Contamos el impar introducido
//
//                            }while (numero != 0);
//
//                            //Bucle terminado, mostramos resultados
//                            System.out.println("\nLa suma de pares es: " + sumaPares);
//                            System.out.println("Cantidad impares introducidos: " + contadorImpares);


                    Scanner qua = new Scanner(System.in);
                    int z = 0;
                    int x= 0;

                    int tot=z*x;



                    System.out.println("Introduex el primer numero:");
                    z = qua.nextInt();

                    System.out.println("Introduex el primer numero:");
                    x = qua.nextInt();
                    System.out.println(z*x);


                    if ((tot%2) !=0){
                        System.out.println("Aquests son els numeros imparells" + tot );
                    }




//                    while (){
//                        System.out.println("Auests numeros son imparells" + tot);
//                    }












//                            int cant, num, pares=0, impares=0;
//                            System.out.print("Cuantos numeros desea ingresar: ");
//                            Scanner cuatre = new Scanner(System.in);
//                            cant = scanner.nextInt();
//
//                            for(int i=1; i<=cant; i++){
//                                System.out.print("Ingresar numero " + i + " de " + cant + ": ");
//                                num = (new Scanner(System.in)).nextInt();
//                                if(num%2 == 0)
//                                    pares++;
//                                else
//                                    impares++; }
//
//                            System.out.println("\nCantidad de numeros pares: " + pares);
//                            System.out.println("Cantidad de numeros impares: " + impares);

//



//                            if (%2!=0)
//                                return true;
//                            else ();
//                                return false;





                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("Adéu!!");
                    finish = true;
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
        }
        while (!finish) ;


        return true;
    }
}