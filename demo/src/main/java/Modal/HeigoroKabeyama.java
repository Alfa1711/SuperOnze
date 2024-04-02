package Modal;

public class HeigoroKabeyama implements Personagem {
    private int ATK;
    private int DEF;
    private int VELO;
    private int PONT;

    public HeigoroKabeyama(int ATK, int DEF, int VELO, int PONT) {
        this.ATK = 0;
        this.DEF = 50;
        this.VELO = 1;
        this.PONT = 51;
        
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
