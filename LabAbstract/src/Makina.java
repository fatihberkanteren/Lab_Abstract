
public class Makina extends Ogrenci {

    Ogrenci ogrenci;
    
    private String bolum = "Makina Mühendisliği";

    @Override
    public void yaz() {
        System.out.println("Makina");
    }

    public String getBolum() {
        return bolum;
    }

}
