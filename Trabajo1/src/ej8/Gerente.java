package ej8;


public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, int edad, float salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void organizar(String rol){
        System.out.println("El empleado "+getNombre()+" se encuentra en la organizacion del  "+rol);
    }
}
