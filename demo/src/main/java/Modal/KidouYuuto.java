package Modal;

public class KidouYuuto implements Personagem {
    private int ATK;
    private int DEF;
    private int VELO;
    private int PONT;

    public KidouYuuto(int ATK, int DEF, int VELO, int PONT) {
        this.ATK = 35;
        this.DEF = 40;
        this.VELO = 40;
        this.PONT = 115;
        
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