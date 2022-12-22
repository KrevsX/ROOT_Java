/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_VII.Entrada_Salida.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                byte[] datos = new byte[5];
                int dato = fichero.read(datos);
                while(dato != -1){
                    System.out.println((char)dato);
//                    System.out.println(datos.toString());
                    dato = fichero.read(datos);

                }
//                byte[] datos = fichero.readAllBytes();
//                for (byte dato : datos){
//                    System.out.println((char)dato);
//                }
            }catch (IOException e){
                System.out.println("No puedo leer el fichero.." + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oye el promgrama da error/...." + e.getMessage());
        }
    }
}
