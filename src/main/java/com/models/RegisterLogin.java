package src.main.java.com.models;
import java.time.LocalDate;
// import java.util.Scanner;

import src.main.java.com.ui.LupaPasswordUI;

public class RegisterLogin {
    private User dataUser;
    // Metode untuk menyimpan data user setelah registrasi
    public void setUserData(User user) {
        this.dataUser = user;
    }
    public User getUserData() {
        return this.dataUser;
    }
    // Metode untuk proses registrasi
    // public User register() {
    // try (Scanner inp = new Scanner(System.in)){

    //     // Menerima input dari user
    //     System.out.println("Registrasi Pengguna Baru:");
    //     System.out.print("Nama Lengkap: ");
    //     String namaLengkap = inp.nextLine();

    //     System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
    //     String tglLahirInput = inp.nextLine();
    //     LocalDate tglLahir = LocalDate.parse(tglLahirInput);  // Parsing tanggal

    //     System.out.print("Nama Ibu: ");
    //     String namaIbu = inp.nextLine();

    //     System.out.print("Username: ");
    //     String username = inp.nextLine();

    //     System.out.print("Password: ");
    //     String password = inp.nextLine();

    //     System.out.print("Konfirmasi Password: ");
    //     String konfirmasiPw = inp.nextLine();

    //     System.out.print("Role (Masyarakat/Pengelola): ");
    //     String roleUser = inp.nextLine();

    //     // Cek apakah password dan konfirmasi password sama
    //     if (!password.equals(konfirmasiPw)) {
    //         System.out.println("Password tidak cocok! Registrasi gagal.");
    //         return null;
    //     }

    //     // Simpan user yang sudah diregistrasi
    //     dataUser = new User(namaLengkap, tglLahir, namaIbu, username, password, roleUser);
    //         System.out.println("Registrasi berhasil! Selamat, " + dataUser.getnamaLengkap());
    //         return dataUser;
    //     }
    // }

    public void login(String usn, String pw) {
    // try (Scanner inp = new Scanner(System.in)){
    //     System.out.println("Login Pengguna:");

    //     System.out.print("Username: ");
    //     String usn = inp.nextLine();

    //     System.out.print("Password: ");
    //     String pw = inp.nextLine();

        // Cek username dan password
        if (dataUser != null && dataUser.getUsername().equals(usn) && dataUser.getPassword().equals(pw)) {
            System.out.println("Login berhasil! Selamat datang kembali " + dataUser.getnamaLengkap());
        } else {
            System.out.println("Username atau password salah!");
            //panggil GUI lupa password
            new LupaPasswordUI(this); //buka GUI lupapassword
            // System.out.print("Apakah Anda lupa password? (y/n): ");
            // String choice = inp.nextLine();
            // if (choice.equalsIgnoreCase("y")) {
            //     lupaPassword();
            // }
        }
    }
    public void lupaPassword (String nmL, LocalDate tglLahirCheck, String nmI) {
        // try(Scanner inp = new Scanner(System.in)){

        // System.out.println("Verifikasi Lupa Password:");
        // System.out.print("Nama Lengkap: ");
        // String nmL = inp.nextLine();

        // System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        // String tglLhr = inp.nextLine();
        // LocalDate tglLahirCheck = LocalDate.parse(tglLhr);  // Parsing tanggal

        // System.out.print("Nama Ibu: ");
        // String nmI = inp.nextLine();

        // Cek data pribadi
        if (dataUser.getnamaLengkap().equals(nmL) && 
            dataUser.gettglLahir().equals(tglLahirCheck) && 
            dataUser.getnamaIbu().equals(nmI)) {
            // Jika cocok, tampilkan password
            System.out.println("Password Anda adalah: " + dataUser.getPassword());
            System.out.println("Login berhasil! Selamat datang kembali " + dataUser.getnamaLengkap());
        } else {
            System.out.println("Verifikasi akun gagal. Data pribadi tidak cocok.");
        }
        //}
    }
}
