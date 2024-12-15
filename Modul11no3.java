package modul7;

import java.util.Scanner;

public class Modul11no3 {
    

        public static void main(String[] args) {        
            int[] skor = new int[5];
            int[] cadangan = new int[5]; // Array cadangan untuk menyimpan salinan
            Scanner input = new Scanner(System.in);
            
            System.out.println("Masukkan 5 data bulat");
            // Membaca 5 data bulat
            for(int i = 0; i < 5; i++){
                System.out.print("Data ke " + (i + 1) + " : ");
                skor[i] = input.nextInt();
            }
            
            // Menyalin isi array skor ke array cadangan
            for(int i = 0; i < 5; i++) {
                cadangan[i] = skor[i];
            }
            
            // Menampilkan data dari akhir ke awal
            System.out.println("\nData dari array skor (dari akhir ke awal):");
            for(int i = 0; i < 5; i++) {
                System.out.println("Data ke " + (i + 1) + " adalah " + skor[4 - i]);
            }
            
            // Menampilkan isi array skor
            System.out.println("\nIsi array skor:");
            for(int i = 0; i < 5; i++) {
                System.out.println("Data ke " + (i + 1) + " adalah " + skor[i]);
            }
            
            // Menampilkan isi array cadangan
            System.out.println("\nIsi array cadangan:");
            for(int i = 0; i < 5; i++) {
                System.out.println("Data ke " + (i + 1) + " adalah " + cadangan[i]);
            }
            
            input  .close(); // Menutup scanner
        }
    }
