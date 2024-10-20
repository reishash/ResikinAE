package src.main.java.com.models;
import java.time.LocalDate;
import java.util.Scanner;

class Login {
    private User ;  // Simpan user yang sudah terdaftar

    // Metode untuk proses registrasi
    public void register() {
        Scanner scanner = new Scanner(System.in);

        // Menerima input dari user
        System.out.println("Registrasi Pengguna Baru:");
        System.out.print("Nama Lengkap: ");
        String fullName = scanner.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String birthDateInput = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateInput);  // Parsing tanggal

        System.out.print("Nama Ibu: ");
        String motherName = scanner.nextLine();

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        System.out.print("Konfirmasi Password: ");
        String confirmPassword = scanner.nextLine();

        System.out.print("Role (Masyarakat/Pengelola): ");
        String roleUser = scanner.nextLine();

        // Cek apakah password dan konfirmasi password sama
        if (!password.equals(confirmPassword)) {
            System.out.println("Password tidak cocok! Registrasi gagal.");
            return;
        }

        // Simpan user yang sudah diregistrasi
        registeredUser = new User(fullName, birthDate, motherName, username, password, roleUser);
        System.out.println("Registrasi berhasil!");
    }

    // Metode untuk proses login
    public void login() {
        Scanner scanner = new Scanner(System.in);

        if (registeredUser == null) {
            System.out.println("Tidak ada user yang terdaftar. Silakan registrasi terlebih dahulu.");
            return;
        }

        // Menerima input nama lengkap untuk login
        System.out.println("Login Pengguna:");
        System.out.print("Nama Lengkap: ");
        String inputFullName = scanner.nextLine();

        // Cek apakah nama lengkap sesuai dengan data registrasi
        if (registeredUser.checkNL(inputFullName)) {
            System.out.println("Login berhasil! Selamat datang, " + registeredUser.getFullName());
        } else {
            System.out.println("Nama lengkap salah! Login gagal.");
        }
    }

    public static void main(String[] args) {
        RegisterLogin app = new RegisterLogin();

        // Proses registrasi
        app.register();

        // Proses login
        app.login();
    }
}
