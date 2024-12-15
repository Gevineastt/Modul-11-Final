package modul7;

import java.util.Scanner;

public class Modul11no5 {
    public static void main(String[] args) {
        double[] nilai;
        nilai = new double[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan 5 data dengan tipe data integer");
        // membaca 5 data yang bertipe bulat
        
        for (int i = 0; i < 5; i++) {
            nilai[i] = input.nextInt();
        }
        
        input.close();
        
        double jumlah = 0;
        for (int i = 0; i < 5; i++) jumlah += nilai[i];
        // cara menampilkan nilai minimum setelah menampilkan nilai maksimum
        double minimum = nilai[0];
        for (int i = 1; i < 5; i++) {
            if (nilai[i] < minimum) {
                minimum = nilai[i];
            }
        }
        System.out.println("Nilai minimum :" + minimum);
        
        // cara menampilkan
        double maksimum = nilai[0];
        for (int i = 1; i < 5; i++) {
            if (nilai[i] > maksimum) {
                maksimum = nilai[i];
            }
        }
        System.out.println("Nilai maksimum :" + maksimum);
        
        double rataRata = jumlah / 5;
        System.out.println("Nilai rata-rata : " + rataRata);
    }

}

    
    
