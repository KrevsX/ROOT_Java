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

import java.util.Vector;

public class Vector_Ex4 {

    public static void main(String[] args) {

        // Version 1

        System.out.println("---------------");
        System.out.println("Version 1");
        System.out.println("---------------");


        Vector<String> vector = new Vector<>(1000);

        System.out.println("La Capacidad del Vector es: " + vector.capacity());

    }
}
