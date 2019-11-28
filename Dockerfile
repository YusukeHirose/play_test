FROM amazoncorretto:11.0.4

WORKDIR /var/app/play-test

COPY ./ /var/app/play-test

RUN chmod +x sbt

#CMD [ "./sbt run" ]