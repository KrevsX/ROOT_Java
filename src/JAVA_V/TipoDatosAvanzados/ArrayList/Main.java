/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 *  All rights reserved
 *  Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_V.TipoDatosAvanzados.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");
        lista.add("ElementoD");

        //Eliminar comentarios para ver las funcionalidades.

        // LINKED-LIST

        /*LinkedList<String> listaEnlazada = new LinkedList<String>();*/


        // ARRAY LIST
        /*// Alternativa simplificada para visualizar la lista.
        for(Object arrayObjeto : lista.toArray()){
            System.out.println(arrayObjeto.toString());
        }*/

        /*lista.remove("ElementoB");
        System.out.println("Contenido: " + lista);*/

        /*for(String nombre:lista){
            System.out.println(nombre);
        }
        System.out.println("---------");

        for(int i = 0; i < lista.size(); i++ ){
            System.out.println(lista.get(i));
        }*/

        /*String array[] = new String[lista.size()];
        for(int i = 0; i < lista.size(); i++ ){
            array[i] = lista.get(i);
        }
        System.out.println("=============");

        for(String elemento : array){
            System.out.println("Elemento es: " + elemento);
        }*/


    }
}
