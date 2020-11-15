/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liatasimpleobjects;

/**
 *
 * @author gisellemb
 */
public class nodo {
    Object dato;
    nodo enlace;

    //constructores
    public nodo(Object dato, nodo enlace) {
        this.dato = dato;
        this.enlace = enlace;
    }

    public nodo(Object dato) {
        this.dato = dato;
    }  
    
    //metodos getters y setters
   
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public nodo getEnlace() {
        return enlace;
    }
   

    public void setEnlace(nodo enlace) {
        this.enlace = enlace;
    }
  
  
    
}

    

