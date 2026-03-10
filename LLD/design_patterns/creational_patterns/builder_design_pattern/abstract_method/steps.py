from classes.http_request import HTTPRequest

class URLStep:

    def __init__(self, request):
        self.request = request

    def url(self, url):
        self.request.url = url
        return MethodStep(self.request)


class MethodStep:

    def __init__(self, request):
        self.request = request

    def method(self, method):
        self.request.method = method
        return OptionalStep(self.request)


class OptionalStep:

    def __init__(self, request):
        self.request = request

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


