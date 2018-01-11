/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diccionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author johne
 */
public class Metodos <K,T>
{ 
    private HashMap <K,T> hashDiccionario ;



    public HashMap<K, T> getHashDiccionario() {
        return hashDiccionario;
    }

    public void setHashDiccionario(HashMap<K, T> hashDiccionario) {
        this.hashDiccionario = hashDiccionario;
    }
    


      public  boolean agregar(K codigo, T precio, HashMap <K,T> listaProductos){
    if (listaProductos.containsKey(codigo)) {
        System.out.println("No se puede introducir . El código esta repetido.");
        return false;
    } else {
        listaProductos.put(codigo, precio); 
        return true;
    }
     
}
    
    public  void modificaPrecio(K codigo, HashMap<K,T> listaProductos){
    Scanner sc = new Scanner(System.in);
    if (listaProductos.containsKey(codigo)) {
        System.out.println("Introduce la nueva definicion :");
        listaProductos.put(codigo, (T) sc.nextLine());            
    } else {
        System.out.println("No hay ninguna palabra con ese código.");
    }
}
 public  String recuperarElemento(HashMap<K, T> listaProductos, K clave) {
   
    Iterator<K> productos = listaProductos.keySet().iterator();
    System.out.println("El dato es :");
        String res = clave + " - " + listaProductos.get(clave);
        System.err.println(res);
        return res;    
}
 
public  List<T> recuperarElementos(HashMap<K,T> listaProductos) {
    Object clave;
    Iterator<K> productos = listaProductos.keySet().iterator();
     List<T> elementList = new ArrayList<T>();
    System.out.println("Hay los siguientes datos:");
    while(productos.hasNext()){
       
       
        clave = productos.next();
         String list = clave + " - " + listaProductos.get(clave);
        System.out.println(clave + " - " + listaProductos.get(clave));
         elementList.add((T) list);
    }   
    return elementList;
}
public  void recuperardefinicion(HashMap<K, T> listaProductos) {
    Iterator iterador = listaProductos.entrySet().iterator();
    //Iterator<Map.Entry<String, Float>> iterador = listaProductos.entrySet().iterator();
    Map.Entry producto;
    while (iterador.hasNext()) {
        producto = (Map.Entry) iterador.next();
        //producto = iterador.next(); Si se usase tambien la otra linea comentada.
        System.out.println(producto.getKey() + " - " + producto.getValue());
    } 
}
public boolean eliminar(K codigo, HashMap<K,T> listaProductos) {
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
