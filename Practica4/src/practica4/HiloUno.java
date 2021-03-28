/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica4;

/**
 *
 * @author nueva
 */
public class HiloUno extends Thread{
//Variables de clase
public int tiempo;
//Constructor con parametros
public HiloUno(int tiempo){
this.tiempo = tiempo;
}
//Sobreescritura de metodos
@Override
public void run(){
try {
    sleep(tiempo);
    for(int i=0 ; i<=1000 ; i++){

}
System.out.println("Termine ejecución de hilo con tiempo"+(tiempo/1000)+" segundos");
   }catch(InterruptedException ex){
Logger.getLogger(HiloDos.class.getName()).log(Level.SERVERE, null, ex)
} 

}
}
