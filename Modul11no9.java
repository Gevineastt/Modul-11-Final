package modul7;

import java.util.Scanner;

public class Modul11no9 {
    // buat program untuk mengurutkan isi array dari yang terkecil hingga terbesar dengan menggunakan bubble sort
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai;
        nilai = new int[5];
        System.out.println("Banyak elemen : 5");
        System.out.println("Elemen ke-1 :");
        nilai[0] = input.nextInt();
        System.out.println("Elemen ke-2 : ");
        nilai[1] = input.nextInt();
        System.out.println("Elemen ke-3 : ");
        nilai[2] = input.nextInt();
        System.out.println("Elemen ke-4 : ");
        nilai[3] = input.nextInt();
        System.out.println("Elemen ke-5 : ");
        nilai[4] = input.nextInt();
        
        int n = nilai.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int urutan = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = urutan;
                }
            }
        }
        System.out.println("Array setelah diurutkan:");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }
        input.close();
    }
}
