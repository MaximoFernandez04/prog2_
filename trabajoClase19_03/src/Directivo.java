public class Directivo extends Empleado{
    private int dni;
    private boolean connection;
    public Directivo() {
    }


    public Directivo(String nombre, int dni, boolean connection) {
        super(nombre);
        this.dni = dni;
        this.connection = connection;
    }

    public int getDni() {
        return dni;
    }

    public boolean isConnection() {
        return connection;
    }

    public void setConnection(boolean connection) {
        this.connection = connection;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        if(isConnection()){
            return getNombre() + " "+ getDni()+" online";
        }else{
            return getNombre() + " "+ getDni()+" offline";
        }
    }
}
