/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_VII.Entrada_Salida.PrintStream;

import java.io.*;


public class Main {
    public static void main(String[] args) {

        try{
            InputStream in = new FileInputStream("/etc/passwd");
            byte [] datos = in.readAllBytes();

            PrintStream out = new PrintStream("Destino.txt");
            out.write(datos);


        }catch (Exception e){
            System.out.println("Excepcion: " + e.getMessage());
        }

//        PrintStream
//        PrintStream info = new PrintStream("Copia2.txt");
//        info.println("Helooooooo");
    }

}
