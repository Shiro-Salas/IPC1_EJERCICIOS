package com.mycompany.sumarecursividad;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Shiro Salas 202401374
 */
public class SumaRecursividad {

    //metodo recursivo
    public static int suma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + suma(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        //por si pone otro caracter que no sea un número
        try {
            System.out.println("\nSumar números de 1 hasta n.");
            System.out.print("\nIngresa un número entero positivo(n): ");
            n = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("\nError, sigue las instrucciones.");
            return;
        }

        //por si el número puesto es negativo
        if (n <= 1) {
            System.out.println("\nError, sigue las instrucciones.");
            return;
        }

        int resultado = suma(n);

        //iniciando archivo
        File archivo = new File("202401374.txt");

        //escribir o generar el archivo
        try (FileWriter escritor = new FileWriter(archivo)) {
            escritor.write("La suma de 1 hasta " + n + " es: " + resultado);
            System.out.println("\nArchivo generado exitosamente.");
        } catch (IOException e) {
            System.out.println("\nError al generar el archivo .txt");
            return;
        }

        //Leer y mostrar el archivo
        try (FileReader lector = new FileReader(archivo)) {
            int c;
            System.err.println("Contenido del archivo:");
            while ((c = lector.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("\nError al leer el archivo .txt");
            return;
        }

    }
}
