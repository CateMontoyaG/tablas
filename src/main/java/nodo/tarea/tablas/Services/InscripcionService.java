package nodo.tarea.tablas.Services;

import nodo.tarea.tablas.Models.Inscripcion;
import nodo.tarea.tablas.Repositories.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscripcionService {

    @Autowired
    private InscripcionRepository inscripcionRepository;

    // Crear o Actualizar
    public Inscripcion saveInscripcion(Inscripcion inscripcion) {
        return inscripcionRepository.save(inscripcion);
    }

    // Eliminar
    public void deleteInscripcion(int id) {
        inscripcionRepository.deleteById(id);
    }

    // Traer todos
    public Iterable<Inscripcion> getAllInscripciones() {
        return inscripcionRepository.findAll();
    }
}
