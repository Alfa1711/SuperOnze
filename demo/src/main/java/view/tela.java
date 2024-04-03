package view;

import java.util.Scanner;

public class tela {
private static Scanner input = new Scanner(System.in);

    public static int escolherPersonagem(String jogador) {
        System.out.println(jogador + ": Escolha um personagem:");
        System.out.println("1 - Atsuya Fubuki");
        System.out.println("2 - Genda Koujirou");
        return input.nextInt();
    }

    public static int escolherAtributo(String jogador) {
        System.out.println(jogador + ": Escolha um atributo para comparar:");
        System.out.println("1 - Ataque (ATK)");
        System.out.println("2 - Defesa (DEF)");
        System.out.println("3 - Velocidade (VELO)");
        System.out.println("4 - Pontuação (PONT)");
        return input.nextInt();
    }

    public static void exibirAtributos(int jogador, int valorAtributo) {
        System.out.println("Jogador " + jogador + " escolheu este atributo. Valor = " + valorAtributo);
    }

    public static void exibirVencedor(int vencedor) {
        System.out.println("Jogador " + vencedor + " venceu!");
    }

    public static void exibirEmpate() {
        System.out.println("Empate!");
    }
}
