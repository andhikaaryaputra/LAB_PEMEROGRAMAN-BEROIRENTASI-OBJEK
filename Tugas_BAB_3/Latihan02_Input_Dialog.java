package Tugas_BAB_3;

import javax.swing.JOptionPane;

public class Latihan02_Input_Dialog {
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();
        
        // Mengambil input berupa nama dari user
        String nama = jop.showInputDialog(null, "Masukan nama anda:");
        
        // Menampilkan hasil input ke konsol/terminal
        System.out.println(nama);
    }
}
