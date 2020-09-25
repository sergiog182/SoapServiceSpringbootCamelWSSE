package co.poc.bmind.processors;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.poc.bmind.webservices.schemas.*;

public class TransformDataProcess implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		Aplicacion app = ex.getIn().getBody(Aplicacion.class);
		
		String actualState = app.getInformacionGeneral().getActiva();
		if (actualState.trim().equals("1") || actualState.trim().toLowerCase().equals("si")) {
			actualState = "true";
		}
		boolean finalState = Boolean.parseBoolean(actualState);
		
		app.getInformacionGeneral().setActiva(String.valueOf(finalState));
		
		String fechaActivacion = app.getInformacionGeneral().getFechaActivacion();
		String fechaDesactivacion = app.getInformacionGeneral().getFechaDesactivacion();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date fechaActivacionDate = formatter.parse(fechaActivacion);
		Date fechaDesactivacionDate = formatter.parse(fechaDesactivacion);
		
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(fechaActivacionDate);
		XMLGregorianCalendar fechaActivacionFinal = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		
		calendar.setTime(fechaDesactivacionDate);
		XMLGregorianCalendar fechaDesactivacionFinal = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		
		app.getInformacionGeneral().setFechaActivacion(fechaActivacionFinal.toXMLFormat());
		app.getInformacionGeneral().setFechaDesactivacion(fechaDesactivacionFinal.toXMLFormat());
		
		ex.getIn().setBody(app);
	}
	
}
