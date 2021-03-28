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
public interface IFecha {
//Variable de Interfaz
public static final int DIA_SEMANA = Calendar.DAY_OF_WEEK;
public static final int DIA_DE_MES = Calendar.DAY_OF_MONTH;
public static final int MES_DEL_AÑO = Calendar.MONTH;
public static final int AÑO = Calendar.YEAR;


public abstract int dia();
public abstract int mes();
public abstract int anio();
}
