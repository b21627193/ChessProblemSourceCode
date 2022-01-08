

public class Tas {
    private int renk;
    private float puan=0;
    private int cesit; // 0=Piyon, 1=At, 2=Fil, 3=Kale, 4=Vezir, 5= Sah
    private boolean tehditAltinda=false;
    private int x;
    private int y;

    public Tas(){}

    public int getRenk() {
        return renk;
    }

    public void setRenk(int renk) {
        this.renk = renk;
    }

    public float getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public boolean isTehditAltinda() {
        return tehditAltinda;
    }

    public void setTehditAltinda(boolean tehditAltinda) {
        this.tehditAltinda = tehditAltinda;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void tehditleriEttikleriniBul(Tas[][] taslar){

    }

    public int getCesit() {
        return cesit;
    }

    public void setCesit(int cesit) {
        this.cesit = cesit;
    }
}
