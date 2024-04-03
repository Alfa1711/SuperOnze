package Modal;

import interfaces.Personagem;

public class AtsuyaFubuki implements Personagem {
    private int ATK;
    private int DEF;
    private int VELO;
    private int PONT;

    public AtsuyaFubuki(int ATK, int DEF, int VELO) {
        this.ATK = 50;
        this.DEF = 30;
        this.VELO = 25;
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
