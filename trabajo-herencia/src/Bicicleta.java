public class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta(){
    }

    public Bicicleta(String color, int wheels, String tipo) {
        super(color, wheels);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Bicicleta: "+
                " type = "+tipo+
                ", color =  "+getColor()+
                ", wheels = "+ getWheels();
    }
}
