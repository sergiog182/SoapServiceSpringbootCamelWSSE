
package co.edu.uninorte.webservices.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.edu.uninorte.webservices.schemas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Aplicacion_QNAME = new QName("http://www.uninorte.edu.co/webservices/schemas", "aplicacion");
    private final static QName _Id_QNAME = new QName("http://www.uninorte.edu.co/webservices/schemas", "id");
    private final static QName _Correcto_QNAME = new QName("http://www.uninorte.edu.co/webservices/schemas", "correcto");
    private final static QName _Error_QNAME = new QName("http://www.uninorte.edu.co/webservices/schemas", "error");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.edu.uninorte.webservices.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Aplicacion }
     * 
     */
    public Aplicacion createAplicacion() {
        return new Aplicacion();
    }

    /**
     * Create an instance of {@link Aplicaciones }
     * 
     */
    public Aplicaciones createAplicaciones() {
        return new Aplicaciones();
    }

    /**
     * Create an instance of {@link Correcto }
     * 
     */
    public Correcto createCorrecto() {
        return new Correcto();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link Lider }
     * 
     */
    public Lider createLider() {
        return new Lider();
    }

    /**
     * Create an instance of {@link Aplicacion.ProyectosAsociados }
     * 
     */
    public Aplicacion.ProyectosAsociados createAplicacionProyectosAsociados() {
        return new Aplicacion.ProyectosAsociados();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Aplicacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uninorte.edu.co/webservices/schemas", name = "aplicacion")
    public JAXBElement<Aplicacion> createAplicacion(Aplicacion value) {
        return new JAXBElement<Aplicacion>(_Aplicacion_QNAME, Aplicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uninorte.edu.co/webservices/schemas", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Correcto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uninorte.edu.co/webservices/schemas", name = "correcto")
    public JAXBElement<Correcto> createCorrecto(Correcto value) {
        return new JAXBElement<Correcto>(_Correcto_QNAME, Correcto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uninorte.edu.co/webservices/schemas", name = "error")
    public JAXBElement<Error> createError(Error value) {
        return new JAXBElement<Error>(_Error_QNAME, Error.class, null, value);
    }

}
