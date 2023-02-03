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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class PruebaFunciones {
    public static void main(String[] args) {
       // Funcionales f = new Funcionales();
        // f.pruebas();

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("orem");
        nombres.add("dabbb");
        nombres.add("ssde");

/*        for(String nombre : nombres){
            System.out.println(nombre);
        }

        nombres.stream().forEach(System.out::println);

        nombres.stream().forEach(x-> System.out.println(x));

        Stream<String> valores = nombres.stream()
        .map((x) -> "Hola,  " + x.toUpperCase());
*/


        //Forma para poder imprimir resutlados
        // especificos de un array como su inicial..

        Stream<String> valores=nombres.stream()
                .map(String::toUpperCase)
                .filter(x -> x.startsWith("D"));

        valores.forEach(System.out::println);

        int []numeros= {1,2,3,4,5,6,7,8,9,10};
        var stNumeros = Arrays.stream(numeros);

        //stNumeros.forEach(x-> System.out.println(x));

        var resultado = stNumeros.filter(x->x %2 ==0).reduce(0,(x,y)->{
            System.out.println("X es:  " + x  + ", Y es: " + y);
            return x+y;
        });

        System.out.println("La Suma es : "+ resultado);

       // stNumeros.forEach(System.out::println);
        //resultado.forEach(System.out::println);

    }
    public static String toMayuscula(String nombre){

        return  nombre.toUpperCase();
    }
}
