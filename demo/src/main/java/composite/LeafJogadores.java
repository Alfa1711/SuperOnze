package composite;
import interfaces.Personagem;

public class LeafJogadores implements Personagem{

    
    private int ATK;
    private int DEF;
    private int VELO;
    private int PONT;

    public LeafJogadores(int ATK, int DEF, int VELO) {
        this.ATK = 0;
        this.DEF = 0;
        this.VELO = 0;
        this.PONT = ATK+DEF+VELO;
    }

    @Override
    public int getATK(){
        return this.ATK;
    }

    @Override
    public int getDEF(){
        return this.DEF;
    }

    @Override
    public int getVELO(){
        return this.VELO;
    }

    @Override
    public int getPONT(){
        return this.PONT;
    }
    
    
}
