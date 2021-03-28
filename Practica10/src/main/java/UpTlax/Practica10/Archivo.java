/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UpTlax.Practica10;
import java.io.FileFiader;
import java.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nueva
 */
public class Archivo {
//Variable de clase
private String ruta;

//Constructor con parametros
public Archivo(String ruta){
this.ruta = ruta;
}
//Método de clase
public String leer()throws IOException{
String contenido = "";
File archivo = null;
FileReader fileReader = null;
BufferedReader bufferedReader = null;
try{
archivo = new File(this.ruta);
fileReader = new FileReader(archivo);
bufferedReader = new BufferedReader(fileReader);
String linea;
while((Linea = bufferedReader.readLine())!= null){
contenido += linea;
}
}
catch(Exception e){
e.prinStackTrace();
}
finally{
bufferedReader.close();
}
return contenido;
}
public void escribir (String ruta, boolean concatenar){
FileWriter archivo = null;
PrintWriter printwriter = null;
try{
archivo = new Filewriter(ruta,concatenar);
printWriter = new PrintWriter(archivo);

//for(int i=0; i<10; i++){
//printWriter = new PrintWriter(archivo);
//printWriter.println(cadena);
//}
}
catch(Exception e){
e.printStackTrace();
}
finally{
try{
archivo.close();
}catch (IOException ex){
ex.printStackTrace();
}
}
}
public void escribirObjeto(){
FileOutputStream fileOutputStream = new FileOutputStream("Persona.data");
}
catch(FileNotFoundException ex){
ex.printStackTracer();
}
catch(Exception e){
e.printStackTracer();
}

finally{
if(ObjetoOutputStream! = null){
try{
objectOutputStream.close();
}catch(IOException ex){
ex.printStackTrace();
}
}
}
}
public void leerObjeto(){
FileInputStream fileInputStream = null;
ObjectInputStream objectInputStream = null;
Persona persona = new Persona();
try{
fileInputStream = new FileInputStream(ruta);
objectInputStream = new ObjectInputStream(fileInputStream);
persona = (Persona)ObjectInputStream.readObject();
}
catch(Exception e){
e.printStackTreace();
}
finally{
try{
objectInputStream.close();

}catch(IOException ex){
ex.printStackTrace();
}

}
return persona;
}
