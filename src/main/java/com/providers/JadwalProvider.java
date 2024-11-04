package src.main.java.com.providers;

import src.main.java.com.models.Jadwal;
import java.util.List;

public class JadwalProvider {
    private JadwalProvider jadwalProvider = new JadwalProvider();

    public List<Jadwal> getJadwalByLokasi(String lokasi) {
        // Implementasi untuk mengambil data jadwal dari database
        return null;
    }

    public Jadwal[] selectJadwal(String lokasi) throws Exception {
        List<Jadwal> jadwalList = jadwalProvider.getJadwalByLokasi(lokasi);
        return jadwalList.toArray(new Jadwal[0]);
    }
}