
import consultoria.DatosProfesor;
import consultoria.LeerDatos;

import consultoria.SeccionActividadesCapacitacionFormal;
import consultoria.SeccionParticipacionCursosCEDA;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Principal {
    
    public static void main (String [ ] args) throws IOException {
 
        
        DatosProfesor.datosConsulturiaProfesor = LeerDatos.procesarBaseDatosExcel(5);//el 5 es el numero de hoja procesada del excel segun seal el profesor que se desa analizar
        String v = DatosProfesor.obtenerNombreProfesor();
        System.out.println(v);
        
        ArrayList<String> lista = DatosProfesor.obtenerCursosQueImpartiriaProfesor();
        System.out.println(lista);
        
        SeccionParticipacionCursosCEDA.datosConsulturiaProfesor = LeerDatos.procesarBaseDatosExcel(5);
        boolean x = SeccionParticipacionCursosCEDA.verificarSiEstaInteresadoEnParticiparCursosImpartidosPorElCEDAProfesor();
        System.out.println(x);
        
        ArrayList<String> lista2 = SeccionParticipacionCursosCEDA.obtenerEnCualesCursosEstaInteresadoParticiparImpartidosPorElCEDAProfesor();
        System.out.println(lista2);
        
        SeccionActividadesCapacitacionFormal.datosConsulturiaProfesor = LeerDatos.procesarBaseDatosExcel(5);
        
        boolean e = SeccionActividadesCapacitacionFormal.verificarSiConsideraQueRequiereActividadesComoParteDeSuCapacitacionFormalProfesor();
        System.out.println(e);
        
        ArrayList<String> lista3 = SeccionActividadesCapacitacionFormal.obtenerPeriodoEnElQueDeseaLlevarActividadesDeCapacitacionFormalProfesor();
        System.out.println(lista3);
    }
    
}
