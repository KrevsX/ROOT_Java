/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 *  All rights reserved
 *  Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_V.SextaEntrega.String;

public class CadenaTexto {

    public static void main(String[] args) {


        // Version 1
        System.out.println("-----------------------");

        System.out.println("Version desde Funcion");

        String reversed = reverse("HOLA MUNDO - DESDE FUNCION");
        System.out.println(reversed);


        System.out.println("-----------------------");
        String cadenaTexto = "HOLAAA MUNDO";

        // Version 2
        System.out.println("Version 2");

        for (int i = cadenaTexto.length() - 1; i >= 0; i--) {
            System.out.print(cadenaTexto.charAt(i));
        }

        // Version 3
        System.out.println("\n-----------------------");

        System.out.println("Version 3");
         for (int i = cadenaTexto.length() - 1; i >= 0; i--) {
            System.out.print(cadenaTexto.charAt(i));
            System.out.println();
         }
        System.out.println("-----------------------");

    }
    public static String reverse(String texto) {
        StringBuilder sb = new StringBuilder(texto);
        sb.reverse();
        return sb.toString();
    }
}



