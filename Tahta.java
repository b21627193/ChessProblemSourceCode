import java.io.BufferedReader;
import java.io.IOException;

public class Tahta {
    private Tas[][] taslar= new Tas[8][8];

    public Tahta(){
    }

    public void tasEkle(Tas t){
        this.taslar[t.getX()][t.getY()] = t;
    }

    public void tasOlustur(String kare, int x, int y){
        char cesit = kare.charAt(0);
        char renk = kare.charAt(1);
        Tas yeniTas = null;
        if(cesit == 'p'){ // PIYON
            Piyon piyon = null;
            if(renk == 's'){
                piyon = new Piyon(0,x,y);
            }
            else if(renk == 'b'){
                piyon = new Piyon(1,x,y);
            }
            else{
                System.out.println("Hatali Renk");
                System.exit(-1);
            }

            yeniTas = piyon;
        }
        else if(cesit == 'a'){ // AT
            At at = null;
            if(renk == 's'){
                at = new At(0,x,y);
            }
            else if(renk == 'b'){
                at = new At(1,x,y);
            }
            else{
                System.out.println("Hatali Renk");
                System.exit(-1);
            }

            yeniTas = at;
        }
        else if(cesit == 'f'){ // FIL
            Fil fil = null;
            if(renk == 's'){
                fil = new Fil(0,x,y);
            }
            else if(renk == 'b'){
                fil = new Fil(1,x,y);
            }
            else{
                System.out.println("Hatali Renk");
                System.exit(-1);
            }

            yeniTas = fil;
        }
        else if(cesit == 'k'){ // KALE
            Kale kale = null;
            if(renk == 's'){
                kale = new Kale(0,x,y);
            }
            else if(renk == 'b'){
                kale = new Kale(1,x,y);
            }
            else{
                System.out.println("Hatali Renk");
                System.exit(-1);
            }

            yeniTas = kale;
        }
        else if(cesit == 'v'){ // VEZIR
            Vezir vezir = null;
            if(renk == 's'){
                vezir = new Vezir(0,x,y);
            }
            else if(renk == 'b'){
                vezir = new Vezir(1,x,y);
            }
            else{
                System.out.println("Hatali Renk");
                System.exit(-1);
            }

            yeniTas = vezir;
        }
        else if(cesit == 's'){ // SAH
            Sah sah = null;
            if(renk == 's'){
                sah = new Sah(0,x,y);
            }
            else if(renk == 'b'){
                sah = new Sah(1,x,y);
            }
            else{
                System.out.println("Hatali Renk");
                System.exit(-1);
            }

            yeniTas = sah;
        }
        else{
            System.out.println("Hatali Tas");
            System.exit(-1);
        }
        this.tasEkle(yeniTas);
    }

    public void taslariDiz(BufferedReader br) throws IOException {
        String st;
        int x=0,y=0;
        while((st = br.readLine()) != null){
            for (String kare:st.split(" ")) {
                if (kare.equals("--")){ //KARE BOS
                    this.taslar[x][y] = new Tas();
                }
                else{ // TAS MEVCUT
                    this.tasOlustur(kare, x, y);
                }
                y++;
            }
            x++;
            y=0;
        }
    }

    public void tahtayiGoster() {
        for(int x =0; x<8 ;x++){

            for(int y=0;y<8;y++){
                System.out.print(this.taslar[x][y].getPuan() + " ");
            }
            System.out.println();
        }
    }

    public void tehditEdilenleriGoster(){
        for(int x =0; x<8 ;x++){
            for(int y=0;y<8;y++){
                if(this.taslar[x][y].isTehditAltinda()){
                    System.out.print("T ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public void tehditleriBul() {
        for(int x=0; x<8 ; x++){
            for(int y=0; y<8; y++){
                if(this.taslar[x][y].getPuan() !=0 ) { // Konumda Tas var ise
                    if(this.taslar[x][y].getCesit()==0 || this.taslar[x][y].getCesit()==1 || this.taslar[x][y].getCesit()==4){ // Vezir(4), At(1) ve Piyonun(0) tehdit ettikleri bulunacak
                        this.taslar[x][y].tehditleriEttikleriniBul(this.taslar);
                    }

                }
            }
        }
    }

    public float beyazPuan(){
        float result = 0;
        for(int x =0; x<8 ;x++){
            for(int y=0;y<8;y++){
                Tas tas = this.taslar[x][y];
                if(tas.getPuan() !=0 && tas.getRenk()==1){
                    if(tas.isTehditAltinda()){
                        result = result + tas.getPuan()/2;
                    }
                    else{
                        result = result + tas.getPuan();
                    }
                }
            }
        }
        return result;
    }

    public float siyahPuan(){
        float result = 0;
        for(int x =0; x<8 ;x++){
            for(int y=0;y<8;y++){
                Tas tas = this.taslar[x][y];
                if(tas.getPuan() !=0 && tas.getRenk()==0){
                    if(tas.isTehditAltinda()){
                        result = result + tas.getPuan()/2;
                    }
                    else{
                        result = result + tas.getPuan();
                    }
                }
            }
        }
        return result;
    }
}
