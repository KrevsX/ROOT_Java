/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 *  All rights reserved
 *  Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_VI.SeptimaEntrega.Errores;

public class Error_Throws {
    public static void main(String[] args) {
        try {
            DividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    public static void DividePorCero() throws ArithmeticException {
        int a = 1;
        int b = 0;
        int c = a / b;
    }
}