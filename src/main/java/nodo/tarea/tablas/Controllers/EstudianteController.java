package nodo.tarea.tablas.Controllers;

import nodo.tarea.tablas.Models.Estudiante;
import nodo.tarea.tablas.Services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @PostMapping("/crear")
    public Estudiante create(@RequestBody Estudiante estudiante) {
        return estudianteService.saveEstudiante(estudiante);
    }

    @DeleteMapping("/eliminar/{id}")
    public void delete(@PathVariable("id") Integer id) {
        estudianteService.deleteEstudiante(id);
    }

    @GetMapping("/traerTodos")
    public Iterable<Estudiante> findAll() {
        return estudianteService.getAllEstudiantes();
    }

    @GetMapping("/traerPorId/{id}")
    public Estudiante findById(@PathVariable("id") Integer id) {
        return estudianteService.getEstudianteById(id);
    }

}
