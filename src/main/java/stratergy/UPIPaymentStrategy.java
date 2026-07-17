package stratergy;

public class UPIPaymentStrategy implements PaymentStrategy{

    @Override
    public void executePayment(int amount) throws PaymentFailureException {
        System.out.println("Executing payment with UPI of amount..."+amount);
    }
}
