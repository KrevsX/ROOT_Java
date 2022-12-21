/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package JAVA_V.TipoDatosAvanzados.Arrays;

public class Main {
    public static void main(String[] args) {

        int arrayDos[] = {1,2,3,4,5};
        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;



        for(int i : arrayDos){
            System.out.println(i);
        }
        for(int i : arrayUno){
            System.out.println(i);
        }

        String nombres[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };

        System.out.println("La longitud del array es: " + nombres.length);

        for(String i : nombres){
            System.out.println("El nombre actual es: "+i);
        }

        String ultimoNombre = "";

        for(int i = 0; i < nombres.length; i++){
            System.out.println("Nombres Actual : " + nombres[i] +"En posicion: " + i);
        }

        System.out.println(ultimoNombre);
    }
}
