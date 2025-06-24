/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

public class SubsidioDTO {

    private int subsidioId;
    private int personaId;
    private int programaId;
    private double monto;
    private String fechaEntrega;

    public SubsidioDTO(int subsidioId, int personaId, int programaId, double monto, String fechaEntrega) {
        this.subsidioId = subsidioId;
        this.personaId = personaId;
        this.programaId = programaId;
        this.monto = monto;
        this.fechaEntrega = fechaEntrega;
    }

    public int getSubsidioId() {
        return subsidioId;
    }

    public int getPersonaId() {
        return personaId;
    }

    public int getProgramaId() {
        return programaId;
    }

    public double getMonto() {
        return monto;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }
}
