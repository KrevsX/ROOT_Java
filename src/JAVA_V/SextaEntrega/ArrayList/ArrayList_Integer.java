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

public class ArrayList_Integer {
    public static void main(String[] args) {

        // Version 1

        System.out.println("---------------");
        System.out.println("Version 1");
        System.out.println("---------------");

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
                i--;
            }
        }

        System.out.println("ArrayList values:");
        for (int item : arrayList) {
            System.out.println(item);
        }

        // Version 2

        System.out.println("---------------");
        System.out.println("Version 2");
        System.out.println("---------------");

        ArrayList<Integer> arrayList2 = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                arrayList2.add(i);
            }
        }
        System.out.println(arrayList2);
    }
}


