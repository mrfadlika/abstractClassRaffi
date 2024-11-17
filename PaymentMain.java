abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardholderName;

    public CreditCardPayment(double amount, String cardNumber, String cardholderName) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardholderName = cardholderName;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment");
        System.out.println("Amount: $" + amount);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Cardholder: " + cardholderName);
    }
}

class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment");
        System.out.println("Amount: $" + amount);
        System.out.println("PayPal Email: " + email);
    }
}

class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Cash Payment");
        System.out.println("Amount: $" + amount);
    }
}

public class PaymentMain {
    public static void main(String[] args) {
        CreditCardPayment cc = new CreditCardPayment(100.50, "1234-5678-9012-3456", "John Doe");
        PayPalPayment pp = new PayPalPayment(75.25, "john@example.com");
        CashPayment cash = new CashPayment(50.00);

        System.out.println("=== Different Payment Methods ===\n");

        cc.processPayment();
        System.out.println();

        pp.processPayment();
        System.out.println();

        cash.processPayment();
    }
}