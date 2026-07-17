package stratergy;

public class PaymentFailureException extends RuntimeException {
    public PaymentFailureException(String message) {
        super(message);
    }
}
