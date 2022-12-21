
/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package JAVA_V.TipoDatosAvanzados.String;

public class Main {
    public static void main(String[] args) {
        String cadena = "Mensaje DE TEXTO";

        int cadenaLen = cadena.length();
        System.out.println("Longitud de mi cadena es" + cadenaLen);

        String cadenaMinus = cadena.toLowerCase();

        System.out.println("La cadena ahora es: " + cadenaMinus);

        String cadenaMayus = cadena.toUpperCase();

        System.out.println("La cadena ahora es: " + cadenaMayus);

        char letra = cadena.charAt(4);

        System.out.println("El caracter es: " + letra);

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Caracter Actual: " + cadena.charAt(i));
        }

        // si la cadena empieza con
        boolean resultado = cadena.startsWith("men");
        if (resultado){
            System.out.println("Empieza por lo que quiero");
        }else{
            System.out.println("Empieza por lo que no quiero");
        }

        //si la cadena termina en
        boolean resultado2 = cadena.endsWith("o");
        if (resultado2){
            System.out.println("Empieza por lo que quiero");
        }else{
            System.out.println("Empieza por lo que no quiero");
        }
    }
}
