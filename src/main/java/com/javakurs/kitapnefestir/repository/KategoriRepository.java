package com.javakurs.kitapnefestir.repository;

import com.javakurs.kitapnefestir.entity.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource(collectionResourceRel = "kategori",path = "kategori")
@CrossOrigin(origins = "*")
public interface KategoriRepository extends JpaRepository<Kategori, Long> {
}
