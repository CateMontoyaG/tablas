package nodo.tarea.tablas.Repositories;

import nodo.tarea.tablas.Models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM cursos")
    public List<Curso> findAllCursos();

}
