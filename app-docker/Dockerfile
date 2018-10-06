FROM tstrelar/hollow-base:LATEST
MAINTAINER tstrelar@gmail.com
COPY target/swarm-app.war /tmp/opt/app/
USER root
RUN chown -R jboss:jboss /tmp && cp -rp /tmp/* / && rm -rf /tmp
USER jboss
ENTRYPOINT ["java","-jar","/opt/swarm/swarm-app-1.0.0-SNAPSHOT-hollow-thorntail.jar","/opt/app/swarm-app-1.0.0-SNAPSHOT.war"]
