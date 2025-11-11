# 📦 Projeto: RESTful Web API com Spring Boot e MySQL

Este projeto é uma **API RESTful** desenvolvida com **Spring Boot**, utilizando **MySQL** como banco de dados relacional. O projeto foi construído na **IDE IntelliJ IDEA**, com foco em arquitetura limpa, boas práticas e extensibilidade.

---

## 🔧 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
- **MySQL**
- **Maven** (Gerenciador de dependências)
- **IntelliJ IDEA** (IDE recomendada)
- **Lombok** (para reduzir boilerplate)
- **Swagger/OpenAPI** (para documentação da API)

---

## 📁 Estrutura do Projeto

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── seu_pacote/
│   │           ├── controller/    # Endpoints REST
│   │           ├── model/         # Entidades JPA
│   │           ├── repository/    # Interfaces JPA
│   │           ├── service/       # Lógica de negócio
│   │           └── Application.java
│   └── resources/
│       ├── application.properties # Configurações do Spring e DB
│       └── ...
└── test/                         # Testes automatizados

