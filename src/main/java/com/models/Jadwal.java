package src.main.java.com.models;

import java.util.Date;
import src.main.java.com.utils.NotifikasiUtil;
import java.sql.Time;

public class Jadwal {

    // Attributes
    private int idJadwal;
    private Date tanggalJadwal;
    private Time jamJadwal;
    private String alamatJadwal;
    private String pusatJadwal;
    private double altitudeJadwal;
    private double latitudeJadwal;

    // Constructor
    public Jadwal(int idJadwal, Date tanggalJadwal, Time jamJadwal, String alamatJadwal, String pusatJadwal, double altitudeJadwal, double latitudeJadwal) {
        this.idJadwal = idJadwal;
        this.tanggalJadwal = tanggalJadwal;
        this.jamJadwal = jamJadwal;
        this.alamatJadwal = alamatJadwal;
        this.pusatJadwal = pusatJadwal;
        this.altitudeJadwal = altitudeJadwal;
        this.latitudeJadwal = latitudeJadwal;
    }

    // Getters and Setters
    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }

    public Date getTanggalJadwal() {
        return tanggalJadwal;
    }

    public void setTanggalJadwal(Date tanggalJadwal) {
        this.tanggalJadwal = tanggalJadwal;
    }

    public Time getJamJadwal() {
        return jamJadwal;
    }

    public void setJamJadwal(Time jamJadwal) {
        this.jamJadwal = jamJadwal;
    }

    public String getAlamatJadwal() {
        return alamatJadwal;
    }

    public void setAlamatJadwal(String alamatJadwal) {
        this.alamatJadwal = alamatJadwal;
    }

    public String getPusatJadwal() {
        return pusatJadwal;
    }

    public void setPusatJadwal(String pusatJadwal) {
        this.pusatJadwal = pusatJadwal;
    }

    public double getAltitudeJadwal() {
        return altitudeJadwal;
    }

    public void setAltitudeJadwal(double altitudeJadwal) {
        this.altitudeJadwal = altitudeJadwal;
    }

    public double getLatitudeJadwal() {
        return latitudeJadwal;
    }

    public void setLatitudeJadwal(double latitudeJadwal) {
        this.latitudeJadwal = latitudeJadwal;
    }

    // Method to display the schedule
    public void tampilkanJadwal() {
        System.out.println("Jadwal ID: " + idJadwal);
        System.out.println("Tanggal: " + tanggalJadwal);
        System.out.println("Jam: " + jamJadwal);
        System.out.println("Alamat: " + alamatJadwal);
        System.out.println("Pusat: " + pusatJadwal);
        System.out.println("Altitude: " + altitudeJadwal);
        System.out.println("Latitude: " + latitudeJadwal);
    }

    // Method to set the schedule
    public void aturJadwal(Date tanggalJadwal, Time jamJadwal, String pusatJadwal) {
        this.tanggalJadwal = tanggalJadwal;
        this.jamJadwal = jamJadwal;
        this.pusatJadwal = pusatJadwal;
    }

    // Method to send notifications
    public void kirimNotifikasi() {
        // Implementation to send notification, for example:
        NotifikasiUtil.kirim("Pengingat Jadwal", "Jadwal pada " + tanggalJadwal + " pukul " + jamJadwal);
    }
}