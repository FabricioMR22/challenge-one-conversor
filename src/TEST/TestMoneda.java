package TEST;
import Clases.Moneda;
import Clases.Temperatura;
import Dominio.Conversion;

public class TestMoneda {
    public static void main(String[] args) {
        Conversion BloqueTipos = new Conversion();
        BloqueTipos.addTipo("Moneda",new Moneda("PEN"));
        BloqueTipos.addTipo("Temperatura",new Temperatura("Celsius"));



        BloqueTipos.getTipos().get("PEN").addValue("USD",3.7685);
        /*PEN.addValue("EUR",4.0067);
        PEN.addValue("GBP",4.5373);
        PEN.addValue("YEN",0.02773);
        PEN.addValue("WON",0.002908);
        */


        BloqueTipos.getTipos().forEach((s, padreConversion) -> System.out.println(s));


        System.out.println(BloqueTipos.getTipos().get("PEN").getValues());



    }
}
