package Modal;

public class UtsunomiyaToramaru implements Personagem {
    private int ATK;
    private int DEF;
    private int VELO;
    private int PONT;

    public UtsunomiyaToramaru(int ATK, int DEF, int VELO, int PONT) {
        this.ATK = 25;
        this.DEF = 10;
        this.VELO = 25;
        this.PONT = 60;
        
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
