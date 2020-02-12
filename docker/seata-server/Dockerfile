FROM openjdk:8-jre-alpine

# set environment
ENV SEATA_USER="seata"

ARG SEATA_VERSION=1.0.0

WORKDIR /$BASE_DIR

# Add seata server
ADD seata /opt/seata
    
RUN ln -snf /usr/share/zoneinfo/$TIME_ZONE /etc/localtime && echo '$TIME_ZONE' > /etc/timezone    

# JVM Arguments
ENV EXTRA_JVM_ARGUMENTS="-XX:MaxDirectMemorySize=1024M"

ENTRYPOINT ["sh","/opt/seata/seata/bin/seata-server.sh"]
EXPOSE 8091

