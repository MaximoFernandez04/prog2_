package ej8;

public class Trabajador extends Empleado {
    private String area;

    public Trabajador(String nombre, int edad, float salario, String area) {
        super(nombre, edad, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void producir(String rol){
        System.out.println("El empleado "+getNombre()+" se encuentra produciedo "+rol);
    }
}
