#!/usr/bin/env bash

RELEASE_VERSION=0.0.7
IMAGE_FULL_NAME=localhost:5000/helidon-mp-example-server:${RELEASE_VERSION}
DOCKERFILE=Dockerfile

mvn clean install -DskipTests=true || exit 1


docker build -f ${DOCKERFILE} -t ${IMAGE_FULL_NAME} . || exit 1
docker image push ${IMAGE_FULL_NAME} || exit 1
