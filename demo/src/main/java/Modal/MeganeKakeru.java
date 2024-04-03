package Modal;

import interfaces.Personagem;

public class MeganeKakeru implements Personagem {
    private int ATK;
    private int DEF;
    private int VELO;
    private int PONT;

    public MeganeKakeru(int ATK, int DEF, int VELO) {
        this.ATK = 5;
        this.DEF = 5;
        this.VELO = 15;
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
