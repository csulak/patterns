package patternStrategy.withoutStrategy;

public class Main {
    public static void main(String[] args) {
        // Example without Strategy Pattern
        Payment creditCardPayment = new Payment(100.00, "CREDIT_CARD");
        Payment paypalPayment = new Payment(50.00, "PAYPAL");
        Payment bitcoinPayment = new Payment(75.00, "BITCOIN");

        System.out.println("Processing payments without Strategy Pattern:");
        System.out.println("----------------------------------------");
        creditCardPayment.processPayment();
        System.out.println("----------------------------------------");
        paypalPayment.processPayment();
        System.out.println("----------------------------------------");
        bitcoinPayment.processPayment();
    }
} 