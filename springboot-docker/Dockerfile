# 以Java8位基础构建镜像
FROM java:8

VOLUME /tmp

MAINTAINER taojianghang ternence.tao@foxmail.com

COPY springboot-docker-1.0.jar /usr/local/bin

ENV JAVA_OPTS = ""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /usr/local/bin/springboot-docker-1.0.jar" ]