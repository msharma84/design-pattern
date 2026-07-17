package stratergy;

public class PaymentClient {

    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();

        // Payment using UPI
        paymentContext.setPaymentStrategy(new UPIPaymentStrategy("upi@sbi"));
        paymentContext.paymentProcess(100);

        // Payment using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardStrategy("Ambani","1111","999","10/10/2027"));
        paymentContext.paymentProcess(200);

        // Payment using Internet Banking
        paymentContext.setPaymentStrategy(new InternetBankingStrategy("jamesbond","007","Morgan Stanley"));
        paymentContext.paymentProcess(150);
    }
}
