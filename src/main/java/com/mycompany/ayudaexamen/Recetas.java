/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayudaexamen;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author luish
 */
@XmlRootElement(name="recetas")
@XmlType(propOrder={"nombreEmpresa","receta"})
public class Recetas {

    private ArrayList<Receta> receta = new ArrayList<>();
    private String nombreEmpresa;
    
    public Recetas() {
    }

    @XmlElement(name="receta")
    public ArrayList<Receta> getReceta() {
        return receta;
    }

    public void setReceta(ArrayList<Receta> receta) {
        this.receta = receta;
    }

    @XmlElement(name="nombreEmpresa")
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    
    
    
}
