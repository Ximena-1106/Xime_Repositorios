/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UPtlax.Practica11;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.level;
import java.util.logging.Logger;
/**
 *
 * @author nueva
 */
public class Archivo {
//Variable de clase
public Archivo(String ruta){
this.ruta = ruta;
}

//Metodo de clase
public String leer(){
String contenido = "";
File archivo =null;
FileReader fileReader =null;
BufferedReader bufferedReader = null;
try{
archivo = new File(this.ruta);
fileReader = new FileReader(archivo);
bufferedReader= new BufferedReader(fileReader);
String linea;
while((linea = bufferedReader.readLine()) !=null){
contenido += linea;
}
}
catch(Exception e){
e.printStackTrace();
}
finally{
try{
bufferedReader.close();
}
catch(IOException ex){
ex.printStackTrace();

}
}
return contenido;
}
public void escribir(String ruta, boolean concatenar){
FileWruter archivo =null;
PrintWriter printWriter = null;
try{
archivo = new FileWriter(ruta.concatenar);
printWriter = new PrintWriter(archivo);
printWriter.println(cadena);

}
catch(Exception e){
e.printStackTrace();
}
finally{
try{
archivo.close();
}catch(IOException ex){
ex.printStackTrace();
}
}
}
public void escribirObjeto(Persona persona, String ruta){
FileOutputStream fileOutputStream = null;
ObjectOutputStream objectOutputStream = null;
try{

FileOutputStream fileOutputStream = new FileOutputStream('archivos/persona.data');
ObjectOutputStream objectOutputStream = new ObjectOutputSream(fileOutputStream);
objectOutputStream.writeObject(persona);
}
catch(FileNotFoundException ex){
ex.printStackTrace();
}
catch(Exception e){
e.printStackTrace();
}
finally{
if(objectOutputStream !=null){
objectOutputStream.close();
}catch (IOException ex){
ex.printStackTrace();
}
}
}
}
public void leerObjeto(String ruta){
FileImputStream fileImputStream = null;
ObjectInputStream objectInputStream = null;
Persona persona = new Persona();
try{
FileInputStream  = new FileInputStream(ruta);
objectInputStream = new ObjectInputStream(fileInputStream);
persona =(Persona)objectInputStream.readObject();

}
catch(Exception e){
e.orintStackTrace();
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
}