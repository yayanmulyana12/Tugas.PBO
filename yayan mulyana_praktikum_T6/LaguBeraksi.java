package pertemuan6;

import java.util.Scanner;

public class LaguBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam (harus lebih dari 0): ");
        int n = scanner.nextInt();

        // Validasi input agar tidak ada nol
        if (n <= 0) {
            System.out.println("Jumlah anak ayam harus lebih dari 0!");
        } else {
            // Menjalankan perulangan buat menampilkan lagu
            while (n > 0) {
                if (n == 1) {
                    System.out.println("Anak ayam turun " + n + ", mati satu tinggal induknya.");
                } else {
                    System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1) + ".");
                }
                n--;
            }
        }

        // Menutup scanner 
        scanner.close();
    }
}
