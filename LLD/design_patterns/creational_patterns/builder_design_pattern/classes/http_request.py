class HTTPRequest:

    def __init__(self):
        self.url = None
        self.method = None
        self.headers = None
        self.body = None
        self.timeout = None

    def __str__(self):
        return f"""
URL: {self.url}
Method: {self.method}
Headers: {self.headers}
Body: {self.body}
Timeout: {self.timeout}
"""