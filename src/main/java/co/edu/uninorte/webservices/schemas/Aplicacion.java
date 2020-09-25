
package co.edu.uninorte.webservices.schemas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fabricante" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reempalzaraA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reemplazadaPor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activa" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fechaActivacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="fechaDesactivacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
 *         &lt;element name="areaPropietaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="procesoPropietario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="liderFuncional" type="{http://www.uninorte.edu.co/webservices/schemas}Lider"/&gt;
 *         &lt;element name="liderTecnico" type="{http://www.uninorte.edu.co/webservices/schemas}Lider"/&gt;
 *         &lt;element name="arquitectura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoInfraestructura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="proveedorServicioCloud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoAutenticacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
    "id",
    "nombre",
    "tipo",
    "descripcion",
    "version",
    "fabricante",
    "reempalzaraA",
    "reemplazadaPor",
    "estado",
    "activa",
    "fechaActivacion",
    "fechaDesactivacion",
    "proyectosAsociados",
    "areaPropietaria",
    "procesoPropietario",
    "liderFuncional",
    "liderTecnico",
    "arquitectura",
    "tipoInfraestructura",
    "proveedorServicioCloud",
    "tipoAutenticacion",
    "precio"
})
public class Aplicacion {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String fabricante;
    @XmlElement(required = true)
    protected String reempalzaraA;
    @XmlElement(required = true)
    protected String reemplazadaPor;
    @XmlElement(required = true)
    protected String estado;
    protected boolean activa;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActivacion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDesactivacion;
    @XmlElement(required = true)
    protected Aplicacion.ProyectosAsociados proyectosAsociados;
    @XmlElement(required = true)
    protected String areaPropietaria;
    @XmlElement(required = true)
    protected String procesoPropietario;
    @XmlElement(required = true)
    protected Lider liderFuncional;
    @XmlElement(required = true)
    protected Lider liderTecnico;
    @XmlElement(required = true)
    protected String arquitectura;
    @XmlElement(required = true)
    protected String tipoInfraestructura;
    @XmlElement(required = true)
    protected String proveedorServicioCloud;
    @XmlElement(required = true)
    protected String tipoAutenticacion;
    @XmlElement(required = true)
    protected BigDecimal precio;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad fabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Define el valor de la propiedad fabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFabricante(String value) {
        this.fabricante = value;
    }

    /**
     * Obtiene el valor de la propiedad reempalzaraA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReempalzaraA() {
        return reempalzaraA;
    }

    /**
     * Define el valor de la propiedad reempalzaraA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReempalzaraA(String value) {
        this.reempalzaraA = value;
    }

    /**
     * Obtiene el valor de la propiedad reemplazadaPor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReemplazadaPor() {
        return reemplazadaPor;
    }

    /**
     * Define el valor de la propiedad reemplazadaPor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReemplazadaPor(String value) {
        this.reemplazadaPor = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad activa.
     * 
     */
    public boolean isActiva() {
        return activa;
    }

    /**
     * Define el valor de la propiedad activa.
     * 
     */
    public void setActiva(boolean value) {
        this.activa = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActivacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActivacion() {
        return fechaActivacion;
    }

    /**
     * Define el valor de la propiedad fechaActivacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActivacion(XMLGregorianCalendar value) {
        this.fechaActivacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesactivacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDesactivacion() {
        return fechaDesactivacion;
    }

    /**
     * Define el valor de la propiedad fechaDesactivacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDesactivacion(XMLGregorianCalendar value) {
        this.fechaDesactivacion = value;
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
     * Obtiene el valor de la propiedad areaPropietaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaPropietaria() {
        return areaPropietaria;
    }

    /**
     * Define el valor de la propiedad areaPropietaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaPropietaria(String value) {
        this.areaPropietaria = value;
    }

    /**
     * Obtiene el valor de la propiedad procesoPropietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcesoPropietario() {
        return procesoPropietario;
    }

    /**
     * Define el valor de la propiedad procesoPropietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcesoPropietario(String value) {
        this.procesoPropietario = value;
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
     * Obtiene el valor de la propiedad arquitectura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArquitectura() {
        return arquitectura;
    }

    /**
     * Define el valor de la propiedad arquitectura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArquitectura(String value) {
        this.arquitectura = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoInfraestructura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInfraestructura() {
        return tipoInfraestructura;
    }

    /**
     * Define el valor de la propiedad tipoInfraestructura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInfraestructura(String value) {
        this.tipoInfraestructura = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedorServicioCloud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProveedorServicioCloud() {
        return proveedorServicioCloud;
    }

    /**
     * Define el valor de la propiedad proveedorServicioCloud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProveedorServicioCloud(String value) {
        this.proveedorServicioCloud = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAutenticacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAutenticacion() {
        return tipoAutenticacion;
    }

    /**
     * Define el valor de la propiedad tipoAutenticacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAutenticacion(String value) {
        this.tipoAutenticacion = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecio(BigDecimal value) {
        this.precio = value;
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
