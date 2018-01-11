/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diccionario;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author johne
 */
public class Metodos <K,T>
{ 
    private HashMap <K,T> hashDiccionario;

    public Metodos(HashMap<K, T> hashDiccionario) {
        this.hashDiccionario = hashDiccionario;
    }

    public HashMap<K, T> getHashDiccionario() {
        return hashDiccionario;
    }

    public void setHashDiccionario(HashMap<K, T> hashDiccionario) {
        this.hashDiccionario = hashDiccionario;
    }
    


      public  boolean agregar(String codigo, String precio, HashMap <String,String> listaProductos){
    if (listaProductos.containsKey(codigo)) {
        System.out.println("No se puede introducir . El código esta repetido.");
    } else {
        listaProductos.put(codigo, precio); 
        return true;
    }
    return true;  
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
 public  String recuperarElemento(HashMap<String, String> listaProductos, String clave) {
   
    Iterator<String> productos = listaProductos.keySet().iterator();
    System.out.println("El dato es :");
        clave = productos.next();
        String res = clave + " - " + listaProductos.get(clave);
        return res;    
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
public boolean eliminar(String codigo, HashMap<String,String> listaProductos) {
    if (listaProductos.containsKey(codigo)) 
    {
        
        listaProductos.remove(codigo);
        return true;
    } else 
    {
        System.out.println("No hay ningun datos con ese código."); 
        return false;
    }       
} 
    }
