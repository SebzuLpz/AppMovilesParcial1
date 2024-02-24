package Auto;

public class Carro1 extends Auto {
     String modelo;

    public Carro1(String nombre, String modelo) {
        super(nombre);
        this.modelo = modelo;
    }

    @Override
    public int ruedas() {
        return 4;
    }


    @Override
    public String toString() {
        return "\nCOCHE 1: \n NOMBRE = " + nombre + "\n MODELO = " + modelo;
    }
}