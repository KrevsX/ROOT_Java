/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_V.SextaEntrega.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_String {
    public static void main(String[] args) {

        // Version 1

        System.out.println("---------------");
        System.out.println("Version 1");
        System.out.println("---------------");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");
        arrayList.add("Elemento 4");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        System.out.println("Valores del ArrayList:");
        for (String valor1 : arrayList) {
            System.out.println(valor1);
        }

        System.out.println("\nValores del LinkedList:");
        for (String valor2 : linkedList) {
            System.out.println(valor2);
        }

    }
}
