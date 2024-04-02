package Modal;

public class SakumaJirou implements Personagem {
    private int ATK;
    private int DEF;
    private int VELO;
    private int PONT;

    public SakumaJirou(int ATK, int DEF, int VELO, int PONT) {
        this.ATK = 50;
        this.DEF = 15;
        this.VELO = 20;
        this.PONT = 85;
        
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
