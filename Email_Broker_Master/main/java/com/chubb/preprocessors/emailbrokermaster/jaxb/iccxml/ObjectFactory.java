//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.20 at 07:29:42 AM BST 
//


package com.chubb.preprocessors.emailbrokermaster.jaxb.iccxml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.chubb.preprocessors.emailbrkermaster.jaxb.iccxml package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DocTypeCode_QNAME = new QName("", "doc_type_code");
    private final static QName _AIN_QNAME = new QName("", "AIN");
    private final static QName _FileNumber_QNAME = new QName("", "FileNumber");
    private final static QName _FileTypeCode_QNAME = new QName("", "file_type_code");
    private final static QName _WorkBasketCode_QNAME = new QName("", "WorkBasket_Code");
    private final static QName _IngestionMethod_QNAME = new QName("", "IngestionMethod");
    private final static QName _CertName_QNAME = new QName("", "cert_name");
    private final static QName _FromMailAddress_QNAME = new QName("", "FromMailAddress");
    private final static QName _ErrorQueue_QNAME = new QName("", "Error_Queue");
    private final static QName _DocProducer_QNAME = new QName("", "doc_producer");
    private final static QName _CertNumber_QNAME = new QName("", "cert_number");
    private final static QName _Otherref_QNAME = new QName("", "Otherref");
    private final static QName _PolNumber_QNAME = new QName("", "pol_number");
    private final static QName _ErrorFlag_QNAME = new QName("", "Error_flag");
    private final static QName _DocDescription_QNAME = new QName("", "doc_description");
    private final static QName _ScanInfo_QNAME = new QName("", "scan_info");
    private final static QName _FolderTypeCode_QNAME = new QName("", "folder_type_code");
    private final static QName _PackageID_QNAME = new QName("", "PackageID");
    private final static QName _CtryCode_QNAME = new QName("", "ctry_code");
    private final static QName _EntityType_QNAME = new QName("", "Entity_Type");
    private final static QName _IsParent_QNAME = new QName("", "IsParent");
    private final static QName _Subject_QNAME = new QName("", "Subject");
    private final static QName _EntCode_QNAME = new QName("", "ent_code");
    private final static QName _GfNumber_QNAME = new QName("", "gf_number");
    private final static QName _Docdate_QNAME = new QName("", "Docdate");
    private final static QName _QuoteNumber_QNAME = new QName("", "quote_number");
    private final static QName _Scandate_QNAME = new QName("", "scandate");
    private final static QName _ActionedDate_QNAME = new QName("", "actioned_date");
    private final static QName _Scantime_QNAME = new QName("", "scantime");
    private final static QName _ToMailAddress_QNAME = new QName("", "ToMailAddress");
    private final static QName _BpuCode_QNAME = new QName("", "bpu_code");
    private final static QName _FileName_QNAME = new QName("", "FileName");
    private final static QName _ClNumber_QNAME = new QName("", "cl_number");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chubb.preprocessors.emailbrkermaster.jaxb.iccxml
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScannedImage }
     */
    public ScannedImage createScannedImage() {
        return new ScannedImage();
    }

    /**
     * Create an instance of {@link EmailMetadata }
     */
    public EmailMetadata createEmailMetadata() {
        return new EmailMetadata();
    }

    /**
     * Create an instance of {@link WorkbasketData }
     */
    public WorkbasketData createWorkbasketData() {
        return new WorkbasketData();
    }

    /**
     * Create an instance of {@link Index }
     */
    public Index createIndex() {
        return new Index();
    }

    /**
     * Create an instance of {@link Document }
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "doc_type_code")
    public JAXBElement<String> createDocTypeCode(String value) {
        return new JAXBElement<String>(_DocTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "AIN")
    public JAXBElement<String> createAIN(String value) {
        return new JAXBElement<String>(_AIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "FileNumber")
    public JAXBElement<String> createFileNumber(String value) {
        return new JAXBElement<String>(_FileNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "file_type_code")
    public JAXBElement<String> createFileTypeCode(String value) {
        return new JAXBElement<String>(_FileTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "WorkBasket_Code")
    public JAXBElement<String> createWorkBasketCode(String value) {
        return new JAXBElement<String>(_WorkBasketCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "IngestionMethod")
    public JAXBElement<String> createIngestionMethod(String value) {
        return new JAXBElement<String>(_IngestionMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "cert_name")
    public JAXBElement<String> createCertName(String value) {
        return new JAXBElement<String>(_CertName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "FromMailAddress")
    public JAXBElement<String> createFromMailAddress(String value) {
        return new JAXBElement<String>(_FromMailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "Error_Queue")
    public JAXBElement<String> createErrorQueue(String value) {
        return new JAXBElement<String>(_ErrorQueue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "doc_producer")
    public JAXBElement<String> createDocProducer(String value) {
        return new JAXBElement<String>(_DocProducer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "cert_number")
    public JAXBElement<String> createCertNumber(String value) {
        return new JAXBElement<String>(_CertNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "Otherref")
    public JAXBElement<String> createOtherref(String value) {
        return new JAXBElement<String>(_Otherref_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "pol_number")
    public JAXBElement<String> createPolNumber(String value) {
        return new JAXBElement<String>(_PolNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "Error_flag")
    public JAXBElement<String> createErrorFlag(String value) {
        return new JAXBElement<String>(_ErrorFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "doc_description")
    public JAXBElement<String> createDocDescription(String value) {
        return new JAXBElement<String>(_DocDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "scan_info")
    public JAXBElement<String> createScanInfo(String value) {
        return new JAXBElement<String>(_ScanInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "folder_type_code")
    public JAXBElement<String> createFolderTypeCode(String value) {
        return new JAXBElement<String>(_FolderTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "PackageID")
    public JAXBElement<String> createPackageID(String value) {
        return new JAXBElement<String>(_PackageID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "ctry_code")
    public JAXBElement<String> createCtryCode(String value) {
        return new JAXBElement<String>(_CtryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "Entity_Type")
    public JAXBElement<String> createEntityType(String value) {
        return new JAXBElement<String>(_EntityType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "IsParent")
    public JAXBElement<Boolean> createIsParent(Boolean value) {
        return new JAXBElement<Boolean>(_IsParent_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "Subject")
    public JAXBElement<String> createSubject(String value) {
        return new JAXBElement<String>(_Subject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "ent_code")
    public JAXBElement<String> createEntCode(String value) {
        return new JAXBElement<String>(_EntCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "gf_number")
    public JAXBElement<String> createGfNumber(String value) {
        return new JAXBElement<String>(_GfNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "Docdate")
    public JAXBElement<String> createDocdate(String value) {
        return new JAXBElement<String>(_Docdate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "quote_number")
    public JAXBElement<String> createQuoteNumber(String value) {
        return new JAXBElement<String>(_QuoteNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "scandate")
    public JAXBElement<String> createScandate(String value) {
        return new JAXBElement<String>(_Scandate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "actioned_date")
    public JAXBElement<String> createActionedDate(String value) {
        return new JAXBElement<String>(_ActionedDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "scantime")
    public JAXBElement<String> createScantime(String value) {
        return new JAXBElement<String>(_Scantime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "ToMailAddress")
    public JAXBElement<String> createToMailAddress(String value) {
        return new JAXBElement<String>(_ToMailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "bpu_code")
    public JAXBElement<String> createBpuCode(String value) {
        return new JAXBElement<String>(_BpuCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "FileName")
    public JAXBElement<String> createFileName(String value) {
        return new JAXBElement<String>(_FileName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "cl_number")
    public JAXBElement<String> createClNumber(String value) {
        return new JAXBElement<String>(_ClNumber_QNAME, String.class, null, value);
    }

}
