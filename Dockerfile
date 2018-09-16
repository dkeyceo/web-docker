FROM airhacks/glassfish
#FROM jboss/wildfly
COPY ./target/web-docker.war ${DEPLOYMENT_DIR}
#COPY ./target/web-docker.war /opt/wildfly13/standalone/deployments