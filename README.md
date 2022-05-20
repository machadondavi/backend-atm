# Backend ATM - Projeto

O desafio consiste em criar um programa que simule a entrega de notas quando um cliente efetuar um saque em um caixa eletrônico, 
entregando sempre o menor número de notas. Foi desenvolvido uma RestAPI em SpringBoot, com uma classe de Controller, com o endpoint para comunicação com a aplicação 
[front-end](https://github.com/machadondavi/frontend-zenvia-challenge), e uma classe de serviço, onde está inserido o algoritmo de validação do valor do saque. Também
foi utilizada a ferramente JUnit para teste unitários, testando um valor de saque válido - de acordo com as notas disponíveis - e um valor inválido, aguardando então uma exceção.

## Tecnologias

 - Java 11;
 - SpringBoot 2.6.3;
 - Maven 4;
 - JUnit 4;

## Como executar

No terminal, clone o projeto: 

`git clone https://github.com/machadondavi/backend-zenvia-challenge.git`

Entre no diretório do projeto e instale as dependencias:

`mvn install`

Execute a aplicação:

`mvn spring-boot:run`

## Demo

<img src="https://github.com/machadondavi/backend-zenvia-challenge/blob/master/src/main/resources/static/image/caixa-eletronico.gif">
