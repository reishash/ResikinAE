package src.main.java.com.models;

import java.time.LocalDateTime;

public class RiwayatAktivitas {
    // Attributes
    private int id_riwayat;
    private int id_user;
    private String deskripsi_aktivitas;
    private LocalDateTime tanggal_aktivitas;

    // Constructor
    public RiwayatAktivitas(int id_riwayat, int id_user, String deskripsi_aktivitas, LocalDateTime tanggal_aktivitas) {
        this.id_riwayat = id_riwayat;
        this.id_user = id_user;
        this.deskripsi_aktivitas = deskripsi_aktivitas;
        this.tanggal_aktivitas = tanggal_aktivitas;
    }

    // Getter dan Setter untuk id_riwayat
    public int getId_riwayat() {
        return id_riwayat;
    }

    public void setId_riwayat(int id_riwayat) {
        this.id_riwayat = id_riwayat;
    }

    // Getter dan Setter untuk id_user
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    // Getter dan Setter untuk deskripsi_aktivitas
    public String getDeskripsi_aktivitas() {
        return deskripsi_aktivitas;
    }

    public void setDeskripsi_aktivitas(String deskripsi_aktivitas) {
        this.deskripsi_aktivitas = deskripsi_aktivitas;
    }

    // Getter dan Setter untuk tanggal_aktivitas
    public LocalDateTime getTanggal_aktivitas() {
        return tanggal_aktivitas;
    }

    public void setTanggal_aktivitas(LocalDateTime tanggal_aktivitas) {
        this.tanggal_aktivitas = tanggal_aktivitas;
    }
}
