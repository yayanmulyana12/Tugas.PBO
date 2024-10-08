package pertemuan6;

public class HurufBeraksi {
    public static void main(String[] args) {
        // Deret huruf besar Z - A
        System.out.println("Deret Huruf Besar Z-A:");
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + " ");
        }

        // Tambah baris kosong buat pemisah
        System.out.println("\n");

        // Deret huruf kecil z - a
        System.out.println("Deret Huruf Kecil z-a:");
        for (char c = 'z'; c >= 'a'; c--) {
            System.out.print(c + " ");
        }
    }
}
