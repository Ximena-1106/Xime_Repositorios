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
public class MiCalendario implement IFecha{
//Sobreescritura de metodos
@Override
public String dia();{
String dia = "";
if(IFecha.DIA_SEMANA ==1){
dia = "lunes";
}
return "El dia "+IFecha.DIA_DE_MES" es "+dia;
}
//Sobreescritura de métodos
@Override 
public String mes(){
String mes  = "";
if(IFecha.MES_DEL_ANIO ==1){
mes = "Enero";
}
return "";
}
//Sobreescritura de métodos
@Override
public String anio(){
String anio  = "";
if(IFecha.AÑO ==1){
anio= "2020";
return " ";
} 
}

