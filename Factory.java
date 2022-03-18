import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 6
 * @author Sebastian Franco 21484
 * @author Gabriela de Leon 21037 
 * Clase Factory
 */
public class Factory<E,I> {
    String E;
    String I;

    /**
     * @param opc
     * @return Map
     */
    public Map<E,I> getMap(String opc){
       switch (opc){
           case "1": return new HashMap<E,I>();
           case "2": return new TreeMap<E,I>();
           case "3": return new LinkedHashMap<E,I>();
           default: return null;
       } 
    }
}
