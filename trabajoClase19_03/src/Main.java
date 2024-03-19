import java.util.EmptyStackException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Directivo direc1 = new Directivo("Damian",45236469, false);
        Operario oper1 = new Operario("Pedro",42265368, true);
        Oficial oficial1 = new Oficial("Juan",455288225, false);
        Tecnico tec1 = new Tecnico("Mariano", 246978733, true);

        System.out.println(direc1);
        System.out.println(oper1);
        System.out.println(oficial1);
        System.out.println(tec1);
    }

}