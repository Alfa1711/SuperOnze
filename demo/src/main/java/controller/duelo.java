package controller;


import interfaces.Personagem;

import java.util.Random;
import java.util.Scanner;
import view.tela;
import Modal.AtsuyaFubuki;
import Modal.GendaKoujirou;


public class duelo {
   public static void main(String[] args) {
        int escolhaPersonagem1 = tela.escolherPersonagem("Jogador 1");
        Personagem personagemJogador1 = criarPersonagem(escolhaPersonagem1);

        int escolhaPersonagem2 = tela.escolherPersonagem("Jogador 2");
        Personagem personagemJogador2 = criarPersonagem(escolhaPersonagem2);

        int jogadorEscolhendo = sortearJogador();

        int jogadorNaoEscolhendo = (jogadorEscolhendo == 1) ? 2 : 1;

        tela.exibirAtributos(jogadorEscolhendo, jogadorNaoEscolhendo);
        int escolhaAtributo = tela.escolherAtributo("Jogador " + jogadorEscolhendo);

        int valorAtributoJogadorEscolhendo = obterValorAtributo(personagemJogador1, personagemJogador2, escolhaAtributo, jogadorEscolhendo);
        int valorAtributoJogadorNaoEscolhendo = obterValorAtributo(personagemJogador1, personagemJogador2, escolhaAtributo, jogadorNaoEscolhendo);

        tela.exibirAtributos(jogadorEscolhendo, valorAtributoJogadorEscolhendo);
        tela.exibirAtributos(jogadorNaoEscolhendo, valorAtributoJogadorNaoEscolhendo);

        int vencedor = determinarVencedor(valorAtributoJogadorEscolhendo, valorAtributoJogadorNaoEscolhendo);
        if (vencedor != 0) {
            tela.exibirVencedor(vencedor);
        } else {
            tela.exibirEmpate();
        }
    }

    private static Personagem criarPersonagem(int escolhaPersonagem) {
        switch (escolhaPersonagem) {
            case 1:
                return new AtsuyaFubuki(50, 30, 25);
            case 2:
                return new GendaKoujirou(30, 50, 25);
            default:
                System.out.println("Opção inválida.");
                return null;
        }
    }

    private static int sortearJogador() {
        Random random = new Random();
        return random.nextInt(2) + 1;
    }

    private static int obterValorAtributo(Personagem personagem1, Personagem personagem2, int escolhaAtributo, int jogador) {
        int valorAtributo = 0;

        if (jogador == 1) {
            switch (escolhaAtributo) {
                case 1:
                    valorAtributo = personagem1.getATK();
                    break;
                case 2:
                    valorAtributo = personagem1.getDEF();
                    break;
                case 3:
                    valorAtributo = personagem1.getVELO();
                    break;
                case 4:
                    valorAtributo = personagem1.getPONT();
                    break;
                default:
                    System.out.println("Opção inválida para o jogador 1.");
                    break;
            }
        } else {
            switch (escolhaAtributo) {
                case 1:
                    valorAtributo = personagem2.getATK();
                    break;
                case 2:
                    valorAtributo = personagem2.getDEF();
                    break;
                case 3:
                    valorAtributo = personagem2.getVELO();
                    break;
                case 4:
                    valorAtributo = personagem2.getPONT();
                    break;
                default:
                    System.out.println("Opção inválida para o jogador 2.");
                    break;
            }
        }

        return valorAtributo;
    }

    private static int determinarVencedor(int valorAtributoJogadorEscolhendo, int valorAtributoJogadorNaoEscolhendo) {
        if (valorAtributoJogadorEscolhendo > valorAtributoJogadorNaoEscolhendo) {
            return 1;
        } else if (valorAtributoJogadorEscolhendo < valorAtributoJogadorNaoEscolhendo) {
            return 2;
        } else {
            return 0; // Empate
        }
    }
}
