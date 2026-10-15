package Tugas_BAB_3;



import javax.swing.JOptionPane;

public class Latihan_Kebalikan_YES_dan_NO {
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();
        
        // Menampilkan pilihan YES / NO
        int confirm = jop.showConfirmDialog(null, 
                "Apakah ini kelas PBO?", 
                "Konfirmasi", 
                JOptionPane.YES_NO_OPTION);
        
        // Nilai return: YES = 0, NO = 1
        if (confirm == JOptionPane.YES_OPTION) { // atau confirm == 1
            jop.showMessageDialog(null, "Anda memilih YES");
        } else {
            jop.showMessageDialog(null, "Anda memilih NO");
        }
    }
}
