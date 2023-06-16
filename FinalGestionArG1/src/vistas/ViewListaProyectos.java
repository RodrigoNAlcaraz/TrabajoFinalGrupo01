/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Controlador.ProyectoData;
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
public class ViewListaProyectos extends javax.swing.JFrame {

    private ProyectoData pd;
    private DefaultTableModel modelo;

    /**
     * Creates new form ViewListaProyectos
     */
    public ViewListaProyectos() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
        limpiarTabla();
        llenarTabla();

    }

    ViewListaProyectos(ProyectoData proyectoData) {
        initComponents();
        this.pd = proyectoData;
        modelo = new DefaultTableModel();
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
        btnSalir = new javax.swing.JButton();
        btnModificarPersonal = new javax.swing.JButton();
        lblSubTituloProyecto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListadoProyecto = new javax.swing.JTable();
        lblTituloListadoProyectos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalir.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnModificarPersonal.setBackground(new java.awt.Color(240, 63, 65));
        btnModificarPersonal.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnModificarPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarPersonal.setText("Modificar");
        btnModificarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPersonalActionPerformed(evt);
            }
        });

        lblSubTituloProyecto.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblSubTituloProyecto.setText("Totalidad de Proyectos");

        tablaListadoProyecto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaListadoProyecto);

        lblTituloListadoProyectos.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        lblTituloListadoProyectos.setText("Listado de Proyectos GestionArG1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(lblSubTituloProyecto))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTituloListadoProyectos)
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTituloListadoProyectos)
                .addGap(56, 56, 56)
                .addComponent(lblSubTituloProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 132, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnModificarPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        ViewPpalProyec ppalProy = new ViewPpalProyec(pd);
        ppalProy.setVisible(true);
        ppalProy.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPersonalActionPerformed
        // TODO add your handling code here:

        //para realizar modificaciones dentro de la vista, es diferente a la que implementamos en miembros, las 2 cumplen su proposito 
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea realizar alguna modificacion?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            //si confirma que si, empezar con el codigo aca abajo
//            ViewBuscarProyec buscarProy = new ViewBuscarProyec();
//            buscarProy.setVisible(true);
//            buscarProy.setLocationRelativeTo(null);
//            this.dispose();

            int filaSeleccionada = tablaListadoProyecto.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna fila.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int columnaSeleccionada = tablaListadoProyecto.getSelectedColumn();
            if (columnaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna columna.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int idColumna = 0; // Columna del ID del proyecto en la tabla
            if (columnaSeleccionada == idColumna) {
                JOptionPane.showMessageDialog(this, "No se permite modificar el Numero del proyecto.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String valorActual = modelo.getValueAt(filaSeleccionada, columnaSeleccionada).toString();
            String nuevoValor = JOptionPane.showInputDialog(this, "Ingrese el nuevo valor:", valorActual);

            if (nuevoValor != null && !nuevoValor.isEmpty()) {
                modelo.setValueAt(nuevoValor, filaSeleccionada, columnaSeleccionada); // Actualizar valor en el modelo de la tabla

                // Obtener el ID del proyecto para realizar la modificación en la base de datos
                int idProyecto = Integer.parseInt(modelo.getValueAt(filaSeleccionada, idColumna).toString());
                Proyecto proyecto = pd.buscarProyecto(idProyecto);

                // Actualizar el campo correspondiente en el objeto Proyecto
                switch (columnaSeleccionada) {
                    case 1: // Nombre del proyecto
                        proyecto.setNombre(nuevoValor);
                        break;
                    case 2: // Fecha de inicio
                        // Aquí puedes realizar el parseo y conversión necesario para convertir nuevoValor en el tipo de dato adecuado
                        proyecto.setFechaInicio(LocalDate.parse(nuevoValor));
                        break;
                    case 3: // Descripción
                        proyecto.setDescripcion(nuevoValor);
                        break;
                    default:
                        // Manejar caso no esperado
                        break;
                }

                pd.modificarProyecto(idProyecto, proyecto);

                //JOptionPane.showMessageDialog(this, "Valor modificado exitosamente.", "Modificación", JOptionPane.INFORMATION_MESSAGE); //el metodo ya devuelve un msj
            } else {
                JOptionPane.showMessageDialog(this, "No se ha ingresado ningún valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnModificarPersonalActionPerformed

    private void llenarTabla() {
        limpiarTabla();
        List<Proyecto> listaProyActivos = new ArrayList<Proyecto>();

        listaProyActivos = pd.listarProyectos();

        for (Proyecto proy : listaProyActivos) {
            modelo.addRow(new Object[]{proy.getIdProyecto(), proy.getNombre(), proy.getFechaInicio(), proy.getDescripcion()});
        }

    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("N°");
        filaCabecera.add("Nombre Proyecto");
        filaCabecera.add("Fecha de Inicio");
        filaCabecera.add("Descripción");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        tablaListadoProyecto.setModel(modelo);

    }

    private void limpiarTabla() {
        int filasModelo = modelo.getRowCount();
        for (int i = 0; i < filasModelo; i++) {
            modelo.removeRow(0);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificarPersonal;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSubTituloProyecto;
    private javax.swing.JLabel lblTituloListadoProyectos;
    private javax.swing.JTable tablaListadoProyecto;
    // End of variables declaration//GEN-END:variables
}
