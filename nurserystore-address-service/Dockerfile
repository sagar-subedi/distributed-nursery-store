FROM openjdk:17-alpine

VOLUME /tmp

ARG JAR_FILE

COPY target/${JAR_FILE} billing-service.jar

#Using Dokerize to check whether db is up, if it is then start this service.
COPY dockerize dockerize

CMD ./dockerize -wait tcp://nurserystore-mysql-db:3306 -timeout 15m java -Djava.security.egd=file:/dev/./urandom -jar /billing-service.jar