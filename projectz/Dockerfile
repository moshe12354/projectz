FROM eclipse-temurin:11-jre
COPY target/projectz*.jar /usr/src/project.jar
COPY src/main/resources/application.properties /opt/conf/application.properties
CMD ["java", "-jar", "/usr/src/project.jar", "--spring.config.location=file:/opt/conf/application.properties"]