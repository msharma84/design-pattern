package stratergy;

public class CreditCardStrategy implements PaymentStrategy{

    @Override
    public void executePayment(int amount) throws PaymentFailureException {
        System.out.println("Executing payment with Credit card of amount..."+amount);
    }
}
