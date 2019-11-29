FROM "amazoncorretto:11.0.4"

COPY ./ /var/app/play-test

WORKDIR /var/app/play-test

RUN chmod +x ./sbt ./sbt-dist/bin/sbt \
    && ./sbt

#CMD [ "./sbt compile" ]