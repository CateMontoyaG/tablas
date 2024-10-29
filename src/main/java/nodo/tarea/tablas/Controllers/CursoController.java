package nodo.tarea.tablas.Controllers;

import nodo.tarea.tablas.Models.Curso;
import nodo.tarea.tablas.Services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping("/crear")
    public Curso create(@RequestBody Curso curso) {
        return cursoService.saveCurso(curso);
    }

    @DeleteMapping("/eliminar/{id}")
    public void delete(@PathVariable("id") Integer id) {
        cursoService.deleteCurso(id);
    }

    @GetMapping("/traerTodos")
    public Iterable<Curso> findAll() {
        return cursoService.getAllCursos();
    }

    @GetMapping("/traerPorId/{id}")
    public Curso findById(@PathVariable("id") Integer id) {
        return cursoService.getCursoById(id);
    }
}
