package com.javakurs.kitapnefestir.repository;

import com.javakurs.kitapnefestir.entity.Yazar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "yazar",path = "yazar")
@CrossOrigin(origins = "*")
public interface YazarRepository extends JpaRepository <Yazar, Long> {
}
