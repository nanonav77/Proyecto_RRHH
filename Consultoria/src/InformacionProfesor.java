
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import Consultas.Consultas;
import consultoria.DatosProfesor;
import consultoria.LeerDatos;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class InformacionProfesor extends javax.swing.JFrame {

    /**
     * Creates new form InformacionProfesor
     *
     */
    int posProfesor;
    public InformacionProfesor(int profesorRow) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        posProfesor = profesorRow;
        initComponents();
        this.prepararTablaInformativa();
    }
    public InformacionProfesor(){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInformativaProfesor = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informacion del profesor");

        TablaInformativaProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Profesor", "Información"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaInformativaProfesor.setAlignmentX(15.0F);
        TablaInformativaProfesor.setAlignmentY(10.0F);
        TablaInformativaProfesor.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TablaInformativaProfesor.setColumnSelectionAllowed(true);
        TablaInformativaProfesor.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaInformativaProfesor.setRequestFocusEnabled(false);
        TablaInformativaProfesor.setRowHeight(30);
        jScrollPane1.setViewportView(TablaInformativaProfesor);
        TablaInformativaProfesor.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TablaInformativaProfesor.getColumnModel().getColumnCount() > 0) {
            TablaInformativaProfesor.getColumnModel().getColumn(0).setPreferredWidth(200);
            TablaInformativaProfesor.getColumnModel().getColumn(1).setResizable(false);
            TablaInformativaProfesor.getColumnModel().getColumn(1).setPreferredWidth(710);
        }

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        try {
            new VentanaNombreProfesores().setVisible(true);
        } catch (IOException | NoSuchMethodException | InvocationTargetException | IllegalAccessException ex) {
            Logger.getLogger(PlanCapacitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionProfesor().setVisible(true);
            }
        });
    }
    
        private ArrayList<String> llamarMetodos() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException{
            
            ArrayList<String> listaExtrema = new ArrayList<String>();
            Consultas consult = new Consultas();
            DatosProfesor.datosConsulturiaProfesor = LeerDatos.procesarBaseDatosExcel(posProfesor);       
            listaExtrema.add(DatosProfesor.obtenerNombreProfesor());
            listaExtrema.add(DatosProfesor.obtenerTipoIdentificacionProfesor());
            listaExtrema.add(DatosProfesor.obtenerCedulaProfesor());
            listaExtrema.add(DatosProfesor.obtenerNumeroPasaporteProfesor());
            listaExtrema.add(DatosProfesor.obtenerPaisProcedenciaProfesor());
            listaExtrema.add(DatosProfesor.obtenerPuestosActualmenteProfesor().toString());
            listaExtrema.add(DatosProfesor.obtenerAreaEspecialidadOTrabajoProfesor().toString());
            listaExtrema.add(DatosProfesor.obtenerCursosQueImpartiriaProfesor().toString());
            listaExtrema.add(DatosProfesor.obtenerRegimenPensionProfesor());
            listaExtrema.add(DatosProfesor.conoceCuotasCanceladas());
            listaExtrema.add(DatosProfesor.obtenerCuotasCanceladasProfesor());
            listaExtrema.add(DatosProfesor.obtenerEdadPensionarseProfesor());
            listaExtrema.add(DatosProfesor.obtenerTituloYGradoAcedemicoProfesor());
            listaExtrema.add(DatosProfesor.obtenerEstudiosPegradoYUbicacionDondeLosObtuvoProfesor());
            
            return listaExtrema;
    }
        
    private void prepararTablaInformativa() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException{
        
        ArrayList<String> listaExtrema = this.llamarMetodos();
        Consultas consult = new Consultas();
        DefaultTableModel modelo = (DefaultTableModel) TablaInformativaProfesor.getModel();
        ArrayList<String> columnas = new ArrayList<String>();
        columnas.add("Nombre");
        columnas.add("Tipo de identificación");
        columnas.add("Cédula");
        columnas.add("Pasaporte");
        columnas.add("País de origen");
        columnas.add("Puestos actuales");
        columnas.add("Especialidades");
        columnas.add("Posibles cursos");
        columnas.add("Régimen de pensión");
        columnas.add("Conoce sus cuotas canceladas");
        columnas.add("Cuotas canceladas");
        columnas.add("Edad de pensión");
        columnas.add("Grado académico");
        columnas.add("Pre-grado");
        System.out.println(listaExtrema);
        for (int i = 0; i < listaExtrema.size(); i++) {
            Vector row = new Vector();
            row.add(columnas.get(i));
            try{
                           row.add("<html>" + listaExtrema.get(i).replace("[","").replace("]","") +"</html>"); 
            }
            catch(Exception e){
                            row.add(listaExtrema.get(i));
            }
            modelo.addRow(row);
        }
        
        
      /*  for (int i = 0; i < listaExtrema.size(); i++) {
            System.out.println(listaExtrema.get(0));
            Vector row = new Vector();
            row.add(columnas.get(i));
            try{
                           row.add("<html>" + listaExtrema.get(i).get(this.posProfesor).toString().replace("[","").replace("]","") +"</html>"); 
            }
            catch(Exception e){
                            row.add(listaExtrema.get(i).get(this.posProfesor).toString());
            }

            modelo.addRow(row);
        }*/
        //NewCellStyle gg = new NewCellStyle();
        //TablaInformativaProfesor.getcol("Información").setCellRenderer(gg);
        TablaInformativaProfesor.setModel(modelo);
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaInformativaProfesor;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
