#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim
#Information who maintains the image
MAINTAINER engkisha.com
#label

#Add the app jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
#execute the app
ENTRYPOINT [ "java","-jar","accounts-0.0.1-SNAPSHOT.jar"]