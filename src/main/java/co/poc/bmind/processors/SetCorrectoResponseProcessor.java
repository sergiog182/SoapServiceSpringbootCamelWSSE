package co.poc.bmind.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.poc.bmind.webservices.schemas.Correcto;

public class SetCorrectoResponseProcessor implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		String codigo = ex.getIn().getHeader("codigo", String.class);
		String mensaje = ex.getIn().getHeader("mensaje", String.class);
		
		Correcto correcto = new Correcto();
		correcto.setCodigo(codigo);
		correcto.setMensaje(mensaje);
		ex.getIn().setBody(correcto);
	}

}
