
package Modelo;

import java.time.LocalDate;

public class Tarea {
    private int idTarea;
    private String nombre;
    private LocalDate fechaCreacion;
    private LocalDate fechaCierre;
    private int estado;
    private EquipoMiembros equipomiembros;

    public Tarea() {
    }

    public Tarea(int idTarea, String nombre, LocalDate fechaCreacion, LocalDate fechaCierre, int estado, EquipoMiembros equipomiembros) {
        this.idTarea = idTarea;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
        this.estado = estado;
        this.equipomiembros = equipomiembros;
    }

    public Tarea(String nombre, LocalDate fechaCreacion, LocalDate fechaCierre, int estado, EquipoMiembros equipomiembros) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
        this.estado = estado;
        this.equipomiembros = equipomiembros;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public EquipoMiembros getEquipomiembros() {
        return equipomiembros;
    }

    public void setEquipomiembros(EquipoMiembros equipomiembros) {
        this.equipomiembros = equipomiembros;
    }

    @Override
    public String toString() {
        return "N° " + idTarea + ", Tarea: " + nombre;
    }

   
    
}
