package modul7;

import java.util.Scanner;

public class Modul11no2 {
    public static void main(String[] args) {
        int[]skor;
        skor = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan 5 data dengan tipe data integer");
        // membaca 5 data yang bertipe bulat 
        for (int i = 0; i < 5; i++) {
            skor[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) System.out.println("Data ke " + (i+1)+ "adalah" +skor[4-i]); {

            input.close();
        }


    }
    
} 
