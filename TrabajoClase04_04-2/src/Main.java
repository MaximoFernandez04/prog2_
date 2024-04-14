// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Guerrero guerrero1 = new Guerrero(10,"Ramon",100);
        Picaro picaro1 = new Picaro(12,"Sanson", 150);
        Mago mago1 = new Mago(24,"Pedro",120);
        picaro1.defense(guerrero1.attack(), guerrero1.getNombre());//guerrero1 ataca picaro defiende
        guerrero1.defense(mago1.attack(), mago1.getNombre());
    }
}