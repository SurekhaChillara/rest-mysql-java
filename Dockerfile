FROM openjdk:latest
ADD /target/rest-mysql-app.jar app.jar
#CMD ["sh","-c","touch","app.jar"]
ENTRYPOINT [ "java" ,"-jar", "app.jar"]
EXPOSE 8090