package nodo.tarea.tablas.Services;


import nodo.tarea.tablas.Models.Curso;
import nodo.tarea.tablas.Repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    // Crear o Actualizar
    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    // Eliminar
    public void deleteCurso(int id) {
        cursoRepository.deleteById(id);
    }

    // Traer todos
    public Iterable<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    // Traer por ID
    public Curso getCursoById(int id) {
        return cursoRepository.findById(id).orElse(null);
    }
}
