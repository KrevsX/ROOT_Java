/*******************************************************************************
 * Copyright (c) 2023. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_AVANZADO.Fa;

public class FuncionPura {
    private static int contador=0;
    public static void main(String[] args) {
        double  result = suma(1,2);
        double result2 = suma(4,3);
        System.out.println(result +" "+ result2);
        System.out.println(contador);
        multiplicar(4,5);
    }
    public static double suma(int a, int b){

        //contador++;
        //int sumador = 5; valor puro
        double sumador = Math.random();
        return (double)a + (double)b + sumador;
    }
    public static int multiplicar(int a, int b){

        return a * b;
    }
}
