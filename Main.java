import java.util.*;
import java.nio.*;
import java.io.IOException;


/**
 * @author Sebastian Franco 21484
 * @author Gabriela de Leon 21037 
 * Clase Main
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        Map mapa;
        Map mapa2;
        Mazo mazo = new Mazo();
        String opcion;
        opcion = read.next();

        System.out.println("Tipo de mapa que quiere utilizar que desea utilizar: "); 
        System.out.println("1) HashMap"); 
        System.out.println("2) TreeMap");
        System.out.println("3) LinkedHashMap."); 
            switch(op){
                case 1:
                    System.out.println("HashMap"); 
                case 2:
                    System.out.println(""); 
                case 3:
                    System.out.println(""); 
                default:
                    System.out.println("Escriba una opción correcta");
                    break;

            }
    }
}

