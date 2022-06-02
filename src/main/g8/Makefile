.PHONY: all init build test run

APP_NAME=$name$
GIT_HASH?=\$(shell git rev-parse --short HEAD)

all: init build test run

init:
	@echo "Initializing base sbt image" #~530Mb
	docker pull hseeberger/scala-sbt:eclipse-temurin-11.0.14.1_1.6.2_2.13.8
build: init
	@echo "Building docker image"
	echo \$(GIT_HASH)
	DOCKER_BULDKIT=1 docker build --target test -t \$(APP_NAME):\$(GIT_HASH) -t \$(APP_NAME):latest -t \$(APP_NAME) .

test: build
	@echo "Running local tests"
	docker run --rm --name=\$(APP_NAME) \$(APP_NAME)Runner sbt test

run: build
	@echo "Running application $name$"