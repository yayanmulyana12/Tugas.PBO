package pertemuan6;

public class PrimaBeraksi {
    public static void main(String[] args) {
        System.out.println("Bilangan prima dari 0-20:");
        for (int i = 0; i <= 20; i++) {
            boolean adalahPrima = true; // Misalkan bilangan adalah prima

            if (i < 2) {
                adalahPrima = false; // Bilangan kurang dari 2 bukan prima
            } else {
                // Memeriksa apakah bilangan habis dibagi selain 1 dan dirinya sendiri
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        adalahPrima = false;
                        break; // Jika ditemukan pembagi, berhenti loop
                    }
                }
            }

            if (adalahPrima) {
                System.out.print(i + " "); // Cetak bilangan prima
            }
        }

        System.out.println("\nBilangan bukan prima dari 0-20:");
        for (int i = 0; i <= 20; i++) {
            boolean adalahPrima = true;

            if (i < 2) {
                adalahPrima = false;
            } else {
                // Memeriksa apakah bilangan bukan prima
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        adalahPrima = false;
                        break;
                    }
                }
            }

            if (!adalahPrima) {
                System.out.print(i + " "); // Cetak bilangan bukan prima
            }
        }
    }
}

