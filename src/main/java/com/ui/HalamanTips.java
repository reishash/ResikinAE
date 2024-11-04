package src.main.java.com.ui;
import src.main.java.com.controllers.TipsController;

public class HalamanTips {
    private TipsController tipsController;

    public HalamanTips() {
        tipsController = new TipsController();
        tampilkanHalaman();
    }

    private void tampilkanHalaman() {
        tipsController.tampilkanHalamanTips();
    }
}
