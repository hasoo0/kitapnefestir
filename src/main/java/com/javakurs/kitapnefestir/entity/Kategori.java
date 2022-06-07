package com.javakurs.kitapnefestir.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
public class Kategori {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long no;
    private String kategoriAd;

    @OneToMany(cascade=CascadeType.ALL,mappedBy="kategori")
            private Set<Kitap> kitaplar=new HashSet<>();
}
