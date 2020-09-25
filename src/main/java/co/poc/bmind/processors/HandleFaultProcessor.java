package co.poc.bmind.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.http.common.HttpOperationFailedException;

public class HandleFaultProcessor implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		
		HttpOperationFailedException exception = ex.getProperty(Exchange.EXCEPTION_CAUGHT, HttpOperationFailedException.class);
		ex.getIn().setBody(exception.getResponseBody());
		System.out.println("Paso a pasito llegare");
	}

}
