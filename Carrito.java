package com.mycompany.proyectopoo;

import java.util.LinkedList;
/**
 *
 * @author gerar
 */
public class Carrito {
     LinkedList<Producto> carro = new LinkedList<Producto>();
     public double total;
    
     public void add(Producto Producto){
        carro.add(Producto);
    }
    
    public void mostrar(){
        for(int i=0;i<carro.size();i++){
            System.out.println(carro.get(i).Nombre); // Usar for each y ver si es mejor o mas entendible
        }
    }
    
    public double Total() {
        for(Producto producto: carro) {
            producto.getDatos();
        }
        
        return 0.0;
    }
            
    
}
