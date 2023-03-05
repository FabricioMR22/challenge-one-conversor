package Dominio;

import java.util.HashMap;
import java.util.Map;

public abstract class PadreConversion {
     private String name;
     private Map<String,Double> values = new HashMap<>();

     public PadreConversion(String name) {
          this.name = name;
     }

     public String getName() {
          return name;
     }

     public Map<String, Double> getValues(){
          return this.values;
     };

     public void addValue(String nombreV,Double value){
          this.values.put(nombreV,value);
     };

     public abstract double Change(double cantidad, String moneda,Boolean motivo);

     @Override
     public String toString() {
          return getName();
     }

}
