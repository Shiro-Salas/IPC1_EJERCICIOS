package com.mycompany.manejoerrores;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Shiro Salas 202401374
 */
public class ManejoErrores {

    static int edad; //variable statica para acceder desde las funciones a esta variable 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        //Menú de opciones con y sin uso de Try-catch
        do {
            System.out.println("\n*******************************+++++++++++++++++***");
            System.out.println("Menú de manejo de errores");
            System.out.println("1. Dato no válido con uso de try-catch.");
            System.out.println("2. Dato no válido sin uso de try-catch.");
            System.out.println("3. Salir.");
            System.out.println("*******************************+++++++++++++++++***");
            System.out.print("\nIngresa una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    UsoTryCatch(sc); //llamada de funcion
                    break;
                case 2:
                    SinTryCatch(sc); //llamada de funcion
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("\nOpción no válida, por favor inténtelo nuevamente.");
            }

        } while (opcion != 3);
    }

    //funciones
    public static void UsoTryCatch(Scanner sc) {
        System.out.println("\nSaber si eres mayor de edad.");
        try {
            System.out.print("\nPor favor ingresa tu edad: ");
            edad = sc.nextInt();
            sc.nextLine(); //limpiando scanner
            if (edad >= 18) {
                System.out.println("\nEres mayor de edad.");
            } else {
                System.out.println("\nEres menor de edad.");
            }

        } catch (InputMismatchException e) {
            System.out.println("\nTipo de dato incorrecto, por favor ingresa un dato válido (número entero).");
            sc.nextLine(); //limpiando scanner
            System.out.println("Try-catch funcionando correctamente.");
        }
    }

    private static void SinTryCatch(Scanner sc) {
        System.out.println("\nSaber si eres mayor de edad.");
        System.out.print("\nPor favor ingresa tu edad: ");
        edad = sc.nextInt();
        sc.nextLine(); //limpiando scanner
        if (edad >= 18) {
            System.out.println("\nEres mayor de edad.");
        } else {
            System.out.println("\nEres menor de edad.");
        }
        /* si se ingresa texto acá truena el programa muestra error y finaliza */
    }

}
