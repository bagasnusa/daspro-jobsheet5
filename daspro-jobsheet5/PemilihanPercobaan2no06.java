import java.util.Scanner;

public class PemilihanPercobaan2no06 {
    public static void main(String[] args) {
        Scanner inputAbsen = new Scanner(System.in);

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = inputAbsen.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = inputAbsen.nextDouble();

        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = inputAbsen.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = inputAbsen.nextDouble();

        // Menghitung nilai akhir berdasarkan bobot
        double nilaiAkhir = (0.4 * nilaiUAS) + (0.3 * nilaiUTS) + (0.1 * nilaiKuis) + (0.2 * nilaiTugas);

        // Menentukan nilai huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 85) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);

        inputAbsen.close();
    }
}


    

