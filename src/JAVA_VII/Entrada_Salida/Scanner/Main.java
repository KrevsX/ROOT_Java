/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_VII.Entrada_Salida.Scanner;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {

//          InputStream fichero2 = new FileInputStream("/etc/passwd");

            boolean ok = false;
            do{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingresar dos numeros: ");

                try{
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;

                }catch(InputMismatchException e){
                    System.out.println("Los numeros son Invalidos");

                }
            }while(!ok);

            System.out.println("Helooooo");
//
//
//            System.out.println("Los numeros enteros son: " + a + " "+ b);


            InputStream fichero = new FileInputStream("/etc/passwd");
            BufferedInputStream ficheroBuffered = new BufferedInputStream(fichero);

            try {
                int dato = ficheroBuffered.read();
                while(dato != -1){
                    System.out.println((char)dato);
//                    System.out.println(datos.toString());
                    dato = ficheroBuffered.read();

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
