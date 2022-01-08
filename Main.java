package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("board.txt");
        BufferedReader br = null;
        try {

            br = new BufferedReader((new FileReader(file)));
            Tahta tahta = new Tahta();
            tahta.taslariDiz(br); // Dosya okunup taslar 2D array'e yerlestirilir.
            tahta.tehditleriBul(); // Tahta üzerindeki tehdit altında olan taslar bulunur.
            System.out.println("Beyaz Puan:"+tahta.beyazPuan());
            System.out.println("Siyah Puan:"+tahta.siyahPuan());
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("board.txt kontrol et");
            System.exit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
