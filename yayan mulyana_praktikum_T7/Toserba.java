package T7;




import java.util.Scanner;

public class Toserba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Bikin objek Scanner buat baca input

        // Ini daftar barang yang ada di toko
        String[] kodeBarang = {"a001", "a002", "a003"}; // Kode barang yang tersedia
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"}; // Nama barangnya
        int[] hargaBarang = {3000, 4000, 5000}; // Harganya masing-masing

        // Minta pengguna masukin berapa barang yang mau dibeli
        System.out.print("Masukkan jumlah item yang ingin dibeli: ");
        int jumlahItem = input.nextInt(); // Jumlah item yang bakal dibeli

        // Buat nyimpen total semua harga nanti
        int totalBayar = 0;

        // Ini buat nyimpen data pembelian
        String[] kodeInput = new String[jumlahItem]; // Kode barang yang dibeli
        int[] jumlahBeli = new int[jumlahItem]; // Berapa banyak barang yang dibeli
        int[] totalPerItem = new int[jumlahItem]; // Total per barang (harga * jumlah beli)

        // Proses input barang yang mau dibeli
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1)); // Urutan data yang diinput

            // Minta pengguna masukin kode barang
            System.out.print("Masukkan Kode Barang: ");
            kodeInput[i] = input.next(); // Baca kode barang yang dimasukin

            // Minta pengguna masukin jumlah beli
            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = input.nextInt(); // Baca jumlah beli dari barang itu

            // Cek kode barang yang dimasukin, terus hitung totalnya
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeInput[i].equals(kodeBarang[j])) { // Kalo kode barang cocok
                    // Hitung total per item (harga barang x jumlah yang dibeli)
                    totalPerItem[i] = hargaBarang[j] * jumlahBeli[i];
                    // Tambahin total harga item ini ke total keseluruhan
                    totalBayar += totalPerItem[i];
                }
            }
        }

        // Tampilkan hasil pembelian dalam bentuk tabel
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("******************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");

        // Loop buat tampilin semua barang yang dibeli
        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeInput[i].equals(kodeBarang[j])) { // Kalo kode barang cocok
                    // Tampilkan data pembelian (nomor, kode, nama, harga, jumlah, total)
                    System.out.println((i + 1) + "   " 
                        + kodeBarang[j] + "         " 
                        + namaBarang[j] + "       " 
                        + hargaBarang[j] + "       " 
                        + jumlahBeli[i] + "          " 
                        + totalPerItem[i]);
                }
            }
        }
        System.out.println("******************************");
        // Tampilkan total bayar setelah semua barang dihitung
        System.out.println("Total Bayar: " + totalBayar);
    }
}
