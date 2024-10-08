package pertemuan6;

import java.util.Scanner;

public class TableBeraksi {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nilai n (1-10): ");
            int n = scanner.nextInt();

            if (n >= 1 && n <= 10) {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.printf("%4d", i * j); // Format hasil agar rapi dengan lebar 4 karakter
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Nilai n harus antara 1 dan 10.");
            }
        }
    }
}

