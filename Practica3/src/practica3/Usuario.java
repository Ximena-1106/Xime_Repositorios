/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica3;

/**
 *
 * @author nueva
 */
public class Usuario {
//Variable de Clase
private String nombre;
private String correo;

//Constructor vacio
public Usuario(){
this.nombre=" ";
this.correo= " ";
}
public String getNombre(){
return nombre;
}
public void setNombre(String nombre){
this.nombre= nombre;
}
public String getCorreo(){
return correo;
}
public void setCorreo(String correo){
this.correo = correo;
}
}
