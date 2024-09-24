package tugas5;


import java.util.Scanner;

public class IndeksMassaTubuh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input berat dan tinggi badan
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();

        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = scanner.nextDouble();

        // Hitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Tentukan kategori berdasarkan nilai IMT
        String kategori = "";
        if (imt < 18.5) {
            kategori = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kategori = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kategori = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kategori = "Gemuk";
        } else if (imt >= 40) {
            kategori = "Sangat Gemuk";
        }

        // Output hasil perhitungan dan kategori
        System.out.println("Nilai IMT: " + imt);
        System.out.println("Kategori: " + kategori);
    }
}
