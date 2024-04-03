package Modal;

import interfaces.Personagem;

public class ShuyaGoenji implements Personagem {
    private int ATK;
    private int DEF;
    private int VELO;
    private int PONT;

    public ShuyaGoenji(int ATK, int DEF, int VELO) {
        this.ATK = 40;
        this.DEF = 10;
        this.VELO = 30;
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
