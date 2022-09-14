package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {
    CalculatorMet con = new CalculatorMet();

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(name = "num1",required = false) Integer x,
                       @RequestParam(name = "num2",required = false) Integer y) {
        if (y == null || x == null) {
            return "Проверьте все параметры";
        }
        int plus = con.plus(x, y);
        return x + "+" + y + "=" + plus;
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(name = "num1", required = false) Integer x,
                        @RequestParam(name = "num2",required = false) Integer y) {
        if (y == null || x == null) {
            return "Проверьте все параметры";
        }
        int minus = con.minus(x, y);
        return x + "-" + y + "=" + minus;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(name = "num1",required = false) Integer x,
                           @RequestParam(name = "num2",required = false) Integer y) {
        if (y == null || x == null) {
            return "Проверьте все параметры";
        }
        int multiply = con.multiply(x, y);
        return x + "*" + y + "=" + multiply;
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(name = "num1",required = false) Integer x,
                         @RequestParam(name = "num2",required = false) Integer y) {
        if (y == 0) {
            return "На ноль делить нельзя!";
        }
        if (y == null || x == null) {
            return "Проверьте все параметры";
        }
        double divide = con.divide(x, y);
        return x + "/" + y + "=" + divide;
    }
}


