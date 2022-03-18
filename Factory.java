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
        if(opc.equalsIgnoreCase("HashMap")){ ///HashMap
            return new HashMap<E,I>();
        } else if  (opc.equalsIgnoreCase("TreeMap")){ ///Treemaps
            return new TreeMap<E,I>();
        } else if (opc.equalsIgnoreCase("LinkedHashMap")){ ///LinkedHashMap
            return new LinkedHashMap<E,I>();
        }
        return null;
    }
}
