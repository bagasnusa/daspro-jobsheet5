import java.util.Scanner;

public class PemilihanPercobaan1No06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan angka:");
        int angka = input.nextInt();
        
        String jenisBilangan = (angka % 2 == 0) ? "genap" : ((angka % 5 == 0) ? "ganjil" : "bukan genap maupun ganjil");
        
        System.out.println("Angka " + angka + " adalah bilangan " + jenisBilangan);
    }
}

