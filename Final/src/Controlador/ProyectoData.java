/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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

public class ProyectoData {

    private Connection con = null;

    public ProyectoData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion a la base de datos" + e.getMessage());
        }

    }

    public void guardarProyecto(Proyecto p) {

        String sql = "INSERT INTO proyecto (nombre, descripcion, fechaInicio, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDate(3, Date.valueOf(p.getFechaInicio()));
            ps.setInt(4, p.isEstado() ? 1 : 0);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                p.setIdProyecto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proyecto añadido con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "El Proyecto no fue añadido.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo añadir el proyecto." + ex.getMessage());
        }

    }

    public Proyecto buscarProyecto(int id) {
        Proyecto p = new Proyecto();
        String sql = "SELECT * FROM proyecto WHERE idProyecto=? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p.setIdProyecto(id);
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                p.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No hay proyecto con ese id.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo buscar el proyecto por problemas de conexion." + ex.getMessage());
        }

        return p;
    }

    public Proyecto buscarProyectoPorNombre(String nombre) {
        Proyecto p = new Proyecto();

        if (nombre == null) {
            JOptionPane.showMessageDialog(null, "El nombre del proyecto no puede ser nulo.");
            return p;
        }

        String sql = "SELECT * FROM proyecto WHERE nombre=? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p.setIdProyecto(rs.getInt("idProyecto"));
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                p.setEstado(rs.getBoolean("estado"));
            } else {
                 JOptionPane.showMessageDialog(null, "No se encontró ningún proyecto con ese nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo buscar el proyecto por problemas de conexión: " + ex.getMessage());
        }

        return p;
    }

    public void eliminarProyecto(int id) {

        try {
            String sql = "UPDATE proyecto SET estado = 0 WHERE idProyecto = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se eliminó el proyecto.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo eliminar el proyecto." + e.getMessage());
        }
    }

    public Proyecto modificarProyecto(int id, Proyecto p) {

        String sql = "UPDATE proyecto SET nombre = ?, descripcion = ?, fechaInicio = ?, estado = ? WHERE  idProyecto = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDate(3, Date.valueOf(p.getFechaInicio()));
            ps.setInt(4, p.isEstado() ? 1 : 0);
            ps.setInt(5, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El proyecto no se encuentra activo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el proyecto." + ex.getMessage());
        }
        return p;
    }

    public List<Proyecto> listarProyectos() {

        List<Proyecto> proyectos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM proyecto WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proyecto p = new Proyecto();
                p.setIdProyecto(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setFechaInicio(rs.getDate(4).toLocalDate());
                p.setEstado(rs.getBoolean(5));
                proyectos.add(p);

            }
//            for (Proyecto p1 : proyectos) {
//                System.out.println(p1);
//            }
            ps.close();
            // JOptionPane.showMessageDialog(null, "Lista devuelta con exito.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda." + ex.getMessage());
        }
        return proyectos;
    }

    public List<Proyecto> listarProyectosInactivos() {

        List<Proyecto> proyectos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM proyecto WHERE estado = 0 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proyecto p = new Proyecto();
                p.setIdProyecto(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setFechaInicio(rs.getDate(4).toLocalDate());
                p.setEstado(rs.getBoolean(5));
                proyectos.add(p);

            }
            for (Proyecto p1 : proyectos) {
                System.out.println(p1);
            }
            ps.close();
            // JOptionPane.showMessageDialog(null, "Lista devuelta con exito.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda." + ex.getMessage());
        }
        return proyectos;
    }

    public void activarProyecto(int id) {

        try {
            String sql = "UPDATE proyecto SET estado = 1 WHERE idProyecto = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se activo el Proyecto.");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " No se pudo activar el Proyecto." + e.getMessage());
        }
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
