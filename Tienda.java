/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

import java.util.LinkedList;

/**
 *
 * @author Angel
 */
public class Tienda {
   // Atrbutos
    public LinkedList<Producto> Productos;
    public String Zona; // Hasta el momento parecen ser los unicos metodos, si ven alguno agreguenlo porfa
    
    // Constructor
    public Tienda(String Zona) {
        this.Zona = Zona;
        this.Productos = new LinkedList<Producto>();
    }

    // Metodos getters y setters

     public String getZona() {
         return Zona;
     }

     public void setZona(String Zona) {
         this.Zona = Zona;
     }

    public LinkedList<Producto> getProductos() {
        return Productos;
    }

    public void setProductos(LinkedList<Producto> Productos) {
        this.Productos = Productos;
    }
     
}
