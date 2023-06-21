package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Modelo.Miembro;

public class MiembroData {

    private Connection con = null;

    public MiembroData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion a la base de datos" + e.getMessage());
        }

    }

    public void guardarmiembro(Miembro Miembro) {
    String sql = "INSERT INTO miembro (dni, apellido, nombre, estado) VALUES (?, ?, ?, ?)";
    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, Miembro.getDni());
        ps.setString(2, Miembro.getApellido());
        ps.setString(3, Miembro.getNombre());
        ps.setInt(4, Miembro.isEstado() ? 1 : 0);
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            Miembro.setIdMiembro(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Miembro añadido con exito.");
        } else {
            JOptionPane.showMessageDialog(null, "El miembro no fue añadido.");
        }
        ps.close();
    } catch (SQLException ex) {
        if (ex.getSQLState().equals("23000")) {
            JOptionPane.showMessageDialog(null, "Intenta añadir un miembro duplicado");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo añadir el miembro." + ex.getMessage());
        }
    }
}



    public Miembro buscarMiembro(int id) {
        Miembro e = new Miembro();
        String sql = "SELECT * FROM miembro WHERE idMiembro=? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                e.setIdMiembro(id);
                e.setDni(rs.getInt("dni"));
                e.setApellido(rs.getString("apellido"));
                e.setNombre(rs.getString("nombre"));
                e.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No hay miembro con ese id.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo buscar el miembro por problemas de conexion." + ex.getMessage());
        }

        return e;
    }

    public Miembro buscarMiembroPorDni(int dni) {
        Miembro e = null; 
        String sql = "SELECT * FROM miembro WHERE dni=? AND estado = 1";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dni);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    e = new Miembro(); 
                    e.setIdMiembro(rs.getInt("idMiembro")); 
                    e.setDni(rs.getInt("dni"));
                    e.setApellido(rs.getString("apellido"));
                    e.setNombre(rs.getString("nombre"));
                    e.setEstado(rs.getBoolean("estado"));
                } else {
                    JOptionPane.showMessageDialog(null, "No hay miembro con ese DNI.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo buscar el miembro por problemas de conexion." + ex.getMessage());
        }

        return e;
    }

    public void eliminarMiembro(int id) {

        try {
            String sql = "UPDATE miembro SET estado = 0 WHERE idMiembro = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se eliminó el miembro.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo eliminar el miembro." + e.getMessage());
        }
    }

    public Miembro modificarMiembro(int id, Miembro m) {

        String sql = "UPDATE miembro SET dni = ?, apellido = ?, nombre = ? , estado = ? WHERE  idMiembro = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, m.getDni());
            ps.setString(2, m.getApellido());
            ps.setString(3, m.getNombre());
            ps.setInt(4, m.isEstado() ? 1 : 0);
            ps.setInt(5, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El miembro no se encuentra activo");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el miembro." + ex.getMessage());
        }
        return m;
    }

    public List<Miembro> listarMiembro() {

        List<Miembro> miembros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM miembro WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Miembro m = new Miembro();
                m.setIdMiembro(rs.getInt(1));
                m.setDni(rs.getInt(2));
                m.setApellido(rs.getString(3));
                m.setNombre(rs.getString(4));
                m.setEstado(rs.getBoolean(5));
                miembros.add(m);

            }
//            for (Miembro miembro1 : miembros) {
//                System.out.println(miembro1);
//            }
            ps.close();
            // JOptionPane.showMessageDialog(null, "Lista devuelta con exito.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda." + ex.getMessage());
        }
        return miembros;
    }

    public List<Miembro> listarMiembrosInactivos() {

        List<Miembro> miembrosInactivos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM miembro WHERE estado = 0 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Miembro m = new Miembro();
                m.setIdMiembro(rs.getInt(1));
                m.setDni(rs.getInt(2));
                m.setApellido(rs.getString(3));
                m.setNombre(rs.getString(4));
                m.setEstado(rs.getBoolean(5));
                miembrosInactivos.add(m);
            }

            ps.close();
            // JOptionPane.showMessageDialog(null, "Lista devuelta con exito.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda." + ex.getMessage());
        }
        return miembrosInactivos;
    }

    public void activarMiembro(int id) {

        try {
            String sql = "UPDATE miembro SET estado = 1 WHERE idMiembro = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se activo el miembro.");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " No se pudo activar el miembro." + e.getMessage());
        }
    }
}
