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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EquipoMiembrosData {

    private Connection con = null;
    private Conexion conexion;

    public EquipoMiembrosData(Conexion conexion) {
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

    public void eliminarEquipoMiembro(int idMiembroEq) {
        try {
            String sql = "DELETE FROM equipomiembros WHERE idMiembroEq = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMiembroEq);
            int rowsAffected = ps.executeUpdate();
            ps.close();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Se eliminó el equipo miembro correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el equipo miembro en el equipo.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el equipo miembro de la base de datos: " + e.getMessage());
        }
    }

    public void eliminarEquipoMiembroPorEquipoYMiembro(int idEquipo, int idMiembro) {
        try {
            String sqlSelect = "SELECT idMiembroEq FROM equipomiembros WHERE idEquipo = ? AND idMiembro = ?";
            PreparedStatement psSelect = con.prepareStatement(sqlSelect);
            psSelect.setInt(1, idEquipo);
            psSelect.setInt(2, idMiembro);
            ResultSet rs = psSelect.executeQuery();

            if (rs.next()) {
                int idMiembroEq = rs.getInt("idMiembroEq");

                String sqlDelete = "DELETE FROM equipomiembros WHERE idMiembroEq = ?";
                PreparedStatement psDelete = con.prepareStatement(sqlDelete);
                psDelete.setInt(1, idMiembroEq);
                int rowsAffected = psDelete.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Se eliminó el miembro del equipo correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el miembro en el equipo.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el miembro en el equipo.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el miembro del equipo de la base de datos: " + e.getMessage());
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

    private EquipoMiembros buscarEquipoMiembrosPorId(int id) {
        EquipoData equiData = new EquipoData((Conexion) con);
        MiembroData miemData = new MiembroData((Conexion) con);

        try {
            String sql = "SELECT * FROM equipomiembros WHERE idMiembroEq = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Obtener los datos del equipo miembro de la base de datos
                int idMiembroEq = rs.getInt("idMiembroEq");
                LocalDate fechaIncorporacion = rs.getDate("fechaIncorporacion").toLocalDate();
                int idEquipo = rs.getInt("idEquipo");
                int idMiembro = rs.getInt("idMiembro");
                boolean estado = rs.getBoolean("estado");

                // Crear y devolver el objeto EquipoMiembros
                Equipo eq = equiData.buscarEquipoPorIdEquipo(idEquipo);
                Miembro miem = miemData.buscarMiembro(idMiembro);
                return new EquipoMiembros(idMiembroEq, fechaIncorporacion, eq, miem, estado);
            } else {
                return null; // No se encontró el equipo miembro
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el equipo miembro en la base de datos: " + e.getMessage());
            return null;
        }
    }

    public List<EquipoMiembros> listarEquipoMiembrosPorIdEquipo(int id) {
        MiembroData md = new MiembroData(conexion);
        EquipoData eq = new EquipoData(conexion);
        List<EquipoMiembros> equiposM = new ArrayList<>();
        try {
            String sql = "SELECT m.*\n"
                    + "FROM miembro m\n"
                    + "JOIN equipomiembros em ON m.idMiembro = em.idMiembro\n"
                    + "JOIN equipo e ON em.idEquipo = e.idEquipo\n"
                    + "WHERE e.idEquipo = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id); // Set parameter before executing query
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Miembro a = new Miembro();
                a.setIdMiembro(rs.getInt("idMiembro"));
                a.setNombre(rs.getString("nombre"));
                a.setDni(rs.getInt("dni"));
                a.setApellido(rs.getString("apellido"));
                a.setEstado(rs.getBoolean("estado"));

                // Crear instancia de EquipoMiembros y agregarla a la lista equiposM
                EquipoMiembros equipoMiembros = new EquipoMiembros(a);
                equiposM.add(equipoMiembros);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda." + ex.getMessage());
        }
        return equiposM;
    }

    public int buscarIdMiembroEq(int idEquipo, int idMiembro) {
        try {
            String sql = "SELECT idMiembroEq FROM equipomiembros WHERE idEquipo = ? AND idMiembro = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEquipo);
            ps.setInt(2, idMiembro);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("idMiembroEq");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el miembro en el equipo.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo buscar el idMiembroEq: " + e.getMessage());
        }
        return -1;  // Retornar -1 en caso de error
    }

    public EquipoMiembros buscarEquipoMiembro(int idEquipo, int idMiembro) {
        try {
            String sql = "SELECT * FROM equipomiembros WHERE idEquipo = ? AND idMiembro = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEquipo);
            ps.setInt(2, idMiembro);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Obtener los datos del equipo miembro de la base de datos
                int idMiembroEq = rs.getInt("idMiembroEq");
                LocalDate fechaIncorporacion = rs.getDate("fechaIncorporacion").toLocalDate();
                boolean estado = rs.getBoolean("estado");

                // Crear y devolver el objeto EquipoMiembros
                EquipoData ed = new EquipoData(conexion);
                MiembroData md = new MiembroData(conexion);
                Equipo eq = ed.buscarEquipoPorIdEquipo(idEquipo);
                Miembro miem = md.buscarMiembro(idMiembro);

                return new EquipoMiembros(idMiembroEq, fechaIncorporacion, eq, miem, estado);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el miembro en el equipo.");
                return null;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo buscar el EquipoMiembro: " + e.getMessage());
            return null;
        }
    }

}

