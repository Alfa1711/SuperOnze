package Modal;

import interfaces.Personagem;

public class TsunamiJousuki implements Personagem {
    private int ATK;
    private int DEF;
    private int VELO;
    private int PONT;

    public TsunamiJousuki(int ATK, int DEF, int VELO) {
        this.ATK = 35;
        this.DEF = 20;
        this.VELO = 35;
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
