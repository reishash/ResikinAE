package src.main.java.com.ui;

import src.main.java.com.controllers.ProfilController;
import src.main.java.com.models.Profil;

import javax.swing.*;
import java.awt.*;

public class HalamanEditProfil extends JFrame {
    private ProfilController controller;
    private int id;
    private JTextField txtNama, txtEmail, txtNomor, txtAlamat;
    private JButton btnSave;

    public HalamanEditProfil(ProfilController controller, int id) {
        this.controller = controller;
        this.id = id;
        initializeUI();
        populateFields();
        addEventHandlers();
    }

    private void initializeUI() {
        setTitle("Edit Profil");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        txtNama = new JTextField();
        txtEmail = new JTextField();
        txtNomor = new JTextField();
        txtAlamat = new JTextField();
        btnSave = new JButton("Simpan");

        add(new JLabel("Nama Lengkap:"));
        add(txtNama);
        add(new JLabel("Email:"));
        add(txtEmail);
        add(new JLabel("Nomor Telepon:"));
        add(txtNomor);
        add(new JLabel("Alamat:"));
        add(txtAlamat);
        add(btnSave);
    }

    private void populateFields() {
        Profil profil = controller.getProfil(id);
        if (profil != null) { // Pastikan profil tidak null
            txtNama.setText(profil.getNama_lengkap());
            txtEmail.setText(profil.getEmail());
            txtNomor.setText(profil.getNomor_telepon());
            txtAlamat.setText(profil.getAlamat());
        } else {
            JOptionPane.showMessageDialog(this, "Profil tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addEventHandlers() {
        btnSave.addActionListener(e -> {
            Profil updatedProfil = new Profil(
                    id,
                    txtNama.getText(),
                    txtEmail.getText(),
                    txtNomor.getText(),
                    txtAlamat.getText(),
                    ""
            );
            controller.updateProfil(updatedProfil);
            this.setVisible(false);
        });
    }

    public void displayForm() {
        setVisible(true);
    }
}
