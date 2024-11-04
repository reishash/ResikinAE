package src.main.java.com.ui;

import src.main.java.com.controllers.ProfilController;
import src.main.java.com.models.Profil;

import javax.swing.*;
import java.awt.*;

public class HalamanProfil extends JFrame {
    private ProfilController controller;
    private JLabel labelNama, labelEmail, labelNomor, labelAlamat;
    private JButton btnEditProfil;

    public HalamanProfil(ProfilController controller) {
        this.controller = controller;
        setTitle("Halaman Profil");
        setSize(400, 300);
        setLayout(new GridLayout(5, 1));

        labelNama = new JLabel("Nama Lengkap: ");
        labelEmail = new JLabel("Email: ");
        labelNomor = new JLabel("Nomor Telepon: ");
        labelAlamat = new JLabel("Alamat: ");
        btnEditProfil = new JButton("Edit Profil");

        btnEditProfil.addActionListener(e -> {
            controller.showEditProfil();
            // Use the controller to fetch and display the profile
            Profil profil = controller.getProfil();
            displayProfil(profil);
        });

        add(labelNama);
        add(labelEmail);
        add(labelNomor);
        add(labelAlamat);
        add(btnEditProfil);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void displayProfil(Profil profil) {
        labelNama.setText("Nama Lengkap: " + profil.getNama_lengkap());
        labelEmail.setText("Email: " + profil.getEmail());
        labelNomor.setText("Nomor Telepon: " + profil.getNomor_telepon());
        labelAlamat.setText("Alamat: " + profil.getAlamat());
        setVisible(true);
    }
}
