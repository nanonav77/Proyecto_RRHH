/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import consultoria.DatosProfesor;
import consultoria.LeerDatos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristopher Inces
 */
public class Consultas {
    
    

    public static  ArrayList<String> ProfesoresInteresadosEnCurso(String curso) {
        ArrayList<String> profesores = new ArrayList<>();
        for (int i = 0; i < LeerDatos.CantidadSheet(); i++) {
            try {
                DatosProfesor.datosConsulturiaProfesor = LeerDatos.procesarBaseDatosExcel(i);
                ArrayList<String> lista = DatosProfesor.obtenerCursosQueImpartiriaProfesor();
                if (lista.contains(curso))
                {
                    profesores.add(DatosProfesor.obtenerNombreProfesor());
                }
            } catch (IOException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return profesores;
    }

}
