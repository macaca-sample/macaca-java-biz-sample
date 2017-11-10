all: test
test: server
	mvn -s settings.xml clean install
	mvn test
server:
	macaca server --verbose &
install:
	mvn -s settings.xml clean install -Dmaven.test.skip=true
.PHONY: test
