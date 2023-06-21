package vistas;

import Controlador.EquipoData;
import Controlador.ProyectoData;
import Modelo.Proyecto;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

public class ViewCrearProy extends javax.swing.JFrame {

    private ProyectoData pd;
    private EquipoData equiData;

    public ViewCrearProy() {
        initComponents();
    }

    public ViewCrearProy(ProyectoData pd, EquipoData equiData) {
        initComponents();
        this.pd = pd;
        this.equiData = equiData;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        lblTituloCrearProy = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnCrearPro = new javax.swing.JButton();
        lblNombreProy = new javax.swing.JLabel();
        txtNombreProy = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        lblFechaInicio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        dateFechaInicio = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblTituloCrearProy.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        lblTituloCrearProy.setText("Crear Proyecto");

        btnSalir.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCrearPro.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnCrearPro.setText("Crear");
        btnCrearPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProActionPerformed(evt);
            }
        });

        lblNombreProy.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblNombreProy.setText("Nombre Proyecto:");

        lblDescripcion.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblDescripcion.setText("Descripción:");

        lblFechaInicio.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblFechaInicio.setText("Fecha de Inicio:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearPro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombreProy, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblFechaInicio))
                            .addComponent(lblDescripcion))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(dateFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreProy, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTituloCrearProy, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(58, 58, 58)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTituloCrearProy)
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreProy)
                    .addComponent(txtNombreProy, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearPro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        ViewPpalProyec ppalProyec = new ViewPpalProyec(pd, equiData);
        ppalProyec.setVisible(true);
        ppalProyec.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCrearProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProActionPerformed

        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de guardar?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            String nombreProy = txtNombreProy.getText();
            String descripcion = txtDescripcion.getText();

            if (nombreProy.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El campo Nombre no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                txtNombreProy.requestFocus();
                return;
            }

            if (!nombreProy.matches("^[a-zA-Z0-9\\s]{3,}$")) {
                JOptionPane.showMessageDialog(this, "El nombre del proyecto debe contener al menos 3 letras y no puede contener caracteres especiales.");
                txtNombreProy.requestFocus();
                return;
            }

            if (descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El campo Descripción no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                txtDescripcion.requestFocus();
                return;
            }

            Date fechaCreacion = dateFechaInicio.getDate();
            if (fechaCreacion == null) {
                JOptionPane.showMessageDialog(this, "Error en la fecha ingresada", "Error", JOptionPane.ERROR_MESSAGE);
                dateFechaInicio.requestFocus();
                return;
            }

            LocalDate fechaCrea;
            try {
                fechaCrea = fechaCreacion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            } catch (DateTimeException dte) {
                JOptionPane.showMessageDialog(this, "Error en la fecha ingresada", "Error", JOptionPane.ERROR_MESSAGE);
                dateFechaInicio.requestFocus();
                return;
            }

            boolean estado = true;
            Proyecto nuevo = new Proyecto(nombreProy, descripcion, fechaCrea, estado);
            pd.guardarProyecto(nuevo);
            limpiar();
        }


    }//GEN-LAST:event_btnCrearProActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void limpiar() {
        txtNombreProy.setText("");
        txtDescripcion.setText("");
        dateFechaInicio.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPro;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser dateFechaInicio;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblNombreProy;
    private javax.swing.JLabel lblTituloCrearProy;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombreProy;
    // End of variables declaration//GEN-END:variables
}
