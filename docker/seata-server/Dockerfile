FROM openjdk:8-jre-alpine

# set environment
ENV SEATA_USER="seata"
ARG SEATA_VERSION=1.0.0

# Wait for it
VOLUME /tmp
ADD https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh

# Dockerize
ADD https://github.com/jwilder/dockerize/releases/download/v0.6.1/dockerize-alpine-linux-amd64-v0.6.1.tar.gz dockerize.tar.gz
RUN tar xzf dockerize.tar.gz
RUN chmod +x dockerize

WORKDIR /$BASE_DIR

# Add seata server
ADD seata /opt/seata
    
RUN ln -snf /usr/share/zoneinfo/$TIME_ZONE /etc/localtime && echo '$TIME_ZONE' > /etc/timezone    

# JVM Arguments
ENV EXTRA_JVM_ARGUMENTS="-XX:MaxDirectMemorySize=1024M"

ENTRYPOINT ["sh","/opt/seata/seata/bin/seata-server.sh"]
EXPOSE 8091

