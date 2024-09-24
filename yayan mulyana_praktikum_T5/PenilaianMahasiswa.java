
package tugas5;

import java.util.Scanner;
public class PenilaianMahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("NPM : ");
        String npm = scanner.nextLine();
        
        System.out.print("Nama Mahasiswa : ");
        String nama = scanner.nextLine();
        
        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = scanner.nextDouble();
        
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = scanner.nextDouble();
        
        System.out.print("Nilai UTS : ");
        double nilaiUTS = scanner.nextDouble();
        
        System.out.print("Nilai UAS : ");
        double nilaiUAS = scanner.nextDouble();
        
        
        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);
        String grade = "";
        String keterangan = "";

      
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }

        
        System.out.println("\nTampilan Output:");
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}
