package Tugas_BAB_3;

import javax.swing.JOptionPane;

public class Latihan01_Masssage_Dialog {
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();
        
        // Message Dialog Sederhana
        jop.showMessageDialog(null, "This is a sample of Message Dialog");
        
        // Message Dialog dengan berbagai Jenis Ikon
        jop.showMessageDialog(null, "Pesan dengan INFORMATION MESSAGE", "Pesan Informasi", JOptionPane.INFORMATION_MESSAGE);
        jop.showMessageDialog(null, "Pesan dengan WARNING MESSAGE", "Pesan Warning", JOptionPane.WARNING_MESSAGE);
        jop.showMessageDialog(null, "Pesan dengan ERROR MESSAGE", "Pesan Error", JOptionPane.ERROR_MESSAGE);
        jop.showMessageDialog(null, "Pesan dengan QUESTION MESSAGE", "Pesan Pertanyaan", JOptionPane.QUESTION_MESSAGE);
    }
}
