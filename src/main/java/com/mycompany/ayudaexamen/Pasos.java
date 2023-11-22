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
@XmlRootElement(name="pasos")
@XmlType(propOrder={"paso"})
public class Pasos {
    ArrayList<String> paso = new ArrayList<>();

    @XmlElement(name="paso")
    public ArrayList<String> getPaso() {
        return paso;
    }

    public void setPaso(ArrayList<String> paso) {
        this.paso = paso;
    }
            
            
}
