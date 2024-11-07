package src.main.java.com.controllers;

import src.main.java.com.models.Profil;
import src.main.java.com.providers.UserProvider;
import src.main.java.com.ui.HalamanProfil;
import src.main.java.com.ui.HalamanEditProfil;

public class ProfilController {
    private HalamanProfil halamanProfil;
    private HalamanEditProfil halamanEditProfil;
    private UserProvider userProvider;

    public ProfilController(UserProvider userProvider) {
        this.userProvider = userProvider;
        this.halamanProfil = new HalamanProfil(this);
        this.halamanEditProfil = new HalamanEditProfil(this);
    }

    public void loadProfil(int userId) {
        Profil profil = userProvider.getProfilByUserId(userId);
        halamanProfil.displayProfil(profil);
    }

    public void showEditProfil() {
        halamanEditProfil.displayForm();
    }

    public void updateProfil(Profil updatedProfil) {
        userProvider.updateProfil(updatedProfil);
        loadProfil(updatedProfil.getId_profil());
    }

    public Profil getProfil(int userId) {
        Profil profil = userProvider.getProfilByUserId(userId);
        return new Profil(profil.getId_profil(), profil.getNama_lengkap(), profil.getEmail(), profil.getNomor_telepon(), profil.getAlamat(), profil.getStatistik_kontribusi());
    }
}
