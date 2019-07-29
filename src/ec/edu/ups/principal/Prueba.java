/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principal;

import ec.edu.ups.controlador.ControladorAuto;
import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.vehiculo.Auto;

/**
 *
 * @author erics
 */
public class Prueba {
    
    public static void main(String args[]){
        ControladorPersona cp = new ControladorPersona();
        ControladorAuto cd = new ControladorAuto();
        Auto p = new Auto("a123", "Mazda", "rojo",2222,"0105802607");
        cd.create(p);
        
        
    }
}
