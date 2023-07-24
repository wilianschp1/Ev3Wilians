package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "instrumentos", path = "instrumentos")
public interface InstrumentoRepository extends PagingAndSortingRepository<instrumento, Integer>,CrudRepository<instrumento, Integer> {

    List<instrumento> findByNombre(@Param("nombre") String nombre);

}