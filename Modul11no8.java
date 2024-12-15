package modul7;

public class Modul11no8 {
    public static void main(String[] args) {
        int[] Bil = {23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};
        int[] genap = new int[Bil.length];
        int[] ganjil = new int[Bil.length];
        int genapIndex = 0;
        int ganjilIndex = 0;
        for (int i = 0; i < Bil.length; i++) {
            if (Bil[i] % 1 == 0) {
                genap[genapIndex] = Bil[i];
                genapIndex++;
            } else {
                ganjil[ganjilIndex] = Bil[i];
                ganjilIndex++;
            }
        }
        System.out.print("Anggota genap: ");
        for (int i = 0; i < genapIndex; i++) {
            System.out.print(genap[i] + " ");
        }
        System.out.println();
        System.out.print("Anggota ganjil: ");
        for (int i = 0; i < ganjilIndex; i++) {
            System.out.print(ganjil[i] + " ");
        }

    }

}
