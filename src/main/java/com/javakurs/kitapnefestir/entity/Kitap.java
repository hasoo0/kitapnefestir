package com.javakurs.kitapnefestir.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.GenerationType;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
public class Kitap{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long no;
    private String isbnNo;
    private String ad;
    private String aciklama;
    private BigDecimal birimFiyat;
    private String resimUrl;
    private boolean basimVarmi;
    private int stokMiktar;
    private Date olusturulmaTrh;
    private Date sonGuncellemeTrh;


    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="kategori_no")
    private Kategori kategori;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="yazar_no")
    private Yazar Yazar;

}