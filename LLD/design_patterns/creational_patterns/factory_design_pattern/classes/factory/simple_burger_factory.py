from ..basic_burger import BasicBurger
from ..factory.burger_factory import BurgerFactory

class simpleBurgerFactory(BurgerFactory):
    
    def create_burger(self):
        return BasicBurger()