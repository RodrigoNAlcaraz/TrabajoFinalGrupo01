/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Controlador.EquipoData;
import Controlador.EquipoMiembrosData;
import Controlador.MiembroData;
import Controlador.ProyectoData;
import Modelo.Equipo;
import Modelo.EquipoMiembros;
import Modelo.Miembro;
import Modelo.Proyecto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ViewListadoEquipo extends javax.swing.JFrame {

    private EquipoData equiData;
    private MiembroData miemData;
    private EquipoMiembrosData equiMiemData;
    private int id;
    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;

    /**
     * Creates new form ViewListadoEquipo
     */
    public ViewListadoEquipo() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo2 = new DefaultTableModel();
        armarCabeceraTabla();
        limpiarTabla();
        llenarTabla();
    }

    public ViewListadoEquipo(EquipoData equiData, MiembroData miemData, EquipoMiembrosData equiMiemData) {
        initComponents();
        this.equiData = equiData;
        this.miemData = miemData;
        this.equiMiemData = equiMiemData;
        modelo = new DefaultTableModel();
        modelo2 = new DefaultTableModel();
        armarCabeceraTabla();
        limpiarTabla();
        llenarTabla();

    }

    ViewListadoEquipo(EquipoData equiData, MiembroData miemData, EquipoMiembrosData equiMiemData, int idLlevar) {
        initComponents();
        this.equiData = equiData;
        this.miemData = miemData;
        this.equiMiemData = equiMiemData;
        this.id = idLlevar;
        modelo = new DefaultTableModel();
        modelo2 = new DefaultTableModel();
        armarCabeceraTabla();
        limpiarTabla();
        llenarTabla();
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
        lblSubTituloListado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMiembrosDEqu = new javax.swing.JTable();
        lblTituloListadoPersonal = new javax.swing.JLabel();
        lblSubTituloListado2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMiembTotales = new javax.swing.JTable();
        btnIncorporar = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSubTituloListado.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblSubTituloListado.setText("Miembros del equipo");

        tablaMiembrosDEqu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaMiembrosDEqu);

        lblTituloListadoPersonal.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        lblTituloListadoPersonal.setText("Listado Miembro Equipo");

        lblSubTituloListado2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblSubTituloListado2.setText("Miembros totales");

        tablaMiembTotales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaMiembTotales);

        btnIncorporar.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnIncorporar.setText("Incorporar");
        btnIncorporar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncorporarActionPerformed(evt);
            }
        });

        btnSalir2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnSalir2.setText("Salir");
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTituloListadoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIncorporar)
                            .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblSubTituloListado))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(lblSubTituloListado2)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(589, Short.MAX_VALUE)
                    .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTituloListadoPersonal)
                .addGap(18, 18, 18)
                .addComponent(lblSubTituloListado)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(lblSubTituloListado2))
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIncorporar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(561, Short.MAX_VALUE)
                    .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncorporarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncorporarActionPerformed

        // TODO add your handling code here:
        // Obteniendo la fila seleccionada
        int filaSeleccionada = tablaMiembTotales.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Obteniendo los datos de la fila seleccionada
            int idMiembro = (int) modelo2.getValueAt(filaSeleccionada, 0);
            Miembro miem = miemData.buscarMiembro(idMiembro);

            Equipo eq = equiData.buscarEquipoPorIdEquipo(id);

            EquipoMiembros eqMiemb = new EquipoMiembros(LocalDate.now(), eq, miem, true);
            // Actualizando la tabla
            equiMiemData.guardarEquipoMiembro(eqMiemb);

            limpiarTabla();
            llenarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila primero");
        }
    }//GEN-LAST:event_btnIncorporarActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        // TODO add your handling code here:
        /*ViewPpalMiembro ppalMiembro = new ViewPpalMiembro(miemData);
        ppalMiembro.setVisible(true);
        ppalMiembro.setLocationRelativeTo(null);
        this.dispose();*/
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:

        // TODO add your handling code here:
        int filaSeleccionada = tablaMiembrosDEqu.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Obteniendo los datos de la fila seleccionada
            int idMiembro = (int) modelo.getValueAt(filaSeleccionada, 0);

            int idEqMiem = equiMiemData.buscarIdMiembroEq(id, idMiembro);
            equiMiemData.eliminarEquipoMiembro(idEqMiem);

            limpiarTabla();
            llenarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila primero");

        }


    }//GEN-LAST:event_btnRemoverActionPerformed

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Legajo");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        filaCabecera.add("DNI");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        tablaMiembrosDEqu.setModel(modelo);

        for (Object it : filaCabecera) {
            modelo2.addColumn(it);
        }
        tablaMiembTotales.setModel(modelo2);

    }

    private void llenarTabla() {
        limpiarTabla();

        List<EquipoMiembros> listEq = equiMiemData.listarEquipoMiembrosPorIdEquipo(id);
        List<Miembro> listaActivos = miemData.listarMiembro();

        for (EquipoMiembros equipoMiembros : listEq) {
            modelo.addRow(new Object[]{equipoMiembros.getMiembro().getIdMiembro(), equipoMiembros.getMiembro().getApellido(), equipoMiembros.getMiembro().getNombre(), equipoMiembros.getMiembro().getDni()});
        }

        listaActivos.removeIf(miembro -> contieneMiembro(listEq, miembro));

        for (Miembro listaActivo : listaActivos) {
            modelo2.addRow(new Object[]{listaActivo.getIdMiembro(), listaActivo.getApellido(), listaActivo.getNombre(), listaActivo.getDni()});
        }
    }

    private boolean contieneMiembro(List<EquipoMiembros> listEq, Miembro miembro) {
        for (EquipoMiembros equipoMiembros : listEq) {
            if (equipoMiembros.getMiembro().getIdMiembro() == miembro.getIdMiembro()) {
                return true;
            }
        }
        return false;
    }

    private void limpiarTabla() {
        int filasModelo = modelo.getRowCount();
        for (int i = 0; i < filasModelo; i++) {
            modelo.removeRow(0);
        }

        int filasModelo2 = modelo2.getRowCount();
        for (int i = 0; i < filasModelo2; i++) {
            modelo2.removeRow(0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncorporar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSubTituloListado;
    private javax.swing.JLabel lblSubTituloListado2;
    private javax.swing.JLabel lblTituloListadoPersonal;
    private javax.swing.JTable tablaMiembTotales;
    private javax.swing.JTable tablaMiembrosDEqu;
    // End of variables declaration//GEN-END:variables
}