# fj-daogen-quarkus-demo

[Fugerit Daogen Mars](https://github.com/fugerit-org/fj-daogen) demo project based on [Quarkus](README_QUARKUS.md).

[![Keep a Changelog v1.1.0 badge](https://img.shields.io/badge/changelog-Keep%20a%20Changelog%20v1.1.0-%23E05735)](https://github.com/fugerit-org/fj-daogen-quarkus-demo/blob/master/CHANGELOG.md)
[![license](https://img.shields.io/badge/License-Apache%20License%202.0-teal.svg)](https://opensource.org/licenses/Apache-2.0)
[![code of conduct](https://img.shields.io/badge/conduct-Contributor%20Covenant-purple.svg)](https://github.com/fugerit-org/fj-universe/blob/main/CODE_OF_CONDUCT.md)

[![Java runtime version](https://img.shields.io/badge/run%20on-java%208+-%23113366.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://universe.fugerit.org/src/docs/versions/java8.html)
[![Java build version](https://img.shields.io/badge/build%20on-java%2017+-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://universe.fugerit.org/src/docs/versions/java17.html)
[![Apache Maven](https://img.shields.io/badge/Apache%20Maven-3.9.0+-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)](https://universe.fugerit.org/src/docs/versions/maven3_9.html)

## Quickstart

Start in dev mode 

```shell script
mvn compile quarkus:dev
```

Open [dev ui](http://localhost:8080/q/dev-ui/)

## Project creation script

```shell script
mvn io.quarkus:quarkus-maven-plugin:3.8.0:create \
-DprojectGroupId=org.fugerit.java.demo \
-DprojectArtifactId=fj-daogen-quarkus-demo \
-Dextensions='resteasy-reactive-jackson,quarkus-arc,quarkus-config-yaml,junit5'
```

