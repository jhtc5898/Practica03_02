/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica03_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import Diccionario.Metodos;
import java.util.List;
import lista.Lista;
import modelo.Persona;
//import lista.Lista;

/**
 *
 * @author johne
 */
public class Practica03_02 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args)  
    {
       HashMap<String, String> listaProductos = new HashMap<String, String>();
        Metodos met = new Metodos();
  
        Scanner teclado = new Scanner(System.in);
        int dat = 10;
         
          while (dat != 1) 
        {
            
         System.err.println("Ingrese el nombre de propietario ");
        String nombre = teclado.next();
        System.err.println("Ingrese el apellido");
         String apellido = teclado.next();
         System.err.println("Ingrese la edad");
         int edad = teclado.nextInt();
         System.err.println("Ingrese su id");
         int id = teclado.nextInt();
         Persona per = new Persona(nombre,apellido,edad,id);   
         met.agregar(id, per, listaProductos);
         System.err.println("Ingrese  1 para salir  sino  Ingrese otro valor  ");
          dat = teclado.nextInt();
        }
          met.recuperarElementos(listaProductos);
         
         
     
    }
    
}
/*
public static void main(String[] args) {
        HashMap<String, String> listaProductos = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        int opcionElegida = 0;
        String precio;
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
                    precio = sc.nextLine();
                    agregar(codigo, precio, listaProductos);
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
    }*/
