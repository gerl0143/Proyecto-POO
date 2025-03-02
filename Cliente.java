/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

/**
 *
 * @author Angel
 */
public class Producto {
    // Atributos
    public String Nombre;
    private String Categoria;
    private String Codigo;
    private int Stock;
    private double Precio;
    private int Cantidad;
    
    // Constructor
    public Producto (String Nombre, String Categoria, String Codigo, double Precio) {
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Codigo = Codigo;
        this.Stock = Stock;
        this.Precio = Precio;
        this.Cantidad = 0;
    }
    
    // Metodos getter y setter
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
    public String getDatos() {
        return  Nombre + " " +  Categoria + " " + Codigo + " " + Precio + " " + Stock;
    }
    
}
