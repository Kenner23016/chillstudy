package com.libcode.ChillStudy.ChillStudy.RegistroAcademico.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="registroacademico")
public class RegistroAcademico {

    //Atributos    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Nombre estudiante que mas adelante se consegura por medio de una relacion, de momento no
    @Column (name="nombre_estudiante")
    private String nombre_estudiante;

    //nombre del curso
    @Column (name="Nombre_curso")
    private String nombre_curso;

    @Column (name="calificacion")
    private float calificacion;

    @Column (name="bservaciones")
    private String observaciones;

    public RegistroAcademico(Long id) {
        this.id = id;
    }

    public RegistroAcademico() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RegistroAcademico other = (RegistroAcademico) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    

    
}
