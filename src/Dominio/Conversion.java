package Dominio;

import java.util.HashMap;
import java.util.Map;

public class Conversion {
    private Map<String, PadreConversion> tipos = new HashMap<>();

    public Conversion() {
    }

    public Map<String, PadreConversion> getTipos() {
        return tipos;
    }

    public void addTipo(String nombre, PadreConversion tipo){
        this.tipos.put(nombre,tipo);
    }
}
