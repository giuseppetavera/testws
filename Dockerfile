# set base Docker image to AdoptOpenJDK Ubuntu Docker image
FROM registry.access.redhat.com/openjdk/openjdk-11-rhel7
LABEL maintainer="Test S.p.A"

# set Docker image build arguments
# build arguments for user/group configurations
ARG USER_ID=1001
ARG USER_GROUP_ID=0
ARG USER_HOME=/home/app

#VOLUME ${USER_HOME}/tmp
USER 0

RUN mkdir -p ${USER_HOME}/config
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /home/app/app.jar
RUN chmod -R g=u ${USER_HOME}

# set the user and work directory
USER ${USER_ID}
WORKDIR ${USER_HOME}

# expose ports
EXPOSE 8080

# initiate container and start Spring services
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /home/app/app.jar ${0} ${@}"]