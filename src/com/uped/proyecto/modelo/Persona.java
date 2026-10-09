package com.uped.proyecto.modelo;

public abstract class Persona {
    protected String nombre;
    protected String dui;

    public Persona(String nombre, String dui) {
        this.nombre = nombre;
        this.dui = dui;
    }

    public String presentarse() {
        return nombre + " (DUI: " + dui + ")";
    }

    // Metodo abstracto (Contrato obligatorio para subclases)
    public abstract double calcularBeneficioAnual();
}