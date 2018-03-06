# MinIE Service

Code for exposing [MinIE - Open Information Extraction system](https://github.com/gkiril/minie) as a service.

Start with:

```bash
$ mvn clean compile exec:java
[..]

[INFO] --- exec-maven-plugin:1.6.0:java (default-cli) @ minie-service ---
MinIE Service
Mar 06, 2018 8:43:13 PM org.glassfish.grizzly.http.server.NetworkListener start
INFO: Started listener bound to [localhost:8080]
Mar 06, 2018 8:43:13 PM org.glassfish.grizzly.http.server.HttpServer start
INFO: [HttpServer] Started.
Application started.
Stop the application using CTRL+C
```

Use the service with:

```bash
$ curl 'http://localhost:8080/minie/query' -X POST -d 'Obama visited the white house.' | jq .
{
  "facts": [
    {
      "subject": "Obama",
      "predicate": "visited",
      "object": "white house"
    }
  ]
}
```
