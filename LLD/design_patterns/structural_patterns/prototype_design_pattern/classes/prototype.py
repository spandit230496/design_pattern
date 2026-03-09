from abc import ABC,abstractmethod

class ProtoType(ABC):
    
    @abstractmethod
    def clone(self):
        pass