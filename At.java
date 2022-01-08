public class At extends Tas{

    public At(int renk, int x, int y) {
        this.setPuan(3);
        this.setRenk(renk);
        this.setX(x);
        this.setY(y);
        this.setCesit(1);
    }

    @Override
    public void tehditleriEttikleriniBul(Tas[][] taslar) {
        super.tehditleriEttikleriniBul(taslar);
        // (x-2)(y+1) (x-1)(y+2) (x+1)(y-2) (x+2)(y-1) (x+2)(y+1) (x+1)(y+2) (x-1)(y-2) (x-2)(y-1)

        // (x-2)(y+1)
        int anlikKonumX = this.getX()-2;
        int anlikKonumY = this.getY()+1;
        if(anlikKonumX >=0 && anlikKonumY < 8) {
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }

        // (x-1)(y+2)
        anlikKonumX = this.getX()-1;
        anlikKonumY = this.getY()+2;
        if(anlikKonumX >=0 && anlikKonumY < 8) {
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }

        // (x+1)(y-2)
        anlikKonumX = this.getX()+1;
        anlikKonumY = this.getY()-2;
        if(anlikKonumX < 8 && anlikKonumY >= 0) {
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }

        // (x+2)(y-1)
        anlikKonumX = this.getX()+2;
        anlikKonumY = this.getY()-1;
        if(anlikKonumX < 8 && anlikKonumY >= 0) {
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }
        // (x+2)(y+1)
        anlikKonumX = this.getX()+2;
        anlikKonumY = this.getY()+1;
        if(anlikKonumX < 8 && anlikKonumY < 8) {
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }
        // (x-1)(y-2)
        anlikKonumX = this.getX()-1;
        anlikKonumY = this.getY()-2;
        if(anlikKonumX >= 0 && anlikKonumY >= 0) {
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }
        // (x-2)(y-1)
        anlikKonumX = this.getX()-2;
        anlikKonumY = this.getY()-1;
        if(anlikKonumX >= 0 && anlikKonumY >= 0) {
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }

        // (x+1)(y+2)
        anlikKonumX = this.getX()+1;
        anlikKonumY = this.getY()+2;
        if(anlikKonumX < 8 && anlikKonumY < 8) {
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }
    }
}
