/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Equipo;
import Modelo.EquipoMiembros;
import Modelo.Tarea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Modelo.Miembro;

/**
 *
 * @author Facu
 */
public class TareaData {

    private Connection con = null;
    private Conexion conexion;

    public TareaData(Conexion conexion) {
        try {
            this.conexion = conexion;
            con = conexion.getConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }

    }

    public void guardarTarea(Tarea t) {

        String sql = "INSERT INTO tarea (nombre, fechaCreacion, fechaCierre,  estado, idMiembroEq) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getNombre());
            ps.setDate(2, Date.valueOf(t.getFechaCreacion()));
            ps.setDate(3, Date.valueOf(t.getFechaCierre()));
            ps.setInt(4, t.getEstado());
            ps.setInt(5, t.getEquipomiembros().getIdMiembroEq());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                t.setIdTarea(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "tarea añadida con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "La tarea no fue añadida.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo añadir la tarea a la BD." + ex.getMessage());
        }
    }

    public void eliminarTarea(int id) {

        try {
            String sql = "UPDATE tarea SET estado = 0 WHERE idTarea = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se eliminó la tarea.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo eliminar la tarea." + e.getMessage());
        }
    }

    public List<Tarea> listarTareasPorIdMiembroEQ(int id) {
        List<Tarea> listaRecibida = new ArrayList<>();
        try {
            String sql = "SELECT idTarea, nombre, fechaCreacion, fechaCierre, Estado\n"
                    + "FROM tarea\n"
                    + "WHERE idMiembroEq = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Tarea a = new Tarea();
                a.setIdTarea(rs.getInt("idTarea"));
                a.setNombre(rs.getString("nombre"));
                a.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
                a.setFechaCierre(rs.getDate("fechaCierre").toLocalDate());
                a.setEstado(rs.getInt("estado"));
                listaRecibida.add(a);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda." + ex.getMessage());
        }
        return listaRecibida;
    }

    public void activarTarea(int id) {

        try {
            String sql = "UPDATE tarea SET estado = 1 WHERE idTarea = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se activo la tarea.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo activo la tarea." + e.getMessage());
        }
    }

    public Tarea modificarTarea(int id, Tarea p) {

        String sql = "UPDATE tarea SET nombre = ?, fechaCreacion = ?,fechaCierre = ?,estado = ?,idMiembroEq = ? WHERE  idTarea = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setDate(2, Date.valueOf(p.getFechaCreacion()));
            ps.setDate(3, Date.valueOf(p.getFechaCierre()));
            ps.setInt(4, p.getEstado());
            ps.setInt(5, p.getEquipomiembros().getIdMiembroEq());
            ps.setInt(6, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La tarea no se encuentra activa");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar la Tarea en la bd." + ex.getMessage());
        }
        return p;
    }

    public void actualizarEstadoTarea(int id, int estado) {
        try {
            if (estado < 0 || estado > 3) {
                JOptionPane.showMessageDialog(null, "El estado proporcionado no es válido. Debe ser 0, 1, 2 o 3.");
                return;
            }
            String sql = "UPDATE tarea SET estado = ? WHERE idTarea = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();

            if(estado ==0){
                JOptionPane.showMessageDialog(null, "La tarea fue desactivada");
            }
            if(estado ==3){
                 JOptionPane.showMessageDialog(null, "La tarea ha sido terminada");
            }
    

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo actualizar el estado de la tarea. " + e.getMessage());
        }
    }

}
