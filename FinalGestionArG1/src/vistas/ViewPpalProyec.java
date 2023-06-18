package vistas;

import Controlador.EquipoData;
import Controlador.ProyectoData;

public class ViewPpalProyec extends javax.swing.JFrame {

    private ProyectoData proyectoData;
    private EquipoData equiData;

    public ViewPpalProyec() {
        initComponents();
    }

    ViewPpalProyec(ProyectoData proyectoData, EquipoData equiData) {
        initComponents();
        this.proyectoData = proyectoData;
        this.equiData = equiData;
    }

    ViewPpalProyec(ProyectoData proyectoData) {
        initComponents();
        this.proyectoData = proyectoData;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnBuscarProyecto = new javax.swing.JButton();
        btnCrearProyecto = new javax.swing.JButton();
        lblTituloProyectos = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnCrearProyecto1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscarProyecto.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnBuscarProyecto.setText("Buscar Proyecto");
        btnBuscarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProyectoActionPerformed(evt);
            }
        });

        btnCrearProyecto.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnCrearProyecto.setText("Crear Proyecto");
        btnCrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProyectoActionPerformed(evt);
            }
        });

        lblTituloProyectos.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        lblTituloProyectos.setText("Proyectos GestionAr");

        btnSalir.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCrearProyecto1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnCrearProyecto1.setText("Todos Los Proyectos");
        btnCrearProyecto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProyecto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(lblTituloProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCrearProyecto1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(btnBuscarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblTituloProyectos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnCrearProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnCrearProyecto1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        ViewPpal ppal = new ViewPpal();
        ppal.setVisible(true);
        ppal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    private void btnCrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProyectoActionPerformed
        // TODO add your handling code here:
        ViewCrearProy crearProyecto = new ViewCrearProy(proyectoData,equiData);
        crearProyecto.setVisible(true);
        crearProyecto.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCrearProyectoActionPerformed
    private void btnBuscarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProyectoActionPerformed
        // TODO add your handling code here:
        ViewBuscarProyec buscarProyecto = new ViewBuscarProyec(proyectoData, equiData);
        buscarProyecto.setVisible(true);
        buscarProyecto.setLocationRelativeTo(null);
        this.dispose();


    }//GEN-LAST:event_btnBuscarProyectoActionPerformed
    private void btnCrearProyecto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProyecto1ActionPerformed
        // TODO add your handling code here:
        ViewListaProyectos listaProyecto = new ViewListaProyectos(proyectoData,equiData);
        listaProyecto.setVisible(true);
        listaProyecto.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnCrearProyecto1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProyecto;
    private javax.swing.JButton btnCrearProyecto;
    private javax.swing.JButton btnCrearProyecto1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTituloProyectos;
    // End of variables declaration//GEN-END:variables
}
