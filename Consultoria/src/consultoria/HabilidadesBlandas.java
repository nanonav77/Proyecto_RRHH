package consultoria;

import java.util.ArrayList;

import jxl.Sheet;

public class HabilidadesBlandas {
	
	public static Sheet datosConsulturiaProfesor;
	
	public static ArrayList<String> obtenerHabilidadesBlandasAFortalecerProfesor(){
        
        ArrayList<String> habilidades = new ArrayList<String>();
        
        for(int i=150;i<=169;i++){
        	if(datosConsulturiaProfesor.getCell(1, i).getContents().toString().equals("X")){
                habilidades.add(datosConsulturiaProfesor.getCell(0, i).getContents().toString());
        	}
            
        }
        
        return habilidades;
    }
	
	public static ArrayList<String> obtenerComoDeseariaFortalecerHabilidadesBlandasProfesor(){
        
        ArrayList<String> habilidades = new ArrayList<String>();
        
        for(int i=171;i<=178;i++){
        	if(datosConsulturiaProfesor.getCell(1, i).getContents().toString().equals("X")){
                habilidades.add(datosConsulturiaProfesor.getCell(0, i).getContents().toString());
        	}
            
        }
        if(datosConsulturiaProfesor.getCell(1, 178).getContents().toString() != null || !datosConsulturiaProfesor.getCell(1, 178).getContents().toString().isEmpty()){
            habilidades.add(datosConsulturiaProfesor.getCell(1, 178).getContents().toString());
        }
        return habilidades;
    }
	public static ArrayList<String> obtenerPeridosQueDeseariaFortalecerHabilidadesBlandasProfesor(){
        
        ArrayList<String> periodos = new ArrayList<String>();
        
        for(int i=180;i<=189;i++){
        	if(datosConsulturiaProfesor.getCell(1, i).getContents().toString().equals("X")){
                periodos.add(datosConsulturiaProfesor.getCell(0, i).getContents().toString());
        	}
            
        }
        return periodos;
    }
	public static String obtenerLugarDondeDeseariaFortalecerHabilidadesBlandasProfesor(){
        
        return datosConsulturiaProfesor.getCell(1, 191).getContents().toString();
    }
	public static String obtenerAñosQueEstimaDurarEnFortalecerHabilidadesBlandasProfesor(){
        
        return datosConsulturiaProfesor.getCell(1, 193).getContents().toString();
    }
}
