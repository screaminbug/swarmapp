FROM tstrelar/backbone:latest
MAINTAINER tstrelar@gmail.com
COPY target/swarm-app.war /tmp/opt/app/
USER root
RUN chown -R jboss:jboss /tmp && cp -rp /tmp/* / && rm -rf /tmp
USER jboss
ENTRYPOINT ["java","-jar","/opt/swarm/swarm-app-hollow-thorntail.jar","/opt/app/swarm-app.war"]
