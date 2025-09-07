package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author Shiro Salas 202401374
 */
public class Calculadora {

    public static int sumar(int a, int b) { // Funciones de operaciones
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("\nNo se puede dividir entre cero.");
        }
        return (double) a / b;
    }

    public static double potencia(int a, int b) {
        return Math.pow(a, b);
    }

    public static double raiz(int a) {
        if (a < 0) {
            throw new ArithmeticException("\nNo se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        int a;
        int b;
        double resultado;

        do {

            try {
                System.out.println("\n****************************************************");
                System.out.println("\nMenú de opciones: ");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Potencia");
                System.out.println("6. Raiz");
                System.out.println("7. Salir\n");
                System.out.println("****************************************************");

                System.out.print("\nOpción: ");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("\nIngresa el primer número: ");
                        a = Integer.parseInt(sc.nextLine());
                        System.out.print("Ingresa el segundo número: ");
                        b = Integer.parseInt(sc.nextLine());
                        resultado = sumar(a, b);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        System.out.print("\nIngresa el primer número: ");
                        a = Integer.parseInt(sc.nextLine());
                        System.out.print("Ingresa el segundo número: ");
                        b = Integer.parseInt(sc.nextLine());
                        resultado = restar(a, b);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        System.out.print("\nIngresa el primer número: ");
                        a = Integer.parseInt(sc.nextLine());
                        System.out.print("Ingresa el segundo número: ");
                        b = Integer.parseInt(sc.nextLine());
                        resultado = multiplicar(a, b);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        System.out.print("\nIngresa el primer número: ");
                        a = Integer.parseInt(sc.nextLine());
                        System.out.print("Ingresa el segundo número: ");
                        b = Integer.parseInt(sc.nextLine());
                        resultado = dividir(a, b);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 5:
                        System.out.print("\nIngresa la base: ");
                        a = Integer.parseInt(sc.nextLine());
                        System.out.print("Ingresa el exponente: ");
                        b = Integer.parseInt(sc.nextLine());
                        resultado = potencia(a, b);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 6:
                        System.out.print("\nIngresa el nùmero para conocer su raìz: ");
                        a = Integer.parseInt(sc.nextLine());
                        resultado = raiz(a);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 7:
                        System.out.println("\nSaliendo del programa...");
                        break;
                    default:
                        System.out.println("\nOpcion no válido, intentalo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nPor favor selecciona una opcion válida.");
            } catch (ArithmeticException e) {
                System.out.print("Error: " + e.getMessage());
            }

        } while (opcion != 7);

    }
}
