
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) throws IOException {

        
        File file = new File("C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\Ogrenci.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fwriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fwriter);

        bufferedWriter.write("İd  |İsim       |Soyisim        |Numara               |Bölüm                      |Fakülte                                     \n");
        bufferedWriter.write("--------------------------------------------------------------------------------------------------------------------------------\n");

        Yazilim yazilim = new Yazilim();
        Mekatronik mekatronik = new Mekatronik();
        Makina makina = new Makina();
        EnerjiSistemleri enerjiSistemleri = new EnerjiSistemleri();
        Elektrik elektrik = new Elektrik();
        
        Scanner input = new Scanner(System.in);
        int secim;
        do {
            System.out.println("1)Yazılım");
            System.out.println("2)Mekatronik");
            System.out.println("3)Makina");
            System.out.println("4)Enerji Sistemleri");
            System.out.println("5)Elektrik");
            System.out.println("\nBölümü seçiniz : ");
            Scanner giris = new Scanner(System.in);
            secim = input.nextInt();
            switch (secim) {

                case 1:
                    System.out.println("Öğrenci adı : ");
                    yazilim.setAd(giris.next());
                    System.out.println("Öğrencini Soyadı :");
                    yazilim.setSoyad(giris.next());
                    System.out.println("Öğrencinin Numarası : ");
                    yazilim.setNumara(giris.next());
                    bufferedWriter.write(yazilim.getId() + "  |  "
                            + yazilim.getAd() + "  |  "
                            + yazilim.getSoyad() + "  |  "
                            + yazilim.getNumara() + "  |  "
                            + yazilim.getBolum() + "  |  "
                            + yazilim.fakulte + "\n");
                    yazilim.idArttır();
                    break;

                case 2:
                    System.out.println("Öğrenci adı : ");
                    mekatronik.setAd(giris.next());
                    System.out.println("Öğrencini Soyadı :");
                    mekatronik.setSoyad(giris.next());
                    System.out.println("Öğrencinin Numarası : ");
                    mekatronik.setNumara(giris.next());
                    bufferedWriter.write(mekatronik.getId() + "  |  "
                            + mekatronik.getAd() + "  |  "
                            + mekatronik.getSoyad() + "  |  "
                            + mekatronik.getNumara() + "  |  "
                            + mekatronik.getBolum() + "  |  "
                            + mekatronik.fakulte + "\n");
                    mekatronik.idArttır();
                    break;

                case 3:
                    System.out.println("Öğrenci adı : ");
                    makina.setAd(giris.next());
                    System.out.println("Öğrencini Soyadı :");
                    makina.setSoyad(giris.next());
                    System.out.println("Öğrencinin Numarası : ");
                    makina.setNumara(giris.next());
                    bufferedWriter.write(makina.getId() + "  |  "
                            + makina.getAd() + "  |  "
                            + makina.getSoyad() + "  |  "
                            + makina.getNumara() + "  |  "
                            + makina.getBolum() + "  |  "
                            + makina.fakulte + "\n");
                    makina.idArttır();
                    break;

                case 4:
                    System.out.println("Öğrenci adı : ");
                    enerjiSistemleri.setAd(giris.next());
                    System.out.println("Öğrencini Soyadı :");
                    enerjiSistemleri.setSoyad(giris.next());
                    System.out.println("Öğrencinin Numarası : ");
                    enerjiSistemleri.setNumara(giris.next());
                    bufferedWriter.write(enerjiSistemleri.getId() + "  |  "
                            + enerjiSistemleri.getAd() + "  |  "
                            + enerjiSistemleri.getSoyad() + "  |  "
                            + enerjiSistemleri.getNumara() + "  |  "
                            + enerjiSistemleri.getBolum() + "  |  "
                            + enerjiSistemleri.fakulte + "\n");
                    enerjiSistemleri.idArttır();
                    break;

                case 5:
                    System.out.println("Öğrenci adı : ");
                    elektrik.setAd(giris.next());
                    System.out.println("Öğrencini Soyadı :");
                    elektrik.setSoyad(giris.next());
                    System.out.println("Öğrencinin Numarası : ");
                    elektrik.setNumara(giris.next());
                    bufferedWriter.write(elektrik.getId() + "  |  "
                            + elektrik.getAd() + "  |  "
                            + elektrik.getSoyad() + "  |  "
                            + elektrik.getNumara() + "  |  "
                            + elektrik.getBolum() + "  |  "
                            + elektrik.fakulte + "\n");
                    elektrik.idArttır();
                    break;

                default:
                    break;
            }
        } while (secim <= 5);
        System.out.println("Kayıt Başarılı.");
        bufferedWriter.close();
    }

}
