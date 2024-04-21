# fj-daogen-quarkus-demo

[Fugerit Daogen Mars](https://github.com/fugerit-org/fj-daogen) demo project based on [Quarkus](README_QUARKUS.md).

[![Keep a Changelog v1.1.0 badge](https://img.shields.io/badge/changelog-Keep%20a%20Changelog%20v1.1.0-%23E05735)](https://github.com/fugerit-org/fj-daogen-quarkus-demo/blob/master/CHANGELOG.md)
[![license](https://img.shields.io/badge/License-Apache%20License%202.0-teal.svg)](https://opensource.org/licenses/Apache-2.0)
[![code of conduct](https://img.shields.io/badge/conduct-Contributor%20Covenant-purple.svg)](https://github.com/fugerit-org/fj-universe/blob/main/CODE_OF_CONDUCT.md)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=fugerit-org_fj-daogen-quarkus-demo&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=fugerit-org_fj-daogen-quarkus-demo)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=fugerit-org_fj-daogen-quarkus-demo&metric=coverage)](https://sonarcloud.io/summary/new_code?id=fugerit-org_fj-daogen-quarkus-demo)
[![Docker images](https://img.shields.io/badge/dockerhub-images-important.svg?logo=Docker)](https://hub.docker.com/repository/docker/fugeritorg/fj-daogen-quarkus-demo/general)


[![Java runtime version](https://img.shields.io/badge/run%20on-java%2021+-%23113366.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://universe.fugerit.org/src/docs/versions/java21.html)
[![Java build version](https://img.shields.io/badge/build%20on-GraalVM%2021+-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://universe.fugerit.org/src/docs/versions/gvm21.html)
[![Apache Maven](https://img.shields.io/badge/Apache%20Maven-3.9.0+-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)](https://universe.fugerit.org/src/docs/versions/maven3_9.html)


## Quickstart

Start in dev mode 

```shell script
mvn compile quarkus:dev -Duser.timezone=UTC -Dfile.encoding=UTF-8
```

Open [dev ui](http://localhost:8080/q/dev-ui/) or sample [API Page](http://localhost:8080/)

## Java package version

build : 

```shell script
mvn package
```

and run : 

```shell script
java -jar target/quarkus-app/quarkus-run.jar
```

## Java package uber jar version

build :

```shell script
mvn package -Dquarkus.package.type=uber-jar
```

and tun : 

```shell script
java -jar target/fj-daogen-quarkus-demo-*-runner.jar
```



## Docker container (jvm version)

Build :

```shell script
docker build --file src/main/docker/Dockerfile.corretto-jvm -t fj-daogen-quarkus-demo:local-jvm .
```

```shell script
docker run -p 8080:8080 --name fj-daogen-quarkus-demo-local fj-daogen-quarkus-demo:local-jvm
```

## Native package version

Build : 

First you need to setup [GraalVM](https://www.graalvm.org/) :
[BUILDING A NATIVE EXECUTABLE](https://quarkus.io/guides/building-native-image)

```shell script
mvn install -Dnative
```

Run :

```shell script
./target/fj-daogen-quarkus-demo-*-runner -Duser.timezone=UTC -Dfile.encoding=UTF-8
```

## Docker container (native version)

Build :

```shell script
docker build --file src/main/docker/Dockerfile.native-micro -t fj-daogen-quarkus-demo:local-native .
```

```shell script
docker run -p 8080:8080 --name fj-daogen-quarkus-demo-local fj-daogen-quarkus-demo:local-native
```

## Project creation script

```shell script
mvn io.quarkus:quarkus-maven-plugin:3.8.0:create \
-DprojectGroupId=org.fugerit.java.demo \
-DprojectArtifactId=fj-daogen-quarkus-demo \
-Dextensions='resteasy-reactive-jackson,quarkus-arc,quarkus-config-yaml,junit5'
```

