package generarPDF;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;

public class DTOFormato {

    private BaseColor fondoEncabezado;
    private BaseColor fondoIntermedio;
    private BaseColor fondoBase;

    private Font formatoTitulo;
    private Font formatoSubtitulo;
    private Font formatoTexto;

    public DTOFormato() {
	fondoEncabezado = new BaseColor(255, 255, 255);
	fondoIntermedio = new BaseColor(255, 255, 255);
	fondoBase = new BaseColor(255, 255, 255);

	formatoTitulo = FontFactory.getFont(FontFactory.COURIER, 20, BaseColor.BLACK);
	formatoSubtitulo = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
	formatoTexto = FontFactory.getFont(FontFactory.COURIER, 12, BaseColor.BLACK);
    }

    public BaseColor getFondoEncabezado() {
	return fondoEncabezado;
    }

    public void setFondoEncabezado(BaseColor fondoEncabezado) {
	this.fondoEncabezado = fondoEncabezado;
    }

    public BaseColor getFondoIntermedio() {
	return fondoIntermedio;
    }

    public void setFondoIntermedio(BaseColor fondoIntermedio) {
	this.fondoIntermedio = fondoIntermedio;
    }

    public BaseColor getFondoBase() {
	return fondoBase;
    }

    public void setFondoBase(BaseColor fondoBase) {
	this.fondoBase = fondoBase;
    }

    public Font getFormatoTitulo() {
	return formatoTitulo;
    }

    public void setFormatoTitulo(Font formatoTitulo) {
	this.formatoTitulo = formatoTitulo;
    }

    public Font getFormatoSubtitulo() {
	return formatoSubtitulo;
    }

    public void setFormatoSubtitulo(Font formatoSubtitulo) {
	this.formatoSubtitulo = formatoSubtitulo;
    }

    public Font getFormatoTexto() {
	return formatoTexto;
    }

    public void setFormatoTexto(Font formatoTexto) {
	this.formatoTexto = formatoTexto;
    }

}
