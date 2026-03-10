# Factory Interface
from abc import ABC ,abstractmethod

class MealFactory(ABC):

    @abstractmethod
    def create_burger(self, type):
        pass
    
    def create_garlic_bread(self,type):
        pass


