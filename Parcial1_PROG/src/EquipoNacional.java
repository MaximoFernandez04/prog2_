import java.util.ArrayList;

public class EquipoNacional {
    private String color;
    private String pais;

    private ArrayList<Atleta> atletasEquipoNacional = new ArrayList<>();

    public EquipoNacional(String color, String pais) {
        this.color = color;
        this.pais = pais;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Atleta> getAtletasEquipoNacional() {
        return atletasEquipoNacional;
    }

    public void setAtletasEquipoNacional(ArrayList<Atleta> atletasEquipoNacional) {
        this.atletasEquipoNacional = atletasEquipoNacional;
    }

    public void agregarAtletas(Atleta atleta){
        atletasEquipoNacional.add(atleta);
    }
}
