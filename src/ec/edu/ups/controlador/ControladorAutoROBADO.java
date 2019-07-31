/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.controlador.*;
import ec.edu.ups.vehiculo.Auto;
import ec.edu.ups.vehiculoRobado.AutoRobado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author erics
 */
public class ControladorAutoROBADO {
    
    SimpleDateFormat formato; 
    private BaseDeDatos MiBaseDatos;

    public ControladorAutoROBADO() {
        MiBaseDatos = new BaseDeDatos();
         formato = new SimpleDateFormat("yyyy-MM-dd");
    }

    public void create(AutoRobado autor) {
        String fecha = formato.format(autor.getFechaRobo());
        String sql = "INSERT INTO \"AUTOROBADO\" VALUES('" + autor.getPlaca()
                + "','" + autor.getModelo() + "'"
                + ",'" + autor.getColor() + "','"
                + autor.getAño() + ",'"
                + fecha + "','"
                + autor.getPerCedula() + "');";

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

    public AutoRobado BuscarAuto(String placa) {

        AutoRobado auto = new AutoRobado();
        try {

            String sql = "SELECT * FROM \"AUTOROBADO\"WHERE\"AUT_PLACA\"='" + placa + "';";
            System.out.println("Base " + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                auto.setPlaca(placa);
                auto.setModelo(res.getString("AUT_MODELO"));
                auto.setColor(res.getString("AUT_COLOR"));
                auto.setAño(res.getInt("AUT_AÑO"));
                 auto.setFechaRobo(res.getDate("AUT_FECHAROBO"));
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

    public void updateAuto(AutoRobado autor) {

        String sql = "UPDATE \"AUTOROBADO \" SET \"AUT_MODELO\" = '"
                + autor.getModelo() + "', \"AUT_COLOR\" = '"
                + autor.getColor() + "', \"AUT_AÑO\" = "
                + autor.getAño()+ ",\"PER_FECHA\" = '" + formato.format(autor.getFechaRobo()) + ", \"PER_CEDULA \" = '"
                + autor.getPerCedula() + "' WHERE \"AUT_PLACA\" ='" + autor.getPlaca() + "';";
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

        String sql = "DELETE FROM \"AUTOROBADO \"WHERE \"AUT_PLACA \"='" + auto + "';";
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

        Set<AutoRobado> lista = new HashSet<>();
        try {

            String sql = "SELECT * FROM \"AUTOROBADO\";";
            System.out.println("Base listar" + sql);

            MiBaseDatos.conectar();
            Statement sta = MiBaseDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                AutoRobado auto = new AutoRobado();
                auto.setPlaca(res.getString("AUT_PLACA"));
                auto.setModelo(res.getString("AUT_MODELO"));
                auto.setColor(res.getString("AUT_COLOR"));
                auto.setAño(res.getInt("AUT_AÑO"));
                 auto.setFechaRobo(res.getDate("AUT_FECHA"));
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
