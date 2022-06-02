 FROM hseeberger/scala-sbt:eclipse-temurin-11.0.14.1_1.6.2_2.13.8 as base

WORKDIR /app

#Cache dependencies so subsequent builds are faster
ADD build.sbt ./
ADD ./project/build.properties ./project/
ADD ./project/plugins.sbt ./project/
RUN sbt update

# -- test image
FROM base as test
ADD . /app

