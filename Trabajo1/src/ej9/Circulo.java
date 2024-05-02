package ej9;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = 3.1416 * (radio*radio);
        System.out.println("El area del circulo con radio "+radio+" es de "+area);
    }


    @Override
    public void carlcularPerimetro() {
        double perimetro = (2 * 3.1416) * radio;
        System.out.println("El perimetro del circulo con radio "+radio+" es de "+perimetro);
    }
}
