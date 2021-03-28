/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica4;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nueva
 */
public class  HiloDos extends Thread{
@Override
public void run(){
    try {
    sleep(10000);
    for(int i=0 ; i<=100000 ; i++){
    }
System.out.println("Termine ejecución de hilo 2");
   }catch(InterruptedException ex){
Logger.getLogger(HiloDos.class.getName()).log(Level.SERVERE, null, ex);
}
}
}
