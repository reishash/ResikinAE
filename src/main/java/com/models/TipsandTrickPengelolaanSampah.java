package src.main.java.com.models;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TipsandTrickPengelolaanSampah{
        // Atribut dengan sifat private
        private int id_artikel;
        private String judul_artikel;
        private String deskripsi_artikel;
        private String media_artikel;
        private Date tanggal_dibuat;
        private String jenis_sampah;
        private String konten;
    
        // Constructor
        public TipsandTrickPengelolaanSampah(int id_artikel, String judul_artikel, String deskripsi_artikel, String media_artikel, Date tanggal_dibuat, String jenis_sampah, String konten) {
            this.id_artikel = id_artikel;
            this.judul_artikel = judul_artikel;
            this.deskripsi_artikel = deskripsi_artikel;
            this.media_artikel = media_artikel;
            this.tanggal_dibuat = tanggal_dibuat;
            this.jenis_sampah = jenis_sampah;
            this.konten = konten;
        }
    
        // Getter dan Setter untuk id_artikel
        public int getId_artikel() {
            return id_artikel;
        }
    
        public void setId_artikel(int id_artikel) {
            this.id_artikel = id_artikel;
        }
    
        // Getter dan Setter untuk judul_artikel
        public String getJudul_artikel() {
            return judul_artikel;
        }
    
        public void setJudul_artikel(String judul_artikel) {
            this.judul_artikel = judul_artikel;
        }
    
        // Getter dan Setter untuk deskripsi_artikel
        public String getDeskripsi_artikel() {
            return deskripsi_artikel;
        }
    
        public void setDeskripsi_artikel(String deskripsi_artikel) {
            this.deskripsi_artikel = deskripsi_artikel;
        }
    
        // Getter dan Setter untuk media_artikel
        public String getMedia_artikel() {
            return media_artikel;
        }
    
        public void setMedia_artikel(String media_artikel) {
            this.media_artikel = media_artikel;
        }
    
        // Getter dan Setter untuk tanggal_dibuat
        public Date getTanggal_dibuat() {
            return tanggal_dibuat;
        }
    
        public void setTanggal_dibuat(Date tanggal_dibuat) {
            this.tanggal_dibuat = tanggal_dibuat;
        }
    
        // Getter dan Setter untuk jenis_sampah
        public String getJenis_sampah() {
            return jenis_sampah;
        }
    
        public void setJenis_sampah(String jenis_sampah) {
            this.jenis_sampah = jenis_sampah;
        }
    
        // Getter dan Setter untuk konten
        public String getKonten() {
            return konten;
        }
    
        public void setKonten(String konten) {
            this.konten = konten;
        }
        // Method untuk menampilkan informasi artikel
         public void tampilkanInformasiArtikel() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String tanggal = dateFormat.format(tanggal_dibuat);

        System.out.println("ID Artikel: " + id_artikel);
        System.out.println("Judul Artikel: " + judul_artikel);
        System.out.println("Deskripsi Artikel: " + deskripsi_artikel);
        System.out.println("Media Artikel: " + media_artikel);
        System.out.println("Tanggal Dibuat: " + tanggal);
        System.out.println("Jenis Sampah: " + jenis_sampah);
        System.out.println("Konten: " + konten);
    }
}