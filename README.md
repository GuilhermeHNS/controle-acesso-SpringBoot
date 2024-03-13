# Spring Security Study Project

[image](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
[image](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
[image](https://img.shields.io/badge/json%20web%20tokens-323330?style=for-the-badge&logo=json-web-tokens&logoColor=pink)

Este projeto é uma aplicação de estudo desenvolvida em Spring Boot, focada na implementação e compreensão do Spring Security. A aplicação oferece funcionalidades básicas, como login, cadastro de usuários e produtos, com diferentes níveis de permissões para cada função.

## Funcionalidades

1. **Login:**
   - Autenticação segura por meio de Spring Security.
   - Controle de acesso baseado em roles.

2. **Cadastro de Usuários:**
   - Registro seguro de novos usuários.
   - Atribuição de roles específicas a cada usuário.

3. **Cadastro de Produtos:**
   - Adição e gerenciamento de produtos na aplicação.
   - Controle de acesso baseado nas roles do usuário.

## Tecnologias Utilizadas

- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- Flyway
- JWT Token

## Configuração do Banco de Dados e do Token

Altere as configurações no arquivo `application.properties`.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/*DataBase name*
spring.datasource.username=postgres
spring.datasource.password=*Password*

api.security.token.secret=${JWT_SECRET:my-secret-key}
``` 

## Como executar
1. **Clone este repositório:**
    ```properties
    git clone https://github.com/GuilhermeHNS/controle-acesso-SpringBoot.git
    ```
2. **Instale as dependencias utilizando maven**

3. Instale o [**PostgresSQL**]([URL](https://www.postgresql.org))

4. **Navegue até o diretório do projeto:**
    ```properties
    cd spring-security-study
    ```
5. **Execute a aplicação usando Maven:**
    ```properties
    mvn spring-boot:run
    ```
6. Acesse a aplicação em http://localhost:8080

##Creditos##
Creditos a @[Fernanda-Kipper](https://github.com/Fernanda-Kipper) pela excelente aula!

