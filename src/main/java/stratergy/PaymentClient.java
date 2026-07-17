package stratergy;

public class PaymentClient {

    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();

        // Payment using UPI
        paymentContext.setPaymentStrategy(new UPIPaymentStrategy());
        paymentContext.paymentProcess(100);

        // Payment using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardStrategy());
        paymentContext.paymentProcess(200);

        // Payment using Internet Banking
        paymentContext.setPaymentStrategy(new InternetBankingStrategy());
        paymentContext.paymentProcess(150);
    }
}
