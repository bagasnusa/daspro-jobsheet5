import java.util.Scanner;

public class tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus, novel, lainnya): ");
        String jenisBuku = input.next().toLowerCase();

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = input.nextInt();

        double diskon = 0.0; // Inisialisasi diskon awal

        if (jenisBuku.equals("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 0.10 + 0.02; // Diskon 10% + tambahan 2% jika lebih dari 2 buku
            } else {
                diskon = 0.10; // Diskon 10%
            }
        } else if (jenisBuku.equals("novel")) {
            if (jumlahBuku > 3) {
                diskon = 0.07 + 0.02; // Diskon 7% + tambahan 2% jika lebih dari 3 buku
            } else {
                diskon = 0.07 + 0.01; // Diskon 7% + tambahan 1% jika 3 buku atau kurang
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05; // Diskon 5% untuk buku selain kamus dan novel jika lebih dari 3 buku
            }
        }

        double totalHarga = 100; // Harga per buku
        double totalDiskon = totalHarga * jumlahBuku * diskon;
        
        System.out.println("Jumlah Diskon: " + (totalDiskon * 100) + "%");
    }
}

    

