FROM openjdk:17

#se copia y se le pone un nombre mas amigable a la copia
COPY target/ChillStudy-0.0.1-SNAPSHOT.jar chillstudy-app.jar
ENTRYPOINT [ "java", "-jar", "chillstudy-app.jar" ]