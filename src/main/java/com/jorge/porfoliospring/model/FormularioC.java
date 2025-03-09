package com.jorge.porfoliospring.model;

public class FormularioC {
    private String nombre;
    private String email;
    private String mensaje;

    public FormularioC() {} // Constructor vacío requerido por Spring

    public FormularioC(String nombre, String email, String mensaje) {
        this.nombre = nombre;
        this.email = email;
        this.mensaje = mensaje;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
}
