package stratergy;

public class DebitCardStrategy implements PaymentStrategy{

    @Override
    public void executePayment(int amount) throws PaymentFailureException {
        System.out.println("Executing payment with Debit card of amount..."+amount);
    }
}
