package patternStrategy.withStrategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("Connecting to PayPal...");
        System.out.println("Completing PayPal payment...");
    }
} 