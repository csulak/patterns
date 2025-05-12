package patternStrategy.withoutStrategy;

public class Payment {
    private double amount;
    private String paymentMethod;

    public Payment(double amount, String paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        // This is a bad practice because we're using if-else statements
        // Making it hard to add new payment methods
        if (paymentMethod.equals("CREDIT_CARD")) {
            System.out.println("Processing credit card payment of $" + amount);
            System.out.println("Validating card information...");
            System.out.println("Charging credit card...");
        } else if (paymentMethod.equals("PAYPAL")) {
            System.out.println("Processing PayPal payment of $" + amount);
            System.out.println("Connecting to PayPal...");
            System.out.println("Completing PayPal payment...");
        } else if (paymentMethod.equals("BITCOIN")) {
            System.out.println("Processing Bitcoin payment of $" + amount);
            System.out.println("Connecting to Bitcoin network...");
            System.out.println("Transferring Bitcoins...");
        }
    }
} 