package com.company;

public class Sah extends Tas {

    public Sah(int renk, int x, int y) {
        this.setPuan(100);
        this.setRenk(renk);
        this.setX(x);
        this.setY(y);
        this.setCesit(5);
    }

    @Override
    public void tehditleriEttikleriniBul(Tas[][] taslar) {
        super.tehditleriEttikleriniBul(taslar);
        //(x+1)(y+1) (x+1)(y) (x)(y+1) (x+1)(y-1) (x-1)(y+1) (x-1)(y-1) (x-1)(y) (x)(y-1)

        //(x+1)(y+1)
        int anlikKonumX = this.getX()+1;
        int anlikKonumY = this.getY()+1;
        if(anlikKonumX < 8 && anlikKonumY < 8){
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true); // TehditAltinda olarak isaretle
                }
            }
        }

        //(x+1)(y)
        anlikKonumX = this.getX()+1;
        anlikKonumY = this.getY();
        if(anlikKonumX < 8 && anlikKonumY < 8){
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }

        //(x)(y+1)
        anlikKonumX = this.getX();
        anlikKonumY = this.getY()+1;
        if(anlikKonumX < 8 && anlikKonumY < 8){
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }

        //(x+1)(y-1)
        anlikKonumX = this.getX()+1;
        anlikKonumY = this.getY()-1;
        if(anlikKonumX < 8 && anlikKonumY >= 0){
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }

        //(x-1)(y+1)
        anlikKonumX = this.getX()-1;
        anlikKonumY = this.getY()+1;
        if(anlikKonumX >= 0 && anlikKonumY < 8){
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }

        //(x-1)(y-1)
        anlikKonumX = this.getX()-1;
        anlikKonumY = this.getY()-1;
        if(anlikKonumX >= 0 && anlikKonumY >= 0){
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }

        //(x-1)(y)
        anlikKonumX = this.getX()-1;
        anlikKonumY = this.getY();
        if(anlikKonumX >= 0 && anlikKonumY < 8){
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }

        //(x)(y-1)
        anlikKonumX = this.getX();
        anlikKonumY = this.getY()-1;
        if(anlikKonumX < 8 && anlikKonumY >= 0){
            if (taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { //ayni renk degilse
                    taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                }
            }
        }
    }
}
