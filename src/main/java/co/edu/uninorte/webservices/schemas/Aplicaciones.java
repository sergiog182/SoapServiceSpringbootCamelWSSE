
package co.edu.uninorte.webservices.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aplicacion" type="{http://www.uninorte.edu.co/webservices/schemas}Aplicacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aplicacion"
})
@XmlRootElement(name = "aplicaciones")
public class Aplicaciones {

    protected List<Aplicacion> aplicacion;

    /**
     * Gets the value of the aplicacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aplicacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAplicacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aplicacion }
     * 
     * 
     */
    public List<Aplicacion> getAplicacion() {
        if (aplicacion == null) {
            aplicacion = new ArrayList<Aplicacion>();
        }
        return this.aplicacion;
    }

}
