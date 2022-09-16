package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Controller;

@Controller
public class CalculatorController {
    public Integer plus(Integer x, Integer y) {
        return x + y;
    }

    public int minus(Integer x, Integer y) {
        return x - y;
    }

    public int multiply(Integer x, Integer y) {
        return x * y;
    }

    public int divide(Integer x, Integer y) {
        return x / y;
    }

}