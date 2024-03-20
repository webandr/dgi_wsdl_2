
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.businesslogiclayer.BaseRequest;
import org.datacontract.schemas._2004._07.businesslogiclayer.BaseResponse;
import org.datacontract.schemas._2004._07.businesslogiclayer.CreateDocumentResponse;
import org.datacontract.schemas._2004._07.businesslogiclayer.DocumentReceivedRequest;
import org.datacontract.schemas._2004._07.businesslogiclayer.DocumentRequest;
import org.datacontract.schemas._2004._07.businesslogiclayer.DocumentResponse;
import org.datacontract.schemas._2004._07.businesslogiclayer.GetFileRequest;
import org.datacontract.schemas._2004._07.businesslogiclayer.GetFileResponse;
import org.datacontract.schemas._2004._07.common.CreateDocumentRequest;
import org.datacontract.schemas._2004._07.common.CreateFileRequest;
import org.datacontract.schemas._2004._07.common.CreateFileResponse;
import org.datacontract.schemas._2004._07.common.DeleteDocumentRequest;
import org.datacontract.schemas._2004._07.common.DeleteDocumentResponse;
import org.datacontract.schemas._2004._07.common.DeleteFileRequest;
import org.datacontract.schemas._2004._07.common.DeleteFileResponse;
import org.datacontract.schemas._2004._07.common.GetChangesResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IService1", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    org.datacontract.schemas._2004._07.businesslogiclayer.ObjectFactory.class,
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class,
    org.datacontract.schemas._2004._07.common.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface IService1 {


    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.businesslogiclayer.DocumentResponse
     */
    @WebMethod(operationName = "GetData", action = "http://tempuri.org/IService1/GetData")
    @WebResult(name = "GetDataResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetData", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetData")
    @ResponseWrapper(localName = "GetDataResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDataResponse")
    public DocumentResponse getData(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        DocumentRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.businesslogiclayer.DocumentResponse
     */
    @WebMethod(operationName = "GetDocument", action = "http://tempuri.org/IService1/GetDocument")
    @WebResult(name = "GetDocumentResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDocument", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDocument")
    @ResponseWrapper(localName = "GetDocumentResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDocumentResponse")
    public DocumentResponse getDocument(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        DocumentRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.common.GetChangesResponse
     */
    @WebMethod(operationName = "GetChanges", action = "http://tempuri.org/IService1/GetChanges")
    @WebResult(name = "GetChangesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetChanges", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetChanges")
    @ResponseWrapper(localName = "GetChangesResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetChangesResponse")
    public GetChangesResponse getChanges(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        BaseRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.businesslogiclayer.BaseResponse
     */
    @WebMethod(operationName = "DocumentReceived", action = "http://tempuri.org/IService1/DocumentReceived")
    @WebResult(name = "DocumentReceivedResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DocumentReceived", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DocumentReceived")
    @ResponseWrapper(localName = "DocumentReceivedResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DocumentReceivedResponse")
    public BaseResponse documentReceived(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        DocumentReceivedRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns org.datacontract.schemas._2004._07.businesslogiclayer.GetFileResponse
     */
    @WebMethod(operationName = "GetFile", action = "http://tempuri.org/IService1/GetFile")
    @WebResult(name = "GetFileResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetFile", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetFile")
    @ResponseWrapper(localName = "GetFileResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetFileResponse")
    public GetFileResponse getFile(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        GetFileRequest request);

    /**
     * 
     * @param req
     * @return
     *     returns org.datacontract.schemas._2004._07.businesslogiclayer.CreateDocumentResponse
     */
    @WebMethod(operationName = "CreateDocument", action = "http://tempuri.org/IService1/CreateDocument")
    @WebResult(name = "CreateDocumentResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreateDocument", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CreateDocument")
    @ResponseWrapper(localName = "CreateDocumentResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CreateDocumentResponse")
    public CreateDocumentResponse createDocument(
        @WebParam(name = "req", targetNamespace = "http://tempuri.org/")
        CreateDocumentRequest req);

    /**
     * 
     * @param req
     * @return
     *     returns org.datacontract.schemas._2004._07.common.DeleteDocumentResponse
     */
    @WebMethod(operationName = "DeleteDocument", action = "http://tempuri.org/IService1/DeleteDocument")
    @WebResult(name = "DeleteDocumentResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteDocument", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteDocument")
    @ResponseWrapper(localName = "DeleteDocumentResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteDocumentResponse")
    public DeleteDocumentResponse deleteDocument(
        @WebParam(name = "req", targetNamespace = "http://tempuri.org/")
        DeleteDocumentRequest req);

    /**
     * 
     * @param req
     * @return
     *     returns org.datacontract.schemas._2004._07.common.DeleteFileResponse
     */
    @WebMethod(operationName = "DeleteFile", action = "http://tempuri.org/IService1/DeleteFile")
    @WebResult(name = "DeleteFileResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteFile", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteFile")
    @ResponseWrapper(localName = "DeleteFileResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteFileResponse")
    public DeleteFileResponse deleteFile(
        @WebParam(name = "req", targetNamespace = "http://tempuri.org/")
        DeleteFileRequest req);

    /**
     * 
     * @param req
     * @return
     *     returns org.datacontract.schemas._2004._07.common.CreateFileResponse
     */
    @WebMethod(operationName = "CreateFile", action = "http://tempuri.org/IService1/CreateFile")
    @WebResult(name = "CreateFileResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreateFile", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CreateFile")
    @ResponseWrapper(localName = "CreateFileResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CreateFileResponse")
    public CreateFileResponse createFile(
        @WebParam(name = "req", targetNamespace = "http://tempuri.org/")
        CreateFileRequest req);

}
