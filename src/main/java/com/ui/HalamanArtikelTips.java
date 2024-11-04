package src.main.java.com.ui;

import src.main.java.com.controllers.TipsController;
import src.main.java.com.models.TipsandTrickPengelolaanSampah;
import javax.swing.*;

public class HalamanArtikelTips {
    private TipsController tipsController;
    private TipsandTrickPengelolaanSampah artikelSaatIni;

    public HalamanArtikelTips(String judul) {
        tipsController = new TipsController();
        artikelSaatIni = tipsController.cariArtikel(judul);

        if (artikelSaatIni != null) {
            tampilkanArtikel();
        } else {
            new DialogUI().showMessage("Artikel tidak dapat diakses");
        }
    }

    private void tampilkanArtikel() {
        JFrame frame = new JFrame("Artikel");
        JTextArea artikelKonten = new JTextArea(artikelSaatIni.getKonten());
        frame.add(artikelKonten);
        
        JButton favoritButton = new JButton("Simpan sebagai Favorit");
        favoritButton.addActionListener(e -> simpanSebagaiFavorit());

        frame.add(favoritButton);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    private void simpanSebagaiFavorit() {
        tipsController.simpanFavorit(artikelSaatIni);
        new DialogUI().showMessage("Artikel berhasil disimpan sebagai favorit.");
    }
}

