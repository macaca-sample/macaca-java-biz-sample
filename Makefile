git_version = $$(git branch 2>/dev/null | sed -e '/^[^*]/d'-e's/* \(.*\)/\1/')
npm_bin= $$(npm bin)

all: test
test: server
	mvn -s settings.xml clean install
	mvn test
server:
	macaca server --verbose &
install:
	mvn -s settings.xml clean install -Dmaven.test.skip=true
.PHONY: test
