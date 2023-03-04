import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double cantidad =0;
        String[] opciones = {
                "Conversor de Moneda",
                "Conversor de Temperatura",
                "Más"};

        JOptionPane optionPaneMenu = new JOptionPane();

        String opcionSeleccionada = (String) optionPaneMenu.showInputDialog(
                null,
                "Seleccione una opción de conversión",
                "Menu",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (opcionSeleccionada == null) {
            System.exit(0);
        }


        if (opcionSeleccionada == opciones[0]) {
             cantidad = Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "Ingrese la cantidad de dinero que deseas convertir"
                    ));
        }

        String[] conversiones = {
                "De Soles a Dólar",
                "De Soles a Euro",
                "De Dólar a Soles",
                "De Euro a Soles"};

        String conversionSeleccionada = (String) JOptionPane.showInputDialog(
                null,
                "Elije la moneda a la que deseas convertir tu dinero",
                "Monedas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                conversiones,
                conversiones[0]);

        if (cantidad>0){
            if (conversionSeleccionada == "De Soles a Dólar") {
                JOptionPane.showMessageDialog(
                        null,
                        "Tienes $ "
                                + cantidad * 3.90+ " Dolares");
            }
        }

    }
}