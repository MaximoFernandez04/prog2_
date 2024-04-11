package Ej2;

public class Gato extends Animal{
    private String raza;

    public Gato(String nombre, int edad, String genero, String raza) {
        super(nombre, edad, genero);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerRuido() {
        System.out.println("El gato maulla");
    }
    public void informacion(){
        System.out.println("Gato: "+
                "nombre = "+getNombre()+
                ", edad = "+getEdad()+
                ", genero = "+ getGenero()+
                ", raza = "+raza
        );
    }
}
