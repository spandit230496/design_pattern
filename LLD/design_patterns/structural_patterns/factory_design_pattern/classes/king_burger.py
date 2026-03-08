# Concrete Factory 2
from .factory.burger_factory import BurgerFactory
from .basic_wheat_burger import BasicWheatBurger
from .standard_wheat_burger import StandardWheatBurger

class KingBurger(BurgerFactory):

    def create_burger(self, type):
        if type.lower() == "basic":
            return BasicWheatBurger()

        elif type.lower() == "standard":
            return StandardWheatBurger()

        else:
            print("Invalid burger type!")
            return None


