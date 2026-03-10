from ..premium_burger import PremiumBurger
from ..factory.burger_factory import BurgerFactory

class premiumBurgerFactory(BurgerFactory):
    
    def create_burger(self):
        return PremiumBurger()