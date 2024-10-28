package src.main.java.com.ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import src.main.java.com.models.RegisterLogin;
import src.main.java.com.models.User;

public class HalamanRegisterUI extends JFrame {
    private JTextField namaLengkapField;
    private JTextField tglLahirField;
    private JTextField namaIbuField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField konfirmasiPasswordField;
    private JRadioButton masyarakatButton;
    private JRadioButton pengelolaButton;
    private ButtonGroup roleGroup;
    private JButton registerButton;
    private RegisterLogin registerLogin;

    public HalamanRegisterUI() {
        FormRegist();
    }

    public void FormRegist() {
        setTitle("Form Registrasi");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 1));
        
        registerLogin= new RegisterLogin();

        // Tambahkan input fields
        add(new JLabel("Nama Lengkap:"));
        namaLengkapField = new JTextField();
        add(namaLengkapField);

        add(new JLabel("Tanggal Lahir (yyyy-mm-dd):"));
        tglLahirField = new JTextField();
        add(tglLahirField);

        add(new JLabel("Nama Ibu:"));
        namaIbuField = new JTextField();
        add(namaIbuField);

        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel("Konfirmasi Password:"));
        konfirmasiPasswordField = new JPasswordField();
        add(konfirmasiPasswordField);

        // Radio Buttons untuk Role
        add(new JLabel("Role:"));
        masyarakatButton = new JRadioButton("Masyarakat Umum");
        pengelolaButton = new JRadioButton("Pengelola Sampah");

        roleGroup = new ButtonGroup();
        roleGroup.add(masyarakatButton);
        roleGroup.add(pengelolaButton);

        add(masyarakatButton);
        add(pengelolaButton);

        // Tombol Registrasi
        registerButton = new JButton("Register");
        add(registerButton);

        // Event untuk Tombol Register
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pendaftaranUser();
            }
        });
        
        setVisible(true);
    }

    private void pendaftaranUser() {
        // Ambil data dari form
        String namaLengkap = namaLengkapField.getText();
        LocalDate tglLahir = LocalDate.parse(tglLahirField.getText());
        String namaIbu = namaIbuField.getText();
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String konfirmasiPassword = new String(konfirmasiPasswordField.getPassword());
        String roleUser = masyarakatButton.isSelected() ? "Masyarakat" : "Pengelola";

        if (!password.equals(konfirmasiPassword)) {
            JOptionPane.showMessageDialog(this, "Password tidak cocok! Registrasi gagal.");
            return;
        }

        // Buat objek User dengan data yang dimasukkan
        User newUser = new User(namaLengkap, tglLahir, namaIbu, username, password, roleUser);

        // Simpan ke RegisterLogin model
        registerLogin.setUserData(newUser);

        JOptionPane.showMessageDialog(this, "Registrasi berhasil! Selamat, " + newUser.getnamaLengkap());
        // Lanjutkan proses penyimpanan data pengguna ke sistem
    }
}

