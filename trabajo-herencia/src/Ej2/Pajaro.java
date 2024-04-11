package Ej2;

public class Pajaro extends Animal{
    private String especie;

    public Pajaro(String nombre, int edad, String genero, String especie) {
        super(nombre, edad, genero);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void hacerRuido() {
        System.out.println("El pajaro canta");
    }
    public void informacion(){
        System.out.println( "Pajaro: "+
                "nombre = "+getNombre()+
                ", edad = "+getEdad()+
                ", genero = "+ getGenero()+
                ", especie = "+especie
        );
    }
}
