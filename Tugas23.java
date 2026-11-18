import java.util.Scanner;

public class Tugas23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] data = new int[10][6];
        int i, j, jumlah, totalSemua;
        double rataResponden, rataPertanyaan, rataTotal;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 6; j++) {
                System.out.print("Responden " + (i + 1) + ", pertanyaan " + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nRata-rata tiap responden:");
        for (i = 0; i < 10; i++) {
            jumlah = 0;
            for (j = 0; j < 6; j++) {
                jumlah = jumlah + data[i][j];
            }
            rataResponden = jumlah / 6.0;
            System.out.println("Responden " + (i + 1) + ": " + rataResponden);
        }

        System.out.println("\nRata-rata tiap pertanyaan:");
        for (j = 0; j < 6; j++) {
            jumlah = 0;
            for (i = 0; i < 10; i++) {
                jumlah = jumlah + data[i][j];
            }
            rataPertanyaan = jumlah / 10.0;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataPertanyaan);
        }

        totalSemua = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 6; j++) {
                totalSemua = totalSemua + data[i][j];
            }
        }
        rataTotal = totalSemua / 60.0;
        System.out.println("\nRata-rata keseluruhan: " + rataTotal);

        sc.close();
    }
}