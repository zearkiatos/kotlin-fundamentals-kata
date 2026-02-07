run:
	./gradlew run

package:
	./gradlew distTar

build:
	./gradlew --no-daemon shadowJar

test:
	./gradlew test

docker-ci:
	docker build -t kotlin-fundamentals-kata:latest -f ci.Dockerfile .