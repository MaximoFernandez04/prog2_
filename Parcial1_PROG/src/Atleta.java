
public class Atleta extends Persona implements Contrato {
    private double altura;
    private int edad;
    private double peso;

    public Atleta(int dni, String nombre, double altura, int edad, double peso) {
        super(dni, nombre);
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calculaIMC() {
        double imc = getPeso() / Math.pow(getAltura(),2);
        return imc;
    }

    @Override
    public boolean hayPesoExtra(double imc) {
        if (imc >= 18.5 && imc <=24.9){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public double tomarPulsaciones() {
        return 0;
    }
}
