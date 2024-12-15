package modul7;

import java.util.Scanner;

public class Modul11no1 {
    public static void main(String[] args) {
        int[]nilai;
        nilai = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan 5 data dengan tipe  data integer");
        //Menyimpan 5 data yang bertipe bulat ke array nilai
        nilai[0] = input.nextInt();
        nilai[1] = input.nextInt();
        nilai[2] = input.nextInt();
        nilai[3] = input.nextInt();
        nilai[4] = input.nextInt();

        input.close();
        
        // menampilkan data dari akhir ke awal 
        for (int i=0; i <=4; i++) System.out.println("Data ke-"+i+" = "+nilai[4-i]);
    }

}
