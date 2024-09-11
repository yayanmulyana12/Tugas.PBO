/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author LENOVO
 */
public class Matematika2 extends Matematika {
    
    public int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Tidak dapat menghitung modulus dengan nol.");
            return 0;  
        }
        return Math.floorMod(a, b);  
    }
}

    

   