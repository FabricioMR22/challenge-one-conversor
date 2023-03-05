package TEST;
import Clases.Moneda;
import Clases.Temperatura;
import Dominio.Conversion;

public class TestMoneda {
    public static void main(String[] args) {
        Moneda PEN = new Moneda("PEN");
        Temperatura Celsius = new Temperatura("Celsius");
        Conversion BloqueTipos = new Conversion();

        PEN.addValue("USD",3.7685);
        PEN.addValue("EUR",4.0067);
        PEN.addValue("GBP",4.5373);
        PEN.addValue("YEN",0.02773);
        PEN.addValue("WON",0.002908);

        BloqueTipos.addTipo("Moneda",PEN);

        System.out.println(PEN.getValues());

        System.out.println(
                PEN.Change(100,"USD",false)
        );


    }
}
