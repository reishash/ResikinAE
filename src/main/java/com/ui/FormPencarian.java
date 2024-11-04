package src.main.java.com.ui;

import src.main.java.com.controllers.JadwalController;
import src.main.java.com.models.Jadwal;
import java.util.List;
import javax.swing.*;

public class FormPencarian {
    private JadwalController jadwalController;
    private DialogUI dialogUI;

    public FormPencarian() {
        jadwalController = new JadwalController();
        dialogUI = new DialogUI();
    }

    public void tampilkan() {
        JFrame frame = new JFrame("Form Pencarian Jadwal");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelLokasi = new JLabel("Lokasi");
        labelLokasi.setBounds(20, 20, 100, 20); 
        frame.add(labelLokasi);

        JTextField fieldLokasi = new JTextField();
        fieldLokasi.setBounds(120, 20, 200, 20);
        frame.add(fieldLokasi);

        JButton buttonCari = new JButton("Cari");
        buttonCari.setBounds(20, 50, 100, 20);
        buttonCari.addActionListener(e -> {
            String lokasi = fieldLokasi.getText();
            List<Jadwal> jadwalList = jadwalController.cariJadwal(lokasi);
            if (jadwalList != null && !jadwalList.isEmpty()) {
                displayJadwal(jadwalList);
            } else {
                dialogUI.show("Lokasi tidak terdeteksi");
            }
        });
        frame.add(buttonCari);

        frame.setVisible(true);
    }

    public void displayJadwal(List<Jadwal> jadwalList) {
        StringBuilder sb = new StringBuilder("Daftar Jadwal:\n");
        for (Jadwal jadwal : jadwalList) {
            sb.append(jadwal.toString()).append("\n");
        }
        dialogUI.show(sb.toString());
    }
}