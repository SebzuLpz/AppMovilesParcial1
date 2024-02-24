package Auto;

public class Carro2 extends Auto {
     String modelo;

    public Carro2(String nombre, String modelo) {
        super(nombre);
        this.modelo = modelo;
    }

    @Override
    public int ruedas() {
        return 4;
    }


    @Override
    public String toString() {
        return "\nCOCHE 2: \n NOMBRE = " + nombre + "\n MODELO = " + modelo;
    }
}