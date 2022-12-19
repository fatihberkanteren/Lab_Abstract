
import java.io.File;

public abstract class Ogrenci {

    public abstract void yaz();

    public static int id = 1;
    private String ad;
    private String soyad;
    public static String fakulte = "Hasan Ferdi Turgutlu Teknoloji Fakültesi";
    private String numara;
    public java.util.Date tarih;
    public File file;

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public void idArttır() {
        id++;
    }
    
    
}
