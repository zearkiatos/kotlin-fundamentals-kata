FROM gradle:8.2-jdk11 AS build

RUN apt-get update && apt-get install -y \
    make \
    && rm -rf /var/lib/apt/lists/*

RUN groupadd -r appgroup && useradd -r -m kotlin -g appgroup

RUN mkdir -p /home/gradle/src && \
    chown -R kotlin:appgroup /home/gradle /home/kotlin

WORKDIR /home/gradle/src
COPY --chown=kotlin:appgroup . /home/gradle/src

USER kotlin
RUN make build

FROM gradle:8.2-jdk11 AS test

RUN apt-get update && apt-get install -y \
    make \
    && rm -rf /var/lib/apt/lists/*

RUN groupadd -r appgroup && useradd -r -m kotlin -g appgroup

RUN mkdir -p /home/gradle/src && \
    chown -R kotlin:appgroup /home/gradle /home/kotlin

WORKDIR /home/gradle/src
COPY --from=build --chown=kotlin:appgroup /home/gradle/src /home/gradle/src

USER kotlin
RUN make test