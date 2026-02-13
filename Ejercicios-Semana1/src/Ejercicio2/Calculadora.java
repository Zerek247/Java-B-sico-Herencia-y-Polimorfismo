package Ejercicio2;

public class Calculadora {
    //    Crear una clase Calculadora con métodos sumar sobrecargados:
//    sumar(int a, int b) — suma de dos enteros.
//    sumar(double a, double b) — suma de dos decimales.
//    sumar(int a, int b, int c) — suma de tres enteros.
//    sumar(int[] numeros) — suma de un array de enteros.
//    Demostrar cada sobrecarga en main.
    // TODO: sumar dos enteros
    public static int sumar(int a, int b) {
        return (int)a + b;
    }

    // TODO: sumar dos doubles
    public static double sumar(double a, double b) {
        return (double) a + b;
    }

    // TODO: sumar tres enteros
    public static int sumar(int a, int b, int c) {
        return (int) a + b + c;
    }

    // TODO: sumar un array de enteros
    public static int sumar(int[] numeros) {
        int total = 0;
        for (int n : numeros){
            total+=n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("2 + 3 = " + sumar(2, 3));
        System.out.println("2.5 + 3.7 = " + sumar(2.5, 3.7));
        System.out.println("1 + 2 + 3 = " + sumar(1, 2, 3));

        int[] nums = {10, 20, 30, 40};
        System.out.println("Array suma = " + sumar(nums));
    }
}