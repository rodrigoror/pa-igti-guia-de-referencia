# Capitulo 1 - Código do Serviço / Run Service

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
Maven home: C:\Users\...\apache-maven-3.9.5-bin\apache-maven-3.9.5
Java version: 21.0.1, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-21
Default locale: en_US, platform encoding: UTF-8
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

```

Docker Desktop instalado 
Current version: 4.30.0 (149282)

```shell script
Você pode precisar habilitar a virtualização na BIOS para usar o docker corretamente. 
Verifique se o fabricante disponibiliza uma documentação de como habilitar.
```

## Rodar a aplicação

Após tudo instalado (Java, MVN, DOcker Desktop), abra sua IDE preferida, copie o endereço do GITHUB do projeto e baixe o codigo para seu ambiente local. 
Agora, abra o terminal, navegue até a pasta SERVICE do projeto e rode o comando:

```shell script
    docker-compose up -d
```

Após o download de todo o necessário, o docker irá iniciar as instâncias necessárias para que possamos rodar a aplicação.

E por fim, podemos rodar a aplicação usando o comando a seguir

```shell script
./mvnw compile quarkus:dev
#result
guide.reference  0.0.1 on JVM (powered by Quarkus 3.11.0) started in 14.318s. Listening on: http://localhost:8080
```
## Acessar ferramentas

http://localhost:8080/ < Para garantir que o projeto está funcionando corretamente>

http://localhost:16686/ < Para ver o JAEGER capiturando as requisições realizadas na API>

Em Outro terminal rode o comando a seguir:

 ```shell script
 curl http://localhost:8080/ok
 #result
StatusCode        : 200
StatusDescription : OK
Content           : {"message":"System check is ok"}
```

## E a próxima etapa

Agora estamos prontos para avançar em nosso aprendizado.

[Capitulo 2 - Arquitetura e divisão de camadas ](https://github.com/rodrigoror/pa-igti-guia-de-referencia/blob/main/service/service/src/main/README.md)