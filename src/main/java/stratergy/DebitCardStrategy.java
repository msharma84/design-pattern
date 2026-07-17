package stratergy;

public class DebitCardStrategy implements PaymentStrategy{

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public DebitCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void executePayment(int amount) throws PaymentFailureException {
        System.out.println("Executing payment with Debit card of amount..."+amount);
    }
}
