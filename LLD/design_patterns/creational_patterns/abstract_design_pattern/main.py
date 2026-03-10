from classes.king_resturant import kingResturant

from classes.factory.simple_burger import simpleBurger
# from classes.factory.simple_garlic_bread import simpleGarlic


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


# mealfactory=kingResturant()
# burger=mealfactory.create_burger("simple")
# burger.prepare()

burger2=simpleBurger()

burger2.prepare()

