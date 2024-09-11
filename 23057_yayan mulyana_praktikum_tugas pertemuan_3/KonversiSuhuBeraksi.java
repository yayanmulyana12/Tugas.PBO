/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author LENOVO
 */
public class KonversiSuhuBeraksi {
    
    public static void main(String[] args) {
        
        KonversiSuhu2 konversi = new KonversiSuhu2();

        
        double suhuCelcius = 100;
        double suhuFahrenheit = 212;

        
        System.out.println(suhuCelcius + " derajat Celcius ke Fahrenheit: " + konversi.celciusToFahrenheit(suhuCelcius));
        System.out.println(suhuCelcius + " derajat Celcius ke Reamur: " + konversi.celciusToReamur(suhuCelcius));
        System.out.println(suhuFahrenheit + " derajat Fahrenheit ke Reamur: " + konversi.fahrenheitToReamur(suhuFahrenheit));
    }
}


