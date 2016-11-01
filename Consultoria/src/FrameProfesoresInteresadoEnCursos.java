/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Consultas.Consultas;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristopher Inces
 */
public class FrameProfesoresInteresadoEnCursos extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FrameProfesoresInteresadoEnCursos() {
        initComponents();
        Sistemas_de_Informacion_Empresarial.setContentAreaFilled(false);
        TallerDeProgramacion.setContentAreaFilled(false);
        OrganizacionArquitecturaComputadores.setContentAreaFilled(false);
        LenguajesDeProgramacion.setContentAreaFilled(false);
        Infraestructura_Tecnologica_I.setContentAreaFilled(false);
        Infraestructura_Tecnologica_II.setContentAreaFilled(false);
        Arquitectura_de_Aplicaciones.setContentAreaFilled(false);
        Administracion_de_Procesos_de_Negocios.setContentAreaFilled(false);
        Sistemas_de_Informacion_Empresarial.setContentAreaFilled(false);
        Introduccion_a_la_programacion.setContentAreaFilled(false);
        Algoritmos_y_Estructuras_de_Datos.setContentAreaFilled(false);
        Bases_de_Datos.setContentAreaFilled(false);
        Bases_de_Datos_Avanzadas.setContentAreaFilled(false);
        Diseño_de_Softaware.setContentAreaFilled(false);
        Inteligencia_de_Negocios.setContentAreaFilled(false);
        Negocios_Electronicos.setContentAreaFilled(false);
        Adquisicion_de_TI.setContentAreaFilled(false);
        Administracion_de_Servicios_de_TI_1.setContentAreaFilled(false);
        Administracion_de_Servicios_de_TI_2.setContentAreaFilled(false);
        Teorias_de_las_organizaciones_y_sus_procesos.setContentAreaFilled(false);
        Administracion_de_proyectos_1.setContentAreaFilled(false);
        Administracion_de_proyectos_2.setContentAreaFilled(false);
        Ingenieria_de_requerimientos.setContentAreaFilled(false);
        Comportamiento_Organizacional_y_Gestion_del_Cambio.setContentAreaFilled(false);
        Especificacion_de_Software.setContentAreaFilled(false);
        Planificaion_Estrategica_de_TI.setContentAreaFilled(false);
        Produccion_Logistica_y_Calidad.setContentAreaFilled(false);
        Modelo_de_Toma_de_Decisiones.setContentAreaFilled(false);
        Formulacion_y_Evaluacion_de_Proyectos_de_TI.setContentAreaFilled(false);
        Espiritu_Emprendedor_y_Creacion_de_Empresas.setContentAreaFilled(false);
        Informacion_Contable_1.setContentAreaFilled(false);
        Informacion_Contable_2.setContentAreaFilled(false);
        Economia.setContentAreaFilled(false);
        Gestion_y_Toma_de_Decisiones_Financieras.setContentAreaFilled(false);
        Mercadeo_de_Productos_de_Alta_Calidad.setContentAreaFilled(false);
        Gestion_de_Recursos_Humanos.setContentAreaFilled(false);
        Costos_en_Ambientes_Informaticos.setContentAreaFilled(false);
        Planificacion_y_Presupuesto.setContentAreaFilled(false);
        Auditoria_de_TI.setContentAreaFilled(false);
        Consultoria_de_TI.setContentAreaFilled(false);
        Electiva1.setContentAreaFilled(false);
        Electiva2.setContentAreaFilled(false);

    }

    @SuppressWarnings("unchecked")

    private void Consultar(String curso) {
        String texto = "";
        ArrayList<String> profesores = Consultas.ProfesoresInteresadosEnCurso(curso);
        for (int i = 0; i < profesores.size(); i++) {
            texto += "\n" + profesores.get(i);
        }
        if (texto.equals("")) {
            texto = "No hay profesores interesados.";
        }

        JOptionPane.showMessageDialog(null, texto, curso, JOptionPane.DEFAULT_OPTION, null);
      
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sistemas_de_Informacion_Empresarial = new javax.swing.JButton();
        Planificaion_Estrategica_de_TI = new javax.swing.JButton();
        Administracion_de_Servicios_de_TI_2 = new javax.swing.JButton();
        Bases_de_Datos = new javax.swing.JButton();
        Bases_de_Datos_Avanzadas = new javax.swing.JButton();
        Diseño_de_Softaware = new javax.swing.JButton();
        Inteligencia_de_Negocios = new javax.swing.JButton();
        Negocios_Electronicos = new javax.swing.JButton();
        Administracion_de_Servicios_de_TI_1 = new javax.swing.JButton();
        Introduccion_a_la_programacion = new javax.swing.JButton();
        Auditoria_de_TI = new javax.swing.JButton();
        Administracion_de_proyectos_1 = new javax.swing.JButton();
        Administracion_de_proyectos_2 = new javax.swing.JButton();
        Ingenieria_de_requerimientos = new javax.swing.JButton();
        Comportamiento_Organizacional_y_Gestion_del_Cambio = new javax.swing.JButton();
        Especificacion_de_Software = new javax.swing.JButton();
        Adquisicion_de_TI = new javax.swing.JButton();
        Teorias_de_las_organizaciones_y_sus_procesos = new javax.swing.JButton();
        Informacion_Contable_1 = new javax.swing.JButton();
        Planificacion_y_Presupuesto = new javax.swing.JButton();
        Economia = new javax.swing.JButton();
        Gestion_y_Toma_de_Decisiones_Financieras = new javax.swing.JButton();
        Mercadeo_de_Productos_de_Alta_Calidad = new javax.swing.JButton();
        Gestion_de_Recursos_Humanos = new javax.swing.JButton();
        Produccion_Logistica_y_Calidad = new javax.swing.JButton();
        Consultoria_de_TI = new javax.swing.JButton();
        Espiritu_Emprendedor_y_Creacion_de_Empresas = new javax.swing.JButton();
        Formulacion_y_Evaluacion_de_Proyectos_de_TI = new javax.swing.JButton();
        Modelo_de_Toma_de_Decisiones = new javax.swing.JButton();
        Informacion_Contable_2 = new javax.swing.JButton();
        Costos_en_Ambientes_Informaticos = new javax.swing.JButton();
        Algoritmos_y_Estructuras_de_Datos = new javax.swing.JButton();
        TallerDeProgramacion = new javax.swing.JButton();
        OrganizacionArquitecturaComputadores = new javax.swing.JButton();
        LenguajesDeProgramacion = new javax.swing.JButton();
        Infraestructura_Tecnologica_I = new javax.swing.JButton();
        Infraestructura_Tecnologica_II = new javax.swing.JButton();
        Arquitectura_de_Aplicaciones = new javax.swing.JButton();
        Administracion_de_Procesos_de_Negocios = new javax.swing.JButton();
        Electiva1 = new javax.swing.JButton();
        Electiva2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        InformationProfessorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profesores Interesados");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sistemas_de_Informacion_Empresarial.setBorder(null);
        Sistemas_de_Informacion_Empresarial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sistemas_de_Informacion_EmpresarialMouseClicked(evt);
            }
        });
        getContentPane().add(Sistemas_de_Informacion_Empresarial, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 90, 80));

        Planificaion_Estrategica_de_TI.setBorder(null);
        Planificaion_Estrategica_de_TI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Planificaion_Estrategica_de_TIMouseClicked(evt);
            }
        });
        getContentPane().add(Planificaion_Estrategica_de_TI, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, 90, 80));

        Administracion_de_Servicios_de_TI_2.setBorder(null);
        Administracion_de_Servicios_de_TI_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Administracion_de_Servicios_de_TI_2MouseClicked(evt);
            }
        });
        getContentPane().add(Administracion_de_Servicios_de_TI_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 90, 80));

        Bases_de_Datos.setBorder(null);
        Bases_de_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bases_de_DatosMouseClicked(evt);
            }
        });
        getContentPane().add(Bases_de_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 90, 80));

        Bases_de_Datos_Avanzadas.setBorder(null);
        Bases_de_Datos_Avanzadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bases_de_Datos_AvanzadasMouseClicked(evt);
            }
        });
        getContentPane().add(Bases_de_Datos_Avanzadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 100, 80));

        Diseño_de_Softaware.setBorder(null);
        Diseño_de_Softaware.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Diseño_de_SoftawareMouseClicked(evt);
            }
        });
        getContentPane().add(Diseño_de_Softaware, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 90, 80));

        Inteligencia_de_Negocios.setBorder(null);
        Inteligencia_de_Negocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inteligencia_de_NegociosMouseClicked(evt);
            }
        });
        getContentPane().add(Inteligencia_de_Negocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 90, 80));

        Negocios_Electronicos.setBorder(null);
        Negocios_Electronicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Negocios_ElectronicosMouseClicked(evt);
            }
        });
        getContentPane().add(Negocios_Electronicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 100, 80));

        Administracion_de_Servicios_de_TI_1.setBorder(null);
        Administracion_de_Servicios_de_TI_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Administracion_de_Servicios_de_TI_1MouseClicked(evt);
            }
        });
        getContentPane().add(Administracion_de_Servicios_de_TI_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 90, 80));

        Introduccion_a_la_programacion.setBorder(null);
        Introduccion_a_la_programacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Introduccion_a_la_programacionMouseClicked(evt);
            }
        });
        getContentPane().add(Introduccion_a_la_programacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, 80));

        Auditoria_de_TI.setBorder(null);
        Auditoria_de_TI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Auditoria_de_TIMouseClicked(evt);
            }
        });
        getContentPane().add(Auditoria_de_TI, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 90, 70));

        Administracion_de_proyectos_1.setBorder(null);
        Administracion_de_proyectos_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Administracion_de_proyectos_1MouseClicked(evt);
            }
        });
        getContentPane().add(Administracion_de_proyectos_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 90, 70));

        Administracion_de_proyectos_2.setBorder(null);
        Administracion_de_proyectos_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Administracion_de_proyectos_2MouseClicked(evt);
            }
        });
        getContentPane().add(Administracion_de_proyectos_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 90, 70));

        Ingenieria_de_requerimientos.setBorder(null);
        Ingenieria_de_requerimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ingenieria_de_requerimientosMouseClicked(evt);
            }
        });
        getContentPane().add(Ingenieria_de_requerimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 100, 70));

        Comportamiento_Organizacional_y_Gestion_del_Cambio.setBorder(null);
        Comportamiento_Organizacional_y_Gestion_del_Cambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Comportamiento_Organizacional_y_Gestion_del_CambioMouseClicked(evt);
            }
        });
        getContentPane().add(Comportamiento_Organizacional_y_Gestion_del_Cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 90, 80));

        Especificacion_de_Software.setBorder(null);
        Especificacion_de_Software.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Especificacion_de_SoftwareMouseClicked(evt);
            }
        });
        getContentPane().add(Especificacion_de_Software, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 90, 80));

        Adquisicion_de_TI.setBorder(null);
        Adquisicion_de_TI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Adquisicion_de_TIMouseClicked(evt);
            }
        });
        getContentPane().add(Adquisicion_de_TI, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 90, 80));

        Teorias_de_las_organizaciones_y_sus_procesos.setBorder(null);
        Teorias_de_las_organizaciones_y_sus_procesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Teorias_de_las_organizaciones_y_sus_procesosMouseClicked(evt);
            }
        });
        getContentPane().add(Teorias_de_las_organizaciones_y_sus_procesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 100, 70));

        Informacion_Contable_1.setBorder(null);
        Informacion_Contable_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Informacion_Contable_1MouseClicked(evt);
            }
        });
        getContentPane().add(Informacion_Contable_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 100, 70));

        Planificacion_y_Presupuesto.setBorder(null);
        Planificacion_y_Presupuesto.setName(""); // NOI18N
        Planificacion_y_Presupuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Planificacion_y_PresupuestoMouseClicked(evt);
            }
        });
        getContentPane().add(Planificacion_y_Presupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 100, 70));

        Economia.setBorder(null);
        Economia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EconomiaMouseClicked(evt);
            }
        });
        getContentPane().add(Economia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 100, 70));

        Gestion_y_Toma_de_Decisiones_Financieras.setBorder(null);
        Gestion_y_Toma_de_Decisiones_Financieras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Gestion_y_Toma_de_Decisiones_FinancierasMouseClicked(evt);
            }
        });
        getContentPane().add(Gestion_y_Toma_de_Decisiones_Financieras, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 90, 70));

        Mercadeo_de_Productos_de_Alta_Calidad.setBorder(null);
        Mercadeo_de_Productos_de_Alta_Calidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mercadeo_de_Productos_de_Alta_CalidadMouseClicked(evt);
            }
        });
        getContentPane().add(Mercadeo_de_Productos_de_Alta_Calidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 90, 70));

        Gestion_de_Recursos_Humanos.setBorder(null);
        Gestion_de_Recursos_Humanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Gestion_de_Recursos_HumanosMouseClicked(evt);
            }
        });
        getContentPane().add(Gestion_de_Recursos_Humanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 90, 70));

        Produccion_Logistica_y_Calidad.setBorder(null);
        Produccion_Logistica_y_Calidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Produccion_Logistica_y_CalidadMouseClicked(evt);
            }
        });
        getContentPane().add(Produccion_Logistica_y_Calidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 100, 80));

        Consultoria_de_TI.setBorder(null);
        Consultoria_de_TI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Consultoria_de_TIMouseClicked(evt);
            }
        });
        getContentPane().add(Consultoria_de_TI, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, 90, 70));

        Espiritu_Emprendedor_y_Creacion_de_Empresas.setBorder(null);
        Espiritu_Emprendedor_y_Creacion_de_Empresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Espiritu_Emprendedor_y_Creacion_de_EmpresasMouseClicked(evt);
            }
        });
        getContentPane().add(Espiritu_Emprendedor_y_Creacion_de_Empresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 350, 100, 80));

        Formulacion_y_Evaluacion_de_Proyectos_de_TI.setBorder(null);
        Formulacion_y_Evaluacion_de_Proyectos_de_TI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Formulacion_y_Evaluacion_de_Proyectos_de_TIMouseClicked(evt);
            }
        });
        getContentPane().add(Formulacion_y_Evaluacion_de_Proyectos_de_TI, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, 90, 80));

        Modelo_de_Toma_de_Decisiones.setBorder(null);
        Modelo_de_Toma_de_Decisiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modelo_de_Toma_de_DecisionesMouseClicked(evt);
            }
        });
        getContentPane().add(Modelo_de_Toma_de_Decisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 100, 80));

        Informacion_Contable_2.setBorder(null);
        Informacion_Contable_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Informacion_Contable_2MouseClicked(evt);
            }
        });
        getContentPane().add(Informacion_Contable_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 100, 70));

        Costos_en_Ambientes_Informaticos.setBorder(null);
        Costos_en_Ambientes_Informaticos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Costos_en_Ambientes_InformaticosMouseClicked(evt);
            }
        });
        getContentPane().add(Costos_en_Ambientes_Informaticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 100, 70));

        Algoritmos_y_Estructuras_de_Datos.setBorder(null);
        Algoritmos_y_Estructuras_de_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Algoritmos_y_Estructuras_de_DatosMouseClicked(evt);
            }
        });
        getContentPane().add(Algoritmos_y_Estructuras_de_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 100, 80));

        TallerDeProgramacion.setBorder(null);
        TallerDeProgramacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TallerDeProgramacionMouseClicked(evt);
            }
        });
        getContentPane().add(TallerDeProgramacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 80));

        OrganizacionArquitecturaComputadores.setBorder(null);
        OrganizacionArquitecturaComputadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrganizacionArquitecturaComputadoresMouseClicked(evt);
            }
        });
        getContentPane().add(OrganizacionArquitecturaComputadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 90, 80));

        LenguajesDeProgramacion.setBorder(null);
        LenguajesDeProgramacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LenguajesDeProgramacionMouseClicked(evt);
            }
        });
        getContentPane().add(LenguajesDeProgramacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 90, 80));

        Infraestructura_Tecnologica_I.setBorder(null);
        Infraestructura_Tecnologica_I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Infraestructura_Tecnologica_IMouseClicked(evt);
            }
        });
        getContentPane().add(Infraestructura_Tecnologica_I, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 90, 80));

        Infraestructura_Tecnologica_II.setBorder(null);
        Infraestructura_Tecnologica_II.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Infraestructura_Tecnologica_IIMouseClicked(evt);
            }
        });
        getContentPane().add(Infraestructura_Tecnologica_II, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 100, 80));

        Arquitectura_de_Aplicaciones.setBorder(null);
        Arquitectura_de_Aplicaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Arquitectura_de_AplicacionesMouseClicked(evt);
            }
        });
        getContentPane().add(Arquitectura_de_Aplicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 90, 80));

        Administracion_de_Procesos_de_Negocios.setBorder(null);
        Administracion_de_Procesos_de_Negocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Administracion_de_Procesos_de_NegociosMouseClicked(evt);
            }
        });
        getContentPane().add(Administracion_de_Procesos_de_Negocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 90, 80));

        Electiva1.setBorder(null);
        Electiva1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electiva1MouseClicked(evt);
            }
        });
        getContentPane().add(Electiva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 100, 80));

        Electiva2.setBorder(null);
        Electiva2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electiva2MouseClicked(evt);
            }
        });
        getContentPane().add(Electiva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 443, 90, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plan.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 1070, 730));

        InformationProfessorButton.setText("Información Profesores");
        InformationProfessorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationProfessorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(InformationProfessorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 620, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Sistemas_de_Informacion_EmpresarialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sistemas_de_Informacion_EmpresarialMouseClicked
        Consultar("TI9905 - Sistemas De Información Empresarial");
        // TODO add your handling code here:
    }//GEN-LAST:event_Sistemas_de_Informacion_EmpresarialMouseClicked

    private void Planificaion_Estrategica_de_TIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Planificaion_Estrategica_de_TIMouseClicked
        Consultar("TI9804 - Planificación Y Estrategias De Ti");
    }//GEN-LAST:event_Planificaion_Estrategica_de_TIMouseClicked

    private void Administracion_de_Servicios_de_TI_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Administracion_de_Servicios_de_TI_2MouseClicked
        Consultar("TI9004 - Administración De Servicios De Tecnologías De Información II");
    }//GEN-LAST:event_Administracion_de_Servicios_de_TI_2MouseClicked

    private void Bases_de_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bases_de_DatosMouseClicked
        Consultar("TI3600 - Bases De Datos");
    }//GEN-LAST:event_Bases_de_DatosMouseClicked

    private void Bases_de_Datos_AvanzadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bases_de_Datos_AvanzadasMouseClicked
        Consultar("TI4601 - Bases De Datos Avanzados");
    }//GEN-LAST:event_Bases_de_Datos_AvanzadasMouseClicked

    private void Diseño_de_SoftawareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Diseño_de_SoftawareMouseClicked
        Consultar("TI5501 - Diseño De Software");
    }//GEN-LAST:event_Diseño_de_SoftawareMouseClicked

    private void Inteligencia_de_NegociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inteligencia_de_NegociosMouseClicked
        Consultar("TI6900 - Inteligencia De Negocios");
    }//GEN-LAST:event_Inteligencia_de_NegociosMouseClicked

    private void Negocios_ElectronicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Negocios_ElectronicosMouseClicked
        Consultar("TI7901 - Negocios Electrónicos");
    }//GEN-LAST:event_Negocios_ElectronicosMouseClicked

    private void Administracion_de_Servicios_de_TI_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Administracion_de_Servicios_de_TI_1MouseClicked
        Consultar("TI8905 - Administración De Servicios De Tecnologías De Información I");
    }//GEN-LAST:event_Administracion_de_Servicios_de_TI_1MouseClicked

    private void Introduccion_a_la_programacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Introduccion_a_la_programacionMouseClicked
        Consultar("TI1400 - Introducción A La Programación");
    }//GEN-LAST:event_Introduccion_a_la_programacionMouseClicked

    private void Auditoria_de_TIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Auditoria_de_TIMouseClicked
        Consultar("TI9805 - Auditoria De Ti");
    }//GEN-LAST:event_Auditoria_de_TIMouseClicked

    private void Administracion_de_proyectos_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Administracion_de_proyectos_1MouseClicked
        Consultar("TI2800 - Administración De Proyectos I");
    }//GEN-LAST:event_Administracion_de_proyectos_1MouseClicked

    private void Administracion_de_proyectos_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Administracion_de_proyectos_2MouseClicked
        Consultar("TI3801 - Administración De Proyectos II");
    }//GEN-LAST:event_Administracion_de_proyectos_2MouseClicked

    private void Ingenieria_de_requerimientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingenieria_de_requerimientosMouseClicked
        Consultar("TI4500 - Ingeniería De Requerimientos");
    }//GEN-LAST:event_Ingenieria_de_requerimientosMouseClicked

    private void Comportamiento_Organizacional_y_Gestion_del_CambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Comportamiento_Organizacional_y_Gestion_del_CambioMouseClicked
        Consultar("TI5300 - Comportamiento Organizacional Y Gestión De Cambios");
    }//GEN-LAST:event_Comportamiento_Organizacional_y_Gestion_del_CambioMouseClicked

    private void Especificacion_de_SoftwareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Especificacion_de_SoftwareMouseClicked
        Consultar("TI6502 - Especificación De Software");
    }//GEN-LAST:event_Especificacion_de_SoftwareMouseClicked

    private void Adquisicion_de_TIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Adquisicion_de_TIMouseClicked
        Consultar("TI8902 - Adquisición De TI");
    }//GEN-LAST:event_Adquisicion_de_TIMouseClicked

    private void Teorias_de_las_organizaciones_y_sus_procesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Teorias_de_las_organizaciones_y_sus_procesosMouseClicked
        Consultar("TI1100 - Teoría De Las Organizaciones Y Sus Procesos");
    }//GEN-LAST:event_Teorias_de_las_organizaciones_y_sus_procesosMouseClicked

    private void Informacion_Contable_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Informacion_Contable_1MouseClicked
        Consultar("TI1101 - Información Contable I");
    }//GEN-LAST:event_Informacion_Contable_1MouseClicked

    private void Planificacion_y_PresupuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Planificacion_y_PresupuestoMouseClicked
        Consultar("TI4101 - Planificación Y Presupuesto");
    }//GEN-LAST:event_Planificacion_y_PresupuestoMouseClicked

    private void EconomiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EconomiaMouseClicked
        Consultar("TI4200 - Economía");
    }//GEN-LAST:event_EconomiaMouseClicked

    private void Gestion_y_Toma_de_Decisiones_FinancierasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gestion_y_Toma_de_Decisiones_FinancierasMouseClicked
        Consultar("TI5100 - Gestión Y Toma De Decisiones Financieras");
    }//GEN-LAST:event_Gestion_y_Toma_de_Decisiones_FinancierasMouseClicked

    private void Mercadeo_de_Productos_de_Alta_CalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mercadeo_de_Productos_de_Alta_CalidadMouseClicked
        Consultar("TI6101 - Mercadeo De Productos De Alta Tecnología");
    }//GEN-LAST:event_Mercadeo_de_Productos_de_Alta_CalidadMouseClicked

    private void Gestion_de_Recursos_HumanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gestion_de_Recursos_HumanosMouseClicked
        Consultar("TI7102 - Gestión De Recursos Humanos");
    }//GEN-LAST:event_Gestion_de_Recursos_HumanosMouseClicked

    private void Produccion_Logistica_y_CalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Produccion_Logistica_y_CalidadMouseClicked
        Consultar("TI6108 - Producción Logística Y Calidad");
    }//GEN-LAST:event_Produccion_Logistica_y_CalidadMouseClicked

    private void Consultoria_de_TIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Consultoria_de_TIMouseClicked
        Consultar("TI9006 - Consultoría De Tecnología De Información");
    }//GEN-LAST:event_Consultoria_de_TIMouseClicked

    private void Espiritu_Emprendedor_y_Creacion_de_EmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Espiritu_Emprendedor_y_Creacion_de_EmpresasMouseClicked
        Consultar("TI9005 - Espíritu Emprendedor Y Creación De Empresas");
    }//GEN-LAST:event_Espiritu_Emprendedor_y_Creacion_de_EmpresasMouseClicked

    private void Formulacion_y_Evaluacion_de_Proyectos_de_TIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Formulacion_y_Evaluacion_de_Proyectos_de_TIMouseClicked
        Consultar("TI8109 - Formulación Y Evaluación De Proyectos De TI");
    }//GEN-LAST:event_Formulacion_y_Evaluacion_de_Proyectos_de_TIMouseClicked

    private void Modelo_de_Toma_de_DecisionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modelo_de_Toma_de_DecisionesMouseClicked
        Consultar("TI7802 - Modelo De Toma De Decisiones");
    }//GEN-LAST:event_Modelo_de_Toma_de_DecisionesMouseClicked

    private void Informacion_Contable_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Informacion_Contable_2MouseClicked
        Consultar("TI2102 - Información Contable II");
    }//GEN-LAST:event_Informacion_Contable_2MouseClicked

    private void Costos_en_Ambientes_InformaticosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Costos_en_Ambientes_InformaticosMouseClicked
        Consultar("TI3103 - Costos En Ambientes Informáticos");
    }//GEN-LAST:event_Costos_en_Ambientes_InformaticosMouseClicked

    private void Algoritmos_y_Estructuras_de_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Algoritmos_y_Estructuras_de_DatosMouseClicked
        Consultar("TI2402 - Algoritmos Y Estructuras De Datos");
    }//GEN-LAST:event_Algoritmos_y_Estructuras_de_DatosMouseClicked

    private void TallerDeProgramacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TallerDeProgramacionMouseClicked
        Consultar("TI1401 - Taller De Programación");
    }//GEN-LAST:event_TallerDeProgramacionMouseClicked

    private void OrganizacionArquitecturaComputadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrganizacionArquitecturaComputadoresMouseClicked
        Consultar("TI2403 - Organización Y Arquitectura De Computadoras");
    }//GEN-LAST:event_OrganizacionArquitecturaComputadoresMouseClicked

    private void LenguajesDeProgramacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LenguajesDeProgramacionMouseClicked
        Consultar("TI3404 - Lenguajes De Programación");
    }//GEN-LAST:event_LenguajesDeProgramacionMouseClicked

    private void Infraestructura_Tecnologica_IMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Infraestructura_Tecnologica_IMouseClicked
        Consultar("TI5701 - Infraestructura Tecnológica I");
    }//GEN-LAST:event_Infraestructura_Tecnologica_IMouseClicked

    private void Infraestructura_Tecnologica_IIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Infraestructura_Tecnologica_IIMouseClicked
        Consultar("TI6702 - Infraestructura Tecnológica 2");
    }//GEN-LAST:event_Infraestructura_Tecnologica_IIMouseClicked

    private void Arquitectura_de_AplicacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Arquitectura_de_AplicacionesMouseClicked
        Consultar("TI7503 - Arquitectura De Aplicaciones");
    }//GEN-LAST:event_Arquitectura_de_AplicacionesMouseClicked

    private void Administracion_de_Procesos_de_NegociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Administracion_de_Procesos_de_NegociosMouseClicked
        Consultar("TI8904 - Administración De Procesos De Negocios");
    }//GEN-LAST:event_Administracion_de_Procesos_de_NegociosMouseClicked

    private void Electiva1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Electiva1MouseClicked
        Consultar("TI5000 - Electiva 1");
    }//GEN-LAST:event_Electiva1MouseClicked

    private void Electiva2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Electiva2MouseClicked
        Consultar("TI6000 - Electiva 2");
    }//GEN-LAST:event_Electiva2MouseClicked

    private void InformationProfessorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationProfessorButtonActionPerformed
        this.dispose();
        try {
            new VentanaNombreProfesores().setVisible(true);
            
// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(FrameProfesoresInteresadoEnCursos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(FrameProfesoresInteresadoEnCursos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(FrameProfesoresInteresadoEnCursos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FrameProfesoresInteresadoEnCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InformationProfessorButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FrameProfesoresInteresadoEnCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProfesoresInteresadoEnCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProfesoresInteresadoEnCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProfesoresInteresadoEnCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameProfesoresInteresadoEnCursos().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Administracion_de_Procesos_de_Negocios;
    private javax.swing.JButton Administracion_de_Servicios_de_TI_1;
    private javax.swing.JButton Administracion_de_Servicios_de_TI_2;
    private javax.swing.JButton Administracion_de_proyectos_1;
    private javax.swing.JButton Administracion_de_proyectos_2;
    private javax.swing.JButton Adquisicion_de_TI;
    private javax.swing.JButton Algoritmos_y_Estructuras_de_Datos;
    private javax.swing.JButton Arquitectura_de_Aplicaciones;
    private javax.swing.JButton Auditoria_de_TI;
    private javax.swing.JButton Bases_de_Datos;
    private javax.swing.JButton Bases_de_Datos_Avanzadas;
    private javax.swing.JButton Comportamiento_Organizacional_y_Gestion_del_Cambio;
    private javax.swing.JButton Consultoria_de_TI;
    private javax.swing.JButton Costos_en_Ambientes_Informaticos;
    private javax.swing.JButton Diseño_de_Softaware;
    private javax.swing.JButton Economia;
    private javax.swing.JButton Electiva1;
    private javax.swing.JButton Electiva2;
    private javax.swing.JButton Especificacion_de_Software;
    private javax.swing.JButton Espiritu_Emprendedor_y_Creacion_de_Empresas;
    private javax.swing.JButton Formulacion_y_Evaluacion_de_Proyectos_de_TI;
    private javax.swing.JButton Gestion_de_Recursos_Humanos;
    private javax.swing.JButton Gestion_y_Toma_de_Decisiones_Financieras;
    private javax.swing.JButton Informacion_Contable_1;
    private javax.swing.JButton Informacion_Contable_2;
    private javax.swing.JButton InformationProfessorButton;
    private javax.swing.JButton Infraestructura_Tecnologica_I;
    private javax.swing.JButton Infraestructura_Tecnologica_II;
    private javax.swing.JButton Ingenieria_de_requerimientos;
    private javax.swing.JButton Inteligencia_de_Negocios;
    private javax.swing.JButton Introduccion_a_la_programacion;
    private javax.swing.JButton LenguajesDeProgramacion;
    private javax.swing.JButton Mercadeo_de_Productos_de_Alta_Calidad;
    private javax.swing.JButton Modelo_de_Toma_de_Decisiones;
    private javax.swing.JButton Negocios_Electronicos;
    private javax.swing.JButton OrganizacionArquitecturaComputadores;
    private javax.swing.JButton Planificacion_y_Presupuesto;
    private javax.swing.JButton Planificaion_Estrategica_de_TI;
    private javax.swing.JButton Produccion_Logistica_y_Calidad;
    private javax.swing.JButton Sistemas_de_Informacion_Empresarial;
    private javax.swing.JButton TallerDeProgramacion;
    private javax.swing.JButton Teorias_de_las_organizaciones_y_sus_procesos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
