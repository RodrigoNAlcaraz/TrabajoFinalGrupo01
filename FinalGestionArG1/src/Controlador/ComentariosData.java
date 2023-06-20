/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Modelo.Comentarios;
import Modelo.Tarea;

public class ComentariosData {

    private Connection con = null;

    public ComentariosData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion a la base de datos" + e.getMessage());
        }

    }

    public void guardarComentario(Comentarios coment) {
        String sql = "INSERT INTO comentarios (comentario, fechaAvance, idTarea, estado) VALUES (?, ?,?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, coment.getComentario());
            ps.setDate(2, Date.valueOf(coment.getFechaAvance()));
            ps.setInt(3, coment.getTarea().getIdTarea());
            ps.setInt(4, coment.isEstado() ? 1 : 0);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                coment.setIdComentario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "comentario añadido con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "El comentario no fue añadido.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo añadir el comentario." + ex.getMessage());
        }
    }

    public void eliminaComentario(int id) {

        try {
            String sql = "UPDATE comentarios SET estado = 0 WHERE idComentario = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se eliminó el comentario");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo eliminar el comentario" + e.getMessage());
        }
    }

    public void activarComentario(int id) {

        try {
            String sql = "UPDATE comentarios SET estado = 1 WHERE idComentario = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se activo el comentario");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo activar el comentario" + e.getMessage());
        }
    }

    public Comentarios modificarComentario(int id, Comentarios c) {

        String sql = "UPDATE comentarios SET comentario = ?, fechaAvance = ?,estado = ? WHERE  idComentario = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getComentario());
            ps.setDate(2, Date.valueOf(c.getFechaAvance()));
            ps.setInt(3, c.isEstado() ? 1 : 0);
            ps.setInt(4, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El comentario no se encuentra activo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar El comentario en la bd." + ex.getMessage());
        }
        return c;
    }

    public List<Comentarios> listarComentariosPorIdTarea(int id) {
        List<Comentarios> comentariosLista = new ArrayList<>();
        try {
            String sql = "SELECT idComentario, comentario,fechaAvance,estado\n"
                    + "FROM comentarios\n"
                    + "WHERE idTarea = ? AND estado = 1";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comentarios a = new Comentarios();
                a.setIdComentario(rs.getInt("idComentario"));
                a.setComentario(rs.getString("comentario"));
                a.setFechaAvance(rs.getDate("fechaAvance").toLocalDate());
                a.setEstado(rs.getBoolean("estado"));
                comentariosLista.add(a);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda." + ex.getMessage());
        }
        return comentariosLista;
    }

}
