public class Piyon extends Tas{

    public Piyon(int renk, int x, int y) {
        this.setPuan(1);
        this.setRenk(renk);
        this.setX(x);
        this.setY(y);
        this.setCesit(0);
    }

    @Override
    public void tehditleriEttikleriniBul(Tas[][] taslar) {
        super.tehditleriEttikleriniBul(taslar);
        if(this.getRenk()==0){ // Siyah Piyon
            // SAG CAPRAZ Kontrol
            int anlikKonumX = this.getX()+1;
            int anlikKonumY = this.getY()+1;
            if(anlikKonumX < 8 && anlikKonumY < 8){
                if(taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                    if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { // Farklı renk ise
                        taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                    }
                }
            }
            // SOL CAPRAZ Kontrol
            anlikKonumX = this.getX()+1;
            anlikKonumY = this.getY()-1;
            if(anlikKonumX < 8 && anlikKonumY >= 0){
                if(taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                    if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { // Farklı renk ise
                        taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                    }
                }
            }
        }
        else{ // Beyaz Piyon
            // SAG CAPRAZ Kontrol
            int anlikKonumX = this.getX()-1;
            int anlikKonumY = this.getY()-1;
            if(anlikKonumX >= 0 && anlikKonumY >= 0){
                if(taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                    if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { // Farklı renk ise
                        taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true);// TehditAltinda olarak isaretle
                    }
                }
            }
            // SOL CAPRAZ Kontrol
            anlikKonumX = this.getX()-1;
            anlikKonumY = this.getY()+1;
            if(anlikKonumX >= 0 && anlikKonumY < 8){
                if(taslar[anlikKonumX][anlikKonumY].getPuan() != 0) { // Konumda Tas Varsa
                    if (taslar[anlikKonumX][anlikKonumY].getRenk() != this.getRenk()) { // Farklı renk ise
                        taslar[anlikKonumX][anlikKonumY].setTehditAltinda(true); // TehditAltinda olarak isaretle
                    }
                }
            }
        }
    }
}
