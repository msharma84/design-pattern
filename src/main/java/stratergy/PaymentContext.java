package stratergy;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public PaymentContext() {
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void paymentProcess(int amount){
        paymentStrategy.executePayment(amount);
    }
}
