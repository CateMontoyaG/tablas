package nodo.tarea.tablas.Services;

import nodo.tarea.tablas.Models.Estudiante;
import nodo.tarea.tablas.Repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    // Crear o Actualizar
    public Estudiante saveEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    // Eliminar
    public void deleteEstudiante(int id) {
        estudianteRepository.deleteById(id);
    }

    // Traer todos
    public Iterable<Estudiante> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }

    // Traer por ID
    public Estudiante getEstudianteById(int id) {
        return estudianteRepository.findById(id).orElse(null);
    }

}
