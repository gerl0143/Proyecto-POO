/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
/**
 *
 * @author Angel
 */
public class BaseDatos {
    private LinkedList<Producto> Productos;
    private LinkedList<Cliente> Clientes;
    private LinkedList<Tienda> Tiendas;
    public Tienda norte;
    public Tienda sur;
    public Tienda centro;
    
    public BaseDatos() {
        this.norte = new Tienda("Norte");
        this.sur = new Tienda("Sur");
        this.centro = new Tienda("Centro");
        this.Productos = new LinkedList<>();
        this.Clientes = new LinkedList<>();
        this.Tiendas = new LinkedList<>();       
    }

    public LinkedList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(LinkedList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }
  
    public void LeerArchivoClientes(String nombre) throws FileNotFoundException, IOException {
        // Carga de archivos
        try(BufferedReader br = new BufferedReader(new FileReader(nombre))){
            String linea;
            while((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");
                Cliente cliente = new Cliente(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]);
                // Agregar a la lista
                Clientes.add(cliente);
            }
        } catch(IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    public void LeerArchivoProductos(String nombre) throws FileNotFoundException, IOException {
        // Carga de archivos
        try(BufferedReader br = new BufferedReader(new FileReader(nombre))){
            String linea;
            while((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");
                Producto producto = new Producto(datos[0],datos[3],datos[1],Double.parseDouble(datos[2]));
                
                 // Agregar a la lista
                Productos.add(producto);
                
                // set stock para norte
                Producto productoNorte = new Producto(datos[0],datos[3],datos[1],Double.parseDouble(datos[2]));
                productoNorte.setStock(Integer.parseInt(datos[4]));
                norte.Productos.add(productoNorte);
                
                // set para sur
                Producto productoSur = new Producto(datos[0],datos[3],datos[1],Double.parseDouble(datos[2]));
                productoSur.setStock(Integer.parseInt(datos[5]));
                sur.Productos.add(productoSur);
                
                // set para centro
                Producto productoCentro = new Producto(datos[0],datos[3],datos[1],Double.parseDouble(datos[2]));
                productoCentro.setStock(Integer.parseInt(datos[6]));
                centro.Productos.add(productoCentro);
            }
        } catch(IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }    
    
    
    
    public Cliente BuscarCliente(String Nombre) {
        for(Cliente Cliente:Clientes) {
            if(Cliente.getNombreUsuario().equals(Nombre)) {
                return Cliente;
            }
        }
        return null;
    }
    
    public Producto BuscarProducto(String nombre) {
        System.out.println("Stock:");    
        for(int i=0;i<Productos.size();i++) {
            if(nombre.equals(Productos.get(i).Nombre)) {
                // Muestra datos del producto en Norte
                System.out.println("\nNorte");
                System.out.println(norte.Productos.get(i).getDatos());
                
                // Muestra datos del producto en Centro
                System.out.println("\nCentro");
                System.out.println(centro.Productos.get(i).getDatos());
                
                // Muestra datos del producto en Sur
                System.out.println("\nSur");
                System.out.println(sur.Productos.get(i).getDatos());
                
                return Productos.get(i);
            } else {
                System.out.println("No se encontrp el producto");
            }
        }
        return null;
    }    
    
    public int IndiceProducto(String nombre) {    
        for(int i=0;i<Productos.size();i++) {
            if(nombre.equals(Productos.get(i).Nombre)) {
                return i;
            } else {
                System.out.println("No se encontro el producto");
            }
        }
        return -1;
    }    
}
