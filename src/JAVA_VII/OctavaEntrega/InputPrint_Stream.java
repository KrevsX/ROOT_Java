/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_VII.OctavaEntrega;

import java.io.*;

public class InputPrint_Stream {

    public static void main(String[] args) {

        /*
           Para poder visualizar los archivos
           - Abrimos la terminal
           - Escribimos | ls -altr  |
           y escribimos \ cat \ y el nombre del fichero que hemos escrito...
         */


        CopiaFichero("/etc/passwd", "/etc/passwd"); // agregar otro directorio..
    }
    public static void CopiaFichero(String fileIn, String fileOut) {
        InputStream input = null;
        PrintStream output = null;
        try {

            input = new FileInputStream(fileIn);
            output = new PrintStream(fileOut);

            int datos;
            while((datos = input.read()) != -1) {
                output.write(datos);
            }
        } catch(IOException e) {

            e.printStackTrace();
        } finally {

            try {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
