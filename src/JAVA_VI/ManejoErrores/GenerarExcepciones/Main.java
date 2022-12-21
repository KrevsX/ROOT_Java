/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 *  All rights reserved
 *  Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_VI.ManejoErrores.GenerarExcepciones;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try{
        divide(4, 0);
        }catch (Exception e) {
            System.out.println("AAAA");

        }
    }
    public static int divide(int A, int B) throws ArithmeticException, IOException{
        int resultado = 0;
        try {
            resultado = A / B;
        } catch (ArithmeticException e) {
            throw  new IOException();
        }

        return resultado;
    }
}
