import javax.swing.*;

public class Main {

    static String selectMenu;
    static double inCantidad;
    static String inConversion;


    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu(){
        String[] opciones ={
                "Conversor de Moneda",
                "Conversor de Temperatura",
                "Más"};

        selectMenu = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción de conversión",
                "Menu",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);

        System.out.println(selectMenu);

        if (selectMenu != null) {
            showCantidad();
        }else {
            System.exit(0);
        }
    }

    public static void showCantidad(){
        try{
            String provCantidad =JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de dinero que deseas convertir");

            if (provCantidad ==null){
                showMenu();
            }

            inCantidad = Double.parseDouble(provCantidad);
            if (inCantidad<=0){
                throw new NumberFormatException();
            }
            showTipo();

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                    "Ingresa una cantidad correcta");
            showCantidad();
        }
    }

    public static void showTipo(){
        String[] conversiones = {
                "De Soles a Dólar",
                "De Soles a Euro",
                "De Dólar a Soles",
                "De Euro a Soles"};

        inConversion = (String) JOptionPane.showInputDialog(
                null,
                "Elije la moneda a la que deseas convertir tu dinero",
                "Monedas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                conversiones,
                conversiones[0]);

        if (inConversion !=null){
            showResult();
        }else{
            showCantidad();
        }
    }

    public static void showResult(){
        if (inConversion == "De Soles a Dólar") {
            JOptionPane.showMessageDialog(
                    null,
                    "Tienes $ "
                            + String.format("%.2f", inCantidad / 3.90)  + " Dolares");
        }else {
            JOptionPane.showMessageDialog(
                    null,
                    "Tienes <Conversion> "
                            + inCantidad * 10 + " Falta");
        }
        optionFinal();
    }

    public static void optionFinal(){
        int result = JOptionPane.showConfirmDialog(
                null,
                "¿Desea continuar?",
                "Finalizar",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            showMenu();
        } else {
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
            System.exit(0);
        }
    }
}