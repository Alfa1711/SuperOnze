package Modal;

import interfaces.Personagem;

public class Endo implements Personagem {
    private int ATK;
    private int DEF;
    private int VELO;
    private int PONT;

    public Endo(int ATK, int DEF, int VELO) {
        this.ATK = 25;
        this.DEF = 40;
        this.VELO = 10;
        this.PONT = ATK+DEF+VELO;
        
    }
    @Override
    public int getATK() {
        return ATK;
    }

    @Override
    public int getDEF() {
        return DEF;
    }

    @Override
    public int getVELO() {
        return VELO;
    }
    @Override
    public int getPONT() {
        return PONT;
    }
    
}
