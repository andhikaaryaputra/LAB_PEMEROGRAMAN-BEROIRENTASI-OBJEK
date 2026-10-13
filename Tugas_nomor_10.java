package Tugas_3;

import java.util.Scanner;

public class Tugas_nomor_10 {
    private static final String PIN_BENAR = "252310034";
    private static final double SALDO_AWAL = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = SALDO_AWAL;

        System.out.println("=== ATM SEDERHANA ===");

        while (true) {
            System.out.print("Masukkan PIN: ");
            String pin = scanner.nextLine();

            if (PIN_BENAR.equals(pin)) {
                break;
            }

            System.out.println("PIN tidak valid. Silakan masukkan kembali.\n");
        }

        boolean selesai = false;
        while (!selesai) {
            System.out.println("\n=== MENU ATM ===");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan menu: ");

            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.printf("Saldo Anda: Rp%,.2f%n", saldo);
                    break;
                case "2":
                    saldo += masukkanNominal(scanner, "Masukkan nominal setor: ");
                    System.out.printf("Setoran berhasil. Saldo Anda: Rp%,.2f%n", saldo);
                    break;
                case "3":
                    double penarikan = masukkanNominal(scanner, "Masukkan nominal tarik tunai: ");
                    if (penarikan > saldo) {
                        System.out.println("Saldo tidak cukup.");
                    } else {
                        saldo -= penarikan;
                        System.out.printf("Penarikan berhasil. Saldo Anda: Rp%,.2f%n", saldo);
                    }
                    break;
                case "4":
                    System.out.print("Apakah Anda yakin ingin keluar dari aplikasi? (Y/N): ");
                    String konfirmasi = scanner.nextLine();
                    if (konfirmasi.equalsIgnoreCase("Y")) {
                        selesai = true;
                        System.out.println("Terima kasih telah menggunakan ATM.");
                    }
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        }

        scanner.close();
    }

    private static double masukkanNominal(Scanner scanner, String pesan) {
        while (true) {
            System.out.print(pesan);
            try {
                double nominal = Double.parseDouble(scanner.nextLine());
                if (nominal > 0) {
                    return nominal;
                }
                System.out.println("Nominal harus lebih besar dari 0.");
            } catch (NumberFormatException e) {
                System.out.println("Masukkan nominal berupa angka yang valid.");
            }
        }
    }
}
