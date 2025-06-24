/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

public class ProgramaDTO {

    private int programaId;
    private String descripcion;
    private int gobiernoId;

    public ProgramaDTO(int programaId, String descripcion, int gobiernoId) {
        this.programaId = programaId;
        this.descripcion = descripcion;
        this.gobiernoId = gobiernoId;
    }

    public int getProgramaId() {
        return programaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getGobiernoId() {
        return gobiernoId;
    }
}
