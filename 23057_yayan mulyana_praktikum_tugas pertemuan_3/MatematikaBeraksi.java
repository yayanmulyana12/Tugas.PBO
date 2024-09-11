/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

/**
 *
 * @author LENOVO
 */

public class MatematikaBeraksi {
    public static void main(String[] args) {
        
        Matematika2 mat = new Matematika2();

        
        int a = 10, b = 0;

        
        System.out.println("Penjumlahan: " + mat.tambah(a, b));
        System.out.println("Pengurangan: " + mat.kurang(a, b));
        System.out.println("Perkalian: " + mat.kali(a, b));
        System.out.println("Pembagian: " + mat.bagi(a, b));  
        System.out.println("Modulus: " + mat.modulus(a, b)); 
    }
}



