package com.mtec.crudlibro.controller;

import com.mtec.crudlibro.model.Libro;
import com.mtec.crudlibro.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping("/libro")
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    @GetMapping("/libros")
    public List<Libro> obtenerTodos() {
        return libroService.findAll();
    }

    @PutMapping("/{id}")
    public Libro actualizarLibro(@PathVariable Integer id, @RequestBody Libro libroActualizado) {
        Libro libroExitente = libroService.findById(id);
        if (libroExitente != null) {
            libroExitente.setAutor(libroActualizado.getAutor());
            libroExitente.setTitulo(libroActualizado.getTitulo());
            return libroService.save(libroExitente);
        }

        return null;
    }

    @DeleteMapping("/libros/{id}")
    public void eliminarLibro(@PathVariable Integer id) {
        libroService.delete(id);
    }
}
