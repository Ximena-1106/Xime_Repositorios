/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UpTlax.Practica10;

/**
 *
 * @author nueva
 */
public class Persona {
private String id;
private String imagen;
private String edad;
private String nombre;
private String compañia;
private String email;
private String telefono;
private String direccion;
private String acerca_de;

//Constructor vacio
public Persona(){
this.id= "";
this.imagen = "";
this.edad = "";
this.nombre = "";
this.compañia = "";
this.email = "";
this.telefono = "";
this.direccion = "";
this.acerca_de = "";
}
 }

    public void setId(String id) {
        this.id = id;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setNombret(int nombre) {
        this.nombre = nombre;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setAcerca_de(String acerca_de) {
        this.acerca_de = acerca_de;
    }
    public String getId() {
        return id;
    }

    public String getImagen() {
        return imagen;
    }

    public String getEdad() {
        return edad;
    }

    public int getNombre() {
        return nombre;
    }

    public String getCompañia() {
        return compañia;
    }

    public String getEmail() {
        return email;
    }
 public String getTelefono() {
        return telefono;
}
    } public String getDireccion() {
        return direccion;
    } 
public String getAcerca_de() {
        return acerca_de;
    }
}
