package composite;

import java.util.ArrayList;
import java.util.Scanner;
import interfaces.Personagem;

public class CompositeJogadores implements Personagem {
    ArrayList<LeafJogadores> time;
    Scanner input = new Scanner(System.in);

    public CompositeJogadores() {
        this.time = new ArrayList<>();
    }

    public void addJogador(LeafJogadores jogador){
        this.time.add(jogador);
    }

    @Override
    public int getATK(){
        return this.getATK();
    }

    @Override
    public int getDEF(){
        return this.getDEF();
    }

    @Override
    public int getVELO(){
        
        return this.getVELO();
    }

    @Override
    public int getPONT(){
        return getATK()+getDEF()+getVELO();
    }
}
