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
import controlador.QuickSort;
import java.util.List;
import java.util.Vector;
import lista.Lista;
import modelo.Casa;
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
    public static void main (String[] args) throws Exception  
    {
         Vector v1;
         v1=new Vector();
       HashMap<String, String> listaProductos = new HashMap<String, String>();
        Metodos met = new Metodos();
        Lista list = new Lista();
        
  
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
        
        System.err.println("Precio");
         int precio = teclado.nextInt();
         System.err.println("Direccion");
         String direccion = teclado.next();
         System.err.println("Ingrese su id");
         int id2 = teclado.nextInt();
         v1.add(id2);
         Casa casa = new Casa (per,precio,direccion,id2);
         list.agregar(casa);
         System.err.println("Ingrese  1 para salir  ");
          dat = teclado.nextInt();
        }
          System.err.println("Diccionario");
          System.err.println("1*- Mostar todos los elementos ");
          System.err.println("2*- Mostar un elemento ");
          System.err.println("3*- Eliminar un elemento ");
          //System.err.println("4*- Ordenar QuickSort ");
          int opc = teclado.nextInt();
          if(opc ==1)
          {
              met.recuperarElementos(listaProductos);
          }
          if(opc == 2)
          {
              System.err.println("Ingrese la clave ");
             int clav = teclado.nextInt();
              met.recuperarElemento(listaProductos, clav);
          }
          if(opc == 3)
          { System.err.println("Ingrese la clave ");
             int clav = teclado.nextInt();
             met.eliminar(clav, listaProductos);
             met.recuperarElementos(listaProductos);
          } 
          
           System.err.println("Lista");
          System.err.println("1*- Mostar un elemento");
          System.err.println("2*- Eliminar Elemento ");
          int opc2 = teclado.nextInt();
          if(opc2 ==1)
          {
              System.err.println(list.getElementList());
              System.err.println("Ingrese Su pisicion");
              int pos = teclado.nextInt();
               System.err.println(list.getElementList());
          }
          if(opc2 ==2)
          {  System.err.println(list.getElementList());
             System.err.println("Ingrese el dato ");
              int pos2 = teclado.nextInt();
              list.eliminarElemento(pos2);
              System.err.println(list.getElementList());
          }
          
        System.err.println("Metodos De Ordenamiento");
          System.err.println("1*- Burbuja");
          System.err.println("2*- QuickSort ");
          int opc3 = teclado.nextInt();
    if(opc3 ==1)
          {
              
          }
      if(opc3 ==2)
          {
               QuickSort qui = new QuickSort();
          int Ord []= qui.Quick(v1);
          for (int i=0 ;i<Ord.length;i++)
          {
              System.err.println(list.recuperarElemento(i));  ;
            
          }
           /* QuickSort qui = new QuickSort();
            Vector v2;
         v2=new Vector();
         v2=(Vector) list.getElementList();
          int Ord []= qui.Quick(v2);
          for (int i=0 ;i<Ord.length;i++)
          {
              list.recuperarElemento(Ord[i]) ;  
          } */  
          }
          
         // System.err.println(v1.toString());
         
          
           //met.recuperarElementos(listaProductos);
           
          // System.err.println(list.getElementList());
            
          /*  Persona perbus = new Persona("2","2",2,2); 
            Casa casabus = new Casa (perbus,2,"2",2);
            for(int i = 0 ; i<3;i++)
            {
                System.err.println(list.recuperarElemento(i)+ "="+ casabus );
                if (list.recuperarElemento(i).equals(casabus))
                {
                    System.err.println("rESPUESTA = "+list.recuperarElemento(i));
                }
            }*/
            
          
            
            
         
         
         
     
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
