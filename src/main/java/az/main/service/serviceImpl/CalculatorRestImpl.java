package az.main.service.serviceImpl;


import az.main.org.Calculator;
import az.main.service.CalculatorRest;
import org.springframework.stereotype.Service;

@Service
public class CalculatorRestImpl implements CalculatorRest {

    Calculator calculator = new Calculator();

    public int add(int a, int b) {

        return calculator.getCalculatorSoap().add(a,b);
    }

    public int multiply(int a, int b) {
        return calculator.getCalculatorSoap().multiply(a,b);
    }

    public int subtract(int a, int b) {
        return calculator.getCalculatorSoap().subtract(a,b);
    }

    public int divide(int a, int b) {
        return calculator.getCalculatorSoap().divide(a,b);
    }
}
