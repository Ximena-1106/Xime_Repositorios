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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Archivo archivo = new Archivo ("archivo/persona,txt");
String temp = archivo.leer();
System.out.println(temp);


archivo.escribir("archivos/nuevo_archivo.txt",false);
Persona persona = new Persona();
persona.setNombre("Ulises");
persona.setCompania("Grupo AMx Bussiness Factory S.A de C.V");
persona.setId("1");
persona.setEdad("27");

archivo.escribirObjeto(persona,"archivo/persona.data");
Persona personaDesdeArchivo = archivo.leerObjeto("archivos/personas.dat");
System.out.println(personaDesdeArchivo.getNombre());
System.out.println(personaDesdseArchivo.getCompania());
    }

}
