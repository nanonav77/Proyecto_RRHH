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
public class DatosProfesor {
    
    public static Sheet datosConsulturiaProfesor;
    
    public static String obtenerNombreProfesor(){
        
        return datosConsulturiaProfesor.getCell(1, 1).getContents().toString();
    }
    
    public static String obtenerTipoIdentificacionProfesor(){
        
        return datosConsulturiaProfesor.getCell(1, 3).getContents().toString();
    }
    
    public static String obtenerCedulaProfesor(){
        
        return datosConsulturiaProfesor.getCell(1, 5).getContents().toString();
    }
    
    public static String obtenerNumeroPasaporteProfesor(){
        
        return datosConsulturiaProfesor.getCell(1, 7).getContents().toString();
    }
    
    public static String obtenerPaisProcedenciaProfesor(){
        
        return datosConsulturiaProfesor.getCell(1, 9).getContents().toString();
    }
    
    public static ArrayList<String> obtenerPuestosActualmenteProfesor(){
        
        ArrayList<String> listaPuestos = new ArrayList<String>();
        
        for(int i=11;i<=15;i++){
            if(datosConsulturiaProfesor.getCell(1, i).getContents().toString().equals("X")){
                listaPuestos.add(datosConsulturiaProfesor.getCell(0, i).getContents().toString());
            }
        }
        
        return listaPuestos;
    }
    
    public static ArrayList<String> obtenerAreaEspecialidadOTrabajoProfesor(){
        
        ArrayList<String> areasEspecialidad = new ArrayList<String>();
        
        for(int i=17;i<=27;i++){
            if(datosConsulturiaProfesor.getCell(1, i).getContents().toString().equals("X")){
                areasEspecialidad.add(datosConsulturiaProfesor.getCell(0, i).getContents().toString());
            }
            
        }
        if(datosConsulturiaProfesor.getCell(1, 28).getContents().toString() != null || !datosConsulturiaProfesor.getCell(1, 28).getContents().toString().isEmpty()){
                areasEspecialidad.add(datosConsulturiaProfesor.getCell(1, 28).getContents().toString());
        }
        return areasEspecialidad;
    }
    
    public static ArrayList<String> obtenerCursosQueImpartiriaProfesor(){
        
        ArrayList<String> posiblesCursos = new ArrayList<String>();
        
        for(int i=29;i<=72;i++){
            if(datosConsulturiaProfesor.getCell(1, i).getContents().toString().equals("X")){
                posiblesCursos.add(datosConsulturiaProfesor.getCell(0, i).getContents().toString());
            }
            
        }
        
        return posiblesCursos ;
    }
    public static String obtenerRegimenPensionProfesor(){
        
        return datosConsulturiaProfesor.getCell(1, 74).getContents().toString();
    }
    // Si esta vacio esta tirando que si a cancelado cuotas.. Arreglar.
    public static String conoceCuotasCanceladas(){
        
         return datosConsulturiaProfesor.getCell(1, 76).getContents().toString();
    }
    
    public static String obtenerCuotasCanceladasProfesor(){
        
        return datosConsulturiaProfesor.getCell(1, 78).getContents().toString();
    }
    public static String obtenerEdadPensionarseProfesor(){
        
        return datosConsulturiaProfesor.getCell(1, 80).getContents().toString();
    }
    public static String obtenerTituloYGradoAcedemicoProfesor(){
        
        return datosConsulturiaProfesor.getCell(1, 82).getContents().toString();
    }
    public static String obtenerEstudiosPegradoYUbicacionDondeLosObtuvoProfesor(){
        
        return datosConsulturiaProfesor.getCell(1, 84).getContents().toString();
    }
    
}
