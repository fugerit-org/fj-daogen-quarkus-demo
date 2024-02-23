# fj-daogen-quarkus-demo

[Fugerit Daogen Mars](https://github.com/fugerit-org/fj-daogen) demo project based on [Quarkus](README_QUARKUS.md).

## Project creation

```shell script
mvn io.quarkus:quarkus-maven-plugin:3.8.0:create \
-DprojectGroupId=org.fugerit.java.demo \
-DprojectArtifactId=fj-daogen-quarkus-demo \
-Dextensions='resteasy-reactive-jackson,quarkus-arc,quarkus-config-yaml,junit5'
```

