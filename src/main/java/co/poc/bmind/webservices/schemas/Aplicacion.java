
package co.poc.bmind.webservices.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Aplicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Aplicacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="informacionGeneral" type="{http://www.bmind.poc.co/webservices/schemas}InformacionGeneral"/&gt;
 *         &lt;element name="liderFuncional" type="{http://www.bmind.poc.co/webservices/schemas}Lider"/&gt;
 *         &lt;element name="liderTecnico" type="{http://www.bmind.poc.co/webservices/schemas}Lider"/&gt;
 *         &lt;element name="proyectosAsociados"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aplicacion", propOrder = {
    "informacionGeneral",
    "liderFuncional",
    "liderTecnico",
    "proyectosAsociados"
})
public class Aplicacion {

    @XmlElement(required = true)
    protected InformacionGeneral informacionGeneral;
    @XmlElement(required = true)
    protected Lider liderFuncional;
    @XmlElement(required = true)
    protected Lider liderTecnico;
    @XmlElement(required = true)
    protected Aplicacion.ProyectosAsociados proyectosAsociados;

    /**
     * Obtiene el valor de la propiedad informacionGeneral.
     * 
     * @return
     *     possible object is
     *     {@link InformacionGeneral }
     *     
     */
    public InformacionGeneral getInformacionGeneral() {
        return informacionGeneral;
    }

    /**
     * Define el valor de la propiedad informacionGeneral.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionGeneral }
     *     
     */
    public void setInformacionGeneral(InformacionGeneral value) {
        this.informacionGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad liderFuncional.
     * 
     * @return
     *     possible object is
     *     {@link Lider }
     *     
     */
    public Lider getLiderFuncional() {
        return liderFuncional;
    }

    /**
     * Define el valor de la propiedad liderFuncional.
     * 
     * @param value
     *     allowed object is
     *     {@link Lider }
     *     
     */
    public void setLiderFuncional(Lider value) {
        this.liderFuncional = value;
    }

    /**
     * Obtiene el valor de la propiedad liderTecnico.
     * 
     * @return
     *     possible object is
     *     {@link Lider }
     *     
     */
    public Lider getLiderTecnico() {
        return liderTecnico;
    }

    /**
     * Define el valor de la propiedad liderTecnico.
     * 
     * @param value
     *     allowed object is
     *     {@link Lider }
     *     
     */
    public void setLiderTecnico(Lider value) {
        this.liderTecnico = value;
    }

    /**
     * Obtiene el valor de la propiedad proyectosAsociados.
     * 
     * @return
     *     possible object is
     *     {@link Aplicacion.ProyectosAsociados }
     *     
     */
    public Aplicacion.ProyectosAsociados getProyectosAsociados() {
        return proyectosAsociados;
    }

    /**
     * Define el valor de la propiedad proyectosAsociados.
     * 
     * @param value
     *     allowed object is
     *     {@link Aplicacion.ProyectosAsociados }
     *     
     */
    public void setProyectosAsociados(Aplicacion.ProyectosAsociados value) {
        this.proyectosAsociados = value;
    }


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
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "nombre"
    })
    public static class ProyectosAsociados {

        protected List<String> nombre;

        /**
         * Gets the value of the nombre property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nombre property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNombre().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNombre() {
            if (nombre == null) {
                nombre = new ArrayList<String>();
            }
            return this.nombre;
        }

    }

}
