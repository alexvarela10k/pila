/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import modelo.Pila;

/**
 *
 * @author jhon.varela
 */
public class MainPila {
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila<Productos> pilaP = new Pila<>();
    pilaP.apilar(new Productos("arroz", 2, 5000));
    pilaP.apilar(new Productos("maiz", 3, 3000));
    pilaP.apilar(new Productos("atun", 1, 5500));
    pilaP.apilar(new Productos("quipito", 1, 800));
    pilaP.apilar(new Productos("lentejas", 2, 4000));
    
    
        System.out.println("Pila \n" + pilaP.toString());
        
        
        pilaP.desapilar();
        System.out.println("Pila \n" +pilaP.toString());
    }
    
}
