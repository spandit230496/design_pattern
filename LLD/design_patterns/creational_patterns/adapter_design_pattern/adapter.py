
from target import PaymentProcessor
from adaptee import NewPaymentGateway


class PaymentAdapter(PaymentProcessor):

    def __init__(self, gateway: NewPaymentGateway):
        self.gateway = gateway

    def pay(self, amount):
        print("processing payment from new payment class")
        self.gateway.make_payment(amount)