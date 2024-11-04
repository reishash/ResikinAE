package src.main.java.com.providers;

import src.main.java.com.models.Jadwal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class JadwalProvider {
    Jadwal[] jadwalList = {
        
    };
    
    
    public List<Jadwal> getJadwalByLokasi(String lokasi) {
        // Simulasi pencarian data dari database berdasarkan lokasi
        List<Jadwal> jadwalList = new ArrayList<>();

        // Contoh data jadwal, biasanya data ini akan diambil dari database
        if (lokasi.equalsIgnoreCase("Lokasi A")) {
            jadwalList.add(new Jadwal(1, LocalDate.now(), LocalTime.of(10, 0), "Alamat A", "Pusat A", -7.123, 112.456));
        } else if (lokasi.equalsIgnoreCase("Lokasi B")) {
            jadwalList.add(new Jadwal(2, LocalDate.now(), LocalTime.of(14, 0), "Alamat B", "Pusat B", -7.789, 112.789));
        }
        
        return jadwalList;
    }
}