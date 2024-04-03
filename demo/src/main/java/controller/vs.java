package controller;

import java.util.Scanner;
import interfaces.Personagem;

public class vs {
   Scanner Entrada = new Scanner(System.in);
        
       int decision = Entrada.nextInt();
       
       switch(decision){
              case 1:

                if(getClass(getATK())> getATK()){
                    System.out.println("Vitoria do Jogador 1");
                }else{
                    System.out.println("Vitoria do Jogador 2");
                }

              break;

              case 2:
                     if(getDEF() > getDEF()){
                            System.out.println("Vitoria do Jogador 1");
                     }else{
                            System.out.println("Vitoria do Jogador 2");
                     }
                
              break;
                
              case 3:
                   if(getVELO() > getVELO()){
                            System.out.println("Vitoria do Jogador 1");
                     }else{
                            System.out.println("Vitoria do Jogador 2");
                     }break;
                
              case 4:
                   if(getPONT() > getPONT()){
                            System.out.println("Vitoria do Jogador 1");
                     }else{
                            System.out.println("Vitoria do Jogador 2");
                     }
              
              break;
       }
}
