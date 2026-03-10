# Concrete Factory 1
from .factory.burger_factory import BurgerFactory
from .basic_burger import BasicBurger
from .standard_burger import StandardBurger
from .premium_burger import PremiumBurger


class SinghBurger(BurgerFactory):

    def create_burger(self, type):
        if type.lower() == "basic":
            return BasicBurger()

        elif type.lower() == "standard":
            return StandardBurger()

        elif type.lower() == "premium":
            return PremiumBurger()

        else:
            print("Invalid burger type!")
            return None


