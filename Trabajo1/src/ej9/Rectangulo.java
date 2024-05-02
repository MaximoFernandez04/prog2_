package ej9;

public class Rectangulo extends FiguraGeometrica{
    private double ancho;
    private double largo;

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public void calcularArea() {
        double area = largo * ancho;
        System.out.println("El area del rectangulo es de "+area);
    }


    @Override
    public void carlcularPerimetro() {
        double perimetro = (2 * largo) + (2*ancho) ;
        System.out.println("El perimetro del rectangulo es de "+perimetro);
    }
}
