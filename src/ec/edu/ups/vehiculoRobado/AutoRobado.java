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

    private String placa;
     private String modelo;
    private String color;
    private int año;
    private Date fechaRobo;
    private String perCedula;

    public AutoRobado() {
    }

    public AutoRobado(String placa, String modelo, String color, int año, Date fechaRobo, String perCedula) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.fechaRobo = fechaRobo;
        this.perCedula = perCedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public Date getFechaRobo() {
        return fechaRobo;
    }

    public void setFechaRobo(Date fechaRobo) {
        this.fechaRobo = fechaRobo;
    }

    public String getPerCedula() {
        return perCedula;
    }

    public void setPerCedula(String perCedula) {
        this.perCedula = perCedula;
    }

    @Override
    public String toString() {
        return "AutoRobado{" + "placa=" + placa + ", modelo=" + modelo + ", color=" + color + ", a\u00f1o=" + año + ", fechaRobo=" + fechaRobo + ", perCedula=" + perCedula + '}';
    }
    
   
    
    
    

}
