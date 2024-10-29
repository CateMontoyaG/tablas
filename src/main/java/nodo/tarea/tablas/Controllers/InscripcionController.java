package nodo.tarea.tablas.Controllers;


import nodo.tarea.tablas.Models.Inscripcion;
import nodo.tarea.tablas.Services.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/inscripcion")
public class InscripcionController {

    @Autowired
    private InscripcionService inscripcionService;

    @PostMapping("/crear")
    public Inscripcion create(@RequestBody Inscripcion inscripcion) {
        return inscripcionService.saveInscripcion(inscripcion);
    }

    @DeleteMapping("/eliminar/{id}")
    public void delete(@PathVariable("id") Integer id) {
        inscripcionService.deleteInscripcion(id);
    }

    @GetMapping("/traerTodos")
    public Iterable<Inscripcion> findAll() {
        return inscripcionService.getAllInscripciones();
    }
}
