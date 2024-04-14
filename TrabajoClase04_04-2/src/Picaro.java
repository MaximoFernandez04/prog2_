public class Picaro extends PersonajeBase implements Personaje{
    public Picaro(int nivel, String nombre, int puntosSalud) {
        super(nivel, nombre, puntosSalud);
    }

    @Override
    public int attack() {
        return 5;
    }

    @Override
    public void defense(int damage, String nombre) {
        System.out.println("Picaro se definde de "+nombre);
        int updatedLife = getPuntosSalud()-damage;
        System.out.println("Picaro pierde "+damage+" puntos de salud");

    }
}
