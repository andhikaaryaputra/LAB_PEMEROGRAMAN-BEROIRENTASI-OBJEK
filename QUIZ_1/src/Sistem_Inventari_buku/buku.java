package Sistem_Inventari_buku;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class buku extends JFrame {

    private final String[] daftarBuku = new String[100];
    private int jumlahBuku = 0;

    private final JTextField inputJudul = new JTextField();
    private final JTextField inputIndeks = new JTextField();
    private final JTextArea areaData = new JTextArea();

    public buku() {
        setTitle("Sistem Inventaris Buku");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        areaData.setEditable(false);
        areaData.setText("Belum ada data buku.");

        JPanel panelInput = new JPanel(new GridLayout(2, 2, 5, 5));
        panelInput.add(new JLabel("Judul buku:"));
        panelInput.add(inputJudul);
        panelInput.add(new JLabel("Indeks buku:"));
        panelInput.add(inputIndeks);

        JButton tombolSimpan = new JButton("Simpan Buku");
        JButton tombolHapus = new JButton("Hapus Buku");
        JButton tombolTampil = new JButton("Output Seluruh Data");
        JButton tombolKeluar = new JButton("Keluar");

        JPanel panelTombol = new JPanel(new GridLayout(1, 4, 5, 5));
        panelTombol.add(tombolSimpan);
        panelTombol.add(tombolHapus);
        panelTombol.add(tombolTampil);
        panelTombol.add(tombolKeluar);

        JPanel panelAtas = new JPanel(new BorderLayout(5, 5));
        panelAtas.add(panelInput, BorderLayout.CENTER);
        panelAtas.add(panelTombol, BorderLayout.SOUTH);

        add(panelAtas, BorderLayout.NORTH);
        add(new JScrollPane(areaData), BorderLayout.CENTER);

        tombolSimpan.addActionListener(e -> simpanBuku());
        tombolHapus.addActionListener(e -> hapusBuku());
        tombolTampil.addActionListener(e -> tampilkanBuku());
        tombolKeluar.addActionListener(e -> System.exit(0));
    }

    private void simpanBuku() {
        String judul = inputJudul.getText().trim();

        if (judul.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Judul buku harus diisi.");
        } else if (jumlahBuku == daftarBuku.length) {
            JOptionPane.showMessageDialog(this, "Data buku sudah penuh.");
        } else {
            daftarBuku[jumlahBuku] = judul;
            jumlahBuku++;
            inputJudul.setText("");
            tampilkanBuku();
            JOptionPane.showMessageDialog(this, "Buku berhasil disimpan.");
        }
    }

    private void hapusBuku() {
        try {
            int indeks = Integer.parseInt(inputIndeks.getText().trim());

            if (indeks < 0 || indeks >= jumlahBuku) {
                JOptionPane.showMessageDialog(this, "Indeks tidak ditemukan.");
                return;
            }

            for (int i = indeks; i < jumlahBuku - 1; i++) {
                daftarBuku[i] = daftarBuku[i + 1];
            }

            daftarBuku[jumlahBuku - 1] = null;
            jumlahBuku--;
            inputIndeks.setText("");
            tampilkanBuku();
            JOptionPane.showMessageDialog(this, "Buku berhasil dihapus.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Indeks harus berupa angka.");
        }
    }

    private void tampilkanBuku() {
        if (jumlahBuku == 0) {
            areaData.setText("Belum ada data buku.");
            return;
        }

        String hasil = "Daftar Buku:\n";
        for (int i = 0; i < jumlahBuku; i++) {
            hasil += i + ". " + daftarBuku[i] + "\n";
        }
        areaData.setText(hasil);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new buku().setVisible(true));
    }
}
