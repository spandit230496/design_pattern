
from builder.http_request_builder import HTTPRequestBuilder
from builder.http_request_builder_v2 import HTTPRequestBuilderV2

# req=(HTTPRequestBuilder()
#      .url("www.google.com")
#      .method("POST")
#      .body({"name":"sandip"})
#      .headers({"content-type":"application/json"})
#      .timeout(5)
#      .build()
#      )

# print(req)

request = (
    HTTPRequestBuilderV2.builder()
    .url("https://api.example.com")
    .method("POST")
    .headers({"Authorization": "Bearer token"})
    .body({"name": "Sandip"})
    .timeout(30)
    .build()
)

print(request)