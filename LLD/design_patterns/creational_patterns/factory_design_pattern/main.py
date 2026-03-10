from classes.singh_burger import SinghBurger
from classes.factory.simple_burger_factory import simpleBurgerFactory
from classes.factory.premium_burger_factory import premiumBurgerFactory



#Hybrid Factory Design Pattern

# Client Code
# if __name__ == "__main__":

#     burger_type = "basic"

#     factory = SinghBurger()

#     burger = factory.create_burger(burger_type)

#     if burger:
#         burger.prepare()

# #Pure Factory Design Pattern

# factory=simpleBurgerFactory()
# burger=factory.create_burger()
# burger.prepare()


factory=premiumBurgerFactory()
burger=factory.create_burger()
burger.prepare()