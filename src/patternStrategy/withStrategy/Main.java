package patternStrategy.withStrategy;

public class Main {
    public static void main(String[] args) {
        // Example with Strategy Pattern
        PaymentContext context = new PaymentContext();
        
        System.out.println("Processing payments with Strategy Pattern:");
        System.out.println("----------------------------------------");
        
        // Process credit card payment
        context.setPaymentStrategy(new CreditCardPayment());
        context.processPayment(100.00);
        
        System.out.println("----------------------------------------");
        
        // Process PayPal payment
        context.setPaymentStrategy(new PayPalPayment());
        context.processPayment(50.00);
        
        System.out.println("----------------------------------------");
        
        // Process Bitcoin payment
        context.setPaymentStrategy(new BitcoinPayment());
        context.processPayment(75.00);
    }
} 