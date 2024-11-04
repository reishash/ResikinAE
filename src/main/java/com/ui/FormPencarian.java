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
        String lokasi = JOptionPane.showInputDialog("Masukkan Lokasi:");
        if (lokasi != null && !lokasi.isEmpty()) {
            List<Jadwal> jadwalList = jadwalController.cariJadwal(lokasi);
            if (jadwalList != null && !jadwalList.isEmpty()) {
                StringBuilder jadwalDisplay = new StringBuilder("Daftar Jadwal:\n");
                for (Jadwal jadwal : jadwalList) {
                    jadwalDisplay.append(jadwal.getTanggalJadwal()).append(" - ")
                                 .append(jadwal.getJamJadwal()).append(" - ")
                                 .append(jadwal.getAlamatJadwal()).append("\n");
                }
                dialogUI.show(jadwalDisplay.toString());
            } else {
                dialogUI.show("Lokasi tidak terdeteksi");
            }
        } else {
            dialogUI.show("Lokasi tidak boleh kosong");
        }
    }
}