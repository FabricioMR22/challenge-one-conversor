package Clases;
import Dominio.PadreConversion;

public class Temperatura extends PadreConversion {

    public Temperatura(String name) {
        super(name);
    }

    @Override
    public double Change(double cantidad, String moneda, Boolean motivo) {
        return 0;
    }
}
