package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

    public String checkNull(Integer x, Integer y) {
        if (x == null || y == null) {
        }
        return "проверьте все значения";
    }

}