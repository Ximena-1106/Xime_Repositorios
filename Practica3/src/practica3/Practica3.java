/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica3;
import java.io.IOException;
/**
 *
 * @author nueva
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
try{
//El arreglo de objetos está vacio
//ArrayList<Usuario> arreglo = new ArrayList<>();
//arreglo.get(0).getCorreo();
//throw new ArrayIndexOutOfBoundsException();
int a=10, b=13;

if(a>b){
System.out.println("Todo está bien");
}
else}
throw new IOException();
    }

}
catch(IOException e){
System.out.println("Este es un error de lectura de archivo");
}
//Este error es de jerarquia menor
catch (ArrayIndexOutOfBoundsException e){
System.out.printl("Acabas de entrar a un error de posición de arreglo");
}
//Este error es de jeraquia mayor
catch (Exception e){
System.out.printl("Esto es un error "+e.getMessage());
}
finally{
System.out.printl("Aca pueden poner codigo que quieren que se ejecute despues de una exception ");
}
}
}