package model.services;

public class BrazilTaxService {

    public Double tax(Double amount) {
        if (amount <= 100.00)
            return amount * 0.2;
        return amount + 0.15;
    }

}
