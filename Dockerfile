FROM amazoncorretto:17 AS build
COPY ./server /home/app
RUN cd /home/app && ./gradlew build