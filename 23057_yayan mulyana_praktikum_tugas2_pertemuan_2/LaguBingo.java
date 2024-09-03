/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23057_yayan_praktikum;

/**
 *
 * @author LENOVO
 */
public class LaguBingo {
    public LaguBingo() {
        String[] bingo = {"B", "I", "N", "G", "O"};
        String clap = "(clap)";

        for (int i = 0; i <= 5; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < bingo.length; k++) {
                    System.out.print(k < i ? clap : bingo[k]);
                    if (k < bingo.length - 1) {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            System.out.println("And Bingo was his name-o.");
        }
    }
}
    
