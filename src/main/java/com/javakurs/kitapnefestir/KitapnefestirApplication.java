package com.javakurs.kitapnefestir;

import com.javakurs.kitapnefestir.entity.Kategori;
import com.javakurs.kitapnefestir.entity.Kitap;
import com.javakurs.kitapnefestir.entity.Yazar;
import com.javakurs.kitapnefestir.repository.KitapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Set;

@SpringBootApplication
public class KitapnefestirApplication implements CommandLineRunner {

    @Autowired
    private KitapRepository  kitapRepository;

    public static void main(String[] args) {
        SpringApplication.run(KitapnefestirApplication.class, args);
    }


    @Override
    public void run(String ... args)throws Exception {
        Kitap kitap1 = new Kitap();
        kitap1.setIsbnNo("9786057429544");
        kitap1.setAd("Sarıkamış Gerçeği Beyaz Ölüm");
        kitap1.setAciklama("Allahuekber dağlarında donarak ölen 90000 şehidimizin hikayesi");
        kitap1.setBirimFiyat(BigDecimal.valueOf(42.35));
        kitap1.setResimUrl("https://img.kitapyurdu.com/v1/getImage/fn:11481576/wh:true/wi:220");
        kitap1.setBasimVarmi(true);
        kitap1.setStokMiktar(2);
        kitap1.setOlusturulmaTrh(new java.util.Date());
        kitap1.setSonGuncellemeTrh(new java.util.Date());
        Kitap kitap2 = new Kitap();
        kitap2.setIsbnNo("9789750407284");
        kitap2.setAd("Unutulmaz Köy Enstitüleri");

        kitap2.setAciklama("Fakir Baykurt'un,kendisinin de yetiştiği Köy Enstitüleri üzerine yazdıkları");
        kitap2.setBirimFiyat(BigDecimal.valueOf(24.89));
        kitap2.setResimUrl("https://img.kitapyurdu.com/v1/getImage/fn:11398807/wh:true/wi:220");
        kitap2.setBasimVarmi(true);
        kitap2.setStokMiktar(3);
        kitap2.setOlusturulmaTrh(new java.util.Date());
        kitap2.setSonGuncellemeTrh(new java.util.Date());

        Kitap kitap3 = new Kitap();
        kitap3.setIsbnNo("9786254203282");
        kitap3.setAd("Ayyasin Kizi");
        kitap3.setAciklama("Babam ayyaştı ama bin ayığa değişmezdim anne.");
        kitap3.setBirimFiyat(BigDecimal.valueOf(42.89));
        kitap3.setResimUrl("https://img.kitapyurdu.com/v1/getImage/fn:11398807/wh:true/wi:220");
        kitap3.setBasimVarmi(true);
        kitap3.setStokMiktar(3);
        kitap3.setOlusturulmaTrh(new java.util.Date());
        kitap3.setSonGuncellemeTrh(new java.util.Date());



        Kategori kategori1 = new Kategori();
        kategori1.setKategoriAd("Tarih");

        Kategori kategori2 = new Kategori();
        kategori2.setKategoriAd("Eğitim");

        Yazar yazar1 = new Yazar();
        yazar1.setAd("Yasar");
        yazar1.setSoyad("Kemal");

        Yazar yazar2 = new Yazar();
        yazar2.setAd("Oguz");
        yazar2.setSoyad("Atay");

        Yazar yazar3 = new Yazar();
        yazar3.setAd("Muhittin");
        yazar3.setSoyad("Guneri");


        kitap1.setKategori(kategori1);
        kitap2.setKategori(kategori2);
        kitap3.setKategori(kategori1);

       kategori1.getKitaplar().add(kitap1);
       kategori1.getKitaplar().add(kitap3);
       kategori1.getKitaplar().add(kitap2);

        kitap1.setYazar(yazar1);
        kitap2.setYazar(yazar2);
        kitap3.setYazar(yazar1);

        yazar1.getKitaplar().add(kitap1);
        yazar1.getKitaplar().add(kitap3);
        yazar2.getKitaplar().add(kitap2);


        kitapRepository.save(kitap1);
        kitapRepository.save(kitap2);
        kitapRepository.save(kitap3);



        Set<Kitap> kitaplar = kategori1.getKitaplar();

        for (Kitap kitap: kitaplar){
            System.out.println(kitap.getAd());
        }

       // kitaplar.forEach((k) -> { System.out.println(); });


        kitap3.setYazar(yazar3);
        yazar3.getKitaplar().add(kitap3);
        kitapRepository.save(kitap3);











    }
}
