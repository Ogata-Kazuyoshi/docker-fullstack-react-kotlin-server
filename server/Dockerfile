FROM amazoncorretto:17 AS build
COPY ./ /home/app
RUN chmod +x /home/app/gradlew
RUN cd /home/app && ./gradlew build