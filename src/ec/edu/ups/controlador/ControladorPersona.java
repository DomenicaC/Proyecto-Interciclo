/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.persona.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author erics
 */
public class ControladorPersona {
    private BaseDeDatos MiBaseDatos;

    public ControladorPersona() {
        MiBaseDatos = new BaseDeDatos();
    }

    public void create(Persona persona) {
        String sql = "INSERT INTO \"PERSONA\" VALUES('" + persona.getCedula() + "',"
                + "'" + persona.getNombre() + "',"
                + "'"+ persona.getApellido() + "',"
                +persona.getEdad() + ",'"               
                + persona.getDireccion() + "');";
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
    public Persona BuscaarPersona(String cedula)  {
        Persona per = new Persona();
        try {

            String sql = "SELECT * FROM \"PERSONA\"WHERE\"PER_CEDULA\"='" + cedula + "';";
            System.out.println("Base " + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                per.setCedula(cedula);
                per.setNombre(res.getString("PER_NOMBRE"));
                per.setApellido(res.getString("PER_APELLIDO"));
                per.setEdad(res.getInt("PER_EDAD"));
                per.setDireccion(res.getString("PER_DIRECCION"));
            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return per;
    }

    public void modificar(Persona p) throws SQLException {
        String sql = "UPDATE\"PERSONA\" SET \"PER_NOMBRE\" = '" 
                + p.getNombre() + "',\"PER_APELLIDO\" = '" + p.getApellido() + "',\"PER_EDAD\" = " 
                + p.getEdad() + ",\"PER_DIRECCION\" = '" + p.getDireccion() +"';";
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
    public void deletePer(String cedula) {
        String sql = "DELETE FROM \"PERSONA\"WHERE \"PER_CEDULA\" = '" + cedula + "';";
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
    public Persona printPer() {
        
        Persona per = new Persona();
        try {

            String sql = "SELECT * FROM \"PERSONA\"';";
            System.out.println("Base " + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                per.setCedula(res.getString("PER_CEDULA"));
                per.setNombre(res.getString("PER_NOMBRE"));
                per.setApellido(res.getString("PER_APELLIDO"));
                per.setEdad(res.getInt("PER_EDAD"));
                per.setDireccion(res.getString("PER_DIRECCION"));
            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return per;
    }

}
