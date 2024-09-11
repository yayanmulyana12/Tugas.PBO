/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author LENOVO
 */

public class Matematika {
   
    int tambah(int a, int b) {
        return a + b;
    }

    
    int kurang(int a, int b) {
        return a - b;
    }

    
    int kali(int a, int b) {
        return a * b;
    }

    
    int bagi(int a, int b) {
        if (b == 0) {
            System.out.println("Tidak bisa dibagi 0.");
            return 0; 
        }
        return a / b;  
    }
}


    
