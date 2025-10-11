#base image
FROM openjdk

#working directory
WORKDIR /usr/src/myapp

#copy all things from current directory to working directory 
COPY . /usr/src/myapp/

#compile the java file
RUN javac Test.java

#command
CMD [ "java", "Test" ]