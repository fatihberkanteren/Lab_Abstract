
public class EnerjiSistemleri extends Ogrenci {

    Ogrenci ogrenci;
    
    private String bolum = "Enerji Sistemleri Mühendisliği";

    @Override
    public void yaz() {
        System.out.println("Eneji");
    }

    public String getBolum() {
        return bolum;
    }


}
