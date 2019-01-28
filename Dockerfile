FROM java:8

COPY . /var/test/samplejava
WORKDIR /var/test/samplejava
RUN javac Sleeper.java
CMD ["java", "Sleeper"]


#docker tag sleeper:latest new-repo:sleeper
#docker push new-repo:tagname