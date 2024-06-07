package com.mtec.crudlibro.repository;

import com.mtec.crudlibro.model.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepo extends CrudRepository<Libro, Integer> {

}
