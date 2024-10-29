package nodo.tarea.tablas.Models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;
    public String correo;
    public String telefono;
    public String direccion;
    public BigDecimal promedioNotas;
    public boolean activo;
    public int cursos;


    @OneToMany(mappedBy = "estudiante")
    private List<Inscripcion> inscripciones;


    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigDecimal getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(BigDecimal promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCursos() {
        return cursos;
    }

    public void setCursos(int cursos) {
        this.cursos = cursos;
    }
}
