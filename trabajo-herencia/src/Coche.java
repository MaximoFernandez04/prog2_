public class Coche extends Vehiculo{
    private int velocidad;
    private int cilindrada;

    public Coche(){
    }

    public Coche(int velocidad, int cilindrada, String color, int wheels) {
        super(color,wheels);
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
        return "Coche : " +
                "Velocidad=" + velocidad  +
                ", cilindrada =" + cilindrada +
                ", color='" + getColor() + '\'' +
                ", wheels=" + getWheels();
    }
}

