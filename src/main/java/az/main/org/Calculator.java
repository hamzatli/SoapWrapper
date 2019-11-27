package az.main.org;


import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(
        name = "Calculator",
        targetNamespace = "http://tempuri.org/",
        wsdlLocation = "http://www.dneonline.com/calculator.asmx?WSDL"
)
public class Calculator extends Service {
    private static final URL CALCULATOR_WSDL_LOCATION;
    private static final WebServiceException CALCULATOR_EXCEPTION;
    private static final QName CALCULATOR_QNAME = new QName("http://tempuri.org/", "Calculator");

    public Calculator() {
        super(__getWsdlLocation(), CALCULATOR_QNAME);
    }

    public Calculator(WebServiceFeature... var1) {
        super(__getWsdlLocation(), CALCULATOR_QNAME, var1);
    }

    public Calculator(URL var1) {
        super(var1, CALCULATOR_QNAME);
    }

    public Calculator(URL var1, WebServiceFeature... var2) {
        super(var1, CALCULATOR_QNAME, var2);
    }

    public Calculator(URL var1, QName var2) {
        super(var1, var2);
    }

    public Calculator(URL var1, QName var2, WebServiceFeature... var3) {
        super(var1, var2, var3);
    }

    @WebEndpoint(
            name = "CalculatorSoap"
    )
    public CalculatorSoap getCalculatorSoap() {
        return (CalculatorSoap)super.getPort(new QName("http://tempuri.org/", "CalculatorSoap"), CalculatorSoap.class);
    }

    @WebEndpoint(
            name = "CalculatorSoap"
    )
    public CalculatorSoap getCalculatorSoap(WebServiceFeature... var1) {
        return (CalculatorSoap)super.getPort(new QName("http://tempuri.org/", "CalculatorSoap"), CalculatorSoap.class, var1);
    }

    private static URL __getWsdlLocation() {
        if (CALCULATOR_EXCEPTION != null) {
            throw CALCULATOR_EXCEPTION;
        } else {
            return CALCULATOR_WSDL_LOCATION;
        }
    }

    static {
        URL var0 = null;
        WebServiceException var1 = null;

        try {
            var0 = new URL("http://www.dneonline.com/calculator.asmx?WSDL");
        } catch (MalformedURLException var3) {
            var1 = new WebServiceException(var3);
        }

        CALCULATOR_WSDL_LOCATION = var0;
        CALCULATOR_EXCEPTION = var1;
    }
}
