public class Camioneta extends Coche{
    private double carga;

    public Camioneta(){
    }

    public Camioneta(int velocidad, int cilindrada, String color, int wheels, double carga) {
        super(velocidad, cilindrada, color, wheels);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Camioneta: " +
                "Carga=" + carga +
                ", velocidad=" + getVelocidad() +
                ", cilindrada=" + getCilindrada() +
                ", color='" + getColor() + '\'' +
                ", wheels=" + getWheels();
    }
}
