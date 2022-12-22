/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_VII.NovenaEntrega;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Ejercicio_Random {

    public static void main(String[] args) {
        InputStream input = null;
        PrintStream output = null;
        try {
            // Abrimos los flujos de entrada y salida
            input = new FileInputStream("/etc/passwd");
            output = new PrintStream("output.txt");

            // Creamos el HashMap y el ArrayList
            HashMap<String, Integer> wordCounts = new HashMap<>();
            ArrayList<String> words = new ArrayList<>();

            // Leemos el fichero de entrada línea a línea
            Scanner scanner = new Scanner(input);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Separamos la línea en palabras
                String[] lineWords = line.split(" ");
                // Procesamos cada palabra
                for (String word : lineWords) {
                    // Actualizamos el contador de ocurrencias de la palabra en el HashMap
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    // Añadimos la palabra al ArrayList
                    words.add(word);
                }
            }

            // Escribimos el resultado en el fichero de salida
            for (String word : words) {
                output.println(word + ": " + wordCounts.get(word));
            }
        } catch(IOException e) {
            // Tratamos cualquier excepción que pueda ocurrir
            e.printStackTrace();
        } finally {
            // Cerramos los flujos de entrada y salida
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
