FROM java:8
ADD ${WORKSPACE}/build/libs/demo-server-service-0.0.1-SNAPSHOT.jar app.jar
VOLUME /tmp
VOLUME /target
RUN bash -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
