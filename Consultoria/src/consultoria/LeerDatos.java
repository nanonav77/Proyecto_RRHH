/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoria;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;

public class LeerDatos {

    public static Sheet procesarBaseDatosExcel(int numeroHoja) throws IOException {

        File archivo = new File("src/consultoria/BDConsultoria.xls");

        ArrayList<String> listaFilas = new ArrayList<>();
        Workbook datosEntrantesArchivo;

        try {

            WorkbookSettings configuracionDeCodificacion = new WorkbookSettings();
            configuracionDeCodificacion.setEncoding("Cp1252");

            datosEntrantesArchivo = Workbook.getWorkbook(archivo, configuracionDeCodificacion);
            Sheet hoja = datosEntrantesArchivo.getSheet(numeroHoja);
            return hoja;

        } catch (BiffException e) {
        }
        return null;
    }

    public static int CantidadSheet() {
        int respuesta = 0;
        try {
            Workbook archivoExcel = Workbook.getWorkbook(new File("src/consultoria/BDConsultoria.xls"));
            respuesta = archivoExcel.getNumberOfSheets();
        } catch (IOException ex) {
            Logger.getLogger(LeerDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(LeerDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
}
