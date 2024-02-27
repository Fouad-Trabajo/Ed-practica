package com.dam.app.features.app_config.data.local;

import com.dam.app.features.app_config.domain.AppConfig;

import java.io.*;
import java.nio.file.*;

/**
 * Esta clase la proporciona el profesor
 **/

public class FileLocalData {

    private static boolean yaIncrementado = false;

    public static AppConfig incrementCount() {
        if (!yaIncrementado) {
            Path path = Paths.get("contador.txt");
            int contador = 0;

            // Comprueba si el archivo ya existe
            if (Files.exists(path)) {
                try {
                    // Si el archivo existe, lee el contador
                    String contenido = new String(Files.readAllBytes(path));
                    contador = Integer.parseInt(contenido.trim());
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo");
                }
            } else {
                System.out.println("¡Bienvenido por primera vez!");
            }

            // Incrementa el contador
            contador++;

            // Escribe el contador en el archivo
            try {
                Files.write(path, String.valueOf(contador).getBytes());
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo");
            }

            yaIncrementado = true; // Asegura que el incremento solo ocurre una vez por ejecución
            return new AppConfig(contador);
        } return  null;
    }
}
