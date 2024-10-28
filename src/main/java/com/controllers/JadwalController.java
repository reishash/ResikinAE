package src.main.java.com.controllers;

import src.main.java.com.providers.JadwalProvider;
import src.main.java.com.models.Jadwal;
import java.util.List;

public class JadwalController {
    private JadwalProvider jadwalProvider;

    public JadwalController() {
        this.jadwalProvider = new JadwalProvider();
    }

    public List<Jadwal> cariJadwal(String lokasi) {
        try {
            List<Jadwal> jadwalList = jadwalProvider.getJadwalByLokasi(lokasi);
            if (jadwalList.isEmpty()) {
                System.out.println("Lokasi tidak terdeteksi");
            }
            return jadwalList;
        } catch (Exception e) {
            System.out.println("Koneksi Database Error: " + e.getMessage());
            return null;
        }
    }
}