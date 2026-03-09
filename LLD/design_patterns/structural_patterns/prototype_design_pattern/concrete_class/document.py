import copy
from classes.prototype import ProtoType

import copy

class Document(ProtoType):

    def __init__(self, title, content):
        self.title = title
        self.content = content

    def clone(self):
        return copy.deepcopy(self)

    def show(self):
        print(f"Title: {self.title}")
        print(f"Content: {self.content}")
