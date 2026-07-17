package stratergy;

public class InternetBankingStrategy implements PaymentStrategy{

     private String username;
     private String password;
     private String bankName;

    public InternetBankingStrategy(String username, String password, String bankName) {
        this.username = username;
        this.password = password;
        this.bankName = bankName;
    }

    @Override
    public void executePayment(int amount) throws PaymentFailureException {
        System.out.println("Executing payment with Internet banking of amount..."+amount);
    }
}
