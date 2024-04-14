public class Guerrero extends PersonajeBase implements Personaje{

    public Guerrero(int nivel, String nombre, int puntosSalud) {
        super(nivel, nombre, puntosSalud);
    }

    @Override
    public int attack() {
        return 10;
    }

    @Override
    public void defense(int damage, String nombre) {
        System.out.println("Guerrero se definde de "+nombre);
        int updatedLife = getPuntosSalud()-damage;
        System.out.println("Guerrero pierde "+damage+" puntos de salud");
    }
}
