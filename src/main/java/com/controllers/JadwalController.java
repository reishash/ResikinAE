package src.main.java.com.controllers;

import src.main.java.com.providers.JadwalProvider;
import src.main.java.com.models.Jadwal;
import src.main.java.com.ui.FormPencarian;
import java.util.List;
import src.main.java.com.ui.DialogUI;

public class JadwalController {
    private JadwalProvider jadwalProvider;

    public JadwalController() {
        this.jadwalProvider = new JadwalProvider();
    }

    public void showPencarianJadwal() {
        // Implementasi untuk menampilkan form pencarian jadwal
        FormPencarian form = new FormPencarian();
        form.tampilkan();
    }

    public List<Jadwal> cariJadwal(String lokasi) {
        try {
            List<Jadwal> jadwalList = jadwalProvider.getJadwalByLokasi(lokasi);
            if (jadwalList.isEmpty()) {
                showDialog("Lokasi tidak terdeteksi");
            }
            return jadwalList;
        } catch (Exception e) {
            showDialog("Koneksi Database Error: " + e.getMessage());
            return null;
        }
    }

    public void displayJadwal(List<Jadwal> jadwalList) {
        FormPencarian form = new FormPencarian();
        form.displayJadwal(jadwalList);
    }

    private void showDialog(String message) {
        // Implementasi untuk menampilkan dialog pesan
        DialogUI dialog = new DialogUI();
        dialog.show(message);
    }

    public Jadwal[] selectJadwal(String lokasi) {
        try {
            return jadwalProvider.selectJadwal(lokasi);
        } catch (Exception e) {
            showDialog("Koneksi Database Error: " + e.getMessage());
            return null;
        }
    }
}