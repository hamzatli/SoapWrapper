package az.main.controller;


import az.main.service.CalculatorRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/calc")
public class RestController {

    @Autowired
    private CalculatorRest calculatorRest;


   /*
   Request format

   http://localhost:8080/calc/add?a=10&b=5
    */

    @GetMapping("/add")
    public int add(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b ){

        return calculatorRest.add(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b ){
        return calculatorRest.multiply(a, b);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b ){
        return calculatorRest.divide(a, b);
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b ){
        return calculatorRest.subtract(a, b);
    }

}
