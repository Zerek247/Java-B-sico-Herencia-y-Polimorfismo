package Ejercicio1;

public class HolaMundoMejorado {
//    Declarar variables para nombre (String), edad (int), altura (double) y esActivo (boolean).
//    Construir un mensaje de presentación usando concatenación con +.
//    Construir el mismo mensaje usando String.format().
//    Imprimir ambas versiones.

    public static void main(String[] args) {
        // TODO: Declarar variables
        String nombre = "Arturo";
        int edad = 29;
        double altura = 1.71;
        boolean esActivo = true;

        // TODO: Concatenacion con +
        String mensaje1 = "Me llamo " + nombre + ", tengo " + edad
                + " anios, mido " + altura + "m y estoy "
                + (esActivo ? "activo" : "inactivo") + ".";
        System.out.println(mensaje1);

        // TODO: Usando String.format()
        String mensaje2 = String.format(
                "Me llamo %s, tengo %d anios, mido %.2f m y estoy %s.",
                nombre, edad, altura, esActivo ? "activo" : "inactivo"
        );
        System.out.println(mensaje2);
    }
}

