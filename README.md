# Curso Java

Repositório com anotações e exercícios práticos do meu aprendizado de Java, organizado por tópicos e projetos, indo desde a sintaxe básica da linguagem até uma aplicação Spring Boot completa com persistência em banco de dados.

## Estrutura do repositório

### Fundamentos da linguagem (raiz do projeto)
Classes soltas usadas para praticar a sintaxe básica de Java:
- Estruturas de controle: `EstruturaCondicional`, `EstruturaFor`, `EstruturaWhile`, `EstruturaDoWhile`, `CondicaoTernaria`
- Datas e horas: `DataEHora`, `CalculosDataHora`, `ConvertendoDataEmTexto`, `ConvertendoDataHoraGlobal`
- Strings e funções: `FuncoesString`, `FuncoesSintaxe`, `FuncaoSplit`
- Outros tópicos: `EscopoEInicializacao`, `OperadorBitwise`, `Debug`, `Negatives`, exercícios diversos (`ExercicioAlturas`, `ResolvendoSemOO`, etc.)

### `application/`
Exercícios de Orientação a Objetos: herança, interfaces, classes abstratas, polimorfismo, generics, coleções (`Listas`, `Map`, `Set`), tratamento de exceções, manipulação de arquivos (`FileReaderBufferedReader`, `FileWriterBufferedWriter`, `ManipulandoFile`) e expressões lambda/streams (`Predicate`, `Pipeline`, `FuncoesComoParametro`).

### `entities/`
Classes de domínio usadas nos exercícios de OOP (`Account`, `Client`, `Employee`, `Product`, `Worker`, formas geométricas como `Circle`/`Rectangle`/`Shape`, enums em `entities/enums`, etc.).

### `model/`
Exercício mais completo simulando um sistema de aluguel de veículos, com separação em `entities` (contratos, faturas, veículos), `exceptions` e `services` (cálculo de juros, impostos, pagamento online).

### `devices/` e `util/`
Exemplos de interfaces e composição (`Device`, `Printer`, `Scanner`) e classes utilitárias (`Calculator`, `PriceUpdate`, predicados e comparadores).

### JDBC — acesso a banco de dados
- **`jdbc1/`**: exemplos básicos de JDBC (inserção, atualização, remoção e transação de dados).
- **`demo-dao-jdbc/`**: aplicação com padrão DAO (`DaoFactory`, `SellerDao`, `DepartmentDao`) sobre JDBC puro.

### JPA / Hibernate
- **`jpa/`**: primeiros exemplos de JPA sem Maven.
- **`jpamaven/`**: mesmo conteúdo, agora estruturado como projeto Maven.

### `course/` — Projeto final: Web Service com Spring Boot
Aplicação REST completa (`CourseApplication`) com:
- **Entidades**: `User`, `Order`, `OrderItem`, `Product`, `Category`, `Payment`
- **Camadas**: `repositories` (Spring Data JPA), `service` e `resource` (controllers REST)
- **Tratamento de exceções**: `ResourceNotFoundException`, `DataBaseException`, `ResourceExceptionHandler`
- Testes em `src/test`

## Tecnologias
- Java
- Maven
- Spring Boot / Spring Data JPA
- JDBC / Hibernate

## Como executar

Os exercícios soltos (raiz, `application/`, `entities/`, etc.) podem ser compilados e executados diretamente, ex.:

```bash
javac Main.java
java Main
```

Já o projeto `course/` é um projeto Maven independente:

```bash
cd course
./mvnw spring-boot:run
```
