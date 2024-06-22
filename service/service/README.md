# Código do Serviço

Este documento delineia uma abordagem técnica e prática para a aprendizagem da Clean Architecture utilizando Java e Quarkus. A metodologia enfatiza a análise detalhada do código-fonte e a navegação pelos READMEs do projeto para compreender a estrutura e a interação das camadas arquiteturais. Os desenvolvedores serão orientados a observar a implementação de princípios como a inversão de dependência, a separação de responsabilidades e a modularidade, aplicando modificações e incrementos no código para reforçar o entendimento teórico. Esta prática visa promover a assimilação de padrões arquiteturais e de design, resultando em soluções de software mais robustas, escaláveis e de fácil manutenção.

## Verificando Requisitos

Se até aqui, vc nao tinha baixado o projeto e o irá fazê-lo, verifique se os requisitos a seguir estão de acordo

```shell script
java --version
#result: 
java 21.0.1 2023-10-17 LTS
Java(TM) SE Runtime Environment (build 21.0.1+12-LTS-29)
Java HotSpot(TM) 64-Bit Server VM (build 21.0.1+12-LTS-29, mixed mode, sharing)

mvn --version
#result: 
Apache Maven 3.9.5 (57804ffe001d7215b5e7bcb531cf83df38f93546)
Maven home: C:\Users\rodri\devs\sdk\apache-maven-3.9.5-bin\apache-maven-3.9.5
Java version: 21.0.1, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-21
Default locale: en_US, platform encoding: UTF-8
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

```

## Rodar a aplicação
Você pode rodar a aplicação apenas usando o comando a seguir
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/service-0.0.1-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- RESTEasy Classic ([guide](https://quarkus.io/guides/resteasy)): REST endpoint framework implementing Jakarta REST and more

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
