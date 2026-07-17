package stratergy;

public class InternetBankingStrategy implements PaymentStrategy{

    @Override
    public void executePayment(int amount) throws PaymentFailureException {
        System.out.println("Executing payment with Internet banking of amount..."+amount);
    }
}
