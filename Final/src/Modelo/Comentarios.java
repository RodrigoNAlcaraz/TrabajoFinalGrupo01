/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

public class Comentarios {
    private int idComentario;
    private String comentario;
    private LocalDate fechaAvance;
    private Tarea tarea;
    private boolean estado;
    

    public Comentarios() {
    }

    public Comentarios(int idComentario, String comentario, LocalDate fechaAvance, Tarea tarea, boolean estado) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.fechaAvance = fechaAvance;
        this.tarea = tarea;
        this.estado = estado;
    }

    public Comentarios(String comentario, LocalDate fechaAvance, Tarea tarea, boolean estado) {
        this.comentario = comentario;
        this.fechaAvance = fechaAvance;
        this.tarea = tarea;
        this.estado = estado;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFechaAvance() {
        return fechaAvance;
    }

    public void setFechaAvance(LocalDate fechaAvance) {
        this.fechaAvance = fechaAvance;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Comentarios{" + "idComentario=" + idComentario + ", comentario=" + comentario + ", fechaAvance=" + fechaAvance+ ", estado=" + estado + '}';
    }

   

    
}
