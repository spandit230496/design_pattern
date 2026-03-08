from classes.singh_burger import SinghBurger


# Client Code
if __name__ == "__main__":

    burger_type = "basic"

    factory = SinghBurger()

    burger = factory.create_burger(burger_type)

    if burger:
        burger.prepare()