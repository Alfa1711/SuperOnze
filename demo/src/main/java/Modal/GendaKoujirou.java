
package Modal;

public class GendaKoujirou implements Personagem {
    private int ATK;
    private int DEF;
    private int VELO;
    private int PONT;

    public GendaKoujirou(int ATK, int DEF, int VELO, int PONT) {
        this.ATK = 30;
        this.DEF = 50;
        this.VELO = 25;
        this.PONT = 105;
        
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
