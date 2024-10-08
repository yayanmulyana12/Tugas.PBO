package pertemuan6;

public class GanjilGenap {
    public static void main(String[] args) {
        // Pake for loop buat bilangan genap
        System.out.println("Bilangan Genap dari 0-20:");
        for (int i = 0; i <= 20; i += 2) {  // Nambahin langsung 2 buat iterasi genap
            System.out.print(i + " ");
        }

        // Pake do-while loop buat bilangan ganjil
        System.out.println("\nBilangan Ganjil dari 0-20:");
        int j = 1;  // Mulai dari 1 karena ganjil prtama
        do {
            System.out.print(j + " ");
            j += 2;  // Nambahin langsung 2 bust iterasi ganjil
        } while (j <= 20);
    }
}

