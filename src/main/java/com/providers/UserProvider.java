package src.main.java.com.providers;

import src.main.java.com.models.Profil;

public class UserProvider {
    public Profil getProfilByUserId(int userId) {
        // Logika mengambil profil dari database atau objek mock
        return new Profil(1, "John Doe", "john@example.com", "123456789", "Main St 42", "Kontribusi Aktif");
    }

    public void updateProfil(Profil profil) {
        // Logika untuk mengupdate profil di database
        System.out.println("Profil berhasil diperbarui untuk: " + profil.getNama_lengkap());
    }
}
