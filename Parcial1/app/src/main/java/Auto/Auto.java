package Auto;

public abstract class Auto {
     String nombre;

    public Auto(String nombre) {
        this.nombre = nombre;
    }

    abstract public int ruedas();

    @Override
    public String toString() {
        return "VEHICULO [NOMBRE=" + nombre + "]";
    }
}