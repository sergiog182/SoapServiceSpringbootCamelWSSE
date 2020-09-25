package co.poc.bmind.processors;

import java.text.SimpleDateFormat;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import co.poc.bmind.webservices.schemas.*;

public class CompleteResponseWithConversionsProcessor implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		co.edu.uninorte.webservices.schemas.Aplicacion responseApp = ex.getIn().getBody(co.edu.uninorte.webservices.schemas.Aplicacion.class);
		
		Aplicacion app = new Aplicacion();
		InformacionGeneral informacionGeneral = new InformacionGeneral();
		Lider liderFuncional = new Lider();
		Lider liderTecnico = new Lider();
		Aplicacion.ProyectosAsociados pasociados = new Aplicacion.ProyectosAsociados();
		
		double precio = responseApp.getPrecio().doubleValue();
		
		double conversionUSD = ex.getIn().getHeader("conversionRateUSD", Double.class);
		double conversionEUR = ex.getIn().getHeader("conversionRateEUR", Double.class);
		
		double precioUSD = precio * conversionUSD;
		double precioEUR = precio * conversionEUR;
		
		informacionGeneral.setId(responseApp.getId());
		informacionGeneral.setPrecioUSD(Double.toString(precioUSD));
		informacionGeneral.setPrecioEUR(Double.toString(precioEUR));
		
		informacionGeneral.setNombre(responseApp.getNombre());
		informacionGeneral.setTipo(responseApp.getTipo());
		informacionGeneral.setDescripcion(responseApp.getDescripcion());
		informacionGeneral.setVersion(responseApp.getVersion());
		informacionGeneral.setFabricante(responseApp.getFabricante());
		informacionGeneral.setReemplazaraA(responseApp.getReempalzaraA());
		informacionGeneral.setReemplazadaPor(responseApp.getReemplazadaPor());
		informacionGeneral.setEstado(responseApp.getEstado());
		if (responseApp.isActiva()) {
			informacionGeneral.setActiva("1");
		} else {
			informacionGeneral.setActiva("0");
		}
		
		XMLGregorianCalendar fechaActivacion = responseApp.getFechaActivacion();
		XMLGregorianCalendar fechaDesactivacion = responseApp.getFechaDesactivacion();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		informacionGeneral.setFechaActivacion(formatter.format(fechaActivacion.toGregorianCalendar().getTime()));
		informacionGeneral.setFechaDesactivacion(formatter.format(fechaDesactivacion.toGregorianCalendar().getTime()));
		
		informacionGeneral.setAreaPropietaria(responseApp.getAreaPropietaria());
		informacionGeneral.setProcesoPropietario(responseApp.getProcesoPropietario());
		informacionGeneral.setArquitectura(responseApp.getArquitectura());
		informacionGeneral.setTipoInfraestructura(responseApp.getTipoInfraestructura());
		informacionGeneral.setProveedorServicioCloud(responseApp.getProveedorServicioCloud());
		informacionGeneral.setTipoAutenticacion(responseApp.getTipoAutenticacion());
		informacionGeneral.setPrecio(responseApp.getPrecio().toString());

		liderFuncional.setNombre(responseApp.getLiderFuncional().getNombre());
		liderFuncional.setEmail(responseApp.getLiderFuncional().getEmail());
		liderFuncional.setTelefono(responseApp.getLiderFuncional().getTelefono());
		
		liderTecnico.setNombre(responseApp.getLiderTecnico().getNombre());
		liderTecnico.setEmail(responseApp.getLiderTecnico().getEmail());
		liderTecnico.setTelefono(responseApp.getLiderTecnico().getTelefono());
		
		pasociados.getNombre().addAll(responseApp.getProyectosAsociados().getNombre());
		
		app.setInformacionGeneral(informacionGeneral);
		app.setLiderFuncional(liderFuncional);
		app.setLiderTecnico(liderTecnico);
		app.setProyectosAsociados(pasociados);
		
		ex.getIn().setBody(app);
	}

}
