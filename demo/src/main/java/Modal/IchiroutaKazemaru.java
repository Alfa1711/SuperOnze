package Modal;

public class IchiroutaKazemaru implements Personagem {
    private int ATK;
    private int DEF;
    private int VELO;
    private int PONT;

    public IchiroutaKazemaru (int ATK, int DEF, int VELO, int PONT) {
        this.ATK = 25;
        this.DEF = 10;
        this.VELO = 40;
        this.PONT = 75;
        
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
