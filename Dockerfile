FROM java:8 

# Install maven
RUN apt-get update
RUN apt-get install -y maven
RUN echo 2 | update-alternatives --config java

WORKDIR /code

# Prepare by downloading dependencies
ADD pom.xml /code/pom.xml
#RUN ["mvn", "dependency:resolve"]
#RUN ["mvn", "verify"]

# Adding source, compile and package into a fat jar
ADD src /code/src
RUN ["mvn", "package"]
RUN ["mvn", "install"]

#EXPOSE 2376
CMD ["java", "-jar", "/code/target/microservices-0.1-SNAPSHOT.jar"]
