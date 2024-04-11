package Ej2;

public class Perro extends Animal{
    private String raza;

    public Perro(String nombre, int edad, String genero, String raza) {
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
        System.out.println("El perro ladra");
    }
    public void informacion(){
        System.out.println( "Perro: "+
                "nombre = "+getNombre()+
                ", edad = "+getEdad()+
                ", genero = "+ getGenero()+
                ", raza = "+raza
        );
    }
}
