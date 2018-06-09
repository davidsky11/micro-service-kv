FROM java:8-jre
MAINTAINER kv

ADD ./target/ms-gateway.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gateway.jar"]

EXPOSE 4000