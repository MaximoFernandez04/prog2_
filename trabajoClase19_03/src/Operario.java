public class Operario extends Empleado {
    private int dni;
    private boolean connection;
    public Operario(String nombre, int dni, boolean connection) {
        super(nombre);
        this.dni = dni;
        this.connection = connection;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isConnection() {
        return connection;
    }

    public void setConnection(boolean connection) {
        this.connection = connection;
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
