package Tugas_BAB_3;

import javax.swing.JOptionPane;

public class Gabungan_ke_3_Fungsi {
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();

        // === LATIHAN 01 (Message Dialog) ===
        jop.showMessageDialog(null, "This is a sample of Message Dialog");
        jop.showMessageDialog(null, "Pesan dengan INFORMATION MESSAGE", "Pesan Informasi", JOptionPane.INFORMATION_MESSAGE);
        
        // === LATIHAN 02 (Input Dialog) ===
        String nama = jop.showInputDialog(null, "Masukan nama anda:");
        System.out.println("Nama yang diinput: " + nama);
        
        // === LATIHAN 03 (Confirm Dialog) ===
        int confirm = jop.showConfirmDialog(null, "Apakah ini kelas PBO?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.NO_OPTION) {
            jop.showMessageDialog(null, "Anda memilih NO");
        } else {
            jop.showMessageDialog(null, "Anda memilih YES");
        }
    }
}