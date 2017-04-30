FROM maven:3-jdk-7 as builder
RUN mkdir -p /tmp/app/src
COPY pom.xml /tmp/app/
COPY src /tmp/app/src
WORKDIR /tmp/app
RUN mvn package
FROM tomcat:7.0-jre7-alpine
COPY --from=builder build/libs/wizard*.war $CATALINA_HOME/webapps/wizard.war

