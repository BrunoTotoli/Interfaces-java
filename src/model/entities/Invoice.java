package model.entities;

public class Invoice {

    private Double basicPayment;
    private Double tax;


    public Invoice() {
    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "INVOICE: \n Basic payment: " + String.format("%.2f", basicPayment) +
                "\n Tax: " + String.format("%.2f", tax) +
                "\n Total payment: " + String.format("%.2f", totalPayment());
    }

    public Double totalPayment() {
        return basicPayment + tax;
    }

    ;

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
