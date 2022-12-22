/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_V.SextaEntrega.Vector;

import java.util.ArrayList;
import java.util.Vector;

public class Vector_Ex3 {
    public static void main(String[] args) {

        // Version 1

        System.out.println("---------------");
        System.out.println("Version 1");
        System.out.println("---------------");

        Vector<Integer> vector1 = new Vector<>();

        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);

        System.out.println("Datos del Vector Completo...");
        System.out.println(vector1);

        vector1.remove(1);
        vector1.remove(1);

        System.out.println("Datos Modificados...");
        System.out.println(vector1);

        // Version 2

        System.out.println("---------------");
        System.out.println("Version 2");
        System.out.println("---------------");

        Vector<String> vector2 = new Vector<>();

        vector2.add("Item 1");
        vector2.add("Item 2");
        vector2.add("Item 3");
        vector2.add("Item 4");
        vector2.add("Item 5");

        System.out.println("Datos del Vector Completo...");
        System.out.println(vector2);

        vector2.remove(1);
        vector2.remove(1);

        System.out.println("Datos Modificados...");
        System.out.println(vector2);


    }

}
