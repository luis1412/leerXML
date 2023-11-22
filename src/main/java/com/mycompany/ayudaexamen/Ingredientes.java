/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayudaexamen;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author luish
 */
@XmlRootElement(name="ingredientes")
@XmlType(propOrder={"ingrediente"})
public class Ingredientes {
    private ArrayList<Ingrediente> ingrediente = new ArrayList<>();

    public Ingredientes() {
    }

    @XmlElement(name="ingrediente")
    public ArrayList<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    
}
