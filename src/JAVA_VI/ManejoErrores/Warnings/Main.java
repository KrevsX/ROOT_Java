/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 *  All rights reserved
 *  Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_VI.ManejoErrores.Warnings;

import java.util.HashMap;
import java.util.Map;
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

    }


    public static void demoMaps() {

         // HASH MAP
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Clave1", 10);
        map.put("Clave2", 20);
        map.put("Clave3", 30);
        map.put("Clave4", 40);

        // recorrer un map
        for (Map.Entry<String, Integer> elemento : map.entrySet()) {

            System.out.println("Elemento clave es: "+ elemento.getKey());
            System.out.println("Elemento clave es: "+ elemento.getValue());
        }


        /*// reemplazar valores
        map.replace("Clave4", 190);
        // remover valores
        map.remove("Clave2");

        // mostrar valores completos
        System.out.println(map);
        map.replace("Clave3", 80);*/
    }
}

