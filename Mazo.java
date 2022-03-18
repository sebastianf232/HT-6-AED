import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.stream.Collectors;
import java.util.Map;


/**
 * @author Sebastian Franco 21484
 * @author Gabriela de Leon 21037 
 * Clase Mazo
 */
public class Mazo {

    /**
     * constructor
     */
    public Mazo(){
    }
    
    Map<String, Cartas> cartas;
    
    /**
     * @param mapa
     */
    public void asignarMapa(Map mapa){ ///Metodo que permite Asignar el Mapaa
        this.cartas = mapa;
    }
    
    /**
     * @param c
     */
    public void agregarCarta(Cartas c){ ///Metodo que permite agregar la Carta
        if (cartas.containsKey(c.getNombre())) {
            c.setValor(c.getValor() + 1);
        }
        cartas.put(c.getNombre(), c);
    }
    
    /**
     * @param c
     * @return true or false
     */
    public Boolean cartaExiste(String c){ ///Metodo que permite Indicar si existen cartas en el mazo.
        if(cartas.containsKey(c)){
            return true;
        }else{ 
            return false;
        }
    }

    /**
     * @param nombre
     * @param tipo
     */
    public void agregarCarta(String nombre, String tipo) { ///Metodo que permite agregarCarta
        cartas.put(nombre, new Cartas(nombre, tipo));
    }
    
    /**
     * @param c
     * @return carta or null
     */
    public Cartas getCarta(String c){ ///metodo que obtiene la carta
        if(cartas.containsKey(c)){
            Cartas carta = cartas.get(c);
            return carta;
        } else{
            return null;
        }
    }
    
    /**
     * @param c
     */
    public void removeCarta(Cartas c) { ///Quita la Carta.
        cartas.remove(c);
    }
    
    
    public void mostrarTodas(){ ///Metodo que ensenia todas las cartas
        System.out.println("Cartas: ");
        for (Map.Entry<String, Cartas> entry : cartas.entrySet()){ 
            System.out.println("Carta: " + entry.getKey() + " Tipo: " + entry.getValue().getTipo() + " Cantidad: " + entry.getValue().getValor());
        }
    }
    
    /**
     * @param param
     * @return result
     */
    public String darTipo(String param){ ///Metodo que permite darle un tipo a la carta
        String result="";
        if(cartas.containsKey(param)){ ///Si el vector de cartas tiene
            Cartas c = cartas.get(param);
            result = "La carta " + param + " es de tipo: " + c.getTipo();
        } else{ ///Si no existe la carta en el vector
            result="No existe la carta.";
        }
        return result;
    }
    
    public void mostrarTipo(){ ///Metodo que permite mostrar el tipo de carta.
        String hechizos = "";
        String trampas = "";
        String monstruos = "";
        System.out.println("");
        System.out.println("Las cartas son: ");
        for (Map.Entry<String, Cartas> entry : cartas.entrySet()){ 
            if (entry.getValue().getTipo().equals("Hechizo")) { ///Hechizos
                hechizos += "Carta: " + entry.getKey() + " Tipo: " + entry.getValue().getTipo() + " Cantidad: " + entry.getValue().getValor() + "\n";
            } else if (entry.getValue().getTipo().equals("Trampa")) { ///Trampas
                trampas += "Carta: " + entry.getKey() + " Tipo: " + entry.getValue().getTipo() + " Cantidad: " + entry.getValue().getValor() + "\n";
            } else if (entry.getValue().getTipo().equals("Monstruo")) { ///Monstruos
                monstruos += "Carta: " + entry.getKey() + " Tipo: " + entry.getValue().getTipo() + " Cantidad: " + entry.getValue().getValor() + "\n";
            }
            
        }
        
        System.out.println("Hechizos: " + hechizos);
        System.out.println("Trampa: " + trampas);
        System.out.println("Monstruos: " + monstruos);
    }
    
}