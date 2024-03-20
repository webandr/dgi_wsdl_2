
package org.datacontract.schemas._2004._07.common;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.common package. 
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

    private final static QName _GetChangesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "GetChangesResponse");
    private final static QName _ArrayOfResponseCID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ArrayOfResponseCID");
    private final static QName _ResponseCID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ResponseCID");
    private final static QName _ArrayOfResponseFiles_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ArrayOfResponseFiles");
    private final static QName _ResponseFiles_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ResponseFiles");
    private final static QName _ArrayOfResponseObject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ArrayOfResponseObject");
    private final static QName _ResponseObject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ResponseObject");
    private final static QName _ArrayOfResponseSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ArrayOfResponseSubject");
    private final static QName _ResponseSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ResponseSubject");
    private final static QName _CreateDocumentRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "CreateDocumentRequest");
    private final static QName _ArrayOfCreateDocumentCID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ArrayOfCreateDocumentCID");
    private final static QName _CreateDocumentCID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "CreateDocumentCID");
    private final static QName _ArrayOfCreateDocumentFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ArrayOfCreateDocumentFile");
    private final static QName _CreateDocumentFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "CreateDocumentFile");
    private final static QName _ArrayOfCreateDocumentObject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ArrayOfCreateDocumentObject");
    private final static QName _CreateDocumentObject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "CreateDocumentObject");
    private final static QName _ObjectTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ObjectTypes");
    private final static QName _ArrayOfCreateDocumentSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ArrayOfCreateDocumentSubject");
    private final static QName _CreateDocumentSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "CreateDocumentSubject");
    private final static QName _GENDER_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "GENDER");
    private final static QName _SUBJECTTYPE_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "SUBJECTTYPE");
    private final static QName _DocStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DocStatus");
    private final static QName _DeleteDocumentRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DeleteDocumentRequest");
    private final static QName _DeleteDocumentResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DeleteDocumentResponse");
    private final static QName _ResponseStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ResponseStatus");
    private final static QName _DeleteFileRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DeleteFileRequest");
    private final static QName _DeleteFileResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DeleteFileResponse");
    private final static QName _CreateFileRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "CreateFileRequest");
    private final static QName _CreateFileResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "CreateFileResponse");
    private final static QName _CreateDocumentSubjectBIRTHDATE_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "BIRTHDATE");
    private final static QName _CreateDocumentSubjectFNAME_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "FNAME");
    private final static QName _CreateDocumentSubjectINN_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "INN");
    private final static QName _CreateDocumentSubjectLNAME_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "LNAME");
    private final static QName _CreateDocumentSubjectNAME_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "NAME");
    private final static QName _CreateDocumentSubjectOGRN_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "OGRN");
    private final static QName _CreateDocumentSubjectSNAME_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "SNAME");
    private final static QName _CreateDocumentSubjectSNILS_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "SNILS");
    private final static QName _CreateDocumentObjectADDRBUILD_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ADDR_BUILD");
    private final static QName _CreateDocumentObjectADDRFIAS_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ADDR_FIAS");
    private final static QName _CreateDocumentObjectADDRTEXT_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ADDR_TEXT");
    private final static QName _CreateDocumentObjectCADNUM_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "CADNUM");
    private final static QName _CreateDocumentObjectFLAT_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "FLAT");
    private final static QName _CreateDocumentObjectNPP_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "NPP");
    private final static QName _CreateDocumentObjectUNKV_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "UNKV");
    private final static QName _CreateDocumentObjectUNOM_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "UNOM");
    private final static QName _CreateDocumentObjectUSLNUM_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "USLNUM");
    private final static QName _CreateDocumentFileDESCRIPTION_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DESCRIPTION");
    private final static QName _CreateDocumentFileFILEBODY_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "FILE_BODY");
    private final static QName _CreateDocumentFileFILENAME_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "FILE_NAME");
    private final static QName _CreateDocumentFileSIGNBODY_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "SIGN_BODY");
    private final static QName _CreateDocumentCIDPARENTTAGNAME_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "PARENT_TAG_NAME");
    private final static QName _CreateDocumentCIDTAGNAME_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "TAG_NAME");
    private final static QName _CreateDocumentCIDTAGVALUE_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "TAG_VALUE");
    private final static QName _ResponseSubjectIDSUBJECT_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ID_SUBJECT");
    private final static QName _ResponseSubjectSTYPE_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "STYPE");
    private final static QName _ResponseSubjectTICKET_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "TICKET");
    private final static QName _ResponseObjectADDRBUILDTEXT_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ADDR_BUILD_TEXT");
    private final static QName _ResponseObjectADDRFIASTEXT_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ADDR_FIAS_TEXT");
    private final static QName _ResponseObjectIDENT_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ID_ENT");
    private final static QName _ResponseObjectIDOBJECT_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ID_OBJECT");
    private final static QName _ResponseFilesIDFILE_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ID_FILE");
    private final static QName _ResponseCIDDATAID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DATAID");
    private final static QName _ResponseCIDVALUE_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "VALUE");
    private final static QName _CreateFileResponseFileId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "FileId");
    private final static QName _CreateFileResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "Message");
    private final static QName _CreateFileRequestFileBytes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "FileBytes");
    private final static QName _CreateFileRequestFileDescr_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "FileDescr");
    private final static QName _CreateFileRequestFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "FileName");
    private final static QName _CreateFileRequestIdDocumentRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "IdDocumentRes");
    private final static QName _CreateFileRequestORGGUID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ORG_GUID");
    private final static QName _CreateDocumentRequestDOCUMENTCID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DOCUMENT_CID");
    private final static QName _CreateDocumentRequestDOCUMENTFILES_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DOCUMENT_FILES");
    private final static QName _CreateDocumentRequestDOCUMENTOBJECT_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DOCUMENT_OBJECT");
    private final static QName _CreateDocumentRequestDOCUMENTSUBJECTS_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DOCUMENT_SUBJECTS");
    private final static QName _CreateDocumentRequestDOLGPODPISANT_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DOLG_PODPISANT");
    private final static QName _CreateDocumentRequestFIOPODPISANT_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "FIO_PODPISANT");
    private final static QName _CreateDocumentRequestISSUER_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ISSUER");
    private final static QName _CreateDocumentRequestPREGISTRN_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "P_REGISTR_N");
    private final static QName _CreateDocumentRequestREGISTRN_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "REGISTR_N");
    private final static QName _CreateDocumentRequestReonLayerObjectID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ReonLayerObjectID");
    private final static QName _GetChangesResponseCREATEDATE_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "CREATEDATE");
    private final static QName _GetChangesResponseDATAREGIS_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "DATA_REGIS");
    private final static QName _GetChangesResponseIDDOCUMENTRES_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ID_DOCUMENTRES");
    private final static QName _GetChangesResponseIDPARENT_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "ID_PARENT");
    private final static QName _GetChangesResponseSIGNDATE_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "SIGNDATE");
    private final static QName _GetChangesResponseSTATUS_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "STATUS");
    private final static QName _GetChangesResponseTYPEDOCUMENT_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "TYPE_DOCUMENT");
    private final static QName _GetChangesResponseTYPEDOCUMENT2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "TYPE_DOCUMENT2");
    private final static QName _GetChangesResponseTYPEDOCUMENT3_QNAME = new QName("http://schemas.datacontract.org/2004/07/Common", "TYPE_DOCUMENT3");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetChangesResponse }
     * 
     */
    public GetChangesResponse createGetChangesResponse() {
        return new GetChangesResponse();
    }

    /**
     * Create an instance of {@link CreateDocumentRequest }
     * 
     */
    public CreateDocumentRequest createCreateDocumentRequest() {
        return new CreateDocumentRequest();
    }

    /**
     * Create an instance of {@link DeleteDocumentRequest }
     * 
     */
    public DeleteDocumentRequest createDeleteDocumentRequest() {
        return new DeleteDocumentRequest();
    }

    /**
     * Create an instance of {@link DeleteDocumentResponse }
     * 
     */
    public DeleteDocumentResponse createDeleteDocumentResponse() {
        return new DeleteDocumentResponse();
    }

    /**
     * Create an instance of {@link DeleteFileRequest }
     * 
     */
    public DeleteFileRequest createDeleteFileRequest() {
        return new DeleteFileRequest();
    }

    /**
     * Create an instance of {@link DeleteFileResponse }
     * 
     */
    public DeleteFileResponse createDeleteFileResponse() {
        return new DeleteFileResponse();
    }

    /**
     * Create an instance of {@link CreateFileRequest }
     * 
     */
    public CreateFileRequest createCreateFileRequest() {
        return new CreateFileRequest();
    }

    /**
     * Create an instance of {@link CreateFileResponse }
     * 
     */
    public CreateFileResponse createCreateFileResponse() {
        return new CreateFileResponse();
    }

    /**
     * Create an instance of {@link ArrayOfResponseCID }
     * 
     */
    public ArrayOfResponseCID createArrayOfResponseCID() {
        return new ArrayOfResponseCID();
    }

    /**
     * Create an instance of {@link ResponseCID }
     * 
     */
    public ResponseCID createResponseCID() {
        return new ResponseCID();
    }

    /**
     * Create an instance of {@link ArrayOfResponseFiles }
     * 
     */
    public ArrayOfResponseFiles createArrayOfResponseFiles() {
        return new ArrayOfResponseFiles();
    }

    /**
     * Create an instance of {@link ResponseFiles }
     * 
     */
    public ResponseFiles createResponseFiles() {
        return new ResponseFiles();
    }

    /**
     * Create an instance of {@link ArrayOfResponseObject }
     * 
     */
    public ArrayOfResponseObject createArrayOfResponseObject() {
        return new ArrayOfResponseObject();
    }

    /**
     * Create an instance of {@link ResponseObject }
     * 
     */
    public ResponseObject createResponseObject() {
        return new ResponseObject();
    }

    /**
     * Create an instance of {@link ArrayOfResponseSubject }
     * 
     */
    public ArrayOfResponseSubject createArrayOfResponseSubject() {
        return new ArrayOfResponseSubject();
    }

    /**
     * Create an instance of {@link ResponseSubject }
     * 
     */
    public ResponseSubject createResponseSubject() {
        return new ResponseSubject();
    }

    /**
     * Create an instance of {@link ArrayOfCreateDocumentCID }
     * 
     */
    public ArrayOfCreateDocumentCID createArrayOfCreateDocumentCID() {
        return new ArrayOfCreateDocumentCID();
    }

    /**
     * Create an instance of {@link CreateDocumentCID }
     * 
     */
    public CreateDocumentCID createCreateDocumentCID() {
        return new CreateDocumentCID();
    }

    /**
     * Create an instance of {@link ArrayOfCreateDocumentFile }
     * 
     */
    public ArrayOfCreateDocumentFile createArrayOfCreateDocumentFile() {
        return new ArrayOfCreateDocumentFile();
    }

    /**
     * Create an instance of {@link CreateDocumentFile }
     * 
     */
    public CreateDocumentFile createCreateDocumentFile() {
        return new CreateDocumentFile();
    }

    /**
     * Create an instance of {@link ArrayOfCreateDocumentObject }
     * 
     */
    public ArrayOfCreateDocumentObject createArrayOfCreateDocumentObject() {
        return new ArrayOfCreateDocumentObject();
    }

    /**
     * Create an instance of {@link CreateDocumentObject }
     * 
     */
    public CreateDocumentObject createCreateDocumentObject() {
        return new CreateDocumentObject();
    }

    /**
     * Create an instance of {@link ArrayOfCreateDocumentSubject }
     * 
     */
    public ArrayOfCreateDocumentSubject createArrayOfCreateDocumentSubject() {
        return new ArrayOfCreateDocumentSubject();
    }

    /**
     * Create an instance of {@link CreateDocumentSubject }
     * 
     */
    public CreateDocumentSubject createCreateDocumentSubject() {
        return new CreateDocumentSubject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChangesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetChangesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "GetChangesResponse")
    public JAXBElement<GetChangesResponse> createGetChangesResponse(GetChangesResponse value) {
        return new JAXBElement<GetChangesResponse>(_GetChangesResponse_QNAME, GetChangesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseCID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseCID }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ArrayOfResponseCID")
    public JAXBElement<ArrayOfResponseCID> createArrayOfResponseCID(ArrayOfResponseCID value) {
        return new JAXBElement<ArrayOfResponseCID>(_ArrayOfResponseCID_QNAME, ArrayOfResponseCID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseCID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseCID }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ResponseCID")
    public JAXBElement<ResponseCID> createResponseCID(ResponseCID value) {
        return new JAXBElement<ResponseCID>(_ResponseCID_QNAME, ResponseCID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseFiles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseFiles }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ArrayOfResponseFiles")
    public JAXBElement<ArrayOfResponseFiles> createArrayOfResponseFiles(ArrayOfResponseFiles value) {
        return new JAXBElement<ArrayOfResponseFiles>(_ArrayOfResponseFiles_QNAME, ArrayOfResponseFiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseFiles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseFiles }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ResponseFiles")
    public JAXBElement<ResponseFiles> createResponseFiles(ResponseFiles value) {
        return new JAXBElement<ResponseFiles>(_ResponseFiles_QNAME, ResponseFiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ArrayOfResponseObject")
    public JAXBElement<ArrayOfResponseObject> createArrayOfResponseObject(ArrayOfResponseObject value) {
        return new JAXBElement<ArrayOfResponseObject>(_ArrayOfResponseObject_QNAME, ArrayOfResponseObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ResponseObject")
    public JAXBElement<ResponseObject> createResponseObject(ResponseObject value) {
        return new JAXBElement<ResponseObject>(_ResponseObject_QNAME, ResponseObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseSubject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseSubject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ArrayOfResponseSubject")
    public JAXBElement<ArrayOfResponseSubject> createArrayOfResponseSubject(ArrayOfResponseSubject value) {
        return new JAXBElement<ArrayOfResponseSubject>(_ArrayOfResponseSubject_QNAME, ArrayOfResponseSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseSubject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseSubject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ResponseSubject")
    public JAXBElement<ResponseSubject> createResponseSubject(ResponseSubject value) {
        return new JAXBElement<ResponseSubject>(_ResponseSubject_QNAME, ResponseSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "CreateDocumentRequest")
    public JAXBElement<CreateDocumentRequest> createCreateDocumentRequest(CreateDocumentRequest value) {
        return new JAXBElement<CreateDocumentRequest>(_CreateDocumentRequest_QNAME, CreateDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentCID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentCID }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ArrayOfCreateDocumentCID")
    public JAXBElement<ArrayOfCreateDocumentCID> createArrayOfCreateDocumentCID(ArrayOfCreateDocumentCID value) {
        return new JAXBElement<ArrayOfCreateDocumentCID>(_ArrayOfCreateDocumentCID_QNAME, ArrayOfCreateDocumentCID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocumentCID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDocumentCID }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "CreateDocumentCID")
    public JAXBElement<CreateDocumentCID> createCreateDocumentCID(CreateDocumentCID value) {
        return new JAXBElement<CreateDocumentCID>(_CreateDocumentCID_QNAME, CreateDocumentCID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentFile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentFile }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ArrayOfCreateDocumentFile")
    public JAXBElement<ArrayOfCreateDocumentFile> createArrayOfCreateDocumentFile(ArrayOfCreateDocumentFile value) {
        return new JAXBElement<ArrayOfCreateDocumentFile>(_ArrayOfCreateDocumentFile_QNAME, ArrayOfCreateDocumentFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocumentFile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDocumentFile }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "CreateDocumentFile")
    public JAXBElement<CreateDocumentFile> createCreateDocumentFile(CreateDocumentFile value) {
        return new JAXBElement<CreateDocumentFile>(_CreateDocumentFile_QNAME, CreateDocumentFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ArrayOfCreateDocumentObject")
    public JAXBElement<ArrayOfCreateDocumentObject> createArrayOfCreateDocumentObject(ArrayOfCreateDocumentObject value) {
        return new JAXBElement<ArrayOfCreateDocumentObject>(_ArrayOfCreateDocumentObject_QNAME, ArrayOfCreateDocumentObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocumentObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDocumentObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "CreateDocumentObject")
    public JAXBElement<CreateDocumentObject> createCreateDocumentObject(CreateDocumentObject value) {
        return new JAXBElement<CreateDocumentObject>(_CreateDocumentObject_QNAME, CreateDocumentObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectTypes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectTypes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ObjectTypes")
    public JAXBElement<ObjectTypes> createObjectTypes(ObjectTypes value) {
        return new JAXBElement<ObjectTypes>(_ObjectTypes_QNAME, ObjectTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentSubject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentSubject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ArrayOfCreateDocumentSubject")
    public JAXBElement<ArrayOfCreateDocumentSubject> createArrayOfCreateDocumentSubject(ArrayOfCreateDocumentSubject value) {
        return new JAXBElement<ArrayOfCreateDocumentSubject>(_ArrayOfCreateDocumentSubject_QNAME, ArrayOfCreateDocumentSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocumentSubject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDocumentSubject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "CreateDocumentSubject")
    public JAXBElement<CreateDocumentSubject> createCreateDocumentSubject(CreateDocumentSubject value) {
        return new JAXBElement<CreateDocumentSubject>(_CreateDocumentSubject_QNAME, CreateDocumentSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GENDER }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GENDER }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "GENDER")
    public JAXBElement<GENDER> createGENDER(GENDER value) {
        return new JAXBElement<GENDER>(_GENDER_QNAME, GENDER.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SUBJECTTYPE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SUBJECTTYPE }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "SUBJECTTYPE")
    public JAXBElement<SUBJECTTYPE> createSUBJECTTYPE(SUBJECTTYPE value) {
        return new JAXBElement<SUBJECTTYPE>(_SUBJECTTYPE_QNAME, SUBJECTTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DocStatus")
    public JAXBElement<DocStatus> createDocStatus(DocStatus value) {
        return new JAXBElement<DocStatus>(_DocStatus_QNAME, DocStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DeleteDocumentRequest")
    public JAXBElement<DeleteDocumentRequest> createDeleteDocumentRequest(DeleteDocumentRequest value) {
        return new JAXBElement<DeleteDocumentRequest>(_DeleteDocumentRequest_QNAME, DeleteDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DeleteDocumentResponse")
    public JAXBElement<DeleteDocumentResponse> createDeleteDocumentResponse(DeleteDocumentResponse value) {
        return new JAXBElement<DeleteDocumentResponse>(_DeleteDocumentResponse_QNAME, DeleteDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ResponseStatus")
    public JAXBElement<ResponseStatus> createResponseStatus(ResponseStatus value) {
        return new JAXBElement<ResponseStatus>(_ResponseStatus_QNAME, ResponseStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFileRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteFileRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DeleteFileRequest")
    public JAXBElement<DeleteFileRequest> createDeleteFileRequest(DeleteFileRequest value) {
        return new JAXBElement<DeleteFileRequest>(_DeleteFileRequest_QNAME, DeleteFileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteFileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DeleteFileResponse")
    public JAXBElement<DeleteFileResponse> createDeleteFileResponse(DeleteFileResponse value) {
        return new JAXBElement<DeleteFileResponse>(_DeleteFileResponse_QNAME, DeleteFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFileRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateFileRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "CreateFileRequest")
    public JAXBElement<CreateFileRequest> createCreateFileRequest(CreateFileRequest value) {
        return new JAXBElement<CreateFileRequest>(_CreateFileRequest_QNAME, CreateFileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateFileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "CreateFileResponse")
    public JAXBElement<CreateFileResponse> createCreateFileResponse(CreateFileResponse value) {
        return new JAXBElement<CreateFileResponse>(_CreateFileResponse_QNAME, CreateFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "BIRTHDATE", scope = CreateDocumentSubject.class)
    public JAXBElement<XMLGregorianCalendar> createCreateDocumentSubjectBIRTHDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreateDocumentSubjectBIRTHDATE_QNAME, XMLGregorianCalendar.class, CreateDocumentSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FNAME", scope = CreateDocumentSubject.class)
    public JAXBElement<String> createCreateDocumentSubjectFNAME(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectFNAME_QNAME, String.class, CreateDocumentSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GENDER }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GENDER }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "GENDER", scope = CreateDocumentSubject.class)
    public JAXBElement<GENDER> createCreateDocumentSubjectGENDER(GENDER value) {
        return new JAXBElement<GENDER>(_GENDER_QNAME, GENDER.class, CreateDocumentSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "INN", scope = CreateDocumentSubject.class)
    public JAXBElement<String> createCreateDocumentSubjectINN(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectINN_QNAME, String.class, CreateDocumentSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "LNAME", scope = CreateDocumentSubject.class)
    public JAXBElement<String> createCreateDocumentSubjectLNAME(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectLNAME_QNAME, String.class, CreateDocumentSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "NAME", scope = CreateDocumentSubject.class)
    public JAXBElement<String> createCreateDocumentSubjectNAME(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectNAME_QNAME, String.class, CreateDocumentSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "OGRN", scope = CreateDocumentSubject.class)
    public JAXBElement<String> createCreateDocumentSubjectOGRN(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectOGRN_QNAME, String.class, CreateDocumentSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "SNAME", scope = CreateDocumentSubject.class)
    public JAXBElement<String> createCreateDocumentSubjectSNAME(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectSNAME_QNAME, String.class, CreateDocumentSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "SNILS", scope = CreateDocumentSubject.class)
    public JAXBElement<String> createCreateDocumentSubjectSNILS(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectSNILS_QNAME, String.class, CreateDocumentSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ADDR_BUILD", scope = CreateDocumentObject.class)
    public JAXBElement<String> createCreateDocumentObjectADDRBUILD(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectADDRBUILD_QNAME, String.class, CreateDocumentObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ADDR_FIAS", scope = CreateDocumentObject.class)
    public JAXBElement<String> createCreateDocumentObjectADDRFIAS(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectADDRFIAS_QNAME, String.class, CreateDocumentObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ADDR_TEXT", scope = CreateDocumentObject.class)
    public JAXBElement<String> createCreateDocumentObjectADDRTEXT(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectADDRTEXT_QNAME, String.class, CreateDocumentObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "CADNUM", scope = CreateDocumentObject.class)
    public JAXBElement<String> createCreateDocumentObjectCADNUM(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectCADNUM_QNAME, String.class, CreateDocumentObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FLAT", scope = CreateDocumentObject.class)
    public JAXBElement<String> createCreateDocumentObjectFLAT(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectFLAT_QNAME, String.class, CreateDocumentObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "NPP", scope = CreateDocumentObject.class)
    public JAXBElement<String> createCreateDocumentObjectNPP(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectNPP_QNAME, String.class, CreateDocumentObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "UNKV", scope = CreateDocumentObject.class)
    public JAXBElement<String> createCreateDocumentObjectUNKV(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectUNKV_QNAME, String.class, CreateDocumentObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "UNOM", scope = CreateDocumentObject.class)
    public JAXBElement<String> createCreateDocumentObjectUNOM(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectUNOM_QNAME, String.class, CreateDocumentObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "USLNUM", scope = CreateDocumentObject.class)
    public JAXBElement<String> createCreateDocumentObjectUSLNUM(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectUSLNUM_QNAME, String.class, CreateDocumentObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DESCRIPTION", scope = CreateDocumentFile.class)
    public JAXBElement<String> createCreateDocumentFileDESCRIPTION(String value) {
        return new JAXBElement<String>(_CreateDocumentFileDESCRIPTION_QNAME, String.class, CreateDocumentFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FILE_BODY", scope = CreateDocumentFile.class)
    public JAXBElement<byte[]> createCreateDocumentFileFILEBODY(byte[] value) {
        return new JAXBElement<byte[]>(_CreateDocumentFileFILEBODY_QNAME, byte[].class, CreateDocumentFile.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FILE_NAME", scope = CreateDocumentFile.class)
    public JAXBElement<String> createCreateDocumentFileFILENAME(String value) {
        return new JAXBElement<String>(_CreateDocumentFileFILENAME_QNAME, String.class, CreateDocumentFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "SIGN_BODY", scope = CreateDocumentFile.class)
    public JAXBElement<byte[]> createCreateDocumentFileSIGNBODY(byte[] value) {
        return new JAXBElement<byte[]>(_CreateDocumentFileSIGNBODY_QNAME, byte[].class, CreateDocumentFile.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "PARENT_TAG_NAME", scope = CreateDocumentCID.class)
    public JAXBElement<String> createCreateDocumentCIDPARENTTAGNAME(String value) {
        return new JAXBElement<String>(_CreateDocumentCIDPARENTTAGNAME_QNAME, String.class, CreateDocumentCID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "TAG_NAME", scope = CreateDocumentCID.class)
    public JAXBElement<String> createCreateDocumentCIDTAGNAME(String value) {
        return new JAXBElement<String>(_CreateDocumentCIDTAGNAME_QNAME, String.class, CreateDocumentCID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "TAG_VALUE", scope = CreateDocumentCID.class)
    public JAXBElement<String> createCreateDocumentCIDTAGVALUE(String value) {
        return new JAXBElement<String>(_CreateDocumentCIDTAGVALUE_QNAME, String.class, CreateDocumentCID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "BIRTHDATE", scope = ResponseSubject.class)
    public JAXBElement<XMLGregorianCalendar> createResponseSubjectBIRTHDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreateDocumentSubjectBIRTHDATE_QNAME, XMLGregorianCalendar.class, ResponseSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FNAME", scope = ResponseSubject.class)
    public JAXBElement<String> createResponseSubjectFNAME(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectFNAME_QNAME, String.class, ResponseSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "GENDER", scope = ResponseSubject.class)
    public JAXBElement<Boolean> createResponseSubjectGENDER(Boolean value) {
        return new JAXBElement<Boolean>(_GENDER_QNAME, Boolean.class, ResponseSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ID_SUBJECT", scope = ResponseSubject.class)
    public JAXBElement<BigDecimal> createResponseSubjectIDSUBJECT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ResponseSubjectIDSUBJECT_QNAME, BigDecimal.class, ResponseSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "INN", scope = ResponseSubject.class)
    public JAXBElement<String> createResponseSubjectINN(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectINN_QNAME, String.class, ResponseSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "LNAME", scope = ResponseSubject.class)
    public JAXBElement<String> createResponseSubjectLNAME(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectLNAME_QNAME, String.class, ResponseSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "NAME", scope = ResponseSubject.class)
    public JAXBElement<String> createResponseSubjectNAME(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectNAME_QNAME, String.class, ResponseSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "OGRN", scope = ResponseSubject.class)
    public JAXBElement<String> createResponseSubjectOGRN(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectOGRN_QNAME, String.class, ResponseSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "SNAME", scope = ResponseSubject.class)
    public JAXBElement<String> createResponseSubjectSNAME(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectSNAME_QNAME, String.class, ResponseSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "SNILS", scope = ResponseSubject.class)
    public JAXBElement<String> createResponseSubjectSNILS(String value) {
        return new JAXBElement<String>(_CreateDocumentSubjectSNILS_QNAME, String.class, ResponseSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "STYPE", scope = ResponseSubject.class)
    public JAXBElement<BigDecimal> createResponseSubjectSTYPE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ResponseSubjectSTYPE_QNAME, BigDecimal.class, ResponseSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "TICKET", scope = ResponseSubject.class)
    public JAXBElement<BigDecimal> createResponseSubjectTICKET(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ResponseSubjectTICKET_QNAME, BigDecimal.class, ResponseSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ADDR_BUILD", scope = ResponseObject.class)
    public JAXBElement<String> createResponseObjectADDRBUILD(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectADDRBUILD_QNAME, String.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ADDR_BUILD_TEXT", scope = ResponseObject.class)
    public JAXBElement<String> createResponseObjectADDRBUILDTEXT(String value) {
        return new JAXBElement<String>(_ResponseObjectADDRBUILDTEXT_QNAME, String.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ADDR_FIAS", scope = ResponseObject.class)
    public JAXBElement<String> createResponseObjectADDRFIAS(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectADDRFIAS_QNAME, String.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ADDR_FIAS_TEXT", scope = ResponseObject.class)
    public JAXBElement<String> createResponseObjectADDRFIASTEXT(String value) {
        return new JAXBElement<String>(_ResponseObjectADDRFIASTEXT_QNAME, String.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ADDR_TEXT", scope = ResponseObject.class)
    public JAXBElement<String> createResponseObjectADDRTEXT(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectADDRTEXT_QNAME, String.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "CADNUM", scope = ResponseObject.class)
    public JAXBElement<String> createResponseObjectCADNUM(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectCADNUM_QNAME, String.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FLAT", scope = ResponseObject.class)
    public JAXBElement<String> createResponseObjectFLAT(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectFLAT_QNAME, String.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ID_ENT", scope = ResponseObject.class)
    public JAXBElement<BigDecimal> createResponseObjectIDENT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ResponseObjectIDENT_QNAME, BigDecimal.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ID_OBJECT", scope = ResponseObject.class)
    public JAXBElement<BigDecimal> createResponseObjectIDOBJECT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ResponseObjectIDOBJECT_QNAME, BigDecimal.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "NPP", scope = ResponseObject.class)
    public JAXBElement<String> createResponseObjectNPP(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectNPP_QNAME, String.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "TICKET", scope = ResponseObject.class)
    public JAXBElement<BigDecimal> createResponseObjectTICKET(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ResponseSubjectTICKET_QNAME, BigDecimal.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "UNKV", scope = ResponseObject.class)
    public JAXBElement<String> createResponseObjectUNKV(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectUNKV_QNAME, String.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "UNOM", scope = ResponseObject.class)
    public JAXBElement<String> createResponseObjectUNOM(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectUNOM_QNAME, String.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "USLNUM", scope = ResponseObject.class)
    public JAXBElement<String> createResponseObjectUSLNUM(String value) {
        return new JAXBElement<String>(_CreateDocumentObjectUSLNUM_QNAME, String.class, ResponseObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FILE_NAME", scope = ResponseFiles.class)
    public JAXBElement<String> createResponseFilesFILENAME(String value) {
        return new JAXBElement<String>(_CreateDocumentFileFILENAME_QNAME, String.class, ResponseFiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ID_FILE", scope = ResponseFiles.class)
    public JAXBElement<BigDecimal> createResponseFilesIDFILE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ResponseFilesIDFILE_QNAME, BigDecimal.class, ResponseFiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DATAID", scope = ResponseCID.class)
    public JAXBElement<BigDecimal> createResponseCIDDATAID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ResponseCIDDATAID_QNAME, BigDecimal.class, ResponseCID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "TAG_NAME", scope = ResponseCID.class)
    public JAXBElement<String> createResponseCIDTAGNAME(String value) {
        return new JAXBElement<String>(_CreateDocumentCIDTAGNAME_QNAME, String.class, ResponseCID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "VALUE", scope = ResponseCID.class)
    public JAXBElement<String> createResponseCIDVALUE(String value) {
        return new JAXBElement<String>(_ResponseCIDVALUE_QNAME, String.class, ResponseCID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FileId", scope = CreateFileResponse.class)
    public JAXBElement<Long> createCreateFileResponseFileId(Long value) {
        return new JAXBElement<Long>(_CreateFileResponseFileId_QNAME, Long.class, CreateFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "Message", scope = CreateFileResponse.class)
    public JAXBElement<String> createCreateFileResponseMessage(String value) {
        return new JAXBElement<String>(_CreateFileResponseMessage_QNAME, String.class, CreateFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FileBytes", scope = CreateFileRequest.class)
    public JAXBElement<byte[]> createCreateFileRequestFileBytes(byte[] value) {
        return new JAXBElement<byte[]>(_CreateFileRequestFileBytes_QNAME, byte[].class, CreateFileRequest.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FileDescr", scope = CreateFileRequest.class)
    public JAXBElement<String> createCreateFileRequestFileDescr(String value) {
        return new JAXBElement<String>(_CreateFileRequestFileDescr_QNAME, String.class, CreateFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FileName", scope = CreateFileRequest.class)
    public JAXBElement<String> createCreateFileRequestFileName(String value) {
        return new JAXBElement<String>(_CreateFileRequestFileName_QNAME, String.class, CreateFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "IdDocumentRes", scope = CreateFileRequest.class)
    public JAXBElement<Integer> createCreateFileRequestIdDocumentRes(Integer value) {
        return new JAXBElement<Integer>(_CreateFileRequestIdDocumentRes_QNAME, Integer.class, CreateFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ORG_GUID", scope = CreateFileRequest.class)
    public JAXBElement<String> createCreateFileRequestORGGUID(String value) {
        return new JAXBElement<String>(_CreateFileRequestORGGUID_QNAME, String.class, CreateFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "Message", scope = DeleteFileResponse.class)
    public JAXBElement<String> createDeleteFileResponseMessage(String value) {
        return new JAXBElement<String>(_CreateFileResponseMessage_QNAME, String.class, DeleteFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ORG_GUID", scope = DeleteFileRequest.class)
    public JAXBElement<String> createDeleteFileRequestORGGUID(String value) {
        return new JAXBElement<String>(_CreateFileRequestORGGUID_QNAME, String.class, DeleteFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "Message", scope = DeleteDocumentResponse.class)
    public JAXBElement<String> createDeleteDocumentResponseMessage(String value) {
        return new JAXBElement<String>(_CreateFileResponseMessage_QNAME, String.class, DeleteDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ORG_GUID", scope = DeleteDocumentRequest.class)
    public JAXBElement<String> createDeleteDocumentRequestORGGUID(String value) {
        return new JAXBElement<String>(_CreateFileRequestORGGUID_QNAME, String.class, DeleteDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentCID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentCID }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DOCUMENT_CID", scope = CreateDocumentRequest.class)
    public JAXBElement<ArrayOfCreateDocumentCID> createCreateDocumentRequestDOCUMENTCID(ArrayOfCreateDocumentCID value) {
        return new JAXBElement<ArrayOfCreateDocumentCID>(_CreateDocumentRequestDOCUMENTCID_QNAME, ArrayOfCreateDocumentCID.class, CreateDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentFile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentFile }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DOCUMENT_FILES", scope = CreateDocumentRequest.class)
    public JAXBElement<ArrayOfCreateDocumentFile> createCreateDocumentRequestDOCUMENTFILES(ArrayOfCreateDocumentFile value) {
        return new JAXBElement<ArrayOfCreateDocumentFile>(_CreateDocumentRequestDOCUMENTFILES_QNAME, ArrayOfCreateDocumentFile.class, CreateDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DOCUMENT_OBJECT", scope = CreateDocumentRequest.class)
    public JAXBElement<ArrayOfCreateDocumentObject> createCreateDocumentRequestDOCUMENTOBJECT(ArrayOfCreateDocumentObject value) {
        return new JAXBElement<ArrayOfCreateDocumentObject>(_CreateDocumentRequestDOCUMENTOBJECT_QNAME, ArrayOfCreateDocumentObject.class, CreateDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentSubject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCreateDocumentSubject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DOCUMENT_SUBJECTS", scope = CreateDocumentRequest.class)
    public JAXBElement<ArrayOfCreateDocumentSubject> createCreateDocumentRequestDOCUMENTSUBJECTS(ArrayOfCreateDocumentSubject value) {
        return new JAXBElement<ArrayOfCreateDocumentSubject>(_CreateDocumentRequestDOCUMENTSUBJECTS_QNAME, ArrayOfCreateDocumentSubject.class, CreateDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DOLG_PODPISANT", scope = CreateDocumentRequest.class)
    public JAXBElement<String> createCreateDocumentRequestDOLGPODPISANT(String value) {
        return new JAXBElement<String>(_CreateDocumentRequestDOLGPODPISANT_QNAME, String.class, CreateDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FIO_PODPISANT", scope = CreateDocumentRequest.class)
    public JAXBElement<String> createCreateDocumentRequestFIOPODPISANT(String value) {
        return new JAXBElement<String>(_CreateDocumentRequestFIOPODPISANT_QNAME, String.class, CreateDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ISSUER", scope = CreateDocumentRequest.class)
    public JAXBElement<String> createCreateDocumentRequestISSUER(String value) {
        return new JAXBElement<String>(_CreateDocumentRequestISSUER_QNAME, String.class, CreateDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ORG_GUID", scope = CreateDocumentRequest.class)
    public JAXBElement<String> createCreateDocumentRequestORGGUID(String value) {
        return new JAXBElement<String>(_CreateFileRequestORGGUID_QNAME, String.class, CreateDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "P_REGISTR_N", scope = CreateDocumentRequest.class)
    public JAXBElement<String> createCreateDocumentRequestPREGISTRN(String value) {
        return new JAXBElement<String>(_CreateDocumentRequestPREGISTRN_QNAME, String.class, CreateDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "REGISTR_N", scope = CreateDocumentRequest.class)
    public JAXBElement<String> createCreateDocumentRequestREGISTRN(String value) {
        return new JAXBElement<String>(_CreateDocumentRequestREGISTRN_QNAME, String.class, CreateDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ReonLayerObjectID", scope = CreateDocumentRequest.class)
    public JAXBElement<String> createCreateDocumentRequestReonLayerObjectID(String value) {
        return new JAXBElement<String>(_CreateDocumentRequestReonLayerObjectID_QNAME, String.class, CreateDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "CREATEDATE", scope = GetChangesResponse.class)
    public JAXBElement<String> createGetChangesResponseCREATEDATE(String value) {
        return new JAXBElement<String>(_GetChangesResponseCREATEDATE_QNAME, String.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DATA_REGIS", scope = GetChangesResponse.class)
    public JAXBElement<String> createGetChangesResponseDATAREGIS(String value) {
        return new JAXBElement<String>(_GetChangesResponseDATAREGIS_QNAME, String.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseCID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseCID }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DOCUMENT_CID", scope = GetChangesResponse.class)
    public JAXBElement<ArrayOfResponseCID> createGetChangesResponseDOCUMENTCID(ArrayOfResponseCID value) {
        return new JAXBElement<ArrayOfResponseCID>(_CreateDocumentRequestDOCUMENTCID_QNAME, ArrayOfResponseCID.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseFiles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseFiles }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DOCUMENT_FILES", scope = GetChangesResponse.class)
    public JAXBElement<ArrayOfResponseFiles> createGetChangesResponseDOCUMENTFILES(ArrayOfResponseFiles value) {
        return new JAXBElement<ArrayOfResponseFiles>(_CreateDocumentRequestDOCUMENTFILES_QNAME, ArrayOfResponseFiles.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DOCUMENT_OBJECT", scope = GetChangesResponse.class)
    public JAXBElement<ArrayOfResponseObject> createGetChangesResponseDOCUMENTOBJECT(ArrayOfResponseObject value) {
        return new JAXBElement<ArrayOfResponseObject>(_CreateDocumentRequestDOCUMENTOBJECT_QNAME, ArrayOfResponseObject.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseSubject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseSubject }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DOCUMENT_SUBJECTS", scope = GetChangesResponse.class)
    public JAXBElement<ArrayOfResponseSubject> createGetChangesResponseDOCUMENTSUBJECTS(ArrayOfResponseSubject value) {
        return new JAXBElement<ArrayOfResponseSubject>(_CreateDocumentRequestDOCUMENTSUBJECTS_QNAME, ArrayOfResponseSubject.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "DOLG_PODPISANT", scope = GetChangesResponse.class)
    public JAXBElement<String> createGetChangesResponseDOLGPODPISANT(String value) {
        return new JAXBElement<String>(_CreateDocumentRequestDOLGPODPISANT_QNAME, String.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "FIO_PODPISANT", scope = GetChangesResponse.class)
    public JAXBElement<String> createGetChangesResponseFIOPODPISANT(String value) {
        return new JAXBElement<String>(_CreateDocumentRequestFIOPODPISANT_QNAME, String.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ID_DOCUMENTRES", scope = GetChangesResponse.class)
    public JAXBElement<BigDecimal> createGetChangesResponseIDDOCUMENTRES(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetChangesResponseIDDOCUMENTRES_QNAME, BigDecimal.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ID_PARENT", scope = GetChangesResponse.class)
    public JAXBElement<BigDecimal> createGetChangesResponseIDPARENT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetChangesResponseIDPARENT_QNAME, BigDecimal.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ISSUER", scope = GetChangesResponse.class)
    public JAXBElement<String> createGetChangesResponseISSUER(String value) {
        return new JAXBElement<String>(_CreateDocumentRequestISSUER_QNAME, String.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "ORG_GUID", scope = GetChangesResponse.class)
    public JAXBElement<String> createGetChangesResponseORGGUID(String value) {
        return new JAXBElement<String>(_CreateFileRequestORGGUID_QNAME, String.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "REGISTR_N", scope = GetChangesResponse.class)
    public JAXBElement<String> createGetChangesResponseREGISTRN(String value) {
        return new JAXBElement<String>(_CreateDocumentRequestREGISTRN_QNAME, String.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "SIGNDATE", scope = GetChangesResponse.class)
    public JAXBElement<String> createGetChangesResponseSIGNDATE(String value) {
        return new JAXBElement<String>(_GetChangesResponseSIGNDATE_QNAME, String.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "STATUS", scope = GetChangesResponse.class)
    public JAXBElement<BigDecimal> createGetChangesResponseSTATUS(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetChangesResponseSTATUS_QNAME, BigDecimal.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "TYPE_DOCUMENT", scope = GetChangesResponse.class)
    public JAXBElement<String> createGetChangesResponseTYPEDOCUMENT(String value) {
        return new JAXBElement<String>(_GetChangesResponseTYPEDOCUMENT_QNAME, String.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "TYPE_DOCUMENT2", scope = GetChangesResponse.class)
    public JAXBElement<String> createGetChangesResponseTYPEDOCUMENT2(String value) {
        return new JAXBElement<String>(_GetChangesResponseTYPEDOCUMENT2_QNAME, String.class, GetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Common", name = "TYPE_DOCUMENT3", scope = GetChangesResponse.class)
    public JAXBElement<String> createGetChangesResponseTYPEDOCUMENT3(String value) {
        return new JAXBElement<String>(_GetChangesResponseTYPEDOCUMENT3_QNAME, String.class, GetChangesResponse.class, value);
    }

}
