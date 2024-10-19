package src.main.java.com.models;

public class Lokasi {
    private int idLokasi;
    private String namaLokasi;
    private double altitudeLokasi;
    private double latitudeLokasi;

    // Constructor
    public Lokasi(int idLokasi, String namaLokasi, double altitudeLokasi, double latitudeLokasi) {
        this.idLokasi = idLokasi;
        this.namaLokasi = namaLokasi;
        this.altitudeLokasi = altitudeLokasi;
        this.latitudeLokasi = latitudeLokasi;
    }

    // Getters and Setters
    public int get_idLokasi() {
        return idLokasi;
    }

    public void set_idLokasi(int idLokasi) {
        this.idLokasi = idLokasi;
    }

    public String get_namaLokasi() {
        return namaLokasi;
    }

    public void set_namaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    public double get_altitudeLokasi() {
        return altitudeLokasi;
    }

    public void set_altitudeLokasi(double altitudeLokasi) {
        this.altitudeLokasi = altitudeLokasi;
    }

    public double get_latitudeLokasi() {
        return latitudeLokasi;
    }

    public void set_latitudeLokasi(double latitudeLokasi) {
        this.latitudeLokasi = latitudeLokasi;
    }

    // Methods
    public String deteksiLokasi() {
        // Logic to detect location
        return "Lokasi terdeteksi: " + namaLokasi + " pada latitude: " + latitudeLokasi + " dan altitude: " + altitudeLokasi;
    }

    public void inputManualLokasi(int idLokasi, String namaLokasi, double altitudeLokasi, double latitudeLokasi) {
        this.idLokasi = idLokasi;
        this.namaLokasi = namaLokasi;
        this.altitudeLokasi = altitudeLokasi;
        this.latitudeLokasi = latitudeLokasi;
    }
}