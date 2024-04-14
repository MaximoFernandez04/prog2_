public abstract class PersonajeBase implements Personaje {
    private int nivel;
    private String nombre;
    private int puntosSalud;

    public PersonajeBase(int nivel, String nombre, int puntosSalud) {
        this.nivel = nivel;
        this.nombre = nombre;
        this.puntosSalud = puntosSalud;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }
}
