package Ej1;

import Ej1.Bicicleta;
import Ej1.Camioneta;
import Ej1.Coche;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        List<Vehiculo> vehicles = new ArrayList<>();

        Coche car1 = new Coche(120, 250, "Azul", 4);
        Camioneta cam1 = new Camioneta(170, 300, "Verde", 4, 10.5);
        Bicicleta bike1 = new Bicicleta("Violeta", 2, "Urbana");
        Motocicleta moto1 = new Motocicleta("Rojo", 2, "Deportiva", 175, 175);

        vehicles.add(car1);
        vehicles.add(cam1);
        vehicles.add(bike1);
        vehicles.add(moto1);



        catalogar(vehicles);


    }

        public static void catalogar(List<Vehiculo> vehiculos) {
            for (int i = 0; i < vehiculos.size(); i++) {
                System.out.println(vehiculos.get(i).toString());
            }
        }
}
