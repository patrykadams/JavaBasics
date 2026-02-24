package lesson02_oop;

/**
 * PayPal implementation of PaymentMethod.
 */
public class PayPalPayment extends BasePayment implements PaymentMethod {

    public PayPalPayment(String transactionId) {
        super(transactionId);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Redirecting to PayPal Secure Gateway...");
        logTransaction(getProviderName(), amount);
    }

    @Override
    public String getProviderName() {
        return "PAYPAL";
    }
}