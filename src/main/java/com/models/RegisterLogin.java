package src.main.java.com.models;
import java.time.LocalDate;
import java.util.Scanner;

public class RegisterLogin {
    // private User dataUser;
    // Metode untuk proses registrasi
    public User register() {
    try (Scanner inp = new Scanner(System.in)){

        // Menerima input dari user
        System.out.println("Registrasi Pengguna Baru:");
        System.out.print("Nama Lengkap: ");
        String namaLengkap = inp.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tglLahirInput = inp.nextLine();
        LocalDate tglLahir = LocalDate.parse(tglLahirInput);  // Parsing tanggal

        System.out.print("Nama Ibu: ");
        String namaIbu = inp.nextLine();

        System.out.print("Username: ");
        String username = inp.nextLine();

        System.out.print("Password: ");
        String password = inp.nextLine();

        System.out.print("Konfirmasi Password: ");
        String konfirmasiPw = inp.nextLine();

        System.out.print("Role (Masyarakat/Pengelola): ");
        String roleUser = inp.nextLine();

        // Cek apakah password dan konfirmasi password sama
        if (!password.equals(konfirmasiPw)) {
            System.out.println("Password tidak cocok! Registrasi gagal.");
            return null;
        }

        // Simpan user yang sudah diregistrasi
        return new User(namaLengkap, tglLahir, namaIbu, username, password, roleUser);
        }
    }

//     public User login() {
//         Scanner scanner = new Scanner(System.in);

//         // Input untuk login
//         System.out.println("Login Pengguna:");
//         System.out.print("Nama Lengkap: ");
//         String  = scanner.nextLine();

//         // Cek nama lengkap
//         if (registeredUser.getFullName().equals(inputFullName)) {
//             System.out.println("Login berhasil! Selamat datang, " + registeredUser.getFullName());
//         } else {
//             System.out.println("Nama lengkap salah! Login gagal.");
//         }
//     }
}
