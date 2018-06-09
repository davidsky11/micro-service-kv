FROM java:8-jre
MAINTAINER kv

ADD ./target/ms-registry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761