FROM  openjdk:21-jdk

EXPOSE  8082

ARG   JAR_FILE=target/*.jar

COPY  ${JAR_FILE}  login
ENTRYPOINT [ "java" ,"-jar", "/login" ]