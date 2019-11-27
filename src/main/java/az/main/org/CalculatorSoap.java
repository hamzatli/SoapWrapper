package az.main.org;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        name = "CalculatorSoap",
        targetNamespace = "http://tempuri.org/"
)
@XmlSeeAlso({ObjectFactory.class})
public interface CalculatorSoap {
    @WebMethod(
            operationName = "Add",
            action = "http://tempuri.org/Add"
    )
    @WebResult(
            name = "AddResult",
            targetNamespace = "http://tempuri.org/"
    )
    @RequestWrapper(
            localName = "Add",
            targetNamespace = "http://tempuri.org/",
            className = "org.tempuri.Add"
    )
    @ResponseWrapper(
            localName = "AddResponse",
            targetNamespace = "http://tempuri.org/",
            className = "org.tempuri.AddResponse"
    )
    int add(@WebParam(name = "intA", targetNamespace = "http://tempuri.org/") int var1, @WebParam(name = "intB", targetNamespace = "http://tempuri.org/") int var2);

    @WebMethod(
            operationName = "Subtract",
            action = "http://tempuri.org/Subtract"
    )
    @WebResult(
            name = "SubtractResult",
            targetNamespace = "http://tempuri.org/"
    )
    @RequestWrapper(
            localName = "Subtract",
            targetNamespace = "http://tempuri.org/",
            className = "org.tempuri.Subtract"
    )
    @ResponseWrapper(
            localName = "SubtractResponse",
            targetNamespace = "http://tempuri.org/",
            className = "org.tempuri.SubtractResponse"
    )
    int subtract(@WebParam(name = "intA", targetNamespace = "http://tempuri.org/") int var1, @WebParam(name = "intB", targetNamespace = "http://tempuri.org/") int var2);

    @WebMethod(
            operationName = "Multiply",
            action = "http://tempuri.org/Multiply"
    )
    @WebResult(
            name = "MultiplyResult",
            targetNamespace = "http://tempuri.org/"
    )
    @RequestWrapper(
            localName = "Multiply",
            targetNamespace = "http://tempuri.org/",
            className = "org.tempuri.Multiply"
    )
    @ResponseWrapper(
            localName = "MultiplyResponse",
            targetNamespace = "http://tempuri.org/",
            className = "org.tempuri.MultiplyResponse"
    )
    int multiply(@WebParam(name = "intA", targetNamespace = "http://tempuri.org/") int var1, @WebParam(name = "intB", targetNamespace = "http://tempuri.org/") int var2);

    @WebMethod(
            operationName = "Divide",
            action = "http://tempuri.org/Divide"
    )
    @WebResult(
            name = "DivideResult",
            targetNamespace = "http://tempuri.org/"
    )
    @RequestWrapper(
            localName = "Divide",
            targetNamespace = "http://tempuri.org/",
            className = "org.tempuri.Divide"
    )
    @ResponseWrapper(
            localName = "DivideResponse",
            targetNamespace = "http://tempuri.org/",
            className = "org.tempuri.DivideResponse"
    )
    int divide(@WebParam(name = "intA", targetNamespace = "http://tempuri.org/") int var1, @WebParam(name = "intB", targetNamespace = "http://tempuri.org/") int var2);
}
