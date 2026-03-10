# Factory Interface
from abc import ABC ,abstractmethod

class BurgerFactory(ABC):

    @abstractmethod
    def create_burger(self, type):
        pass


