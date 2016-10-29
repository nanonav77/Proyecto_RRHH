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
public class SeccionActividadesCapacitacionFormal {
 
    public static Sheet datosConsulturiaProfesor;
     
    public static boolean verificarSiConsideraQueRequiereActividadesComoParteDeSuCapacitacionFormalProfesor(){
        
         if(datosConsulturiaProfesor.getCell(1, 117).getContents().toString().equals("No")){
             return false;
         }
         return true;
    }
    public static ArrayList<String> obtenerActividadesQueRequiereComoParteDeCapacitacionFormalProfesor(){
        
        ArrayList<String> actividades = new ArrayList<String>();
        
        for(int i=119;i<=121;i++){
            
                actividades.add(datosConsulturiaProfesor.getCell(1, i).getContents().toString());
            
            
        }
        
        return actividades ;
    }
    public static ArrayList<String> obtenerObjetivoEstrategicoDeLasActividadesComoParteDeCapacitacionFormalProfesor(){
        
        ArrayList<String> objetivos = new ArrayList<String>();
        
        for(int i=123;i<=128;i++){
            if(datosConsulturiaProfesor.getCell(1, i).getContents().toString().equals("X")){
                objetivos.add(datosConsulturiaProfesor.getCell(0, i).getContents().toString());
            }
            
        }
        
        return objetivos;
    }
    public static ArrayList<String> obtenerPeriodoEnElQueDeseaLlevarActividadesDeCapacitacionFormalProfesor(){
        
        ArrayList<String> periodos = new ArrayList<String>();
        
        for(int i=130;i<=139;i++){
            if(datosConsulturiaProfesor.getCell(1, i).getContents().toString().equals("X")){
                periodos.add(datosConsulturiaProfesor.getCell(0, i).getContents().toString());
            }
            
        }
        
        return periodos;
    }
}
