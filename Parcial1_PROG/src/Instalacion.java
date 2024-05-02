import java.util.ArrayList;

public class Instalacion {
    private String categoria;
    private String localizacion;
    private String nombre;
    private String tipo;

    private ArrayList<Prueba> isMade = new ArrayList<>();

    public Instalacion(String categoria, String localizacion, String nombre, String tipo) {
        this.categoria = categoria;
        this.localizacion = localizacion;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Prueba> getIsMade() {
        return isMade;
    }

    public void setIsMade(ArrayList<Prueba> isMade) {
        this.isMade = isMade;
    }

    public void agregarisMade(Prueba prueba){
        isMade.add(prueba);
    }

}
