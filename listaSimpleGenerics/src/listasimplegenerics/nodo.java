/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimplegenerics;

/**
 *
 * @author gisellemb
 */
public class nodo <T>{
    T dato;
    nodo enlace;

     public nodo(T x)
  {
   dato=x;
   enlace=null;  
  }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
  

    

    public nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(nodo enlace) {
        this.enlace = enlace;
    }
    
}

