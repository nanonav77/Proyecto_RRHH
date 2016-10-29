/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoria;

import java.util.ArrayList;
import jxl.Sheet;

/**
 *
 * @author jose
 */
public class SeccionParticipacionCursosCEDA {
    
    public static Sheet datosConsulturiaProfesor;
    
    public static boolean verificarSiEstaInteresadoEnParticiparCursosImpartidosPorElCEDAProfesor(){
        
         if(datosConsulturiaProfesor.getCell(1, 86).getContents().toString().equals("No")){
             return false;
         }
         return true;
    }
    
    public static ArrayList<String> obtenerEnCualesCursosEstaInteresadoParticiparImpartidosPorElCEDAProfesor(){
        
        ArrayList<String> posiblesCursos = new ArrayList<String>();
        
        for(int i=88;i<=103;i++){
            if(datosConsulturiaProfesor.getCell(1, i).getContents().toString().equals("X")){
                posiblesCursos.add(datosConsulturiaProfesor.getCell(0, i).getContents().toString());
            }
            
        }
        if(datosConsulturiaProfesor.getCell(1, 104).getContents().toString() != null || !datosConsulturiaProfesor.getCell(1, 104).getContents().toString().isEmpty()){
                posiblesCursos.add(datosConsulturiaProfesor.getCell(1, 104).getContents().toString());
        }
        return posiblesCursos ;
    }
    
    public static ArrayList<String> obtenerPeriodoEnElQueDeseaParticiparEnCursosImpartidosPorElCEDAProfesor(){
        
        ArrayList<String> periodos = new ArrayList<String>();
        
        for(int i=106;i<=115;i++){
            if(datosConsulturiaProfesor.getCell(1, i).getContents().toString().equals("X")){
                periodos.add(datosConsulturiaProfesor.getCell(0, i).getContents().toString());
            }
            
        }
        
        return periodos;
    }
    
}
