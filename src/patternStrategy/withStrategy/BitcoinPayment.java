package patternStrategy.withStrategy;

public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
        System.out.println("Connecting to Bitcoin network...");
        System.out.println("Transferring Bitcoins...");
    }
} 