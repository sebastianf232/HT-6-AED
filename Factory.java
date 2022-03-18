import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
//import java.util.Scanner; creo que no hay que usarla

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 6
 * @author Sebastian Franco 21484
 * @author Gabriela de Leon 21037 
 * Clase Factory
 */
public class Factory<E,I> {
    public Map<E,I> getMap(String opc){
        if(opc.equalsIgnoreCase("HashMap")){
            return new HashMap<E,I>();
        } else if 
        (opc.equalsIgnoreCase("TreeMap")){
            return new TreeMap<E,I>();
        } else if 
        (opc.equalsIgnoreCase("LinkedHashMap")){
            return new LinkedHashMap<E,I>();
        }
        return null;
    }
    /**private Pilas<E> stack;
    public Pilas<E> getStack(){
        Scanner scan = new Scanner(System.in);
        boolean on = true;
        int i = 0;
        while (on){ ///Mientras este activa el Factory se hace el proceso. Se ingresa que tipo de stack o ista a usar.
            System.out.println("Ingrese tipo de stack a utilziar: \n1.Vector \n2. ArrayList \n3. Lista (debera escoger tipo de lista)");
            try{
                i = scan.nextInt();
            } catch (Exception e){
                /// Se pone la Exception para obtener errores del usuario.
                System.out.println("Ingrese solo 1, 2 o 3");
                continue;
            }
            if (i <= 0 || i > 3){
                /// Se pone la Exception para obtener errores del usuario.
                System.out.println("Ingrese solo 1, 2 o 3");
                continue;
            }
            break;
        }

        if(i == 1){ ///Stack de Pilas de Vector
            stack = new StackPV<>();
        } if (i == 2){ ///Stack de Pilas de ArrayList
            stack = new StackPAL<>();
        } if (i == 3){ ///Stack de Listas, donde tendra que escoger el tipo de lista.
            stack = new StackPL<>();
        }
        return stack; ///Se regresa el Stack segun el orden que se escogio.
    */}
}
