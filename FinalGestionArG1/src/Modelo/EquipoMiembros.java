/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Facu
 */
public class EquipoMiembros {
    private int idMiembroEq;
    private LocalDate fechaIncorporacion;
    private Equipo equipo;
    private Miembro miembro;
    private boolean estado;

    public EquipoMiembros() {
    }

    public EquipoMiembros(int idMiembroEq, LocalDate fechaIncorporacion, Equipo equipo, Miembro miembro, boolean estado) {
        this.idMiembroEq = idMiembroEq;
        this.fechaIncorporacion = fechaIncorporacion;
        this.equipo = equipo;
        this.miembro = miembro;
        this.estado = estado;
    }

    public EquipoMiembros(LocalDate fechaIncorporacion, Equipo equipo, Miembro miembro, boolean estado) {
        this.fechaIncorporacion = fechaIncorporacion;
        this.equipo = equipo;
        this.miembro = miembro;
        this.estado = estado;
    }

    public EquipoMiembros(Miembro a) {
       this.miembro = a;
    }

    public int getIdMiembroEq() {
        return idMiembroEq;
    }

    public void setIdMiembroEq(int idMiembroEq) {
        this.idMiembroEq = idMiembroEq;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EquipoMiembros{" + "idMiembroEq=" + idMiembroEq + ", fechaIncorporacion=" + fechaIncorporacion + ", equipo=" + equipo + ", miembro=" + miembro + ", estado=" + estado + '}';
    }

    

   


}
