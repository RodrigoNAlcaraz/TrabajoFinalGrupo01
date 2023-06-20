/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Controlador.ComentariosData;
import Controlador.EquipoData;
import Controlador.EquipoMiembrosData;
import Controlador.MiembroData;
import Controlador.ProyectoData;
import Controlador.TareaData;
import Modelo.EquipoMiembros;
import Modelo.Miembro;
import Modelo.Tarea;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ViewAsignarTareaMiembroEq extends javax.swing.JFrame {

    private ProyectoData proyecData;
    private EquipoData equiData;
    private EquipoMiembrosData equiMiemData;
    private MiembroData miemData;
    private TareaData tareaData;
    private ComentariosData comData;
    private ViewBuscarEquipo busEq;
    private int idEquipo;

    /**
     * Creates new form ViewAsignarTareaMiembroEq
     */
    public ViewAsignarTareaMiembroEq() {
        initComponents();
    }

    ViewAsignarTareaMiembroEq(ProyectoData proyecData, EquipoData equiData, EquipoMiembrosData equiMiemData, MiembroData miemData, TareaData tareaData, ComentariosData comData, int idLlevar) {
        initComponents();
        this.proyecData = proyecData;
        this.equiData = equiData;
        this.equiMiemData = equiMiemData;
        this.miemData = miemData;
        this.tareaData = tareaData;
        this.comData = comData;
        this.idEquipo = idLlevar;
        limpiar();
        cargaMiembroCBox();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        lblTituloAsignarTareas = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnAsignar = new javax.swing.JButton();
        lblNombreTarea = new javax.swing.JLabel();
        txtNombreTarea = new javax.swing.JTextField();
        lblFechaCreacion = new javax.swing.JLabel();
        dateFechaCreacion = new com.toedter.calendar.JDateChooser();
        lblMiembro = new javax.swing.JLabel();
        cBoxMiembro = new javax.swing.JComboBox<>();
        lblFechaCierre = new javax.swing.JLabel();
        dateFechaCierre = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblTituloAsignarTareas.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        lblTituloAsignarTareas.setText("Asignar Tareas al Equipo");

        btnSalir.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAsignar.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        lblNombreTarea.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblNombreTarea.setText("Nombre Tarea:");

        lblFechaCreacion.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblFechaCreacion.setText("Fecha de Creación:");

        lblMiembro.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblMiembro.setText("Miembro:");

        cBoxMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxMiembroActionPerformed(evt);
            }
        });

        lblFechaCierre.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblFechaCierre.setText("Fecha de Cierre:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreTarea)
                                    .addComponent(lblFechaCreacion)
                                    .addComponent(lblMiembro))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreTarea)
                                    .addComponent(cBoxMiembro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateFechaCreacion, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblFechaCierre)
                                .addGap(46, 46, 46)
                                .addComponent(dateFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblTituloAsignarTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTituloAsignarTareas)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMiembro)
                    .addComponent(cBoxMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreTarea)
                    .addComponent(txtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaCreacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaCierre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        // TODO add your handling code here:
        ViewBuscarEquipo busEq = new ViewBuscarEquipo(proyecData, equiData, equiMiemData, miemData, tareaData, comData);
        busEq.setVisible(true);
        busEq.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea Asignar esta Tarea?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {

            try {
                if (txtNombreTarea.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "El campo nombre de la tarea no puede estar vacío.");
                    txtNombreTarea.requestFocus();
                    return;
                }

                Date sfecha = dateFechaCreacion.getDate();
                if (sfecha == null) {
                    JOptionPane.showMessageDialog(this, "La fecha de creación no puede estar vacía.");
                    return;
                }

                Date sfecha2 = dateFechaCierre.getDate();
                if (sfecha2 == null) {
                    JOptionPane.showMessageDialog(this, "La fecha de cierre no puede estar vacía.");
                    return;
                }

                if (sfecha2.before(sfecha)) {
                    JOptionPane.showMessageDialog(this, "La fecha de cierre no puede ser anterior a la fecha de creación.");
                    return;
                }

                Miembro miemSelec = (Miembro) cBoxMiembro.getSelectedItem();

                String nombreT = txtNombreTarea.getText();

                LocalDate fechaCre = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                LocalDate fechaCierre = sfecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                EquipoMiembros eqMiemb = equiMiemData.buscarEquipoMiembro(idEquipo, miemSelec.getIdMiembro());

                int estado = 1;

                Tarea t = new Tarea(nombreT, fechaCre, fechaCierre, estado, eqMiemb);

                tareaData.guardarTarea(t);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Hay errores en los campos.");
                txtNombreTarea.requestFocus();
            }
        }

    }//GEN-LAST:event_btnAsignarActionPerformed

    private void cBoxMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxMiembroActionPerformed
        // TODO add your handling code here:
        Miembro eqSelec = (Miembro) cBoxMiembro.getSelectedItem();
    }//GEN-LAST:event_cBoxMiembroActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cargaMiembroCBox() {
        boolean band = false;
        List<EquipoMiembros> listaMiembroXEq = equiMiemData.listarEquipoMiembrosPorIdEquipo(idEquipo);
        List<Miembro> listaMiembro = miemData.listarMiembro();

        for (Miembro miembro : listaMiembro) {
            band = false;
            for (EquipoMiembros miembroXEq : listaMiembroXEq) {
                if (miembro.getIdMiembro() == miembroXEq.getMiembro().getIdMiembro()) {
                    band = true;

                }
            }

            if (band) {
                cBoxMiembro.addItem(miembro);
            }

        }

    }

    public void limpiar() {
        txtNombreTarea.setText("");
        dateFechaCreacion.setDate(null);
        dateFechaCierre.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Miembro> cBoxMiembro;
    private com.toedter.calendar.JDateChooser dateFechaCierre;
    private com.toedter.calendar.JDateChooser dateFechaCreacion;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFechaCierre;
    private javax.swing.JLabel lblFechaCreacion;
    private javax.swing.JLabel lblMiembro;
    private javax.swing.JLabel lblNombreTarea;
    private javax.swing.JLabel lblTituloAsignarTareas;
    private javax.swing.JTextField txtNombreTarea;
    // End of variables declaration//GEN-END:variables
}
