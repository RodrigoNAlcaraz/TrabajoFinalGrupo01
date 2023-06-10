package Controlador;

import Modelo.Equipo;
import Modelo.EquipoMiembros;
import Modelo.Miembro;
import Modelo.Proyecto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EquipomiembrosData {

    private Connection con = null;
    private Conexion conexion;

    public EquipomiembrosData(Conexion conexion) {
        try {
            this.conexion = conexion;
            con = conexion.getConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }

    }

    public void guardarEquipoMiembro(EquipoMiembros p) {

        String sql = "INSERT INTO equipomiembros (fechaIncorporacion, idEquipo, idMiembro,estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getFechaIncorporacion().toString());
            ps.setInt(2, p.getEquipo().getIdEquipo());
            ps.setInt(3, p.getMiembro().getIdMiembro());
            ps.setBoolean(4, p.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                p.setIdMiembroEq(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "EquipoMiembro añadido con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "El EquipoMiembro no fue añadido.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo añadir el EquipoMiembro." + ex.getMessage());
        }
    }

    public void eliminarEquipoMiembro(int id) {

        try {
            String sql = "UPDATE equipomiembros SET estado = 0 WHERE idMiembroEq = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se eliminó el equipo miembro.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo eliminar el equipo miembro de la bd." + e.getMessage());
        }
    }

    public void activarEquipoMiembro(int id) {

        try {
            String sql = "UPDATE equipomiembros SET estado = 1 WHERE idMiembroEq = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se activo el equipo miembro.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo activar el equipo miembro de la bd." + e.getMessage());
        }
    }

    public EquipoMiembros modificarEquipoMiembro(int id, EquipoMiembros p) {

        String sql = "UPDATE equipomiembros SET fechaIncorporacion = ?,  estado = ? WHERE  idMiembroEq = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setDate(1, Date.valueOf(p.getFechaIncorporacion()));
            ps.setInt(2, p.isEstado() ? 1 : 0);
            ps.setInt(3, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El equipo miembro no se encuentra activo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el equipo miembro en la bd." + ex.getMessage());
        }
        return p;
    }



}
