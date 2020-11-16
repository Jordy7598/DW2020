FROM adoptopenjdk/openjdk8:latest
RUN	mkdir /usr/src/demo
copy demo-0.0.1-SNAPSHOT.jar /usr/src/demo
WORKDIR /usr/src/demo
EXPOSE 9090
CMD ["java","-jar","-Dspring.data.mongodb.host=mongodbcontainer","/usr/src/demo/demo-0.0.1-SNAPSHOT.jar"]
