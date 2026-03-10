from abstract_method.steps import *
from classes.http_request import HTTPRequest

class HTTPRequestBuilderV2:

    @staticmethod
    def builder():
        return URLStep(HTTPRequest())