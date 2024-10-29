package nodo.tarea.tablas.Repositories;

import nodo.tarea.tablas.Models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM estudiantes")
    public List<Estudiante> findAllEstudiantes();








}
