/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 *  All rights reserved
 *  Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_V.TipoDatosAvanzados.Vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector1();
    }

    public static void Vector1(){

        Vector<Integer> vector = new Vector(16);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println("Capacidad: " + vector.capacity() + " Tamano: " + vector.size());
        vector.trimToSize();
        System.out.println("Capacidad: " + vector.capacity() + " Tamano: " + vector.size());


        /*System.out.println(vector.get(3));
        vector.remove(3);
        System.out.println(vector.get(3));*/

       /* for (int i : vector){
            System.out.println("El valor actual del vector es: " + i);

        }
        for(int i = 0; i < vector.size(); i++){
            if(i % 2 == 0){
                vector.remove(i);
                continue;
            }

            System.out.println("Valor es: " + vector.get(i) + "En posicion: " + i);

        }*/

       /* Vector<Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(2);  // al modificar unos de estos valores de igual forma los evalua

        boolean resultado = vector.equals(vector2);
        System.out.println("Son Iguales? " + resultado);*/

       /*vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);
        vector.add(12);*/

       /*System.out.println("Datos del Vector: " + vector );

        // Borra la posicion subyacente del array.

        vector.remove(2);
        System.out.println("Datos del Vector: " + vector );

        System.out.println("Tamano del vector: "+ vector.size() + " Capacidad : " + vector.capacity());*/

    }
}
