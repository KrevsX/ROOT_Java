/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_V.SextaEntrega.Array;

public class A_Bidimensional {

    public static void main(String[] args) {

        // Version 1

        System.out.println("---------------");
        System.out.println("Version 1");
        System.out.println("---------------");

        int[][] arrayBiDi = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        for (int i = 0; i < arrayBiDi.length; i++) {
            for (int j = 0; j < arrayBiDi[i].length; j++) {
                System.out.println("Posicion: (" + i + ", " + j + ") Valor: " + arrayBiDi[i][j]);
            }
        }

        // Version 2

        System.out.println("---------------");
        System.out.println("Version 2");
        System.out.println("---------------");

        int arrayBiDi2[][] = new int [2][4];
        arrayBiDi2[0][0] = 100;
        arrayBiDi2[0][1] = 200;
        arrayBiDi2[0][2] = 300;
        arrayBiDi2[0][3] = 400;
        arrayBiDi2[1][0] = 500;
        arrayBiDi2[1][1] = 600;
        arrayBiDi2[1][2] = 700;
        arrayBiDi2[1][3] = 800;


        for(int i = 0; i < arrayBiDi2.length; i++){
            for(int j = 0; j < arrayBiDi2[i].length; j++) {
                System.out.println("Posicion: (" + i + ", " + j + ") Valor: " + arrayBiDi2[i][j]);
            }
        }


    }
}
