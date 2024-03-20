
package org.datacontract.schemas._2004._07.businesslogiclayer;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.businesslogiclayer package. 
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

    private final static QName _DocumentRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "DocumentRequest");
    private final static QName _BaseRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "BaseRequest");
    private final static QName _DocumentResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "DocumentResponse");
    private final static QName _BaseResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "BaseResponse");
    private final static QName _ArrayOfDocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "ArrayOfDocument");
    private final static QName _Document_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "Document");
    private final static QName _ArrayOfDocumentLink_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "ArrayOfDocumentLink");
    private final static QName _DocumentLink_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "DocumentLink");
    private final static QName _ResponseStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "ResponseStatus");
    private final static QName _DocumentReceivedRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "DocumentReceivedRequest");
    private final static QName _GetFileRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "GetFileRequest");
    private final static QName _GetFileResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "GetFileResponse");
    private final static QName _CreateDocumentResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "CreateDocumentResponse");
    private final static QName _DocumentLinkDESC_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "DESC");
    private final static QName _DocumentLinkFILENAME_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "FILE_NAME");
    private final static QName _DocumentLinkIDFILE_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "ID_FILE");
    private final static QName _DocumentLinkSIG_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "SIG");
    private final static QName _DocumentXML_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "XML");
    private final static QName _DocumentLinkList_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "linkList");
    private final static QName _BaseResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "message");
    private final static QName _CreateDocumentResponseDocumentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "documentId");
    private final static QName _CreateDocumentResponseFilesId_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "filesId");
    private final static QName _GetFileResponseIDDOC_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "ID_DOC");
    private final static QName _GetFileResponseFileBytes_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "fileBytes");
    private final static QName _GetFileResponseFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "fileName");
    private final static QName _GetFileResponseFileSig_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "fileSig");
    private final static QName _DocumentResponseDocumentsList_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "documentsList");
    private final static QName _DocumentResponseText_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "text");
    private final static QName _DocumentRequestCADNUM_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "CADNUM");
    private final static QName _DocumentRequestDATAREGIS_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "DATA_REGIS");
    private final static QName _DocumentRequestREGISTRN_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "REGISTR_N");
    private final static QName _DocumentRequestTYPEDOCUMENT_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "TYPE_DOCUMENT");
    private final static QName _DocumentRequestUNOM_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "UNOM");
    private final static QName _DocumentRequestUSLNUM_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", "USLNUM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.businesslogiclayer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link DocumentRequest }
     * 
     */
    public DocumentRequest createDocumentRequest() {
        return new DocumentRequest();
    }

    /**
     * Create an instance of {@link DocumentResponse }
     * 
     */
    public DocumentResponse createDocumentResponse() {
        return new DocumentResponse();
    }

    /**
     * Create an instance of {@link BaseRequest }
     * 
     */
    public BaseRequest createBaseRequest() {
        return new BaseRequest();
    }

    /**
     * Create an instance of {@link DocumentReceivedRequest }
     * 
     */
    public DocumentReceivedRequest createDocumentReceivedRequest() {
        return new DocumentReceivedRequest();
    }

    /**
     * Create an instance of {@link BaseResponse }
     * 
     */
    public BaseResponse createBaseResponse() {
        return new BaseResponse();
    }

    /**
     * Create an instance of {@link GetFileRequest }
     * 
     */
    public GetFileRequest createGetFileRequest() {
        return new GetFileRequest();
    }

    /**
     * Create an instance of {@link GetFileResponse }
     * 
     */
    public GetFileResponse createGetFileResponse() {
        return new GetFileResponse();
    }

    /**
     * Create an instance of {@link CreateDocumentResponse }
     * 
     */
    public CreateDocumentResponse createCreateDocumentResponse() {
        return new CreateDocumentResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDocument }
     * 
     */
    public ArrayOfDocument createArrayOfDocument() {
        return new ArrayOfDocument();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentLink }
     * 
     */
    public ArrayOfDocumentLink createArrayOfDocumentLink() {
        return new ArrayOfDocumentLink();
    }

    /**
     * Create an instance of {@link DocumentLink }
     * 
     */
    public DocumentLink createDocumentLink() {
        return new DocumentLink();
    }

    /**
     * Create an instance of {@link Document.XML }
     * 
     */
    public Document.XML createDocumentXML() {
        return new Document.XML();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "DocumentRequest")
    public JAXBElement<DocumentRequest> createDocumentRequest(DocumentRequest value) {
        return new JAXBElement<DocumentRequest>(_DocumentRequest_QNAME, DocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "BaseRequest")
    public JAXBElement<BaseRequest> createBaseRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_BaseRequest_QNAME, BaseRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "DocumentResponse")
    public JAXBElement<DocumentResponse> createDocumentResponse(DocumentResponse value) {
        return new JAXBElement<DocumentResponse>(_DocumentResponse_QNAME, DocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "BaseResponse")
    public JAXBElement<BaseResponse> createBaseResponse(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_BaseResponse_QNAME, BaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "ArrayOfDocument")
    public JAXBElement<ArrayOfDocument> createArrayOfDocument(ArrayOfDocument value) {
        return new JAXBElement<ArrayOfDocument>(_ArrayOfDocument_QNAME, ArrayOfDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentLink }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentLink }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "ArrayOfDocumentLink")
    public JAXBElement<ArrayOfDocumentLink> createArrayOfDocumentLink(ArrayOfDocumentLink value) {
        return new JAXBElement<ArrayOfDocumentLink>(_ArrayOfDocumentLink_QNAME, ArrayOfDocumentLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentLink }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentLink }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "DocumentLink")
    public JAXBElement<DocumentLink> createDocumentLink(DocumentLink value) {
        return new JAXBElement<DocumentLink>(_DocumentLink_QNAME, DocumentLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "ResponseStatus")
    public JAXBElement<ResponseStatus> createResponseStatus(ResponseStatus value) {
        return new JAXBElement<ResponseStatus>(_ResponseStatus_QNAME, ResponseStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReceivedRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentReceivedRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "DocumentReceivedRequest")
    public JAXBElement<DocumentReceivedRequest> createDocumentReceivedRequest(DocumentReceivedRequest value) {
        return new JAXBElement<DocumentReceivedRequest>(_DocumentReceivedRequest_QNAME, DocumentReceivedRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFileRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "GetFileRequest")
    public JAXBElement<GetFileRequest> createGetFileRequest(GetFileRequest value) {
        return new JAXBElement<GetFileRequest>(_GetFileRequest_QNAME, GetFileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "GetFileResponse")
    public JAXBElement<GetFileResponse> createGetFileResponse(GetFileResponse value) {
        return new JAXBElement<GetFileResponse>(_GetFileResponse_QNAME, GetFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "CreateDocumentResponse")
    public JAXBElement<CreateDocumentResponse> createCreateDocumentResponse(CreateDocumentResponse value) {
        return new JAXBElement<CreateDocumentResponse>(_CreateDocumentResponse_QNAME, CreateDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "DESC", scope = DocumentLink.class)
    public JAXBElement<String> createDocumentLinkDESC(String value) {
        return new JAXBElement<String>(_DocumentLinkDESC_QNAME, String.class, DocumentLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "FILE_NAME", scope = DocumentLink.class)
    public JAXBElement<String> createDocumentLinkFILENAME(String value) {
        return new JAXBElement<String>(_DocumentLinkFILENAME_QNAME, String.class, DocumentLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "ID_FILE", scope = DocumentLink.class)
    public JAXBElement<BigDecimal> createDocumentLinkIDFILE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DocumentLinkIDFILE_QNAME, BigDecimal.class, DocumentLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "SIG", scope = DocumentLink.class)
    public JAXBElement<byte[]> createDocumentLinkSIG(byte[] value) {
        return new JAXBElement<byte[]>(_DocumentLinkSIG_QNAME, byte[].class, DocumentLink.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document.XML }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document.XML }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "XML", scope = Document.class)
    public JAXBElement<Document.XML> createDocumentXML(Document.XML value) {
        return new JAXBElement<Document.XML>(_DocumentXML_QNAME, Document.XML.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentLink }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentLink }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "linkList", scope = Document.class)
    public JAXBElement<ArrayOfDocumentLink> createDocumentLinkList(ArrayOfDocumentLink value) {
        return new JAXBElement<ArrayOfDocumentLink>(_DocumentLinkList_QNAME, ArrayOfDocumentLink.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "message", scope = BaseResponse.class)
    public JAXBElement<String> createBaseResponseMessage(String value) {
        return new JAXBElement<String>(_BaseResponseMessage_QNAME, String.class, BaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "documentId", scope = CreateDocumentResponse.class)
    public JAXBElement<Long> createCreateDocumentResponseDocumentId(Long value) {
        return new JAXBElement<Long>(_CreateDocumentResponseDocumentId_QNAME, Long.class, CreateDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "filesId", scope = CreateDocumentResponse.class)
    public JAXBElement<ArrayOfint> createCreateDocumentResponseFilesId(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_CreateDocumentResponseFilesId_QNAME, ArrayOfint.class, CreateDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "ID_DOC", scope = GetFileResponse.class)
    public JAXBElement<Integer> createGetFileResponseIDDOC(Integer value) {
        return new JAXBElement<Integer>(_GetFileResponseIDDOC_QNAME, Integer.class, GetFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "ID_FILE", scope = GetFileResponse.class)
    public JAXBElement<Integer> createGetFileResponseIDFILE(Integer value) {
        return new JAXBElement<Integer>(_DocumentLinkIDFILE_QNAME, Integer.class, GetFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "fileBytes", scope = GetFileResponse.class)
    public JAXBElement<byte[]> createGetFileResponseFileBytes(byte[] value) {
        return new JAXBElement<byte[]>(_GetFileResponseFileBytes_QNAME, byte[].class, GetFileResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "fileName", scope = GetFileResponse.class)
    public JAXBElement<String> createGetFileResponseFileName(String value) {
        return new JAXBElement<String>(_GetFileResponseFileName_QNAME, String.class, GetFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "fileSig", scope = GetFileResponse.class)
    public JAXBElement<byte[]> createGetFileResponseFileSig(byte[] value) {
        return new JAXBElement<byte[]>(_GetFileResponseFileSig_QNAME, byte[].class, GetFileResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "documentsList", scope = DocumentResponse.class)
    public JAXBElement<ArrayOfDocument> createDocumentResponseDocumentsList(ArrayOfDocument value) {
        return new JAXBElement<ArrayOfDocument>(_DocumentResponseDocumentsList_QNAME, ArrayOfDocument.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "text", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseText(String value) {
        return new JAXBElement<String>(_DocumentResponseText_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "CADNUM", scope = DocumentRequest.class)
    public JAXBElement<String> createDocumentRequestCADNUM(String value) {
        return new JAXBElement<String>(_DocumentRequestCADNUM_QNAME, String.class, DocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "DATA_REGIS", scope = DocumentRequest.class)
    public JAXBElement<String> createDocumentRequestDATAREGIS(String value) {
        return new JAXBElement<String>(_DocumentRequestDATAREGIS_QNAME, String.class, DocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "REGISTR_N", scope = DocumentRequest.class)
    public JAXBElement<String> createDocumentRequestREGISTRN(String value) {
        return new JAXBElement<String>(_DocumentRequestREGISTRN_QNAME, String.class, DocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "TYPE_DOCUMENT", scope = DocumentRequest.class)
    public JAXBElement<String> createDocumentRequestTYPEDOCUMENT(String value) {
        return new JAXBElement<String>(_DocumentRequestTYPEDOCUMENT_QNAME, String.class, DocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "UNOM", scope = DocumentRequest.class)
    public JAXBElement<String> createDocumentRequestUNOM(String value) {
        return new JAXBElement<String>(_DocumentRequestUNOM_QNAME, String.class, DocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessLogicLayer.BRRemoteService", name = "USLNUM", scope = DocumentRequest.class)
    public JAXBElement<String> createDocumentRequestUSLNUM(String value) {
        return new JAXBElement<String>(_DocumentRequestUSLNUM_QNAME, String.class, DocumentRequest.class, value);
    }

}
