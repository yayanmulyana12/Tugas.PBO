/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23057_yayan.mulyana_praktikum_tugas1_pertemuan2;

/**
 *
 * @author LENOVO
 */
public class Matematika implements MatematikaInterface {
    
    public int pertambahan(int a, int b){
        return a+b;
    }
    
    public int pengurangan(int a, int b){
        return a-b;
    }
    
    public int perkalian(int a,int b ){
        return a*b;
    }
    @Override
    public int pembagian(int a, int b){
        return a/b;
    }
    
}
