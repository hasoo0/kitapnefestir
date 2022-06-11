package com.javakurs.kitapnefestir.config;


import com.javakurs.kitapnefestir.entity.Kategori;
import com.javakurs.kitapnefestir.entity.Kitap;
import jdk.jfr.internal.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {


        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config,CorsRegistry cors) {
            config.exposeIdsFor(Kitap.class);
            config.exposeIdsFor(Kategori.class);
        }
    }