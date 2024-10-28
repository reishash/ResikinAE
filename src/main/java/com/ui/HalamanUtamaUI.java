package src.main.java.com.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HalamanUtamaUI extends JFrame {
    public HalamanUtamaUI() {
        setTitle("Halaman Utama");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btnJadwal = new JButton("Cari Jadwal Pengambilan Sampah");
        btnJadwal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FormPencarian formPencarian = new FormPencarian();
                formPencarian.tampilkan();
            }
        });
        
        add(btnJadwal);
        setLocationRelativeTo(null); // Center on screen
    }
}