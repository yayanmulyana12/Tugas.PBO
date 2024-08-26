/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23057_yayan.mulyana_praktikum_tugas2_pertemuan2;

/**
 *
 * @author LENOVO
 */
public class Nilai {
    String nim;
    String nama;
    double absen;
    double tugas;
    double uts;
    double uas;


    public void tampilkanNilai() {
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Absen : " + absen);
        System.out.println("Nilai Tugas : " + tugas);
        System.out.println("Nilai UTS   : " + uts);
        System.out.println("Nilai UAS   : " + uas);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
    }

    public double hitungNilaiAkhir() {
        double nilaiAkhir = (absen * 0.1) + (tugas * 0.2) + (uts * 0.3) + (uas * 0.4);
        return nilaiAkhir;
    }
}

