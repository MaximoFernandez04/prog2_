// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta(24568964,"Julio Rojas", 1.75,48,78.5);
        Atleta atleta2 = new Atleta(21452145,"Cesar Silva", 1.80,51,79.8);
        Atleta atleta3 = new Atleta(32458453,"Pedro Lopez", 1.90,40,82.7);
        Atleta atleta4 = new Atleta(45698741,"Esteban Gutierres", 1.81,20,95);

        EquipoNacional eqN1 = new EquipoNacional("Azul","Honduras");
        eqN1.agregarAtletas(atleta1);
        eqN1.agregarAtletas(atleta2);
        eqN1.agregarAtletas(atleta4);

        Prueba prueba1 = new Prueba(276,"Prueba1");
        prueba1.agregarParticipantes(atleta1);
        Prueba prueba2 = new Prueba(245,"Prueba 2");
        prueba2.agregarParticipantes(atleta1);
        prueba2.agregarParticipantes(atleta2);
        prueba2.agregarParticipantes(atleta3);

        Sede sede1 = new Sede(2,"02/03/2025","A confirmar");
        Instalacion instalacion1 = new Instalacion("Islandia", "Europa","IslandStadium", "Pista de hielo");
        instalacion1.agregarisMade(prueba1);
        instalacion1.agregarisMade(prueba2);

        //Desde instalacion
        System.out.println("Tercer atleta de la segunda prueba: "+instalacion1.getIsMade().get(1).getParticipantes().get(2).getNombre());
        System.out.println("Codigo de la segunda prueba: "+ instalacion1.getIsMade().get(1).getCodigo());

        //Desde equipo nacional
        System.out.println("Altura de los atletas del equipo nacional:");
        for (Atleta atleta : eqN1.getAtletasEquipoNacional()) {
            System.out.println(atleta.getAltura());
        }
        System.out.println("Peso de los atletas");
        for (Atleta atleta: eqN1.getAtletasEquipoNacional()) {
            System.out.println(atleta.hayPesoExtra(atleta.calculaIMC()));
        }
    }
}