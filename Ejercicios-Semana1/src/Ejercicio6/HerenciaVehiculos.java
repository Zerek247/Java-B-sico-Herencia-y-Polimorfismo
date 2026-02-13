package Ejercicio6;

import java.util.ArrayList;

public class HerenciaVehiculos {

    public static void main(String[] args) {

        ArrayList<Vehiculo> flota = new ArrayList<>();

        flota.add(new Auto("Toyota", "Corolla", 2024, 4));
        flota.add(new Moto("Honda", "CBR600", 2023, 600));
        flota.add(new VehiculoElectrico("Tesla", "Model 3", 2025, 4, 580));
        flota.add(new Auto("Ford", "Mustang", 2024, 2));
        flota.add(new Moto("Yamaha", "MT-07", 2024, 689));

        for (Vehiculo v : flota) {
            System.out.println(v);
            v.arrancar();
            v.detener();
            System.out.println();
        }
    }
}