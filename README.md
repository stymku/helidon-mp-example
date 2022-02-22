# Helidon MP Example Service

Example Helidon MP project that includes multiple REST operations.

## Build and run

With JDK11+
```bash
mvn package
java -jar helidon-mp-example-server/target/helidon-mp-example-server.jar
```

## Health check

```
curl http://localhost:8080/health
{"outcome":"UP",...
. . .
```