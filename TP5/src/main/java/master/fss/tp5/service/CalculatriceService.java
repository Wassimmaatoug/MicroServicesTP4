package master.fss.tp5.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatriceService {

    public Double addition(Double a, Double b) {
        return a + b;
    }

    public Double soustraction(Double a, Double b) {
        return a - b;
    }

    public Double multiplication(Double a, Double b) {
        return a * b;
    }

    public Double division(Double a, Double b) {
        if (b == 0) throw new ArithmeticException("Division par zéro");
        return a / b;
    }
}