package Ej2;

public class EjercutableEj2 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libroNovela = new Novela("Cien años de soledad", "Gabriel García Márquez", 1967, false, "Romance");
        Libro libroUniversitario = new Universitario("n", "", 2020, true, "Ingeniería");
        Libro libroInfantil = new Infantil("El principito", "Antoine de Saint-Exupéry", 1943, true, 5);

        biblioteca.agregarLibro(libroNovela);
        biblioteca.agregarLibro(libroUniversitario);
        biblioteca.agregarLibro(libroInfantil);

        biblioteca.listarLibrosDisponibles();

        biblioteca.prestarLibro("El principito");
        biblioteca.listarLibrosDisponibles();

        biblioteca.prestarLibro("El principito");

        biblioteca.devolverLibro("El principito");
        biblioteca.listarLibrosDisponibles();

        biblioteca.devolverLibro("Don Quijote");
    }
}
