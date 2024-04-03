package controller;

import composite.LeafJogadores;
import composite.CompositeJogadores;
import interfaces.Personagem;
import java.util.Scanner;


public class duelo {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    


    LeafJogadores jog1 = new LeafJogadores(20, 15, 50);
    LeafJogadores jog2 = new LeafJogadores(10, 30, 25);

    CompositeJogadores time = new CompositeJogadores();

    time.addJogador(jog1);
    time.addJogador(jog2);

    int escolha = input.nextInt();

    switch (escolha) {
        case 1:
        /*Compare os valores de Ataque */
        case 2:
        /*Compare os valores de Defesa */
        case 3:
        /*Compare os valores de Velocidade */

        case 4:
        /*Compare os valores de Pontuação */

        default:
        System.out.print("Está ação não existe");


    }

   }
    
}
