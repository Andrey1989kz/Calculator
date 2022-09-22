package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {
    private CalculatorService calculatorService;

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(name = "num1", required = false) Integer x, @RequestParam(name = "num2", required = false) Integer y) {
        calculatorService.checkNull(x, y);
        int plus = calculatorService.plus(x, y);
        return x + "+" + y + "=" + plus;
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(name = "num1", required = false) Integer x, @RequestParam(name = "num2", required = false) Integer y) {
        calculatorService.checkNull(x, y);
        int minus = calculatorService.minus(x, y);
        return x + "-" + y + "=" + minus;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(name = "num1", required = false) Integer x, @RequestParam(name = "num2", required = false) Integer y) {
        calculatorService.checkNull(x, y);
        int multiply = calculatorService.multiply(x, y);
        return x + "*" + y + "=" + multiply;
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer x, @RequestParam(name = "num2", required = false) Integer y) {
        if (y == 0) {
            return "На ноль делить нельзя!";
        }
        calculatorService.checkNull(x, y);
        double divide = calculatorService.divide(x, y);
        return x + "/" + y + "=" + divide;
    }
}