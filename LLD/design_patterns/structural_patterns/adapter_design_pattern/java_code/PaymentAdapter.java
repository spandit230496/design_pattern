public class PaymentAdapter implements PaymentProcessor {

    private NewPaymentGateway gateway;

    public PaymentAdapter(NewPaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void pay(int amount) {
        gateway.makePayment(amount);
    }

}