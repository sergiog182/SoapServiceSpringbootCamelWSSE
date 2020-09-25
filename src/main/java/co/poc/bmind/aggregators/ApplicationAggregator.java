package co.poc.bmind.aggregators;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import co.poc.bmind.webservices.schemas.*;

public class ApplicationAggregator implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		Aplicaciones aplicaciones;
		int contador = 0;
		
		if (oldExchange != null) {
			aplicaciones = oldExchange.getIn().getBody(Aplicaciones.class);
			contador = oldExchange.getIn().getHeader("tieneAplicaciones", Integer.class);
		} else {
			aplicaciones = new Aplicaciones();
		}
		
		Aplicacion aplicacion = newExchange.getIn().getBody(Aplicacion.class);
		aplicaciones.getAplicacion().add(aplicacion);
		
		newExchange.getIn().setBody(aplicaciones);
		newExchange.getIn().setHeader("tieneAplicaciones", contador++);
		
		
		return newExchange;
	}

}
