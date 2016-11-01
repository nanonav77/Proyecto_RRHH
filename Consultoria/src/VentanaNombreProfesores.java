
import java.util.ArrayList;
import consultoria.DatosProfesor;
import consultoria.LeerDatos;
import Consultas.Consultas;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenneth
 */
public class VentanaNombreProfesores extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInformativaProfesores
     */
    public VentanaNombreProfesores() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        initComponents();
        this.prepararTabla();

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInformativa = new javax.swing.JTable();
        javax.swing.JButton BackPlanCarrera = new javax.swing.JButton();
        InformationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaInformativa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre de los profesores"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaInformativa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaInformativaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaInformativa);
        TablaInformativa.getAccessibleContext().setAccessibleName("");

        BackPlanCarrera.setText("Plan de carrera");
        BackPlanCarrera.setToolTipText("");
        BackPlanCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackPlanCarreraActionPerformed(evt);
            }
        });

        InformationButton.setText("Ver información del profesor seleccionado");
        InformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackPlanCarrera)
                        .addGap(179, 179, 179)
                        .addComponent(InformationButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackPlanCarrera)
                    .addComponent(InformationButton))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackPlanCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackPlanCarreraActionPerformed
        this.dispose();
        new FrameProfesoresInteresadoEnCursos().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_BackPlanCarreraActionPerformed

    private void InformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationButtonActionPerformed
        
        if (TablaInformativa.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this,"No hay ningún profesor seleccionado");
    }
        else {
            int selectedRow = TablaInformativa.getSelectedRow();
            this.dispose();
            InformacionProfesor ventanaInformativa;
            try {
                ventanaInformativa = new InformacionProfesor(selectedRow);
                ventanaInformativa.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(VentanaNombreProfesores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(VentanaNombreProfesores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(VentanaNombreProfesores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(VentanaNombreProfesores.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                }
    }//GEN-LAST:event_InformationButtonActionPerformed

    private void TablaInformativaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInformativaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaInformativaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaNombreProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaNombreProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaNombreProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaNombreProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaNombreProfesores ventana;
                try {
                    ventana = new VentanaNombreProfesores();
                    ventana.setVisible(true);
                } catch (IOException | NoSuchMethodException | InvocationTargetException | IllegalAccessException ex) {
                    Logger.getLogger(VentanaNombreProfesores.class.getName()).log(Level.SEVERE, null, ex);
                }
                
  
            }
        });
    }
    private void prepararTabla() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException{
        
        ArrayList<ArrayList<Object>> listaExtrema = new ArrayList<ArrayList<Object>>();
        Consultas consult = new Consultas();
        listaExtrema.add(consult.getDataByMethod("obtenerNombreProfesor"));
        DefaultTableModel modelo = (DefaultTableModel) TablaInformativa.getModel();
        
        System.out.println(listaExtrema.get(0).size());
        for (int i = 0; i < listaExtrema.get(0).size(); i++) {
            Vector row = new Vector();
            row.add(listaExtrema.get(0).get(i)); 
            modelo.addRow(row);
           
        }
       
        
        TablaInformativa.setModel(modelo);
    }

    
    


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InformationButton;
    private javax.swing.JTable TablaInformativa;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}