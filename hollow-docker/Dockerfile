FROM jboss/base-jdk:8
MAINTAINER tstrelar@gmail.com
EXPOSE 8080
COPY target/swarm-app-hollow-thorntail.jar /tmp/opt/swarm/
USER root
RUN chown -R jboss:jboss /tmp && cp -rp /tmp/* / && rm -rf /tmp
USER jboss
