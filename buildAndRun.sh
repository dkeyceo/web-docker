#!/bin/sh
mvn clean package && docker build -t com.dkey.web/web-docker .
docker rm -f web-docker || true && docker run -d -p 8080:8080 --name web-docker com.dkey.web/web-docker
