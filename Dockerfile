FROM java:8
MAINTAINER Shao (armv7/armhf-java8) java:8
ADD /target/jewelry.jar jewelry.jar
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
  && echo 'Asia/Shanghai' >/etc/timezone \
#ADD /src/main/resources/application-dev.properties application-dev.properties
# ENV env QAZWSX
#EXPOSE 8083
ENTRYPOINT ["java","-jar","-Xms200m","-Xmx200m","jewelry.jar","--spring.profiles.active=prod"]
# 只能新增挂载点 不能映射到外部宿主机
# VOLUME ["/tmp"]








