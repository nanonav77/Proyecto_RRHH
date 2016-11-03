
import consultoria.DatosProfesor;
import consultoria.LeerDatos;
import consultoria.SeccionActividadesCapacitacionComplementaria;
import consultoria.SeccionActividadesCapacitacionFormal;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class PlanCapacitacion extends javax.swing.JFrame {

    /**
     * Creates new form PlanCapacitacion
     */
    
    int posProfesor;
    DefaultTableModel model;
    
    public PlanCapacitacion() {
        initComponents();
    }
    
    public PlanCapacitacion(int profeID) throws IOException{
        initComponents();
        
        posProfesor = profeID;
        inicializarModel();
        llenarDatos();
    }
    
    public void inicializarModel(){
        model = new DefaultTableModel(
            new Object [][] {
                {"Actividades capacitación formal", null},
                {"Objetivos Estratégicos capacitacion formal", null},
                {"Periodos para llevarlo a cabo", null},
                {"Lugar donde lo realizaría", null},
                {"Tipo de actualización que significaría", null},
                {"Años estimados que durará la capacitación", null},
                {"Habilidades blandas por fortalecer", null},
                {"Como fortaceler Habilidades blandas", null},
                {"Periodos para fortalecer lo anterior", null},
                {"Lugar para fortalecer habilidades blandas", null},
                {"Años para fortalecer habilidades blandas", null},
                {"Actividades capacitacion complementaria", null}
            },
            new String [] {
                "Pregunta", "Respuesta"
            }
        );
    }
    
    public void llenarDatos() throws IOException{
        DatosProfesor.datosConsulturiaProfesor = LeerDatos.procesarBaseDatosExcel(posProfesor);
        jLabelNombre.setText(DatosProfesor.obtenerNombreProfesor());
        
        //********************Capacitaciones formales**********************//
        DatosProfesor.datosConsulturiaProfesor = LeerDatos.procesarBaseDatosExcel(posProfesor);
        //Actividades
        ArrayList<String> lista = SeccionActividadesCapacitacionFormal.obtenerActividadesQueRequiereComoParteDeCapacitacionFormalProfesor();
        String respuesta="";
        for (String element: lista)
            respuesta+=element+", ";
        if (!respuesta.equals(""))
            respuesta = respuesta.substring(0, respuesta.length()-2); 
        model.setValueAt(respuesta, 0, 1);
        
        //Objetivos
        lista = SeccionActividadesCapacitacionFormal.obtenerObjetivoEstrategicoDeLasActividadesComoParteDeCapacitacionFormalProfesor();
        respuesta="";
        for (String element: lista)
            respuesta+=element+", ";
        if (!respuesta.equals(""))
            respuesta = respuesta.substring(0, respuesta.length()-2);
        model.setValueAt(respuesta, 1, 1);

        //Periodos
        lista = SeccionActividadesCapacitacionFormal.obtenerPeriodoEnElQueDeseaLlevarActividadesDeCapacitacionFormalProfesor();
        respuesta="";
        for (String element: lista)
            respuesta+=element+", ";
        if (!respuesta.equals(""))
            respuesta = respuesta.substring(0, respuesta.length()-2);
        model.setValueAt(respuesta, 2, 1);
        
        //Lugar
        String lugar = SeccionActividadesCapacitacionFormal.obtenerLugarDondeRealizariaActividadesComoParteDeSuCapacitacionFormalProfesor();
        model.setValueAt(lugar, 3, 1);
        
        //Actualizaciones
        lista = SeccionActividadesCapacitacionFormal.obtenerTipoActualizacionQueSignificariaCapacitacionFormalProfesor();
        respuesta="";
        for (String element: lista)
            respuesta+=element+", ";
        if (!respuesta.equals(""))
            respuesta = respuesta.substring(0, respuesta.length()-2);
        model.setValueAt(respuesta, 4, 1);
        
        //Año
        String year = SeccionActividadesCapacitacionFormal.obtenerAñoQueEstimaDurarEnCadaCapacitacionFormalProfesor();
        model.setValueAt(year, 5, 1);
        
        //Habilidades blandas
        lista = SeccionActividadesCapacitacionFormal.obtenerHabilidadesBlandasCapacitacionFormalProfesor();
        respuesta="";
        for (String element: lista)
            respuesta+=element+", ";
        if (!respuesta.equals(""))
            respuesta = respuesta.substring(0, respuesta.length()-2);
        model.setValueAt(respuesta, 6, 1);
        
        //Como fortalecer hailidades
        lista = SeccionActividadesCapacitacionFormal.obtenerComoFortalecerHabilidadesBlandasCapacitacionFormalProfesor();
        respuesta="";
        for (String element: lista)
            respuesta+=element+", ";
        if (!respuesta.equals(""))
            respuesta = respuesta.substring(0, respuesta.length()-2);
        model.setValueAt(respuesta, 7, 1);
        
        //Periodos hailidades
        lista = SeccionActividadesCapacitacionFormal.obtenerPeriodosFortalecerHabilidadesBlandasCapacitacionFormalProfesor();
        respuesta="";
        for (String element: lista)
            respuesta+=element+", ";
        if (!respuesta.equals(""))
            respuesta = respuesta.substring(0, respuesta.length()-2);
        model.setValueAt(respuesta, 8, 1);
        
        //Lugar habilidades
        lugar = SeccionActividadesCapacitacionFormal.obtenerLugarDondeRealizarHabilidadesCapacitacionFormalProfesor();
        model.setValueAt(lugar, 9, 1);
        
        //Año
        year = SeccionActividadesCapacitacionFormal.obtenerAñoHabilidadesCapacitacionFormalProfesor();
        model.setValueAt(year, 10, 1);
        
        
        //********************Capacitaciones complementarias**********************//
        SeccionActividadesCapacitacionComplementaria.datosConsulturiaProfesor = LeerDatos.procesarBaseDatosExcel(posProfesor);
        boolean enco = SeccionActividadesCapacitacionComplementaria.verificarSiConsideraQueRequiereActividadesComoParteDeSuCapacitacionComplementariaProfesor();
        if(enco){
            //Actividades complementarias
            lista = SeccionActividadesCapacitacionComplementaria.obtenerActividadesQueRequiereComoParteDeCapacitacionComplementariaProfesor();
            respuesta="";
            for (String element: lista)
                respuesta+=element+", ";
            if(!respuesta.equals(""))
                respuesta = respuesta.substring(0, respuesta.length()-2);
            model.setValueAt(respuesta,11, 1);
        } else
            model.setValueAt("Ninguna", 11, 1);
        
        
        jTable1.setModel(model);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plan de capacitación");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Plan de capacitación");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 10, 400, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 20, 110, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Profesor(a):");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 120, 30);

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombre.setText("Gonzalo Delgado");
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(170, 90, 460, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 70, 1180, 10);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(40);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 130, 1140, 620);

        setSize(new java.awt.Dimension(1216, 889));
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
            java.util.logging.Logger.getLogger(PlanCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanCapacitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanCapacitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
