/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2_celulares;

/**
 *
 * @author nueva
 */
public class Samsung extends Celular {
    @Override
    public String imprimirInformacion(){
        return "Esta se esta imprimiendo desde la clase hijo de Samsung";
    }
    

    @Override
    public String imprimirMarca() {
      return "Este celular de marca Samsung"; 
    }
    
}
