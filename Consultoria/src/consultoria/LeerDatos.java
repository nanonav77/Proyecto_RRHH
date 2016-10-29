/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoria;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;

  
public class LeerDatos{
   

  
  public static Sheet procesarBaseDatosExcel(int numeroHoja) throws IOException  {
    
	File archivo = new File("src/consultoria/BDConsultoria.xls");
        
        ArrayList<String> listaFilas  = new ArrayList<>();
	Workbook datosEntrantesArchivo;
    
	try {
	  
          WorkbookSettings configuracionDeCodificacion = new WorkbookSettings();
          configuracionDeCodificacion.setEncoding("Cp1252");
          
          
	  datosEntrantesArchivo = Workbook.getWorkbook(archivo,configuracionDeCodificacion);
          Sheet hoja = datosEntrantesArchivo.getSheet(numeroHoja);
          return hoja;

        }
        
      catch (BiffException e) {
      }
      return null;
  }
} 

    

