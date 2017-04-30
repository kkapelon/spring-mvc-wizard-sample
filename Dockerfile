FROM tomcat:7.0-jre7-alpine
COPY /tmp/app/target/wizard*.war $CATALINA_HOME/webapps/wizard.war

