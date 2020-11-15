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
public class lista {
    private nodo cabeza;
    private nodo anterior;
    private int tamaño;

    public lista(){
   cabeza=null;
   tamaño=0;
  }  
  
  
  public boolean esVacia(){
        return cabeza == null;
    }

//  public lista insertarFinal(int entrada)
//  {
//    nodo nuevo=new nodo(entrada);
//    if(cabeza==null)
//       cabeza=nuevo;
//    else
//         anterior.enlace=nuevo; 
//    
//    anterior=nuevo;   
//   return this;    
//  }  
//  
  public int getTamaño(){
        return tamaño;
    }
  
  public lista insertarInicio(int entrada){
        nodo nuevo = new nodo(entrada);//Define un nuevo nodo.
        nuevo.getDato();//Agrega al valor al nodo.
        if (esVacia()) {//Consulta si la lista esta vacia.
            cabeza = nuevo;//Inicializa la lista agregando como inicio al nuevo nodo.
        } else{     //Caso contrario va agregando los nodos al inicio de la lista.
            nuevo.setEnlace(cabeza);//Une el nuevo nodo con la lista existente.
            cabeza = nuevo; // Renombra al nuevo nodo como el inicio de la lista.
        }
        tamaño++; //Incrementa el contador de tamaño de la lista.
        return this;    
  }
  
  public void visualizar()
  {
   nodo n;
   n=cabeza;
   while(n!=null)
    {
      System.out.println(n.dato + " ");
      n=n.enlace;
    }
  }
    
}
