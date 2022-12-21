/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 *  All rights reserved
 *  Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_V.TipoDatosAvanzados.Mapas;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // TREE MAP
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Clave1", 10);
        map.put("Clave2", 20);
        map.put("Clave3", 30);
        map.put("Clave4", 40);

        // recorrer un map
        for (Map.Entry elemento : map.entrySet()) {

            System.out.println("Elemento clave es: "+ elemento.getKey());
            System.out.println("Elemento clave es: "+ elemento.getValue());
        }
        // HASH MAP
        /*HashMap<String, Integer> map = new HashMap<>();

        map.put("Clave1", 10);
        map.put("Clave2", 20);
        map.put("Clave3", 30);
        map.put("Clave4", 40);

        // recorrer un map
        for (Map.Entry elemento : map.entrySet()) {

            System.out.println("Elemento clave es: "+ elemento.getKey());
            System.out.println("Elemento clave es: "+ elemento.getValue());
        }*/


        /*// reemplazar valores
        map.replace("Clave4", 190);
        // remover valores
        map.remove("Clave2");

        // mostrar valores completos
        System.out.println(map);
        map.replace("Clave3", 80);*/
    }
}
