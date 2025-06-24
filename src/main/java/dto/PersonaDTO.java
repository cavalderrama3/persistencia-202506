/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

public class PersonaDTO {

    private int personaId;
    private String nombre;
    private String ubicacion;
    private String genero;
    private String origenEtnico;
    private String nivelPobreza;
    private double ingresos;
    private String discapacidad;

    public PersonaDTO() {
        // Constructor vacío necesario para JSP o frameworks
    }

    public PersonaDTO(int personaId, String nombre, String ubicacion, String genero,
            String origenEtnico, String nivelPobreza, double ingresos, String discapacidad) {
        this.personaId = personaId;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.genero = genero;
        this.origenEtnico = origenEtnico;
        this.nivelPobreza = nivelPobreza;
        this.ingresos = ingresos;
        this.discapacidad = discapacidad;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getOrigenEtnico() {
        return origenEtnico;
    }

    public void setOrigenEtnico(String origenEtnico) {
        this.origenEtnico = origenEtnico;
    }

    public String getNivelPobreza() {
        return nivelPobreza;
    }

    public void setNivelPobreza(String nivelPobreza) {
        this.nivelPobreza = nivelPobreza;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }
}