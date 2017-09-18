/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

public class profesionalesDTO extends contactosDTO{
    
private String CIF;
private String DireccionFiscal;
private String Sector;

    public profesionalesDTO(String CIF, String DireccionFiscal, String Sector, String nombre, String apellido, int telefono1, int telefono2, String direccionPostal, String email, String cumpleaños) {
        super(nombre, apellido, telefono1, telefono2, direccionPostal, email, cumpleaños);
        this.CIF = CIF;
        this.DireccionFiscal = DireccionFiscal;
        this.Sector = Sector;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getDireccionFiscal() {
        return DireccionFiscal;
    }

    public void setDireccionFiscal(String DireccionFiscal) {
        this.DireccionFiscal = DireccionFiscal;
    }

    public String getSector() {
        return Sector;
    }

    public void setSector(String Sector) {
        this.Sector = Sector;
    }




    }


    
//getters and setters



