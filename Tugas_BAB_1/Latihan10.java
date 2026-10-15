package Tugas_BAB_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Students member = new Students();

        System.out.print("Masukkan Nama Member : ");
        String namaMember = scanner.nextLine();
        member.getFullname(namaMember);

        System.out.print("Masukkan jumlah produk yang dibeli : ");
        int qty = scanner.nextInt();

        final int HARGA_SATUAN = 6300;
        int totalAwal = qty * HARGA_SATUAN;
        int kelipatan = qty / 3;
        int persenDiskon = kelipatan * 5; 
        double jumlahDiskon = totalAwal * (persenDiskon / 100.0);
        double subTotal = totalAwal - jumlahDiskon;

        LocalDateTime waktuSekarang = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");
        String tanggalFormatted = waktuSekarang.format(formatter);

        System.out.println("\nTOKO SERBAGUNA IBIK");
        System.out.println(tanggalFormatted);
        System.out.println("==========================================");
        System.out.printf("%-15s %-5s %-12s %-12s\n", "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.println("==========================================");
        System.out.printf("%-15s %-5d Rp %-9s Rp %-10s\n", "ROTI ENAK", qty, String.format("%,d", HARGA_SATUAN), String.format("%,d", totalAwal));
        System.out.println("------------------------------------------");
        System.out.println("Diskon    : " + persenDiskon + "%");
        System.out.printf("Sub Total : Rp %,.2f\n", subTotal);
        System.out.println("Member Name: " + member.getFullname(namaMember));
        System.out.println("==========================================");

        scanner.close();
    }
}