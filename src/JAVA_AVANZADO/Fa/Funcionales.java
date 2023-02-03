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



import java.util.function.Function;

public class Funcionales {
    private static Function<String,String> toMayus = x -> x.toUpperCase();
    private static Function<Integer,Integer> sumador = x -> x.sum(x,x);
    public void pruebas(){
        Saluda(toMayus,"Kevin");
//        System.out.println(toMayus.apply("kevin van winkle"));
//        System.out.println(sumador.apply(5));
    }
    public void Saluda( Function<String,String> miFuncion, String nombre){
        miFuncion.apply(nombre);

    }
}
