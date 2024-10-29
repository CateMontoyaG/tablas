package nodo.tarea.tablas.Repositories;

import nodo.tarea.tablas.Models.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Integer> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM inscripciones")
    public List<Inscripcion> findAllInscripciones();
}
