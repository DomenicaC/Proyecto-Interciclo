/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vehiculo;

import ec.edu.ups.persona.Persona;

/**
 *
 * @author erics
 */
public class Auto extends Persona {

    private String placa;
    private String modelo;
    private String color;
    private String año;
    private String perCedula;

    public Auto() {

    }

    public Auto(String placa, String modelo, String color, String año, String perCedula) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
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

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getPerCedula() {
        return perCedula;
    }

    public void setPerCedula(String perCedula) {
        this.perCedula = perCedula;
    }

    @Override
    public String toString() {
        return "Auto{" + "placa=" + placa + ", modelo=" + modelo + ", color=" + color + ", a\u00f1o=" + año + ", perCedula=" + perCedula + '}';
    }

}
