# 以Java8位基础构建镜像
FROM java:8

VOLUME /tmp

MAINTAINER taojianghang ternence.tao@foxmail.com

ADD target/springboot-docker-1.0-SNAPSHOT.jar springboot-docker.jar

ENTRYPOINT [ "sh", "-c", "java -jar springboot-docker.jar" ]