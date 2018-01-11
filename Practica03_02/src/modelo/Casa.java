/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author User
 */
public class Casa {
    private Persona duenio;
    private int Precio;
    private String direccion;
    private int id;
    

    public Casa(Persona duenio, int precio, String direccion,int id) {
        this.duenio = duenio;
        this.Precio = precio;
        this.direccion = direccion;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        this.Precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Casas{" + "duenio=" + duenio + ", precio=" + Precio + ", direccion=" + direccion + '}';
    }
    
    
}
