package src.main.java.com.providers;
import src.main.java.com.models.TipsandTrickPengelolaanSampah;
import java.util.ArrayList;
import java.util.List;

public class TipsProvider {
    private List<TipsandTrickPengelolaanSampah> tipsList = new ArrayList<>();

    // Memuat semua tips
    public void loadTips() {
        // Implementasi pemuatan data dari sumber (misalnya database)
    }

    // Mencari artikel berdasarkan judul
    public TipsandTrickPengelolaanSampah selectArtikel(String judul) {
        for (TipsandTrickPengelolaanSampah tip : tipsList) {
            if (tip.getJudul_artikel().equalsIgnoreCase(judul)) {
                return tip;
            }
        }
        return null;
    }

    // Menyimpan artikel ke favorit
    public void simpanFavorit(TipsandTrickPengelolaanSampah artikel) {
        // Implementasi menyimpan artikel sebagai favorit
    }
}
