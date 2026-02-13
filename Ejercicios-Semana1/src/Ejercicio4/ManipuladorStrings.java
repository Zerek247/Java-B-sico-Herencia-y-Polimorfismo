package Ejercicio4;

public class ManipuladorStrings {
//    Crear invertir(String s) usando StringBuilder.
//    Crear esPalindromo(String s) ignorando mayúsculas y espacios.
//    Crear contarVocales(String s) que cuente a, e, i, o, u.
//    Crear construirPiramide(int niveles) con asteriscos usando


    // Invertir string usando StringBuilder
    public static String invertir(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Verificar si es palíndromo ignorando mayúsculas y espacios
    public static boolean esPalindromo(String s) {
        // Convertir a minúsculas y eliminar espacios
        String limpio = s.toLowerCase().replaceAll("\\s+", "");

        // Invertir string limpio
        String invertido = new StringBuilder(limpio).reverse().toString();

        // Comparar
        return limpio.equals(invertido);
    }

    // Contar vocales
    public static int contarVocales(String s) {
        int count = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vocales.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    // Construir pirámide con asteriscos
    public static String construirPiramide(int niveles) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= niveles; i++) {

            // Espacios
            for (int j = 0; j < niveles - i; j++) {
                sb.append(" ");
            }

            // Asteriscos
            for (int j = 0; j < (2 * i - 1); j++) {
                sb.append("*");
            }

            // Salto de línea
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Invertir 'Hola Mundo': "
                + invertir("Hola Mundo"));

        System.out.println("'Anita lava la tina' es palindromo: "
                + esPalindromo("Anita lava la tina"));

        System.out.println("Vocales en 'Murcielago': "
                + contarVocales("Murcielago"));

        System.out.println("Piramide de 5 niveles:");
        System.out.println(construirPiramide(5));
    }
}
