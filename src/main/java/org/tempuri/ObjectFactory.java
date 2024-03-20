
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.businesslogiclayer.BaseRequest;
import org.datacontract.schemas._2004._07.businesslogiclayer.BaseResponse;
import org.datacontract.schemas._2004._07.businesslogiclayer.DocumentReceivedRequest;
import org.datacontract.schemas._2004._07.businesslogiclayer.DocumentRequest;
import org.datacontract.schemas._2004._07.businesslogiclayer.DocumentResponse;
import org.datacontract.schemas._2004._07.businesslogiclayer.GetFileRequest;
import org.datacontract.schemas._2004._07.common.CreateDocumentRequest;
import org.datacontract.schemas._2004._07.common.CreateFileRequest;
import org.datacontract.schemas._2004._07.common.DeleteDocumentRequest;
import org.datacontract.schemas._2004._07.common.DeleteFileRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetDataRequest_QNAME = new QName("http://tempuri.org/", "request");
    private final static QName _GetDataResponseGetDataResult_QNAME = new QName("http://tempuri.org/", "GetDataResult");
    private final static QName _GetDocumentResponseGetDocumentResult_QNAME = new QName("http://tempuri.org/", "GetDocumentResult");
    private final static QName _GetChangesResponseGetChangesResult_QNAME = new QName("http://tempuri.org/", "GetChangesResult");
    private final static QName _DocumentReceivedResponseDocumentReceivedResult_QNAME = new QName("http://tempuri.org/", "DocumentReceivedResult");
    private final static QName _GetFileResponseGetFileResult_QNAME = new QName("http://tempuri.org/", "GetFileResult");
    private final static QName _CreateDocumentReq_QNAME = new QName("http://tempuri.org/", "req");
    private final static QName _CreateDocumentResponseCreateDocumentResult_QNAME = new QName("http://tempuri.org/", "CreateDocumentResult");
    private final static QName _DeleteDocumentResponseDeleteDocumentResult_QNAME = new QName("http://tempuri.org/", "DeleteDocumentResult");
    private final static QName _DeleteFileResponseDeleteFileResult_QNAME = new QName("http://tempuri.org/", "DeleteFileResult");
    private final static QName _CreateFileResponseCreateFileResult_QNAME = new QName("http://tempuri.org/", "CreateFileResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link GetDocument }
     * 
     */
    public GetDocument createGetDocument() {
        return new GetDocument();
    }

    /**
     * Create an instance of {@link GetDocumentResponse }
     * 
     */
    public GetDocumentResponse createGetDocumentResponse() {
        return new GetDocumentResponse();
    }

    /**
     * Create an instance of {@link GetChanges }
     * 
     */
    public GetChanges createGetChanges() {
        return new GetChanges();
    }

    /**
     * Create an instance of {@link org.tempuri.GetChangesResponse }
     * 
     */
    public org.tempuri.GetChangesResponse createGetChangesResponse() {
        return new org.tempuri.GetChangesResponse();
    }

    /**
     * Create an instance of {@link DocumentReceived }
     * 
     */
    public DocumentReceived createDocumentReceived() {
        return new DocumentReceived();
    }

    /**
     * Create an instance of {@link DocumentReceivedResponse }
     * 
     */
    public DocumentReceivedResponse createDocumentReceivedResponse() {
        return new DocumentReceivedResponse();
    }

    /**
     * Create an instance of {@link GetFile }
     * 
     */
    public GetFile createGetFile() {
        return new GetFile();
    }

    /**
     * Create an instance of {@link org.tempuri.GetFileResponse }
     * 
     */
    public org.tempuri.GetFileResponse createGetFileResponse() {
        return new org.tempuri.GetFileResponse();
    }

    /**
     * Create an instance of {@link CreateDocument }
     * 
     */
    public CreateDocument createCreateDocument() {
        return new CreateDocument();
    }

    /**
     * Create an instance of {@link org.tempuri.CreateDocumentResponse }
     * 
     */
    public org.tempuri.CreateDocumentResponse createCreateDocumentResponse() {
        return new org.tempuri.CreateDocumentResponse();
    }

    /**
     * Create an instance of {@link DeleteDocument }
     * 
     */
    public DeleteDocument createDeleteDocument() {
        return new DeleteDocument();
    }

    /**
     * Create an instance of {@link org.tempuri.DeleteDocumentResponse }
     * 
     */
    public org.tempuri.DeleteDocumentResponse createDeleteDocumentResponse() {
        return new org.tempuri.DeleteDocumentResponse();
    }

    /**
     * Create an instance of {@link DeleteFile }
     * 
     */
    public DeleteFile createDeleteFile() {
        return new DeleteFile();
    }

    /**
     * Create an instance of {@link org.tempuri.DeleteFileResponse }
     * 
     */
    public org.tempuri.DeleteFileResponse createDeleteFileResponse() {
        return new org.tempuri.DeleteFileResponse();
    }

    /**
     * Create an instance of {@link CreateFile }
     * 
     */
    public CreateFile createCreateFile() {
        return new CreateFile();
    }

    /**
     * Create an instance of {@link org.tempuri.CreateFileResponse }
     * 
     */
    public org.tempuri.CreateFileResponse createCreateFileResponse() {
        return new org.tempuri.CreateFileResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetData.class)
    public JAXBElement<DocumentRequest> createGetDataRequest(DocumentRequest value) {
        return new JAXBElement<DocumentRequest>(_GetDataRequest_QNAME, DocumentRequest.class, GetData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataResult", scope = GetDataResponse.class)
    public JAXBElement<DocumentResponse> createGetDataResponseGetDataResult(DocumentResponse value) {
        return new JAXBElement<DocumentResponse>(_GetDataResponseGetDataResult_QNAME, DocumentResponse.class, GetDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetDocument.class)
    public JAXBElement<DocumentRequest> createGetDocumentRequest(DocumentRequest value) {
        return new JAXBElement<DocumentRequest>(_GetDataRequest_QNAME, DocumentRequest.class, GetDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDocumentResult", scope = GetDocumentResponse.class)
    public JAXBElement<DocumentResponse> createGetDocumentResponseGetDocumentResult(DocumentResponse value) {
        return new JAXBElement<DocumentResponse>(_GetDocumentResponseGetDocumentResult_QNAME, DocumentResponse.class, GetDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetChanges.class)
    public JAXBElement<BaseRequest> createGetChangesRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_GetDataRequest_QNAME, BaseRequest.class, GetChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.GetChangesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.GetChangesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetChangesResult", scope = org.tempuri.GetChangesResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.common.GetChangesResponse> createGetChangesResponseGetChangesResult(org.datacontract.schemas._2004._07.common.GetChangesResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.common.GetChangesResponse>(_GetChangesResponseGetChangesResult_QNAME, org.datacontract.schemas._2004._07.common.GetChangesResponse.class, org.tempuri.GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReceivedRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentReceivedRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = DocumentReceived.class)
    public JAXBElement<DocumentReceivedRequest> createDocumentReceivedRequest(DocumentReceivedRequest value) {
        return new JAXBElement<DocumentReceivedRequest>(_GetDataRequest_QNAME, DocumentReceivedRequest.class, DocumentReceived.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DocumentReceivedResult", scope = DocumentReceivedResponse.class)
    public JAXBElement<BaseResponse> createDocumentReceivedResponseDocumentReceivedResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_DocumentReceivedResponseDocumentReceivedResult_QNAME, BaseResponse.class, DocumentReceivedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFileRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetFile.class)
    public JAXBElement<GetFileRequest> createGetFileRequest(GetFileRequest value) {
        return new JAXBElement<GetFileRequest>(_GetDataRequest_QNAME, GetFileRequest.class, GetFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.businesslogiclayer.GetFileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.businesslogiclayer.GetFileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFileResult", scope = org.tempuri.GetFileResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.businesslogiclayer.GetFileResponse> createGetFileResponseGetFileResult(org.datacontract.schemas._2004._07.businesslogiclayer.GetFileResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.businesslogiclayer.GetFileResponse>(_GetFileResponseGetFileResult_QNAME, org.datacontract.schemas._2004._07.businesslogiclayer.GetFileResponse.class, org.tempuri.GetFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = CreateDocument.class)
    public JAXBElement<CreateDocumentRequest> createCreateDocumentReq(CreateDocumentRequest value) {
        return new JAXBElement<CreateDocumentRequest>(_CreateDocumentReq_QNAME, CreateDocumentRequest.class, CreateDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.businesslogiclayer.CreateDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.businesslogiclayer.CreateDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreateDocumentResult", scope = org.tempuri.CreateDocumentResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.businesslogiclayer.CreateDocumentResponse> createCreateDocumentResponseCreateDocumentResult(org.datacontract.schemas._2004._07.businesslogiclayer.CreateDocumentResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.businesslogiclayer.CreateDocumentResponse>(_CreateDocumentResponseCreateDocumentResult_QNAME, org.datacontract.schemas._2004._07.businesslogiclayer.CreateDocumentResponse.class, org.tempuri.CreateDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = DeleteDocument.class)
    public JAXBElement<DeleteDocumentRequest> createDeleteDocumentReq(DeleteDocumentRequest value) {
        return new JAXBElement<DeleteDocumentRequest>(_CreateDocumentReq_QNAME, DeleteDocumentRequest.class, DeleteDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.DeleteDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.DeleteDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeleteDocumentResult", scope = org.tempuri.DeleteDocumentResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.common.DeleteDocumentResponse> createDeleteDocumentResponseDeleteDocumentResult(org.datacontract.schemas._2004._07.common.DeleteDocumentResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.common.DeleteDocumentResponse>(_DeleteDocumentResponseDeleteDocumentResult_QNAME, org.datacontract.schemas._2004._07.common.DeleteDocumentResponse.class, org.tempuri.DeleteDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFileRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteFileRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = DeleteFile.class)
    public JAXBElement<DeleteFileRequest> createDeleteFileReq(DeleteFileRequest value) {
        return new JAXBElement<DeleteFileRequest>(_CreateDocumentReq_QNAME, DeleteFileRequest.class, DeleteFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.DeleteFileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.DeleteFileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeleteFileResult", scope = org.tempuri.DeleteFileResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.common.DeleteFileResponse> createDeleteFileResponseDeleteFileResult(org.datacontract.schemas._2004._07.common.DeleteFileResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.common.DeleteFileResponse>(_DeleteFileResponseDeleteFileResult_QNAME, org.datacontract.schemas._2004._07.common.DeleteFileResponse.class, org.tempuri.DeleteFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFileRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateFileRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "req", scope = CreateFile.class)
    public JAXBElement<CreateFileRequest> createCreateFileReq(CreateFileRequest value) {
        return new JAXBElement<CreateFileRequest>(_CreateDocumentReq_QNAME, CreateFileRequest.class, CreateFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.CreateFileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.common.CreateFileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreateFileResult", scope = org.tempuri.CreateFileResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.common.CreateFileResponse> createCreateFileResponseCreateFileResult(org.datacontract.schemas._2004._07.common.CreateFileResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.common.CreateFileResponse>(_CreateFileResponseCreateFileResult_QNAME, org.datacontract.schemas._2004._07.common.CreateFileResponse.class, org.tempuri.CreateFileResponse.class, value);
    }

}
