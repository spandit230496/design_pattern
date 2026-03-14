package LLD.design_patterns.behavioral_patterns.strategy_design_pattern;

interface PaymentStrategy {
    void pay(int amount);
}

class UPIPayment implements PaymentStrategy {
    public void pay(int amount){
        System.out.println("UPI payment");
    }
}
class CardPayment implements PaymentStrategy {
    public void pay(int amount){
        System.out.println("Card payment");
    }
}
class PaymentService {

    PaymentStrategy strategy;

    public PaymentService(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void pay(int amount){
        strategy.pay(amount);
    }
}

public class Main {

    public static void main(String[] args) {

        // Using UPI Payment Strategy
        PaymentStrategy upi = new UPIPayment();
        PaymentService context = new PaymentContext(upi);
        context.payAmount(500);

        // Changing strategy at runtime
        PaymentStrategy card = new CreditCardPayment();
        context = new PaymentContext(card);
        context.payAmount(1000);

    }
}
