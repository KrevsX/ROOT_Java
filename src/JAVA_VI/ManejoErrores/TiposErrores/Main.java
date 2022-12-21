/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 *  All rights reserved
 *  Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_VI.ManejoErrores.TiposErrores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un numero: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        // Division entre 0 no es posible...
        int reesultado = numeroA / numeroB;
        System.out.println("Resultado de la operacion: " + reesultado);

        // Errores Logicos
        int temperatura = 25;
        if(temperatura <= 25){
            System.out.println("Hace Frio!!!");
        }
    }
}
