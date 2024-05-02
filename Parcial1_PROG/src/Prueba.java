import java.util.ArrayList;

public class Prueba {
    private int codigo;
    private String titulo;

    private ArrayList<Atleta> participantes = new ArrayList<>();
    private ArrayList<Instalacion> donde = new ArrayList<>();


    public Prueba(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Atleta> getAtletas() {
        return participantes;
    }

    public void setAtletas(ArrayList<Atleta> atletas) {
        this.participantes = atletas;
    }

    public ArrayList<Instalacion> getDonde() {
        return donde;
    }

    public void setDonde(ArrayList<Instalacion> donde) {
        this.donde = donde;
    }

    public ArrayList<Atleta> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Atleta> participantes) {
        this.participantes = participantes;
    }

    public void agregarParticipantes(Atleta atleta){
        participantes.add(atleta);
    }
}
