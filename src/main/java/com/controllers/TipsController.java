package src.main.java.com.controllers;
import src.main.java.com.models.TipsandTrickPengelolaanSampah;
import src.main.java.com.providers.TipsProvider;

public class TipsController {
    private TipsProvider tipsProvider;

    public TipsController() {
        this.tipsProvider = new TipsProvider();
    }

    // Menampilkan halaman Tips dan Trik Pengelolaan Sampah
    public void tampilkanHalamanTips() {
        tipsProvider.loadTips();
    }

    // Mencari artikel berdasarkan judul
    public TipsandTrickPengelolaanSampah cariArtikel(String judul) {
        return tipsProvider.selectArtikel(judul);
    }

    // Menyimpan artikel sebagai favorit
    public void simpanFavorit(TipsandTrickPengelolaanSampah artikel) {
        tipsProvider.simpanFavorit(artikel);
    }
}

