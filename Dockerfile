# Fast docker build that skip multi-stage image creation.
FROM odo-docker-signed-local.artifactory.oci.oraclecorp.com/oci-oel7x-jdk11:1.0.291
WORKDIR /helidon/helidon-mp-example-server

LABEL version="latest"

COPY helidon-mp-example-server/target/libs ./libs
COPY helidon-mp-example-server/target/helidon-mp-example-server.jar helidon-mp-example-server.jar

ENTRYPOINT ["java", "-jar", "helidon-mp-example-server.jar"]

EXPOSE 8080
