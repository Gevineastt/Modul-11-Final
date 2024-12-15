package modul7;

import java.util.Scanner;

public class Modul11no6 {
    public static void main(String[] args) {
     
        int[] A = {2,7,3,9,4,1,34,25,76,80,90,54,21,78};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai yang dicari : ");
        int nilai = input.nextInt();
        int index = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == nilai) {
                index = i;
                break;
            }
        }
        System.out.println("Nilai " + nilai + " berada di index " + index);
        input.close();
    }
}

