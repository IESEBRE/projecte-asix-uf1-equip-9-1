package UF1.Projecte;

import java.util.Arrays;
import java.util.Scanner;
//import static UF1.Projecte.Simulador.joel;
import static UF1.Projecte.Simulador.ent;

public class Person {
    // Constructor
    void Person (){}

    String talking () {
        boolean finish = false, guanyador=false;
        Boolean fet[]=new Boolean[8];
        Arrays.fill(fet,Boolean.FALSE);
        String name="", sexe="", esport="", fina="",sortida3="",sortida4="",sortida6="",sortida7="";
        String repetir="Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!";

        do {
            if (!Simulador.joel){
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
            }

            switch (Integer.parseInt(ent.nextLine())) {
                case 1:
                    //int numero= Integer.parseInt(ent.nextLine());
                    int numero;
                    String se="";
                    do {
                        if (!Simulador.joel)System.out.print("Escriu un numero del 0 al 100: ");
                        numero= Integer.parseInt(ent.nextLine());
//                        "Valor incorrecte. Torna-ho a provar."
//                        if (!Simulador.joel){
                    }while(numero<0| numero>100);

                    while(true) {
                        if(numero%2==0 && numero%3==0){
                            se+="No binari";
                            System.out.println(se);
                            sexe+=se;
                            break;
                        }
                        else{
                            if(numero%2==0) {
                                se+="Home";
                                System.out.println(se);
                                sexe+=se;
                                break;
                            }else{
                                if(numero%3==0) {
                                    se+="Dona";
                                    System.out.println(se);
                                    sexe+=se;
                                    break;
                                }else {
                                    if (numero<=100)numero+=2;
                                    else numero-=4;
                                }
                            }
                        }
                    }
                    fet[0]=true;
                    break;
                case 2:
                    if (fet[0]!=true){
                        if (!Simulador.joel)System.out.println(repetir);
                        continue;
                    }else{
                        int num;
                        do {
                            if (!Simulador.joel) System.out.print("Introduix un numero del 1 al 10: ");
                            num = Integer.parseInt(ent.nextLine());
                        }while(num<1| num>10);

                        switch (num) {
                            case 1:
                                System.out.println("Golf");
                                esport+="Golf";
                                break;
                            case 2:
                                System.out.println("Fútbol americano");
                                esport+="Fútbol americano";
                                break;
                            case 3:
                                System.out.println("Béisbol");
                                esport+="Béisbol";
                                break;
                            case 4:
                                System.out.println("Tenis de mesa");
                                esport+="Tenis de mesa";
                                break;
                            case 5:
                                System.out.println("Voleibol");
                                esport+="Voleibol";
                                break;
                            case 6:
                                System.out.println("Tenis");
                                esport+="Tenis";
                                break;
                            case 7:
                                System.out.println("Hockey sobre césped");
                                esport+="Hockey sobre césped";
                                break;
                            case 8:
                                System.out.println("Baloncesto");
                                esport+="Baloncesto";
                                break;
                            case 9:
                                System.out.println("Cricket");
                                esport+="Cricket";
                                break;
                            case 10:
                                System.out.println("Fútbol");
                                esport+="Fútbol";
                                break;
                        }
                        fet[1]=true;
                        break;
                    }
                case 3:
                    if (fet[1]!=true){
                        if (!Simulador.joel)System.out.println(repetir);
                        continue;
                    }else{
                        if (!Simulador.joel)System.out.print("Introduix un numero màxim: ");
                        int nume = Integer.parseInt(ent.nextLine());
                        int i=0;
                        String resultat="";
                        while (i<nume/2){
                            resultat+=" "+i;
                            i++;
                        }
                        sortida3+=resultat+" ...He triat el "+nume/2;
                        System.out.println(sortida3);
                        fet[2]=true;
                        break;
                    }
                case 4:
                    if (fet[2]!=true){
                        if (!Simulador.joel)System.out.println(repetir);
                        continue;
                    }else{
                        int a,b, multi, multi2;
                        String fi="", fi2="";
                        if (!Simulador.joel)System.out.println("introdueix dos enters: ");
                        a=Integer.parseInt(ent.nextLine());
                        b=Integer.parseInt(ent.nextLine());

                        for (int k=a ; k <=b ; k++) {
                            boolean parell=false;
                            for (int j=b; j >=a ; j--) {
                                int s=k*j;
                                if(s%2==0){
                                    parell=true;
                                    sortida4+=s+"\t";
                                    System.out.printf("%d\t",s);
                                }
                            }
                            if (parell){
                                System.out.println();
                                sortida4+="\n";
                            }
                        }
                        fet[3]=true;
                        break;
                    }
                case 5:
                    if (fet[3]!=true){
                        if (!Simulador.joel)System.out.println(repetir);
                        continue;
                    }else{
                        if (Simulador.joel) {
                            System.out.println("No pots jugar en model Joel!!");
                            fet[4]=true;
                            continue;
                        }else{
                            boolean joc = false;
                            int usuari,maquina=0, jugador=0;
                            do {
                                int person = (int)(Math.random() * 3) + 1;
                                System.out.println("Tria :    \n 1.pedra\n 2.papel\n 3.tisora ");
                                System.out.print("Ya!!: ");
                                usuari= Integer.parseInt(ent.nextLine());
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
                                        guanyador=true;
                                        joc=true;
                                    }
                                }

                            }while(!joc);
                            fet[4]=true;
                            break;
                        }
                    }
                case 6:
                    if (fet[4]!=true){
                        if (!Simulador.joel)System.out.println(repetir);
                        continue;
                    }else{
                        String nom;
                        do {
                            if (!Simulador.joel)System.out.print("Escull un nom: ");
                            nom=ent.nextLine().strip();
                            if(!Simulador.joel){
                                if (nom.isEmpty()) System.out.println("Valor incorrecte. Torna-ho a provar.");
                            }
                        }while(nom.isEmpty());

                        name+=nom;
                        sortida6+="Gràcies, m’agrada molt el nom de "+ nom;
                        System.out.println(sortida6);
                        fet[5]=true;
                        break;
                    }
                case 7:
                    if (fet[5]!=true){
                        if (!Simulador.joel)System.out.println(repetir);
                        continue;
                    }else{
                        sortida7+="Em dic "+name+" i he nascut "+sexe.toLowerCase()+
                                " el meu esport favorit és el "+esport;
                        System.out.println(sortida7);
                     if(!Simulador.joel){
                         if (guanyador==true) System.out.println("Juga se'm dona bé però he de reconèixer que has" +
                                 " guanyat de forma triunfal, ets molt bo!!");
                         else {
                             if (guanyador==false)System.out.println("Juga se'm dona molt bé, he guanyat");
                         }
                     }
                        fet[6]=true;
                        break;
                    }
                case 8:
                    if (fet[6]!=true){
                        if (!Simulador.joel)System.out.println(repetir);
                        continue;
                    }else{
                        finish=true;
                        fet[7]=true;
                        break;
                    }
            }
        } while (!finish);
        fina+=sexe+"\n\n"+ esport+"\n\n"+sortida3+"\n\n"+sortida4+"\n"+sortida6+"\n\n"+sortida7;

        return fina;
    }

}