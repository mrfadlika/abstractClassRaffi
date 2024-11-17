abstract class Payment {
    protected int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardholderName;

    public CreditCardPayment(int amount, String cardNumber, String cardholderName) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardholderName = cardholderName;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment");
        System.out.println("Amount: Rp" + amount);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Cardholder: " + cardholderName);
    }
}

class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(int amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment");
        System.out.println("Amount: Rp" + amount);
        System.out.println("PayPal Email: " + email);
    }
}

class CashPayment extends Payment {
    public CashPayment(int amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Cash Payment");
        System.out.println("Amount: Rp" + amount);
    }
}

public class PaymentMain {
    public static void main(String[] args) {
        CreditCardPayment cc = new CreditCardPayment(100500, "1234-5678-9012-3456", "Raffi Fadlika");
        PayPalPayment pp = new PayPalPayment(750000, "raffifadlika@raffifadlika.com");
        CashPayment cash = new CashPayment(50000);

        System.out.println("=== Different Payment Methods ===\n");

        cc.processPayment();
        System.out.println();

        pp.processPayment();
        System.out.println();

        cash.processPayment();
    }
}