package patternStrategy.withStrategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Validating card information...");
        System.out.println("Charging credit card...");
    }
} 