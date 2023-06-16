/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.ProyectoData;
import Modelo.Equipo;
import Modelo.Miembro;
import Modelo.Proyecto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EquipoData {

    private Connection con = null;
    private Conexion conexion;

    public EquipoData(Conexion conexion) {
        try {
            this.conexion = conexion;
            con = conexion.getConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }

    }

    public void guardarEquipo(Equipo e) {

        String sql = "INSERT INTO equipo (idProyecto, nombre, fechaCreacion, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, e.getProyecto().getIdProyecto());
            ps.setString(2, e.getNombre());
            ps.setDate(3, Date.valueOf(e.getFechaCreacion()));
            ps.setInt(4, e.isEstado() ? 1 : 0);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                e.setIdEquipo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "equipo añadido con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "El Equipo no fue añadido.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo añadir el Equipo a la BD." + ex.getMessage());
        }

    }

    public void eliminarEquipo(int id) {

        try {
            String sql = "UPDATE equipo SET estado = 0 WHERE idEquipo = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se eliminó el equipo.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo eliminar el equipo de la bd." + e.getMessage());
        }
    }

    public void activarEquipo(int id) {

        try {
            String sql = "UPDATE equipo SET estado = 1 WHERE idEquipo = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se activo el equipo.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo activar el equipo de la bd." + e.getMessage());
        }
    }

    public Equipo modificarEquipo(int id, Equipo p) {

        String sql = "UPDATE equipo SET nombre = ?, fechaCreacion = ?,estado = ? WHERE  idEquipo = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setDate(2, Date.valueOf(p.getFechaCreacion()));
            ps.setInt(3, p.isEstado() ? 1 : 0);
            ps.setInt(4, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Equipo no se encuentra activo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el Equipo en la bd." + ex.getMessage());
        }
        return p;
    }

    public List<Equipo> listarEquipo() {

        List<Equipo> equipos = new ArrayList<>();
        try {

            String sql = "SELECT * FROM equipo WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Equipo e = new Equipo();
                //EN CASO DE NO QUERER EL ID PROYECTO CAMBIAR O BUSCAR FORMA DE SACARLO SOLO son las lineas 110 y 111
                Proyecto y = buscarProyecto(rs.getInt("idProyecto"));
                e.setProyecto(y);
                e.setIdEquipo(rs.getInt("idEquipo"));
                e.setNombre(rs.getString("nombre"));
                e.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
                e.setEstado(rs.getBoolean("estado"));
                equipos.add(e);

            }
//            for (Equipo equipo : equipos) {
//                System.out.println(equipo);
//            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda." + ex.getMessage());
        }
        return equipos;
    }

    public List<Equipo> listarEquiposInactivos() {

        List<Equipo> equipos = new ArrayList<>();
        try {

            String sql = "SELECT * FROM equipo WHERE estado = 0 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Equipo e = new Equipo();
                //EN CASO DE NO QUERER EL ID PROYECTO CAMBIAR O BUSCAR FORMA DE SACARLO SOLO son las lineas 110 y 111
                Proyecto y = buscarProyecto(rs.getInt("idProyecto"));
                e.setProyecto(y);
                e.setIdEquipo(rs.getInt("idEquipo"));
                e.setNombre(rs.getString("nombre"));
                e.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
                e.setEstado(rs.getBoolean("estado"));
                equipos.add(e);

            }
            for (Equipo equipo : equipos) {
                System.out.println(equipo);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda." + ex.getMessage());
        }
        return equipos;
    }

    public Equipo buscarEquipoPorIdProyecto(int idProyecto) {

        List<Equipo> listaEquipos = listarEquipo();
        for (Equipo listaEquipo : listaEquipos) {
            if (listaEquipo.getProyecto().getIdProyecto() == idProyecto) {
                return listaEquipo;
            }
        }
        return null;

    }

    /*public Equipo buscarEquipoPorIdEquipo(int id) {
        try {
            List<Equipo> listaEquipos = listarEquipo();
            for (Equipo listaEquipo : listaEquipos) {
                if (listaEquipo.getIdEquipo() == id) {
                    Equipo eq = new Equipo(listaEquipo.getProyecto(), listaEquipo.getIdEquipo(), listaEquipo.getNombre(), listaEquipo.getFechaCreacion(), true);
                    return eq;
                }

            }
        } catch (Exception ex) {
            // Manejo de la excepción
            JOptionPane.showMessageDialog(null, " Error en la busqueda." + ex.getMessage());
        }
        return null;

    }*/
    public Equipo buscarEquipoPorIdEquipo(int id) {
        try {
            List<Equipo> listaEquipos = listarEquipo();
            for (Equipo equipo : listaEquipos) {
                if (equipo.getIdEquipo() == id) {
                    return equipo;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la búsqueda: " + ex.getMessage());
        }
        return null;
    }

    public Equipo buscarEquipoPorNombre(String n) {
        try {
            List<Equipo> listaEquipos = listarEquipo();

            for (Equipo listaEquipo : listaEquipos) {
                if (listaEquipo.getNombre().equalsIgnoreCase(n)) {
                    Equipo eq = new Equipo(listaEquipo.getProyecto(), listaEquipo.getIdEquipo(), listaEquipo.getNombre(), listaEquipo.getFechaCreacion(), true);
                    return eq;
                }
            }
        } catch (Exception ex) {
            // Manejo de la excepción
            JOptionPane.showMessageDialog(null, " Error en la busqueda." + ex.getMessage());
        }

        return null;
    }

    public Miembro buscarMiembro(int id) {
        MiembroData ad = new MiembroData(conexion);

        return ad.buscarMiembro(id);
    }

    public Proyecto buscarProyecto(int id) {
        ProyectoData as = new ProyectoData(conexion);

        return as.buscarProyecto(id);
    }

}
