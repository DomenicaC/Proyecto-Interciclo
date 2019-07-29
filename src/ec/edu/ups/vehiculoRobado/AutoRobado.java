/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vehiculoRobado;

import java.sql.Date;

/**
 *
 * @author Domenica Cañizares
 */
public class AutoRobado {

    private int placa;
    private String color;
    private int año;
    private String modelo;
    private Date fechaRobo;
    private int perCedula;

    public AutoRobado() {
    }

    public AutoRobado(int placa, String color, int año, String modelo, Date fechaRobo, int perCedula) {

        this.placa = placa;
        this.color = color;
        this.año = año;
        this.modelo = modelo;
        this.fechaRobo = fechaRobo;
        this.perCedula = perCedula;

    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaRobo() {
        return fechaRobo;
    }

    public void setFechaRobo(Date fechaRobo) {
        this.fechaRobo = fechaRobo;
    }

    public int getPerCedula() {
        return perCedula;
    }

    public void setPerCedula(int perCedula) {
        this.perCedula = perCedula;
    }

    @Override
    public String toString() {
        return "AutoRobado{" + " placa=" + placa + ", color=" + color + ", a\u00f1o=" + año + ", modelo=" + modelo + ", fechaRobo=" + fechaRobo + ", perCedula=" + perCedula + " " + '}';
    }

}
