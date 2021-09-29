# DIO-SPRING-BOOT-PROJECT

## Sobre 📰

Este é um desafio de projeto realizado na digitalinnovation.one.

O objetivo desta aplicação é desenvolver uma api Rest, com um conjunto de funcionalidades para um cadastro de pessoas.

------

## Requisitos do Projeto

* Desenvolver o projeto utilizando Spring-boot
* Seguir o padrão REST
* Implementar um CRUD de pessoas
* Mapear entidades, implementar e utilizar Banco de dados


## Requisito bônus do Projeto

* Criar um teste unitario na funcionalidade de criação de pessoas

------

## Tecnologias & bibliotecas utilizadas 💻

- Spring-boot
- Java
- H2
- Gradle
- Lombok
- Mapstruct
- Java Bean Validation

## Como baixar e executar o projeto 💡

### BACK-END
```bash

# Primeiramente clone o repositorio
$ git clone https://github.com/Joaquimlagos/dio-api-person-improved.git

# Agora, verifique se você tem o gradle instalado em uma versão superior a 4.6
$ gradle -v

# Agora digite o seguinte comando para aplicação rodar
$ gradle bootRun 
```
------
### Testar a aplicação

```bash
# Após o programa estar rodando, ele já estara disponível no seguinte endereço:
$ localhost:8080
# para acessar o banco de dados insira esta url:
$ localhost:8080/h2-console
# lembrando que a JDBC URL vai ser informada quando o programa estivar inicializando, fique atendo no console para pegar o endereço

# Para testar as funcionalidades pro programa utilize a segui nte url:
$ http://localhost:8080/api/v1/people/

```
