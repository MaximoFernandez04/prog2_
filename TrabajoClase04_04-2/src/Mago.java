public class Mago extends PersonajeBase implements Personaje {

    public Mago(int nivel, String nombre, int puntosSalud) {
        super(nivel, nombre, puntosSalud);
    }

    @Override
    public int attack() {
        return 7;
    }

    @Override
    public void defense(int damage, String nombre) {
        System.out.println("Mago se definde de "+nombre);
        int updatedLife = getPuntosSalud()-damage;
        System.out.println("Mago pierde "+damage+" puntos de salud");

    }
}
