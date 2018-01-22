
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

    private final static QName _GetDataResponse_QNAME = new QName("http://jws.com/", "getDataResponse");
    private final static QName _ManualExtractDataResponse_QNAME = new QName("http://jws.com/", "manualExtractDataResponse");
    private final static QName _GetData_QNAME = new QName("http://jws.com/", "getData");
    private final static QName _ManualExtractData_QNAME = new QName("http://jws.com/", "manualExtractData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link ManualExtractDataResponse }
     * 
     */
    public ManualExtractDataResponse createManualExtractDataResponse() {
        return new ManualExtractDataResponse();
    }

    /**
     * Create an instance of {@link ManualExtractData }
     * 
     */
    public ManualExtractData createManualExtractData() {
        return new ManualExtractData();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "getDataResponse")
    public JAXBElement<GetDataResponse> createGetDataResponse(GetDataResponse value) {
        return new JAXBElement<GetDataResponse>(_GetDataResponse_QNAME, GetDataResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "getData")
    public JAXBElement<GetData> createGetData(GetData value) {
        return new JAXBElement<GetData>(_GetData_QNAME, GetData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManualExtractData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.com/", name = "manualExtractData")
    public JAXBElement<ManualExtractData> createManualExtractData(ManualExtractData value) {
        return new JAXBElement<ManualExtractData>(_ManualExtractData_QNAME, ManualExtractData.class, null, value);
    }

}
