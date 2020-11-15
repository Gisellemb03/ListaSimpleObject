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
public class ListaSimpleGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lista l = new lista();
        for (int i = 0; i < 5; i++) {
//              l.insertar(i);
            l.insertarInicio(i);

        }

        System.out.println("Elementos:");
        l.visualizar();

    }
    }
    

