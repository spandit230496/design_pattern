
from adapter import PaymentAdapter
from adaptee import NewPaymentGateway


def main():

    gateway = NewPaymentGateway()

    adapter = PaymentAdapter(gateway)

    adapter.pay(100)


if __name__ == "__main__":
    main()