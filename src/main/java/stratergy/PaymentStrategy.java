package stratergy;

public interface PaymentStrategy {

    void executePayment(int amount) throws PaymentFailureException;
}
