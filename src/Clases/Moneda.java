package Clases;
import Dominio.PadreConversion;

public class Moneda extends PadreConversion {

    public Moneda(String name) {
        super(name);
    }

    public double Change(double cantidad, String moneda,Boolean motivo){
        double valueL = super.getValues().get(moneda);

        return motivo ?
                cantidad/valueL:
                cantidad*valueL;
    }
}
