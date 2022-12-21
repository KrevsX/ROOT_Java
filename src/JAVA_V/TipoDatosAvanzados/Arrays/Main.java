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

        Array1();
        Array2();


    }
    public static void Array1(){
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

    public static void Array2(){

        // Recorrer un Array Bidimensional

        int arrayBidi[][] = new int [2][4];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;
        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        // 2 filas x 4 columnas
//
//        int arrayBidi[][] = {
//                {1,2,3,4},
//                {10,20,30,40}
//        };

        for(int i = 0; i < arrayBidi.length; i++){
            System.out.println("valor de i: " + i);
            for(int j = 0; j < arrayBidi[i].length; j++){
                System.out.println("Estoy en i = " + i + ", j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

//        int enteros = new int [100]; //100 2^32bits

        String nombres [] = {"Pepe", "Juan"};
        nombres[0] = "Victor";
        nombres[1] = "Francisco";

        for (String nombre : nombres){
            System.out.println(nombre);
        }
    }
}
