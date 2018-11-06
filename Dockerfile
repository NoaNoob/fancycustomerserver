FROM tomcat:8.0.20-jre8

RUN mkdir /usr/local/tomcat/webapps/myapp

COPY /target/fancycustomerserver-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/fancycustomerserver.war
COPY tomcat-users.xml conf/tomcat-users.xml