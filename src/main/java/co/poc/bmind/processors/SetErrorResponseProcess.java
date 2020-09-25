package co.poc.bmind.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.poc.bmind.webservices.schemas.Error;

public class SetErrorResponseProcess implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		Error error = new Error();
		
		String errorCode = ex.getIn().getHeader("errorCode", String.class);
		error.setCodigo(errorCode);
		
		String errorMessage = ex.getIn().getHeader("errorMessage", String.class);
		error.setMensaje(errorMessage);
		
		ex.getIn().setBody(error);
	}

}
