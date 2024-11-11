package src.main.java.com.controllers;

import src.main.java.com.models.Profil;
import src.main.java.com.providers.UserProvider;
import src.main.java.com.ui.HalamanProfil;
import src.main.java.com.ui.HalamanEditProfil;

public class ProfilController {
    private HalamanProfil halamanProfil;
    private HalamanEditProfil halamanEditProfil;
    private UserProvider userProvider;
    private int userId;

    public ProfilController(UserProvider userProvider, int userId) {
        this.userProvider = userProvider;
        this.userId = userId;
        this.halamanProfil = new HalamanProfil(this);
        this.halamanEditProfil = new HalamanEditProfil(this, userId);
    }

    public void loadProfil() {
        Profil profil = userProvider.getProfilByUserId(userId);
        if (profil != null) {
            halamanProfil.displayProfil(profil);
        } else {
            System.out.println("Profil tidak ditemukan untuk userId: " + userId);
        }
    }

    public void showEditProfil() {
        halamanEditProfil.displayForm();
    }

    public void updateProfil(Profil updatedProfil) {
        userProvider.updateProfil(updatedProfil);
        loadProfil();
    }

    public Profil getProfil(int userId) {
        return userProvider.getProfilByUserId(userId); // pastikan metode ini mengembalikan profil yang valid atau null
    }
}
