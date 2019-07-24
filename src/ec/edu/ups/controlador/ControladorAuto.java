/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.persona.Persona;
import ec.edu.ups.vehiculo.Auto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author erics
 */
public class ControladorAuto {
     private BaseDeDatos MiBaseDatos;

    public ControladorAuto() {
        MiBaseDatos = new BaseDeDatos();
    }

    public void create(Auto auto) {
        String sql = "INSERT INTO \"AUTO\" VALUES('" + auto.getPlaca() + "',"
                + "'" + auto.getModelo() + "',"
                + "'"+ auto.getColor() + "',"
                +auto.getAño() + ",'"               
                + auto.getPerosna() + ");";
        System.out.println(sql);
        MiBaseDatos.conectar();
        try {
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            MiBaseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public Auto BuscaarPersona(String placa)  {
        Auto auto = new Auto();
        try {

            String sql = "SELECT * FROM \"AUTO\"WHERE\"AUT_PLACA\"='" + placa + "';";
            System.out.println("Base " + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                auto.setPlaca(placa);
                auto.setModelo(res.getString("AUT_MODELO"));
                auto.setColor(res.getString("AUT_COLOR"));
                auto.setAño(res.getString("AUT_AÑO"));
              //  auto.setPerosna(res.getInt("PER_CEDULA"));
               

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return auto;
    }

    public void updatePer(Auto auto, String placa) {
        
        String sql = "UPDATE \"AUTO \" SET('" + auto.getPlaca() + "','"
                + auto.getModelo() + "','"
                + auto.getColor() + "',"
                + auto.getAño() + ",'"
                + auto.getPerosna()+ ")\"WHERE \"AUT_PLACA\"='" + placa + "';";
        System.out.println("Base de datos " + sql);

        MiBaseDatos.conectar();
        try {

            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            MiBaseDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }

    }

    public void deletePer(String auto) {

        String sql = "DELETE FROM \"AURO \"WHERE \"AUT_PLACA \"='" + auto + "';";
        System.out.println("Base eliminada " + sql);

        MiBaseDatos.conectar();
        try {

            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            MiBaseDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }

    }
    
    public Auto printPer() {
        
        Auto auto = new Auto();
        try {

            String sql = "SELECT * FROM \"AUTO\"';";
            System.out.println("Base " + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                auto.setPlaca(res.getString("AUT_PLACA"));
                auto.setModelo(res.getString("AUT_MODELO"));
                auto.setColor(res.getString("AUT_COLOR"));
                auto.setAño(res.getString("AUT_AÑO"));
                //per.setDireccion(res.getString("PER_DIRECCION"));
             

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return auto;
    }
     
    
    
    
    
    
}
