/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

public class contactosDTO {
    
    private String nombre;
    private String apellido;
    private int telefono1;
    private int telefono2;
    private String direccionPostal;
    private String email;
    private String cumpleaños;
    
    public contactosDTO(String nombre, String apellido, int telefono1, int telefono2, String direccionPostal, String email, String cumpleaños) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.direccionPostal =direccionPostal;
        this.email = email;
        this.cumpleaños = cumpleaños;
        
        
      
    }

    //generamos getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }

    public int getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(int telefono2) {
        this.telefono2 = telefono2;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
    // constructor 
    
}
