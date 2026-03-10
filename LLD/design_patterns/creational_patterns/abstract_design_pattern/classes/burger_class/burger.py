from abc import ABC, abstractmethod


# Product Interface
class Burger(ABC):

    @abstractmethod
    def prepare(self):
        pass


