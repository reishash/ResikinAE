package src.main.java.com;

import src.main.java.com.controllers.JadwalController;
import src.main.java.com.controllers.LoginController;
import src.main.java.com.ui.HalamanAwalUI;

public class Main {
    public static void main(String[] args) {
        LoginController loginController = new LoginController();
        JadwalController jadwalController = new JadwalController();
        HalamanAwalUI halamanAwalUI = new HalamanAwalUI(loginController, jadwalController);
        halamanAwalUI.tampilkan();
    }
}