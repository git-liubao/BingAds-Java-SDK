
package com.microsoft.bingads.reporting;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "IReportingService", targetNamespace = "https://bingads.microsoft.com/Reporting/v9")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IReportingService {


    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.reporting.SubmitGenerateReportResponse>
     */
    @WebMethod(operationName = "SubmitGenerateReport", action = "SubmitGenerateReport")
    public Response<SubmitGenerateReportResponse> submitGenerateReportAsync(
        @WebParam(name = "SubmitGenerateReportRequest", targetNamespace = "https://bingads.microsoft.com/Reporting/v9", partName = "parameters")
        SubmitGenerateReportRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "SubmitGenerateReport", action = "SubmitGenerateReport")
    public Future<?> submitGenerateReportAsync(
        @WebParam(name = "SubmitGenerateReportRequest", targetNamespace = "https://bingads.microsoft.com/Reporting/v9", partName = "parameters")
        SubmitGenerateReportRequest parameters,
        @WebParam(name = "SubmitGenerateReportResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<SubmitGenerateReportResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.reporting.SubmitGenerateReportResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFaultDetail_Exception
     */
    @WebMethod(operationName = "SubmitGenerateReport", action = "SubmitGenerateReport")
    @WebResult(name = "SubmitGenerateReportResponse", targetNamespace = "https://bingads.microsoft.com/Reporting/v9", partName = "parameters")
    public SubmitGenerateReportResponse submitGenerateReport(
        @WebParam(name = "SubmitGenerateReportRequest", targetNamespace = "https://bingads.microsoft.com/Reporting/v9", partName = "parameters")
        SubmitGenerateReportRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.reporting.PollGenerateReportResponse>
     */
    @WebMethod(operationName = "PollGenerateReport", action = "PollGenerateReport")
    public Response<PollGenerateReportResponse> pollGenerateReportAsync(
        @WebParam(name = "PollGenerateReportRequest", targetNamespace = "https://bingads.microsoft.com/Reporting/v9", partName = "parameters")
        PollGenerateReportRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "PollGenerateReport", action = "PollGenerateReport")
    public Future<?> pollGenerateReportAsync(
        @WebParam(name = "PollGenerateReportRequest", targetNamespace = "https://bingads.microsoft.com/Reporting/v9", partName = "parameters")
        PollGenerateReportRequest parameters,
        @WebParam(name = "PollGenerateReportResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<PollGenerateReportResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.reporting.PollGenerateReportResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFaultDetail_Exception
     */
    @WebMethod(operationName = "PollGenerateReport", action = "PollGenerateReport")
    @WebResult(name = "PollGenerateReportResponse", targetNamespace = "https://bingads.microsoft.com/Reporting/v9", partName = "parameters")
    public PollGenerateReportResponse pollGenerateReport(
        @WebParam(name = "PollGenerateReportRequest", targetNamespace = "https://bingads.microsoft.com/Reporting/v9", partName = "parameters")
        PollGenerateReportRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

}
