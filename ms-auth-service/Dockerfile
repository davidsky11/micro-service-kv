FROM java:8-jre
MAINTAINER kv

ADD ./target/ms-auth-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/auth-service.jar"]

EXPOSE 5000