#!/bin/sh

echo "Building the microservices"
cd ..; mvn clean install; cd ./scripts;

echo "Creating their images"
cd ../client-rest-microservice; docker build -t local/client-rest-microservice:1.0 .;
cd ../resource-rest-microservice; docker build -t local/resource-rest-microservice:1.0 .;

echo "Running rest microservices containers"
cd ..; docker-compose -f docker-compose.rest.yml down; docker-compose -f docker-compose.rest.yml up -d;
