/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppalparrafo;

import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class PpalParrafo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner Parrafo = new Scanner (System.in);
        
           // constuctor por defecto
    
        
         // cosntructor sobrecargado 1
        System.out.println("Parrafo con lectura de teclado Sobrecarga 1): ");
        System.out.print("Lea el parrafo: ");
        String pa = Parrafo.nextLine();
         System.out.print("Palabra que desea buscar: ");
        String pe = Parrafo.next();
        Parrafo parra = crearparrafo(pa, pe);
        infoParrafo(parra);
        
    }
    
    public static Parrafo crearparrafo(String a,String b ){
        
        Parrafo i = new Parrafo();
        
        i.setParrafo(a);
        i.setbuscar(b);
        
        return i; 
        
    }
    
    
    public static void infoParrafo( Parrafo parra){
        
        System.out.println("Parrafo: " + parra.getParrafo());
        System.out.println("Numero de vocales: " + parra.nvocales());
        System.out.println("Numero de consonates: " + parra.nconsonantes());
        System.out.println("Numero de simbolos: " + parra.nsimbolos());
        System.out.println("Numero de veces que se repite la palabra: " + parra.palabra());
       
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
