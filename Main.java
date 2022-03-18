import java.util.*;
import java.nio.*;
import java.io.IOException;
import java.util.stream.Stream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * @author Sebastian Franco 21484
 * @author Gabriela de Leon 21037 
 * Clase Main
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Factory f = new Factory<>();
        Scanner sc = new Scanner(System.in);

        Map Hmap;
        Map Tmap;
        Map Lmap;

        Mazo mazo = new Mazo();
        String opcion;

        boolean next = true;

        System.out.println("Tipo de mapa que quiere utilizar que desea utilizar: "); 
        System.out.println("1. HashMap"); 
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap."); 
        opcion = sc.next();

        Hmap = f.getMap(opcion);
        Tmap = f.getMap(opcion);
        Lmap = f.getMap(opcion);

        if(Hmap != null && Tmap != null && Lmap != null){ ///Por si no existe
            mazo.asignarMapa(Hmap);
            mazo.asignarMapa(Tmap);
            mazo.asignarMapa(Lmap);
        }

        ArrayList<String> cartas = new ArrayList<>();///Se lee el archivo
        try {
            Stream<String> lines;
            lines = Files.lines(Paths.get("cards_desc.txt"), StandardCharsets.UTF_8);
            lines.forEach(cartas::add);
        } catch(IOException e) {
            System.out.println("Error.");
        }

        for (String c: cartas){ ///Para separar las cartas
            String[] posicion = c.split("[|]");
            mazo.agregarCarta(posicion[0], posicion[1]);
        }

        while (next){ 
            System.out.println("1. Guardar carta");
            System.out.println("2. Indicar que tipo de carta es");
            System.out.println("3. Mostrar Mi Mazo");
            System.out.println("4. Mostrar Mi Mazo por tipo");
            System.out.println("5. Mosytar Mazo entero ");
            System.out.println("6. Mostrar Mi mazo por tipo");
            System.out.println("7. Salir");
            String eleccion = sc.next();

            if (eleccion == "1"){

            } else if (eleccion =="2"){

            } else if (eleccion =="3"){
                mazo.mostrarTodas();
            } else if (eleccion =="4"){
                mazo.mostrarTipo();
            } else if (eleccion =="5"){
                cartas.
            } else if (eleccion =="6"){
                
            } else if (eleccion =="7"){
                next = false;
            }

        }

    }
}

