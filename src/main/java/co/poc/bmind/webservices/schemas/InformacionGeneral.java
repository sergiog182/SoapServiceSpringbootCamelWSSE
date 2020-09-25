
package co.poc.bmind.webservices.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InformacionGeneral complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InformacionGeneral"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fabricante" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reemplazaraA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reemplazadaPor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaActivacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaDesactivacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="areaPropietaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="procesoPropietario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="arquitectura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoInfraestructura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="proveedorServicioCloud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoAutenticacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precioUSD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precioEUR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionGeneral", propOrder = {
    "id",
    "nombre",
    "tipo",
    "descripcion",
    "version",
    "fabricante",
    "reemplazaraA",
    "reemplazadaPor",
    "estado",
    "activa",
    "fechaActivacion",
    "fechaDesactivacion",
    "areaPropietaria",
    "procesoPropietario",
    "arquitectura",
    "tipoInfraestructura",
    "proveedorServicioCloud",
    "tipoAutenticacion",
    "precio",
    "precioUSD",
    "precioEUR"
})
public class InformacionGeneral {

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
    protected String reemplazaraA;
    @XmlElement(required = true)
    protected String reemplazadaPor;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String activa;
    @XmlElement(required = true)
    protected String fechaActivacion;
    @XmlElement(required = true)
    protected String fechaDesactivacion;
    @XmlElement(required = true)
    protected String areaPropietaria;
    @XmlElement(required = true)
    protected String procesoPropietario;
    @XmlElement(required = true)
    protected String arquitectura;
    @XmlElement(required = true)
    protected String tipoInfraestructura;
    @XmlElement(required = true)
    protected String proveedorServicioCloud;
    @XmlElement(required = true)
    protected String tipoAutenticacion;
    @XmlElement(required = true)
    protected String precio;
    @XmlElement(required = true)
    protected String precioUSD;
    @XmlElement(required = true)
    protected String precioEUR;

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
     * Obtiene el valor de la propiedad reemplazaraA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReemplazaraA() {
        return reemplazaraA;
    }

    /**
     * Define el valor de la propiedad reemplazaraA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReemplazaraA(String value) {
        this.reemplazaraA = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiva() {
        return activa;
    }

    /**
     * Define el valor de la propiedad activa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiva(String value) {
        this.activa = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActivacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaActivacion() {
        return fechaActivacion;
    }

    /**
     * Define el valor de la propiedad fechaActivacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaActivacion(String value) {
        this.fechaActivacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesactivacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesactivacion() {
        return fechaDesactivacion;
    }

    /**
     * Define el valor de la propiedad fechaDesactivacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesactivacion(String value) {
        this.fechaDesactivacion = value;
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
     *     {@link String }
     *     
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecio(String value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUSD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioUSD() {
        return precioUSD;
    }

    /**
     * Define el valor de la propiedad precioUSD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioUSD(String value) {
        this.precioUSD = value;
    }

    /**
     * Obtiene el valor de la propiedad precioEUR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioEUR() {
        return precioEUR;
    }

    /**
     * Define el valor de la propiedad precioEUR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioEUR(String value) {
        this.precioEUR = value;
    }

}
