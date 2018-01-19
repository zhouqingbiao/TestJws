
package com.jws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jws package. 
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

    private final static QName _ManualExtractDataResponse_QNAME = new QName("http://jws.com/", "manualExtractDataResponse");
    private final static QName _SelectHzGisTpsFwWithColumnName_QNAME = new QName("http://jws.com/", "selectHzGisTpsFwWithColumnName");
    private final static QName _SelectHzFwdjTpfJcdjbResponse_QNAME = new QName("http://jws.com/", "selectHzFwdjTpfJcdjbResponse");
    private final static QName _SelectHzGisTpsFw_QNAME = new QName("http://jws.com/", "selectHzGisTpsFw");
    private final static QName _SelectHzGisTpsFwResponse_QNAME = new QName("http://jws.com/", "selectHzGisTpsFwResponse");
    private final static QName _SelectHzGisTpsFwWithColumnNameAndCheckResponse_QNAME = new QName("http://jws.com/", "selectHzGisTpsFwWithColumnNameAndCheckResponse");
    private final static QName _SelectHzGisTpsFwWithColumnNameAndCheck_QNAME = new QName("http://jws.com/", "selectHzGisTpsFwWithColumnNameAndCheck");
    private final static QName _ManualExtractData_QNAME = new QName("http://jws.com/", "manualExtractData");
    private final static QName _SelectHzGisTpsZrz_QNAME = new QName("http://jws.com/", "SelectHzGisTpsZrz");
    private final static QName _SelectHzFwdjTpfJcdjb_QNAME = new QName("http://jws.com/", "selectHzFwdjTpfJcdjb");
    private final static QName _SelectHzGisTpsFwWithColumnNameResponse_QNAME = new QName("http://jws.com/", "selectHzGisTpsFwWithColumnNameResponse");
    private final static QName _SelectHzGisTpsZrzResponse_QNAME = new QName("http://jws.com/", "SelectHzGisTpsZrzResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelectHzGisTpsFw }
     * 
     */
    public SelectHzGisTpsFw createSelectHzGisTpsFw() {
        return new SelectHzGisTpsFw();
    }

    /**
     * Create an instance of {@link ManualExtractDataResponse }
     * 
     */
    public ManualExtractDataResponse createManualExtractDataResponse() {
        return new ManualExtractDataResponse();
    }

    /**
     * Create an instance of {@link SelectHzGisTpsFwWithColumnName }
     * 
     */
    public SelectHzGisTpsFwWithColumnName createSelectHzGisTpsFwWithColumnName() {
        return new SelectHzGisTpsFwWithColumnName();
    }

    /**
     * Create an instance of {@link SelectHzFwdjTpfJcdjbResponse }
     * 
     */
    public SelectHzFwdjTpfJcdjbResponse createSelectHzFwdjTpfJcdjbResponse() {
        return new SelectHzFwdjTpfJcdjbResponse();
    }

    /**
     * Create an instance of {@link ManualExtractData }
     * 
     */
    public ManualExtractData createManualExtractData() {
        return new ManualExtractData();
    }

    /**
     * Create an instance of {@link SelectHzGisTpsZrz }
     * 
     */
    public SelectHzGisTpsZrz createSelectHzGisTpsZrz() {
        return new SelectHzGisTpsZrz();
    }

    /**
     * Create an instance of {@link SelectHzFwdjTpfJcdjb }
     * 
     */
    public SelectHzFwdjTpfJcdjb createSelectHzFwdjTpfJcdjb() {
        return new SelectHzFwdjTpfJcdjb();
    }

    /**
     * Create an instance of {@link SelectHzGisTpsFwWithColumnNameResponse }
     * 
     */
    public SelectHzGisTpsFwWithColumnNameResponse createSelectHzGisTpsFwWithColumnNameResponse() {
        return new SelectHzGisTpsFwWithColumnNameResponse();
    }

    /**
     * Create an instance of {@link SelectHzGisTpsZrzResponse }
     * 
     */
    public SelectHzGisTpsZrzResponse createSelectHzGisTpsZrzResponse() {
        return new SelectHzGisTpsZrzResponse();
    }

    /**
     * Create an instance of {@link SelectHzGisTpsFwResponse }
     * 
     */
    public SelectHzGisTpsFwResponse createSelectHzGisTpsFwResponse() {
        return new SelectHzGisTpsFwResponse();
    }

    /**
     * Create an instance of {@link SelectHzGisTpsFwWithColumnNameAndCheckResponse }
     * 
     */
    public SelectHzGisTpsFwWithColumnNameAndCheckResponse createSelectHzGisTpsFwWithColumnNameAndCheckResponse() {
        return new SelectHzGisTpsFwWithColumnNameAndCheckResponse();
    }

    /**
     * Create an instance of {@link SelectHzGisTpsFwWithColumnNameAndCheck }
     * 
     */
    public SelectHzGisTpsFwWithColumnNameAndCheck createSelectHzGisTpsFwWithColumnNameAndCheck() {
        return new SelectHzGisTpsFwWithColumnNameAndCheck();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManualExtractDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "manualExtractDataResponse")
    public JAXBElement<ManualExtractDataResponse> createManualExtractDataResponse(ManualExtractDataResponse value) {
        return new JAXBElement<ManualExtractDataResponse>(_ManualExtractDataResponse_QNAME, ManualExtractDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectHzGisTpsFwWithColumnName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "selectHzGisTpsFwWithColumnName")
    public JAXBElement<SelectHzGisTpsFwWithColumnName> createSelectHzGisTpsFwWithColumnName(SelectHzGisTpsFwWithColumnName value) {
        return new JAXBElement<SelectHzGisTpsFwWithColumnName>(_SelectHzGisTpsFwWithColumnName_QNAME, SelectHzGisTpsFwWithColumnName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectHzFwdjTpfJcdjbResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "selectHzFwdjTpfJcdjbResponse")
    public JAXBElement<SelectHzFwdjTpfJcdjbResponse> createSelectHzFwdjTpfJcdjbResponse(SelectHzFwdjTpfJcdjbResponse value) {
        return new JAXBElement<SelectHzFwdjTpfJcdjbResponse>(_SelectHzFwdjTpfJcdjbResponse_QNAME, SelectHzFwdjTpfJcdjbResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectHzGisTpsFw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "selectHzGisTpsFw")
    public JAXBElement<SelectHzGisTpsFw> createSelectHzGisTpsFw(SelectHzGisTpsFw value) {
        return new JAXBElement<SelectHzGisTpsFw>(_SelectHzGisTpsFw_QNAME, SelectHzGisTpsFw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectHzGisTpsFwResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "selectHzGisTpsFwResponse")
    public JAXBElement<SelectHzGisTpsFwResponse> createSelectHzGisTpsFwResponse(SelectHzGisTpsFwResponse value) {
        return new JAXBElement<SelectHzGisTpsFwResponse>(_SelectHzGisTpsFwResponse_QNAME, SelectHzGisTpsFwResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectHzGisTpsFwWithColumnNameAndCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "selectHzGisTpsFwWithColumnNameAndCheckResponse")
    public JAXBElement<SelectHzGisTpsFwWithColumnNameAndCheckResponse> createSelectHzGisTpsFwWithColumnNameAndCheckResponse(SelectHzGisTpsFwWithColumnNameAndCheckResponse value) {
        return new JAXBElement<SelectHzGisTpsFwWithColumnNameAndCheckResponse>(_SelectHzGisTpsFwWithColumnNameAndCheckResponse_QNAME, SelectHzGisTpsFwWithColumnNameAndCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectHzGisTpsFwWithColumnNameAndCheck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "selectHzGisTpsFwWithColumnNameAndCheck")
    public JAXBElement<SelectHzGisTpsFwWithColumnNameAndCheck> createSelectHzGisTpsFwWithColumnNameAndCheck(SelectHzGisTpsFwWithColumnNameAndCheck value) {
        return new JAXBElement<SelectHzGisTpsFwWithColumnNameAndCheck>(_SelectHzGisTpsFwWithColumnNameAndCheck_QNAME, SelectHzGisTpsFwWithColumnNameAndCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManualExtractData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "manualExtractData")
    public JAXBElement<ManualExtractData> createManualExtractData(ManualExtractData value) {
        return new JAXBElement<ManualExtractData>(_ManualExtractData_QNAME, ManualExtractData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectHzGisTpsZrz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "SelectHzGisTpsZrz")
    public JAXBElement<SelectHzGisTpsZrz> createSelectHzGisTpsZrz(SelectHzGisTpsZrz value) {
        return new JAXBElement<SelectHzGisTpsZrz>(_SelectHzGisTpsZrz_QNAME, SelectHzGisTpsZrz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectHzFwdjTpfJcdjb }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "selectHzFwdjTpfJcdjb")
    public JAXBElement<SelectHzFwdjTpfJcdjb> createSelectHzFwdjTpfJcdjb(SelectHzFwdjTpfJcdjb value) {
        return new JAXBElement<SelectHzFwdjTpfJcdjb>(_SelectHzFwdjTpfJcdjb_QNAME, SelectHzFwdjTpfJcdjb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectHzGisTpsFwWithColumnNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "selectHzGisTpsFwWithColumnNameResponse")
    public JAXBElement<SelectHzGisTpsFwWithColumnNameResponse> createSelectHzGisTpsFwWithColumnNameResponse(SelectHzGisTpsFwWithColumnNameResponse value) {
        return new JAXBElement<SelectHzGisTpsFwWithColumnNameResponse>(_SelectHzGisTpsFwWithColumnNameResponse_QNAME, SelectHzGisTpsFwWithColumnNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectHzGisTpsZrzResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "SelectHzGisTpsZrzResponse")
    public JAXBElement<SelectHzGisTpsZrzResponse> createSelectHzGisTpsZrzResponse(SelectHzGisTpsZrzResponse value) {
        return new JAXBElement<SelectHzGisTpsZrzResponse>(_SelectHzGisTpsZrzResponse_QNAME, SelectHzGisTpsZrzResponse.class, null, value);
    }

}
