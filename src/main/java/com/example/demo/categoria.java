package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;

import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "categoria")
public class categoria {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nombre;

    @OneToMany(targetEntity = instrumento.class, mappedBy = "categoria")
    @OrderBy("nombre ASC")
    private Set<instrumento> instrumentos = new HashSet<instrumento>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<instrumento> getInstrumento() {
        return instrumentos;
    }
    public void setInstrumento(Set<instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
}