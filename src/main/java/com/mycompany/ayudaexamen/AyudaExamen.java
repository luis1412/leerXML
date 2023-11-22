/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ayudaexamen;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author luish
 */
public class AyudaExamen {

    public static void main(String[] args) {
      
        JAXBContext context;
        
        try {
            
             // Creamos el contexto indicando la clase raíz
        context = JAXBContext.newInstance(Recetas.class);
         // Creamos el Marshaller, convierte el java bean en una cadena XML
         // Permite leer información almacenada en un fichero a una estructura de memoria, como ArrayList
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        // Escribimos en el archivo
        Recetas receta = (Recetas) unmarshaller.unmarshal(new File(".\\src\\main\\java\\com\\mycompany\\ayudaexamen\\recetas.xml"));
        
        
        System.out.println("Nombre Empresa: " + receta.getNombreEmpresa());
        
        ArrayList<Receta> recetas = receta.getReceta();
        
        for(Receta l: recetas){
            Tipo tipo = l.getTipo();
            System.out.println(tipo.getDefinicion());
            System.out.println(" Dificultad "+l.getDificultad() +" "+ "Ingredientes: ");
            Ingredientes a = l.getIngredientes();
            ArrayList<Ingrediente> listaIngrediente = a.getIngrediente();
            for (Ingrediente ingrediente : listaIngrediente) {
                System.out.println("Nombre: " +  ingrediente.getNombre() + " Cantidad: " + ingrediente.getCantidad());
            }
            System.out.println("Calorias: " + l.getCalorias());
            Pasos b = l.getPasos();
            ArrayList<String> pasoLista = b.getPaso();
            for (String paso : pasoLista) {
                System.out.println( "Paso: " + paso);
            }
            System.out.println("Tiempo: " + l.getTiempo());
            System.out.println("Elaboracion: " + l.getElaboracion());
            System.out.println("\n \n");
        }}
catch (JAXBException e) 
{
  e.printStackTrace();
}
        
    }
}
