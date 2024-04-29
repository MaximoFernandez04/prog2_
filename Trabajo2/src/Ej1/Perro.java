package Ej1;

import Ej1.Animal;

public class Perro extends Animal {
    private String raza;
    private boolean vacunado;

    public Perro(String nombre, int edad, String tipoAnimal, double precio, String raza, boolean vacunado) {
        super(nombre, edad, tipoAnimal, precio);
        this.raza = raza;
        this.vacunado = vacunado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+"\n"+
                "Edad: "+getEdad()+"\n"+
                "Tipo de animal: "+getTipoAnimal()+"\n"+
                "Precio: "+getPrecio()+"\n"+
                "Raza: "+getRaza()+"\n"+
                "¿Vacunado?: "+isVacunado();
    }
}
