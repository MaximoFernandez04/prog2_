package ej10;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Titan del gol y de la vida","Miguel Bossio", 20000);
        LibroTexto libroTexto1 = new LibroTexto("Matematica 1","Pedro lopez", 2500,"MAT1");
        LibroTextoUniColombia libroTextoUniColombia1 = new LibroTextoUniColombia("Cosecha del cafe", "Jose Rodriguez", 30000 ,"AGRO1","Universidad Colombia");
        Novela novela1 = new Novela("La bella y la bestia","Gabrielle-Suzanne Barbot de Villeneuve",10000, "Romantica");
        libro1.mostrarLibro();
        libroTexto1.mostrarLibro();
        libroTextoUniColombia1.mostrarLibro();
        novela1.mostrarLibro();
    }
}
