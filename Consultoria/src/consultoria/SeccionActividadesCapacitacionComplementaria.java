package consultoria;

import java.util.ArrayList;

import jxl.Sheet;

public class SeccionActividadesCapacitacionComplementaria {
	
	public static Sheet datosConsulturiaProfesor;
	
	public static boolean verificarSiConsideraQueRequiereActividadesComoParteDeSuCapacitacionComplementariaProfesor(){
        
        if(datosConsulturiaProfesor.getCell(1, 195).getContents().toString().equals("No")){
            return false;
        }
        return true;
   }
   public static ArrayList<String> obtenerActividadesQueRequiereComoParteDeCapacitacionComplementariaProfesor(){
        
        ArrayList<String> actividades = new ArrayList<String>();
        
        for(int i=197;i<=206;i++){
            
        	String validador =(String)datosConsulturiaProfesor.getCell(1, i).getContents().toString();
        	if(validador!=null && !validador.equals("")){
        		actividades.add(datosConsulturiaProfesor.getCell(1, i).getContents().toString());
            }
                
         }
        
        return actividades ;
    }
}
