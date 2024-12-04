# crud-spring-data

Projeto realizado para a cadeira de Programação Orientada a Objetos da Universidade Luterana do Brasil - Campus Torres, com o professor Daniel Souza no período de 2024/2. O projeto foi desenvolvido na IDE Intellij IDEA utilizando **Java Spring Boot**, e também o conceito de *spring data* para realizar uma conexão com um banco de dados PostgreSQL, este sendo executado através de um container via Docker e o software *Insomnia* para testes de rotas do CRUD.


## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

### 📋 Pré-requisitos

- IDE que identifique e execute a linguagem JAVA;
- Docker
- Software que teste requisições HTTP
- PostgreSQL
- SGBD compatível com o banco utilizado


### 🔧 Instalação

Uma série de exemplos passo-a-passo que informam o que você deve executar para ter um ambiente de desenvolvimento em execução.

Passo 1:
*Abrir terminal*

Passo 2: 
```
mkdir {nome da pasta}
```

Passo 3:
```
cd {nome da pasta}
```

Passo 4:
*
```
git clone https://github.com/PauloUlbra/crud-spring-data
```

Passo 5:

*Abrir projeto na IDE*

Passo 6:

*Abrir o terminal do docker*

Passo 7:

Digitar o comando:
```
docker run --name meu-postgres -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=1234 -p 5432:5432 -d postgres  
```

Passo 8:

*Executar container*

Passo 9:

*Abrir crud-spring-data/src/main/resources/application.properties*

Passo 10:

*Alterar* 
```
spring.jpa.hibernate.ddl-auto=update
```
*para* 
```
spring.jpa.hibernate.ddl-auto=create
```

## 🛠️ Construído com

Mencione as ferramentas que você usou para criar seu projeto

* [Spring](https://start.spring.io) - Inicializador do Spring
* [Gradle](https://grade.org) - Gerente de Dependência
* [JAVA](https://www.java.com/pt-BR/) - Linguagem utilizada


## ✒️ Autores


* **Paulo Roberto** - *Desenvolvimento e documentação* - [Paulo Roberto](https://github.com/PauloUlbra)
* **Caetano Machado** - *Desenvolvimento e documentação* - [Caetano Machado](https://github.com/MACHADO-Caetano)

