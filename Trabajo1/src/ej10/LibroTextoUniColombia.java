package ej10;

public class LibroTextoUniColombia extends LibroTexto{
    private String facultadPublico;

    public LibroTextoUniColombia(String titulo, String autor, double precio, String curso, String facultadPublico) {
        super(titulo, autor, precio, curso);
        this.facultadPublico = facultadPublico;
    }

    public String getFacultadPublico() {
        return facultadPublico;
    }

    public void setFacultadPublico(String facultadPublico) {
        this.facultadPublico = facultadPublico;
    }

    @Override
    public void mostrarLibro() {
        System.out.println("");
    }
}
