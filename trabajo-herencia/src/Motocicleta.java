public class Motocicleta extends Bicicleta {
    private int velocidad;
    private int cilindrada;

    public Motocicleta(){
    }

    public Motocicleta(String color, int wheels, String tipo, int velocidad, int cilindrada) {
        super(color, wheels, tipo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto: "+
                "velocidad= "+velocidad +
                ", cilindrada = "+cilindrada+
                ", type = "+getTipo()+
                ", color =  "+getColor()+
                ", wheels = "+ getWheels();
    }
}
