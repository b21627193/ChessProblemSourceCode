public class Kale extends Tas {
    public Kale(int renk, int x, int y) {
        this.setPuan(5);
        this.setRenk(renk);
        this.setX(x);
        this.setY(y);
        this.setCesit(3);
    }

    @Override
    public void tehditleriEttikleriniBul(Tas[][] taslar) {
        super.tehditleriEttikleriniBul(taslar);
        // Yukari Kontrol (x--)
        int anlikKonumX= this.getX()-1;
        while(anlikKonumX >= 0){
            if(taslar[anlikKonumX][this.getY()].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][this.getY()].getRenk() == this.getRenk()) {
                    break;
                } // Bu yonde tehdit edilecek tas yok, ayni renkte tas mevcut
                else {
                    taslar[anlikKonumX][this.getY()].setTehditAltinda(true);// TehditAltinda olarak isaretle
                    break;
                }
            }
            anlikKonumX = anlikKonumX -1;
        }

        // Asagi Kontrol (x++)
        anlikKonumX = this.getX() + 1 ;
        while(anlikKonumX < 8){
            if(taslar[anlikKonumX][this.getY()].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][this.getY()].getRenk() == this.getRenk()) {
                    break;
                } // Bu yonde tehdit edilecek tas yok, ayni renkte tas mevcut
                else {
                    taslar[anlikKonumX][this.getY()].setTehditAltinda(true);// TehditAltinda olarak isaretle
                    break;
                }
            }
            anlikKonumX++;
        }
        // Sag Kontrol (y++)
        int anlikKonumY = this.getY() + 1;
        while(anlikKonumY < 8){
            if(taslar[this.getX()][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[this.getX()][anlikKonumY].getRenk() == this.getRenk()) {
                    break;
                } // Bu yonde tehdit edilecek tas yok, ayni renkte tas mevcut
                else {
                    taslar[this.getX()][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                    break;
                }
            }
            anlikKonumY++;
        }

        // Sol Kontrol (y--)

        anlikKonumY = this.getY() -1;
        while(anlikKonumY >= 0){
            if(taslar[this.getX()][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[this.getX()][anlikKonumY].getRenk() == this.getRenk()) {
                    break;
                } // Bu yonde tehdit edilecek tas yok, ayni renkte tas mevcut
                else {
                    taslar[this.getX()][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                    break;
                }
            }
            anlikKonumY = anlikKonumY -1;
        }
    }

}
