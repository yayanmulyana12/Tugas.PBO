/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23057_yayan.mulyana_praktikum_tugas1_pertemuan2;

/**
 *
 * @author LENOVO
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematikaInterface operasi_penghitungan = new Matematika();
        
        int a, b ;
        
       a = 20;
       b = 10;
       System.out.println("Pertambahan : " + a + " + " + b + " = " + operasi_penghitungan.pertambahan(a, b));
       
       a = 10;
       b = 5;
       System.out.println("Pengurangan : " + a + " - " + b + " = " + operasi_penghitungan.pengurangan(a, b));
       
       a = 10;
       b = 3;
       System.out.println("Perkalian   : " + a + " * " + b + " = " + operasi_penghitungan.perkalian(a, b));
       
       a = 21;
       b = 2;
       System.out.println("Pembagian   : " + a + " / " + b + " = " + operasi_penghitungan.pembagian(a, b));
       
        // TODO code application logic here
    }
    
}
