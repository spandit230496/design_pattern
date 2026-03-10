public class Client {

    public static void main(String[] args) {

        NewPaymentGateway gateway = new NewPaymentGateway();

        PaymentProcessor adapter = new PaymentAdapter(gateway);

        adapter.pay(100);

    }

}

