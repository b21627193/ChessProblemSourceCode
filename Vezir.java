
public class Vezir extends Tas {
    public Vezir(int renk, int x, int y) {
        this.setPuan(9);
        this.setRenk(renk);
        this.setX(x);
        this.setY(y);
        this.setCesit(4);
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
                    taslar[anlikKonumX][this.getY()].setTehditAltinda(true); // TehditAltinda olarak isaretle
                    break;
                }
            }
            anlikKonumX = anlikKonumX -1;  // Konumda tas yoksa
        }

        // Asagi Kontrol (x++)
        anlikKonumX = this.getX() + 1 ;
        while(anlikKonumX < 8){
            if(taslar[anlikKonumX][this.getY()].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][this.getY()].getRenk() == this.getRenk()) {
                    break;
                } // Bu yonde tehdit edilecek tas yok, ayni renkte tas mevcut
                else {
                    taslar[anlikKonumX][this.getY()].setTehditAltinda(true); // TehditAltinda olarak isaretle
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
                    taslar[this.getX()][anlikKonumY].setTehditAltinda(true); // TehditAltinda olarak isaretle
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
                    taslar[this.getX()][anlikKonumY].setTehditAltinda(true); // TehditAltinda olarak isaretle
                    break;
                }
            }
            anlikKonumY = anlikKonumY -1;
        }



        // SOL UST CAPRAZ Kontrol x-- y--
        anlikKonumX = this.getX()-1;
        anlikKonumY = this.getY()-1;
        while(anlikKonumX >=0 && anlikKonumY >=0){
            if(taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() == this.getRenk()) {
                    break;
                } // Bu yonde tehdit edilecek tas yok, ayni renkte tas mevcut
                else {
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true); // TehditAltinda olarak isaretle
                    break;
                }
            }
            anlikKonumX--;
            anlikKonumY--;
        }
        // SAG UST CAPRAZ Kontrol x-- y++
        anlikKonumX = this.getX()-1;
        anlikKonumY = this.getY()+1;
        while(anlikKonumX >=0 && anlikKonumY < 8){
            if(taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() == this.getRenk()) {
                    break;
                } // Bu yonde tehdit edilecek tas yok, ayni renkte tas mevcut
                else {
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true); // TehditAltinda olarak isaretle
                    break;
                }
            }
            anlikKonumX--;
            anlikKonumY++;
        }
        // SOL ALT CAPRAZ Kontrol x++ y--
        anlikKonumX = this.getX()+1;
        anlikKonumY = this.getY()-1;
        while(anlikKonumX < 8 && anlikKonumY >= 0){
            if(taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() == this.getRenk()) {
                    break;
                } // Bu yonde tehdit edilecek tas yok, ayni renkte tas mevcut
                else {
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true); // TehditAltinda olarak isaretle
                    break;
                }
            }
            anlikKonumX++;
            anlikKonumY--;
        }
        // SAG ALT CAPRAZ Kontrol x++ y++
        anlikKonumX = this.getX()+1;
        anlikKonumY = this.getY()+1;
        while(anlikKonumX < 8 && anlikKonumY < 8 ){
            if(taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() == this.getRenk()) {
                    break;
                } // Bu yonde tehdit edilecek tas yok, ayni renkte tas mevcut
                else {
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true); // TehditAltinda olarak isaretle
                    break;
                }
            }
            anlikKonumX++;
            anlikKonumY++;
        }



    }
}
