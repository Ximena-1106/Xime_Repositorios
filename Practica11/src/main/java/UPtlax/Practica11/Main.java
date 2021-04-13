/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UPtlax.Practica11;

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
Archivo archivo = new Archivo("archivos/personas.txt");
String temp = archivo.leer();
System.out.println(temp);

archivo.escribir("archivo/nuevo_archivo.txt",'Esto es nuevo'false);
Persona persona =new Persona();
persona.setNombre('Ximena');
persona.setCompañia('Grupo ABx Bussiness Factory S.A de C.V.');
persona.setId("1");
persona.setEdad("19");
 archivo.escribirObjeto(persona);
Persona personaDesdeArchivo =archivo.leerObjeto('archivo/persona.data');
System.out.println(personaDesdeArchivo.getNombre());
System.out.println(personaDesdeArchivo.getCompañia());
    }

}
