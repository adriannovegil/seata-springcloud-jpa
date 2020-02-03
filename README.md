# Spring Boot + Spring Cloud + Mybatis + SEATA

Every microservice is a Spring Boot application and can be started locally using IDE or `./mvnw spring-boot:run` command.

Please note that supporting services (__Discovery Server__) must be started before any other application (Account, Business, Order and Storage).

## Starting services locally with docker-compose

In order to start entire infrastructure using Docker, you have to build images by executing `./mvnw clean install -PbuildDocker`
from a project root.

Once images are ready, you can start them with a single command
`docker-compose up`.

*NOTE: Under MacOSX or Windows, make sure that the Docker VM has enough memory to run the microservices. The default settings
are usually not enough and make the `docker-compose up` painfully slow.*

### Load

 * Gatling load generator. Load generation starts with a delay of 5 minutes! (To ensure that all services are up and running properly.)

```

## References

 * https://github.com/seata/seata
 * https://github.com/seata/seata-go-server