/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import consultoria.DatosProfesor;
import consultoria.LeerDatos;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristopher Inces
 */
public class Consultas {

    public static ArrayList<String> ProfesoresInteresadosEnCurso(String curso) {
        ArrayList<String> profesores = new ArrayList<>();
        for (int i = 0; i < LeerDatos.CantidadSheet(); i++) {
            try {
                DatosProfesor.datosConsulturiaProfesor = LeerDatos.procesarBaseDatosExcel(i);
                ArrayList<String> lista = DatosProfesor.obtenerCursosQueImpartiriaProfesor();
                if (lista.contains(curso)) {
                    profesores.add(DatosProfesor.obtenerNombreProfesor());
                    profesores.add(Integer.toString(i));
                }
            } catch (IOException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return profesores;
    }

    public ArrayList<Object> getDataByMethod(String nombreMetodo) throws IOException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println(nombreMetodo);
        ArrayList<Object> datos = new ArrayList<>();
        for (int i = 0; i < LeerDatos.CantidadSheet(); i++) {
            DatosProfesor.datosConsulturiaProfesor = LeerDatos.procesarBaseDatosExcel(i);
            Class datosProfesor = DatosProfesor.class;
            Method metodo = datosProfesor.getMethod(nombreMetodo);
            datos.add((Object) metodo.invoke(null, null).toString());

        }
        //System.out.println(datos);
        return datos;
    }

}
