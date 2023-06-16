/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author user
 */
public class ViewIncorporarMiembroEquipo extends javax.swing.JFrame {

    /**
     * Creates new form ViewIncorporarMiembroEquipo2
     */
    public ViewIncorporarMiembroEquipo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel23 = new javax.swing.JPanel();
        lblTituloIncMiemEq = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblNroEquipo = new javax.swing.JLabel();
        lblListaAlumno = new javax.swing.JLabel();
        radBtnMiembrosEquipo = new javax.swing.JRadioButton();
        radBtnMiembrosNoEqu = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMiemEquipo = new javax.swing.JTable();
        btnIncorporar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloIncMiemEq.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        lblTituloIncMiemEq.setText("Incorporar Miembros al Equipo Nº");

        btnSalir.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblNroEquipo.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        lblNroEquipo.setText(" ");

        lblListaAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblListaAlumno.setText("Miembros:");

        radBtnMiembrosEquipo.setText("Miembros del equipo");
        radBtnMiembrosEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnMiembrosEquipoActionPerformed(evt);
            }
        });

        radBtnMiembrosNoEqu.setText("Miembros no asignados al equipo");
        radBtnMiembrosNoEqu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnMiembrosNoEquActionPerformed(evt);
            }
        });

        tablaMiemEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaMiemEquipo);

        btnIncorporar.setBackground(new java.awt.Color(0, 225, 0));
        btnIncorporar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnIncorporar.setText("Incorporar");
        btnIncorporar.setEnabled(false);
        btnIncorporar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncorporarActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(250, 0, 0));
        btnRemover.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(radBtnMiembrosEquipo)
                        .addGap(129, 129, 129)
                        .addComponent(radBtnMiembrosNoEqu)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnIncorporar)
                        .addGap(104, 104, 104)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTituloIncMiemEq, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNroEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(lblListaAlumno)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloIncMiemEq)
                    .addComponent(lblNroEquipo))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(radBtnMiembrosEquipo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(radBtnMiembrosNoEqu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblListaAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIncorporar)
                            .addComponent(btnRemover))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        ViewBuscarEquipo ppalBusEquipo = new ViewBuscarEquipo();
        ppalBusEquipo.setVisible(true);
        ppalBusEquipo.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void radBtnMiembrosEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnMiembrosEquipoActionPerformed
//        borrarFilaTabla();
        radBtnMiembrosNoEqu.setSelected(false);
//        cargaDatosInscriptas();
        btnRemover.setEnabled(true);
        btnIncorporar.setEnabled(false);
    }//GEN-LAST:event_radBtnMiembrosEquipoActionPerformed

    private void radBtnMiembrosNoEquActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnMiembrosNoEquActionPerformed
//        borrarFilaTabla();
     radBtnMiembrosEquipo.setSelected(false);
//        cargaDatosNoInscriptas();
   btnRemover.setEnabled(false);
     btnIncorporar.setEnabled(true);
    }//GEN-LAST:event_radBtnMiembrosNoEquActionPerformed

    private void btnIncorporarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncorporarActionPerformed

//        int filaSeleccionada = tablaMiemEquipo.getSelectedRow();
//        if (filaSeleccionada != -1) {
//            Alumno a = (Alumno) comBoxAlumno.getSelectedItem();
//
//            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
//            String nombreMateria = (String) modelo.getValueAt(filaSeleccionada, 1);
//            int anio = (Integer) modelo.getValueAt(filaSeleccionada, 2);
//            Materia m = new Materia(idMateria, nombreMateria, anio, true);
//
//            Inscripcion I = new Inscripcion(a, m, 0);
//
//            insData.inscribir(I);
//
//            borrarFilaTabla();
//        }
    }//GEN-LAST:event_btnIncorporarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed

//        int idAlumno = ((Alumno) comBoxAlumno.getSelectedItem()).getIdAlumno();
//        int idMateria = (int) tablaMiemEquipo.getValueAt((int) tablaMiemEquipo.getSelectedRow(), 0);
//
//        insData.borrarInscripcionMateriaAlumno(idAlumno, idMateria);
//
//        borrarFilaTabla();
//        cargaDatosInscriptas();
    }//GEN-LAST:event_btnRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncorporar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblListaAlumno;
    private javax.swing.JLabel lblNroEquipo;
    private javax.swing.JLabel lblTituloIncMiemEq;
    private javax.swing.JRadioButton radBtnMiembrosEquipo;
    private javax.swing.JRadioButton radBtnMiembrosNoEqu;
    private javax.swing.JTable tablaMiemEquipo;
    // End of variables declaration//GEN-END:variables
}