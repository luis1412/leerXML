/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayudaexamen;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author luish
 */
//    @XmlAttribute(name="nombre")
//    @XmlElement(name="paso")


@XmlRootElement(name="receta")
@XmlType(propOrder={"tipo", "dificultad", "nombre", "ingredientes", "calorias", "pasos", "tiempo", "elaboracion"})
public class Receta {
    private String dificultad;
    private String nombre;
    private Ingredientes ingredientes;
    private String calorias;
    private Pasos pasos;
    private String tiempo;
    private String elaboracion;
    private Tipo tipo;

    public Receta() {
    }

    @XmlElement(name="tipo")
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }




    @XmlElement(name="dificultad")
    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    @XmlElement(name="nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement(name="ingredientes")
    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

   @XmlElement(name="calorias")
    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    @XmlElement(name="pasos")    
    public Pasos getPasos() {
        return pasos;
    }

    public void setPasos(Pasos pasos) {
        this.pasos = pasos;
    }
    
    @XmlElement(name="tiempo")
    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
    @XmlElement(name="elaboracion")
    public String getElaboracion() {
        return elaboracion;
    }

    public void setElaboracion(String elaboracion) {
        this.elaboracion = elaboracion;
    }
    
    
}
