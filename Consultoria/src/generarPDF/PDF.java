package generarPDF;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDF {

    private Document archivo;
    private DTOFormato formato;

    /**
     * Método constructor de la clase
     *
     * @param pFormato Las configuraciones del PDF
     */
    public PDF(DTOFormato pFormato) {
        formato = pFormato;
        archivo = new Document(PageSize.LETTER, 25, 25, 25, 25);
        crearDocumento();
    }

    // GENERADOR DEL DOCUMENTO
    /**
     * Busca la ruta para almacenar el documento PDF
     *
     * @return La ruta escogida por el usuario
     */
    public String retornarRuta() {
        // Genera la ventana de busqueda de la dirección
        JFileChooser sChooser = new JFileChooser();
        sChooser.addChoosableFileFilter(new FileNameExtensionFilter("PDF Documents", "pdf"));
        sChooser.setAcceptAllFileFilterUsed(false);

        // Comprueba si ha presionado el boton de aceptar
        if (sChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {

            // obtenemos el path del archivo a guardar
            File path = sChooser.getSelectedFile();
            return path.getAbsolutePath() + ".pdf";
        }

        return null;
    }

    /**
     * Crea el documento PDF y lo abre para edición
     *
     * @return La condición de exito que tuvo al crear el documento
     */
    private Boolean crearDocumento() {
        // Filtra la creación del documento
        try {
            // Obtiene la instancia del PDF
            PdfWriter writer = PdfWriter.getInstance(archivo, new FileOutputStream(retornarRuta()));
            writer.setInitialLeading(16);

            // Abre el documento
            archivo.open();

            return true;
        } catch (FileNotFoundException | DocumentException e) {
            return false;
        }
    }

    /**
     * Cierra el documento para poder ser leido
     */
    public void generarDocumento() {
        archivo.close();
    }

    // GENERADOR DE LAS TABLAS
    /**
     * Añade una lista de datos a una tabla en específico
     *
     * @param pEncabezado Los títulos de los valores
     * @param pLista Los valores de la tabla
     */
    public void añadirTabla(String[] pEncabezado, String[][] pLista) {
        try {
            // Crea la tabla con el tamaño de columnas que posee
            PdfPTable sTabla = new PdfPTable(pEncabezado.length);

            // Ciclo que asigna los encabezados a la tabla
            for (String pEncabezado1 : pEncabezado) {
                PdfPCell sCelda = formatoCelda(pEncabezado1, formato.getFondoEncabezado());
                sTabla.addCell(sCelda);
            }

            // Ciclo que asigna los valores a la tabla
            for (int i = 0; i < pLista.length; i++) {
                for (String item : pLista[i]) {
                    PdfPCell sCelda = formatoCelda(item, (i % 2 == 0) ? formato.getFondoBase() : formato.getFondoIntermedio());
                    sTabla.addCell(sCelda);
                }
            }

            // Añade la tabla al documento
            archivo.add(sTabla);
        } catch (DocumentException e) {
        }
    }

    /**
     * Da formato de color a cada una de las celdas
     *
     * @param pEntrada El texto ingresado
     * @param pColor El color a asignar
     * @return La celda con formato
     */
    private PdfPCell formatoCelda(String pEntrada, BaseColor pColor) {
        // Crea la celda y le asigna el valor
        PdfPCell sCelda = new PdfPCell(new Phrase(pEntrada));

        // Le da el formato respectivo
        sCelda.setBackgroundColor(pColor);

        // Retorna la celda
        return sCelda;
    }

    // GENERADOR DE TEXTOS
    /**
     * Asigna el texto en el documento
     *
     * @param pParrafo El texto a añadir
     * @param pLetra El formato del texto
     */
    private void añadirTexto(String pParrafo, Font pLetra) {
        try {
            // Añade el parrafo al documento
            Chunk titulo = new Chunk(pParrafo, pLetra);
            Paragraph pp = new Paragraph(titulo);
            pp.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
            archivo.add(titulo);
        } catch (DocumentException e) {
        }
    }

    /**
     * Realiza el salto de linea del texto
     */
    public void añadirSalto() {
        try {
            // A�ade el parrafo al documento
            archivo.add(Chunk.NEWLINE);
        } catch (DocumentException e) {
        }
    }

    /**
     * Convierte el texto a cursiva
     *
     * @param pParrafo El texto a añadir
     */
    public void añadirCursiva(String pParrafo) {
        Font pLetra = formato.getFormatoTexto();
        pLetra.setStyle(Font.ITALIC);
        añadirTexto(pParrafo, pLetra);
    }

    /**
     * Convierte el texto a negrita
     *
     * @param pParrafo El texto a añadir
     */
    public void añadirNegrita(String pParrafo) {
        Font pLetra = formato.getFormatoTexto();
        pLetra.setStyle(Font.BOLD);
        añadirTexto(pParrafo, pLetra);
    }

    /**
     * Convierte el texto a Normal
     *
     * @param pParrafo El texto a añadir
     */
    public void añadirTexto(String pParrafo) {
        Font pLetra = formato.getFormatoTexto();
        añadirTexto(pParrafo, pLetra);
    }

    /**
     * Convierte el texto a Titulo
     *
     * @param pParrafo El texto a añadir
     */
    public void añadirTitulo(String pParrafo) {
        Font pLetra = formato.getFormatoTitulo();
        añadirTexto(pParrafo, pLetra);
        añadirSalto();
        añadirSalto();
    }

    /**
     * Convierte el texto a subtitulo
     *
     * @param pParrafo El texto a añadir
     */
    public void añadirSubtitulo(String pParrafo) {
        Font pLetra = formato.getFormatoSubtitulo();
        añadirTexto(pParrafo, pLetra);
        añadirSalto();
        añadirSalto();
    }

    static public void main(String[] args) {

        String[][] Lista = {{"Fila 1", "1", "2"}, {"Fila 2", "3", "4"}, {"Fila 3", "5", "6"},
        {"Fila 4", "7", "8"}};
        String[] Encabezado = {"", "Columna 1", "Columna 2"};

        DTOFormato dto = new DTOFormato();
        dto.setFondoEncabezado(new BaseColor(204, 255, 102));
        dto.setFondoIntermedio(new BaseColor(216, 214, 214));
        dto.setFormatoTexto(FontFactory.getFont(FontFactory.HELVETICA, 13, BaseColor.BLACK));

        PDF pdf = new PDF(dto);
        pdf.añadirTitulo("Titulo 1");
        pdf.añadirSubtitulo("Subtitulo A");
        pdf.añadirTexto("Esto es una prueba de texto, ");
        pdf.añadirCursiva("donde se pueden combinar diferentes formatos ");
        pdf.añadirNegrita("en el mismo documento y poderlos almacenar");
        pdf.añadirSalto();
        pdf.añadirTabla(Encabezado, Lista);
        pdf.generarDocumento();
    }
}
