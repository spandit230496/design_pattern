from classes.factory.meal_factory import MealFactory
from classes.burger_class.basic_burger import BasicBurger as simple_burger
from classes.burger_class.premium_burger import PremiumBurger
from classes.garlic_bread.simple_garlic_bread import simpleGarlic
from classes.garlic_bread.premium_garlic_bread import premiumGarlic


class kingResturant(MealFactory):
    
    def create_burger(self, type):
        if type=='simple':
            return simple_burger()
        
        if type=='premium':
            return PremiumBurger()
        
    def create_garlic_bread(self, type):
        if type =='simple':
            return simpleGarlic()
        if type == 'premium':
            return premiumGarlic()