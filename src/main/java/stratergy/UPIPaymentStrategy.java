package stratergy;

public class UPIPaymentStrategy implements PaymentStrategy{

    private String upiId;

    public UPIPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void executePayment(int amount) throws PaymentFailureException {
        System.out.println("Executing payment with UPI of amount..."+amount);
    }
}
