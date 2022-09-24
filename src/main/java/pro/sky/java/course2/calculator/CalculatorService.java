package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@RequestMapping(value = "/calculator")
public class CalculatorService {
    private CalculatorController calculatorController;

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(name = "num1", required = false) Integer x, @RequestParam(name = "num2", required = false) Integer y) {
        calculatorController.checkNull(x, y);
        int plus = calculatorController.plus(x, y);
        return x + "+" + y + "=" + plus;
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(name = "num1", required = false) Integer x, @RequestParam(name = "num2", required = false) Integer y) {
        calculatorController.checkNull(x, y);
        int minus = calculatorController.minus(x, y);
        return x + "-" + y + "=" + minus;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(name = "num1", required = false) Integer x, @RequestParam(name = "num2", required = false) Integer y) {
        calculatorController.checkNull(x, y);
        int multiply = calculatorController.multiply(x, y);
        return x + "*" + y + "=" + multiply;
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer x, @RequestParam(name = "num2", required = false) Integer y) {
        if (y == 0) {
            return "На ноль делить нельзя!";
        }
        calculatorController.checkNull(x, y);
        double divide = calculatorController.divide(x, y);
        return x + "/" + y + "=" + divide;
    }
}