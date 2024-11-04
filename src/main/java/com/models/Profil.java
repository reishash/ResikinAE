package src.main.java.com.models;

public class Profil {
    // Attributes
    private int id_profil;
    private String nama_lengkap;
    private String email;
    private String nomor_telepon;
    private String alamat;
    private String statistik_kontribusi;

    // Constructor
    public Profil(int id_profil, String nama_lengkap, String email, String nomor_telepon, String alamat, String statistik_kontribusi) {
        this.id_profil = id_profil;
        this.nama_lengkap = nama_lengkap;
        this.email = email;
        this.nomor_telepon = nomor_telepon;
        this.alamat = alamat;
        this.statistik_kontribusi = statistik_kontribusi;
    }

    // Getter dan Setter untuk id_profil
    public int getId_profil() {
        return id_profil;
    }

    public void setId_profil(int id_profil) {
        this.id_profil = id_profil;
    }

    // Getter dan Setter untuk nama_lengkap
    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    // Getter dan Setter untuk email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter dan Setter untuk nomor_telepon
    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    // Getter dan Setter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter dan Setter untuk statistik_kontribusi
    public String getStatistik_kontribusi() {
        return statistik_kontribusi;
    }

    public void setStatistik_kontribusi(String statistik_kontribusi) {
        this.statistik_kontribusi = statistik_kontribusi;
    }

    
}
