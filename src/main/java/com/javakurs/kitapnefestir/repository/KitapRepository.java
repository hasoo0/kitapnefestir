package com.javakurs.kitapnefestir.repository;

import com.javakurs.kitapnefestir.entity.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource(collectionResourceRel = "kitap",path = "kitap")
@CrossOrigin(origins = "*")
public interface KitapRepository extends JpaRepository <Kitap, Long> {
}
