package com.company;

public class Fil extends Tas {
    public Fil(int renk, int x, int y) {
        this.setPuan(3);
        this.setRenk(renk);
        this.setX(x);
        this.setY(y);
        this.setCesit(2);
    }

    @Override
    public void tehditleriEttikleriniBul(Tas[][] taslar) {
        super.tehditleriEttikleriniBul(taslar);
        // SOL UST CAPRAZ Kontrol x-- y--
        int anlikKonumX = this.getX()-1, anlikKonumY = this.getY()-1;
        while(anlikKonumX >=0 && anlikKonumY >=0){
            if(taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() == this.getRenk()) {
                    break;
                } // Bu yonde tehdit edilecek tas yok, ayni renkte tas mevcut
                else {
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
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
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
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
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
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
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                    break;
                }
            }
            anlikKonumX++;
            anlikKonumY++;
        }
    }
}
