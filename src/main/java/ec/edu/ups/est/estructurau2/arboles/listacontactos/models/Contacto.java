/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructurau2.arboles.listacontactos.models;

import java.util.List;
import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author pablo
 */
public class Contacto {
    private String nombre;
    private String telefono;
    private List<String> emails;
    private Map<String, String> redesSociales;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.emails = new ArrayList<>();
        this.redesSociales = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<String> getEmails() {
        return this.emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public Map<String, String> getRedesSociales() {
        return this.redesSociales;
    }

    public void setRedesSociales(Map<String, String> redesSociales) {
        this.redesSociales = redesSociales;
    }

    // Otros métodos y atributos según tus necesidades

    @Override
    public String toString() {
        return "Contacto:" + nombre;
    }
}