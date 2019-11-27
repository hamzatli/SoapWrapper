package az.main.org;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {
    }

    public Add createAdd() {
        return new Add();
    }

    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    public Subtract createSubtract() {
        return new Subtract();
    }

    public SubtractResponse createSubtractResponse() {
        return new SubtractResponse();
    }

    public Multiply createMultiply() {
        return new Multiply();
    }

    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    public Divide createDivide() {
        return new Divide();
    }

    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }
}
