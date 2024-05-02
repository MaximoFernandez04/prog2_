package ej8;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador("Mariano", 45,120000,"Botellas");
        Gerente gerente1 = new Gerente("Raul", 47,250000,"departamento de botellas");
        trabajador1.producir(trabajador1.getArea());
        gerente1.organizar(gerente1.getDepartamento());
    }
}