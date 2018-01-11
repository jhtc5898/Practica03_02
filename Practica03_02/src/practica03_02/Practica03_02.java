/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica03_02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author johne
 */
public class Practica03_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> listaProductos = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        int opcionElegida = 0;
        String definicion;
        String codigo;

        while (opcionElegida != 5) 
        {
            System.out.println("Menu");
            System.out.println("1.- Agregar Al Diccionario");
            System.out.println("2.- Modificar p");
            System.out.println("3.- Mostrar todos los productos");
            System.out.println("4.- Eliminar producto");
            System.out.println("5.- Salir");
            opcionElegida = sc.nextInt();

            switch (opcionElegida) 
            {
                case 1:
                    System.out.println("Introduce la palabra clave :");
                    codigo = sc.next();
                    System.out.println("Ingrese La de definicion:");
                    sc.nextLine();
                    definicion = sc.nextLine();
                    agregar(codigo, definicion, listaProductos);
                    break;
                case 2:
                    System.out.println("Introduce la palabra clave  del que quieres cambiar su definicion:");
                    codigo = sc.next();
                    modificaPrecio(codigo, listaProductos);
                    break;
                case 3:
                    System.out.println("Introduce la palabra clave buscar:");
                    codigo = sc.next();
                    recuperarElementos(listaProductos);
                    break;
                case 4:
                    System.out.println("Introduce la palabra clave que quieres eliminar:");
                    codigo = sc.next();
                    eliminar(codigo, listaProductos);
                    break;
                case 5:
                    break;   // Si la opcion es 5 no se hace nada 
                default:
                    System.out.println("Tienes que introducir una opción valida");
            }

        } // TODO code application logic here
    }
  
    public static void agregar(String codigo, String precio, HashMap <String,String> listaProductos){
    if (listaProductos.containsKey(codigo)) {
        System.out.println("No se puede introducir . El código esta repetido.");
    } else {
        listaProductos.put(codigo, precio);               
    }
}
    
    public static void modificaPrecio(String codigo, HashMap<String,String> listaProductos){
    Scanner sc = new Scanner(System.in);
    if (listaProductos.containsKey(codigo)) {
        System.out.println("Introduce la nueva definicion :");
        listaProductos.put(codigo, sc.nextLine());            
    } else {
        System.out.println("No hay ninguna palabra con ese código.");
    }
}
 public static void recuperarElemento(HashMap<String, String> listaProductos, String clave) {
   
    Iterator<String> productos = listaProductos.keySet().iterator();
    System.out.println("El dato es :");
        clave = productos.next();
        System.out.println(clave + " - " + listaProductos.get(clave));
            
}
 
public static void recuperarElementos(HashMap<String, String> listaProductos) {
    String clave;
    Iterator<String> productos = listaProductos.keySet().iterator();
    System.out.println("Hay los siguientes datos:");
    while(productos.hasNext()){
        clave = productos.next();
        System.out.println(clave + " - " + listaProductos.get(clave));
    }        
}
public static void recuperardefinicion(HashMap<String, String> listaProductos) {
    Iterator iterador = listaProductos.entrySet().iterator();
    //Iterator<Map.Entry<String, Float>> iterador = listaProductos.entrySet().iterator();
    Map.Entry producto;
    while (iterador.hasNext()) {
        producto = (Map.Entry) iterador.next();
        //producto = iterador.next(); Si se usase tambien la otra linea comentada.
        System.out.println(producto.getKey() + " - " + producto.getValue());
    } 
}
public static void eliminar(String codigo, HashMap<String,String> listaProductos) {
    if (listaProductos.containsKey(codigo)) {
        listaProductos.remove(codigo);
    } else {
        System.out.println("No hay ningun datos con ese código.");  
    }       
} 
}
