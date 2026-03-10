from ..classes.http_request import HTTPRequest

class HTTPRequestBuilder:

    def __init__(self):
        self.request = HTTPRequest()

    def url(self, url):
        self.request.url = url
        return self

    def method(self, method):
        self.request.method = method
        return self

    def headers(self, headers):
        self.request.headers = headers
        return self

    def body(self, body):
        self.request.body = body
        return self

    def timeout(self, timeout):
        self.request.timeout = timeout
        return self

    def build(self):
        return self.request