.PHONY: all init build test run

APP_NAME=$name$

test:
	@echo "Running local tests"
	JAVA_OPTS="--add-exports java.base/sun.nio.ch=ALL-UNNAMED" sbt test

run:
	@echo "Running application $name$"