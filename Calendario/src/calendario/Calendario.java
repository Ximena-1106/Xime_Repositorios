/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calendario;

/**
 *
 * @author nueva
 */
public class Calendario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
int entero  100;
double doble = 10.50;
float flotante = 11.50f  ;
char caracter;

System.out.println("El valor del doble es: +doble");
//Hacemos un casteo de variable
System.out.println("El valor casteado de doble es: "+((int)doble));

System.out.println("El valor  de entero es: "+entero);
System.out.println("El valor casteado de entero doble es: "+((double)entero));

String Cadena = "";
Integer enteroClase = 10;
Integer enteroClaseDos = 20;
Double dobleClase = 10.50 ;
Float flotanteClase = 11.50;

//==
enteroClase.compareTo(enteroClaseDos);

Integer miEntero = Integer.parseInt("100");
System.out.println("Elvalor de la clase es:" +miEntero);
try{
Double.perseDouble("t");
}
catch(NumberFormaException ex){
//ex.printStackTrace();

}
catch(Exception e){
//e.printStackTrace();
}
MiCalendario calendario = new MiCalendario();
System.out.println(calendario.dia());
}

}