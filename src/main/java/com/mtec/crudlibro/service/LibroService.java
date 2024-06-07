package com.mtec.crudlibro.service;

import com.mtec.crudlibro.model.Libro;

import java.util.List;

public interface LibroService {
    public List<Libro> findAll();
    public Libro save(Libro libro);
    public Libro findById(Integer id);
    public void delete(Integer id);

}
