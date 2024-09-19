/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23057_yayan.mulyana_praktikum_T4;

/**
 *
 * @author LENOVO
 */
public class BangunRuangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        BangunRuang kubus = new Kubus(5);
        BangunRuang balok = new Balok(5, 3, 4);

        
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());

        
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
    }
}
        
    
    

