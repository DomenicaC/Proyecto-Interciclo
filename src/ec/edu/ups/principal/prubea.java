/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principal;

import ec.edu.ups.controlador.ControladorAutoROBADO;
import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.vehiculoRobado.AutoRobado;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author erics
 */
public class prubea {
     public static void main(String[] args) throws SQLException {
        
        ControladorAutoROBADO cp = new ControladorAutoROBADO();
        
        AutoRobado p = new AutoRobado("a1234", "modelo", "rojo", 2201, (java.sql.Date) new Date(), "0983894228");
        cp.create(p);
        //cp.create(p);
        
        //System.out.println(cp.BuscarCedula("0302829957"));
        
     //   System.out.println(cd.maxcodeigo());
        // ControladorPersona controladorPersona = new ControladorPersona();
       // Persona p = new Persona("0105802708", "erick samuel", "parra ulloa ", 19, new Date(), "0998988991", 252.0);
        // Persona persona = controladorPersona.BuscaarPersona("0105802607");
          //controladorPersona.printPer();
        //  System.out.println(persona);
        
    }
    
}
