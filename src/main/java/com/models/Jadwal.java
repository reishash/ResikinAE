package src.main.java.com.models;
import java.time.LocalDate;
import java.time.LocalTime;
public class Jadwal {
    private int idJadwal;
    private LocalDate tanggalJadwal;
    private LocalTime jamJadwal;
    private String alamatJadwal;
    private String pusatJadwal;
    private double altitude;
    private double latitude;

    public Jadwal(int idJadwal, LocalDate tanggalJadwal, LocalTime jamJadwal, String alamatJadwal, String pusatJadwal, double altitude, double latitude) {
        this.idJadwal = idJadwal;
        this.tanggalJadwal = tanggalJadwal;
        this.jamJadwal = jamJadwal;
        this.alamatJadwal = alamatJadwal;
        this.pusatJadwal = pusatJadwal;
        this.altitude = altitude;
        this.latitude = latitude;
    }

    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }

    public LocalDate getTanggalJadwal() {
        return tanggalJadwal;
    }

    public void setTanggalJadwal(LocalDate tanggalJadwal) {
        this.tanggalJadwal = tanggalJadwal;
    }

    public LocalTime getJamJadwal() {
        return jamJadwal;
    }

    public void setJamJadwal(LocalTime jamJadwal) {
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

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

}

