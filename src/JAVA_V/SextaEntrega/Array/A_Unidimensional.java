/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 *  All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_V.SextaEntrega.Array;

public class A_Unidimensional {

    public static void main(String[] args) {

        // Version 1
        String[] arraUniDi = {"Item 1", "Item 2", "Item 3"};

        System.out.println("---------------");
        System.out.println("Version 1");
        System.out.println("---------------");




        // Version 2
        for (int i = 0; i < arraUniDi.length; i++) {
            System.out.println(arraUniDi[i]);
        }
        System.out.println("---------------");
        System.out.println("Version 2");
        System.out.println("---------------");

        String[] array1 = {"Item 1", "Item 2", "Item 3"};

        for (String item : array1) {
            System.out.println(item);
        }

        System.out.println("---------------");

    }
}
