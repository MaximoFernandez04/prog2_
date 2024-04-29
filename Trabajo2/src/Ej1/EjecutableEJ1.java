package Ej1;

import Ej1.Ave;

public class EjecutableEJ1 {
    public static void main(String[] args) {
        TiendaMascotas tienda = new TiendaMascotas();

        tienda.addAnimal(new Perro("Firulais", 3, "Canino", 150, "Border Collie", true));
        tienda.addAnimal(new Gato("Michi", 2, "Felino", 120, "Ragdoll", false));
        tienda.addAnimal(new Ave("Polly", 1, "Ej1.Ave", 50, "Loro", true));
        tienda.addAnimal(new Pez("Nemo", 1, "Ej1.Pez", 10, "Payaso"));

        tienda.listarAnimales();
        tienda.venderAnimal("Firulais");
        tienda.alimentarAnimal("Michi");
        tienda.listarAnimales();
    }
}
