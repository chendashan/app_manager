FROM openjdk:8-jdk-alpine

ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ARG JAR_FILE
COPY ${JAR_FILE} /usr/share/intranet_app_manager.jar
ENTRYPOINT ["java","-jar","/usr/share/intranet_app_manager.jar"]
