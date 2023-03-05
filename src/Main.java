import Clases.Moneda;
import Clases.Temperatura;
import Dominio.Conversion;
import Dominio.PadreConversion;

import javax.swing.*;

public class Main {
    static PadreConversion ObjMenu;
    static double inCantidad;
    static String inConversion;
    static boolean inChange;

    static Conversion BloqueTipos = new Conversion();

    public static void main(String[] args) {
        Moneda PEN = new Moneda("PEN");
        Temperatura Celsius = new Temperatura("Celsius");

        BloqueTipos.addTipo("Moneda",PEN);
        BloqueTipos.addTipo("Temperatura",Celsius);

        PEN.addValue("USD",3.7685);
        PEN.addValue("EUR",4.0067);
        PEN.addValue("GBP",4.5373);
        PEN.addValue("YEN",0.02773);
        PEN.addValue("WON",0.002908);

        Celsius.addValue("Fahrenheit",33.8);
        showMenu();
    }

    public static void showMenu(){
        String[] opciones = BloqueTipos.getTipos().keySet().toArray(new String[0]);
        String selectMenu =(String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        ObjMenu = BloqueTipos.getTipos().get(selectMenu);
        if (selectMenu == null) System.exit(0);
        showCantidad();
    }

    public static void showCantidad(){
        try{
            String provCantidad =JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir");
            if (provCantidad ==null) showMenu();
            inCantidad = Double.parseDouble(provCantidad);
            if (inCantidad<=0) throw new NumberFormatException();
            showTipo();
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingresa una cantidad correcta");
            showCantidad();
        }
    }

    public static void showTipo(){
        String[] conversiones = ObjMenu.getValues().keySet().toArray(new String[0]);
        inConversion = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, conversiones, conversiones[0]);
        if (inConversion ==null) showCantidad();
        showChange();
    }

    public static void showChange(){
        String[] opciones = {"Cambiar PEN a "+inConversion, "Cambiar " + inConversion+ " a PEN"};
        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Cambiar moneda", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]
        );
        inChange = (seleccion == 0);
        showResult();
    }

    public static void showResult(){
        String moneda = inChange? inConversion : "PEN";
        double result = ObjMenu.Change(inCantidad, inConversion, inChange);
        String message = String.format("Tienes %.2f %s", result, moneda);
        JOptionPane.showMessageDialog(null, message);
        optionFinal();
    }

    public static void optionFinal(){
        int result = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Finalizar", JOptionPane.YES_NO_CANCEL_OPTION);
        if (result != JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
            System.exit(0);
        }
        showMenu();
    }
}