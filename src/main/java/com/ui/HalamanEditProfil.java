package src.main.java.com.ui;

import src.main.java.com.controllers.ProfilController;
import src.main.java.com.models.Profil;

import javax.swing.*;
import java.awt.*;

public class HalamanEditProfil extends JFrame {
    private ProfilController controller;
    private JTextField txtNama, txtEmail, txtNomor, txtAlamat;
    private JButton btnSave;

    public HalamanEditProfil(ProfilController controller) {
        this.controller = controller;
        setTitle("Edit Profil");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));

        txtNama = new JTextField();
        txtEmail = new JTextField();
        txtNomor = new JTextField();
        txtAlamat = new JTextField();
        btnSave = new JButton("Simpan");

        btnSave.addActionListener(e -> {
            Profil updatedProfil = new Profil(
                    1,
                    txtNama.getText(),
                    txtEmail.getText(),
                    txtNomor.getText(),
                    txtAlamat.getText(),
                    ""
            );
            controller.updateProfil(updatedProfil);
            this.setVisible(false);
        });

        add(new JLabel("Nama Lengkap:"));
        add(txtNama);
        add(new JLabel("Email:"));
        add(txtEmail);
        add(new JLabel("Nomor Telepon:"));
        add(txtNomor);
        add(new JLabel("Alamat:"));
        add(txtAlamat);
        add(btnSave);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void displayForm() {
        setVisible(true);
    }
}
