/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.vehiculo.Auto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

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
                + "'" + auto.getColor() + "',"
                + auto.getAño() + ",'"
                + auto.getPerCedula() + ");";

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

    public Auto BuscarAuto(String placa) {

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
                auto.setAño(String.valueOf(res.getInt("AUT_AÑO")));
                auto.setPerCedula(res.getString("PER_CEDULA"));

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return auto;
    }

    public void updateAuto(Auto auto) {

        String sql = "UPDATE \"AUTO \" SET \"AUT_MODELO\" = '"
                + auto.getModelo() + "', \"AUT_COLOR\" = '"
                + auto.getColor() + "', \"AUT_AÑO\" = "
                + auto.getAño() + ", \"PER_CEDULA \" = '"
                + auto.getPerCedula() + "' WHERE \"AUT_PLACA\" ='" + auto.getPlaca() + "';";
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

    public void deleteAuto(String auto) {

        String sql = "DELETE FROM \"AUTO \"WHERE \"AUT_PLACA \"='" + auto + "';";
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

    public Set printAuto() {

        Set<Auto> lista = new HashSet<>();
        try {

            String sql = "SELECT * FROM \"AUTO\";";
            System.out.println("Base listar" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Auto auto = new Auto();
                auto.setPlaca(res.getString("AUT_PLACA"));
                auto.setModelo(res.getString("AUT_MODELO"));
                auto.setColor(res.getString("AUT_COLOR"));
                auto.setAño(String.valueOf(res.getInt("AUT_AÑO")));
                auto.setPerCedula(res.getString("PER_CEDULA"));
                lista.add(auto);

            }
            res.close();
            sta.close();
            MiBaseDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }

        return lista;

    }

}
