/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principal;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.persona.Persona;

/**
 *
 * @author erics
 */
public class Prueba {
    public static void main (String args[]){
         ControladorPersona cp = new ControladorPersona();
       // ControladorDireccion cd = new ControladorDireccion();
        Persona p = new Persona("0105802607", "Pedro", "Parra", 22, "Gualaceo");
        cp.create(p);
    }
}
