package Ej2;

public class Main{
    public static void main (String[] args){
        Perro dog1 = new Perro("Cristobal", 7, "Macho", "Pitbull");
        Gato cat1 = new Gato("Juancin", 3,"Hembra", "Siamés");
        Pajaro bird1 = new Pajaro("Marcelin",2,"Hembra", "Gorrion");

        dog1.hacerRuido();
        dog1.informacion();

        cat1.hacerRuido();
        cat1.informacion();

        bird1.hacerRuido();
        bird1.informacion();
    }
}
