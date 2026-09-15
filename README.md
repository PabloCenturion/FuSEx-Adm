# Gestão Financeira

Sistema de Gestão Financeira desenvolvido com Angular, Spring Boot, MySQL e Docker.

---

# Objetivo

Este projeto tem como objetivo fornecer uma plataforma para gerenciamento financeiro, permitindo o cadastro e gerenciamento de fornecedores e demais funcionalidades financeiras que serão implementadas durante a evolução do sistema.

O sistema foi desenvolvido seguindo uma arquitetura moderna baseada em microsserviços simples utilizando containers Docker para garantir portabilidade, facilidade de implantação e padronização do ambiente de desenvolvimento.

---

# Tecnologias Utilizadas

## Backend

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

## Frontend

- Angular
- TypeScript
- HTML
- CSS
- Nginx

## Banco de Dados

- MySQL 8

## DevOps

- Docker
- Docker Compose
- Git
- GitHub

---

# Arquitetura da Aplicação

```text
┌─────────────────────┐
│     Frontend        │
│      Angular        │
│ localhost:4200      │
└──────────┬──────────┘
           │ HTTP
           ▼
┌─────────────────────┐
│      Backend        │
│   Spring Boot API   │
│ localhost:8080      │
└──────────┬──────────┘
           │ JDBC
           ▼
┌─────────────────────┐
│      MySQL 8        │
│ localhost:3306      │
└─────────────────────┘
```

A aplicação é composta por três containers Docker:

1. Frontend Angular
2. Backend Spring Boot
3. Banco de Dados MySQL

Todos os serviços são orquestrados através do Docker Compose.

---

# Estrutura do Projeto

```text
GestaoFinanceira/
│
├── docker-compose.yml
├── Dockerfile
├── README.md
├── .env
├── .env.example
│
├── src/
│   └── Backend Spring Boot
│
├── frontend/
│   └── frontend/
│       └── Aplicação Angular
│
└── target/
```

---

# Configuração das Variáveis de Ambiente

Criar um arquivo chamado:

```text
.env
```

na raiz do projeto.

Exemplo:

```env
DB_URL=jdbc:mysql://mysql:3306/gestao_financeira

DB_USER=root
DB_PASSWORD=SUA_SENHA

MYSQL_DATABASE=gestao_financeira
MYSQL_ROOT_PASSWORD=SUA_SENHA
```

---

# Segurança

O arquivo:

```text
.env
```

não deve ser enviado para o GitHub.

Ele está configurado no:

```text
.gitignore
```

para proteger credenciais e informações sensíveis.

Para facilitar a configuração por outros desenvolvedores, utilize o arquivo:

```text
.env.example
```

como modelo.

---

# Executando Localmente sem Docker

## Backend

Executar através da IDE:

- IntelliJ IDEA
- VS Code

Configurar as variáveis de ambiente:

```text
DB_URL
DB_USER
DB_PASSWORD
```

Executar a classe:

```java
GestaoFinanceiraApplication
```

---

# Executando com Docker

## Construir e iniciar os containers

```bash
docker compose up --build -d
```

---

## Verificar containers em execução

```bash
docker ps
```

Resultado esperado:

```text
gestaofinanceira-frontend
gestaofinanceira-backend
gestaofinanceira-db
```

---

## Visualizar logs

### Frontend

```bash
docker logs -f gestaofinanceira-frontend
```

### Backend

```bash
docker logs -f gestaofinanceira-backend
```

### Banco de Dados

```bash
docker logs -f gestaofinanceira-db
```

---

## Parar os containers

```bash
docker compose down
```

---

## Recriar os containers

```bash
docker compose up --build -d
```

---

# Endereços da Aplicação

## Frontend

```text
http://localhost:4200
```

## Backend

```text
http://localhost:8080
```

## Banco de Dados

```text
localhost:3306
```

---

# Banco de Dados

Banco utilizado:

```text
gestao_financeira
```

O banco é inicializado automaticamente pelo container MySQL quando executado pela primeira vez.

Os dados são persistidos através de volume Docker:

```text
mysql_data
```

garantindo que as informações não sejam perdidas ao reiniciar os containers.

---

# Comandos Úteis

Listar containers:

```bash
docker ps
```

Listar volumes:

```bash
docker volume ls
```

Entrar no banco MySQL:

```bash
docker exec -it gestaofinanceira-db mysql -u root -p
```

Listar redes Docker:

```bash
docker network ls
```

Remover ambiente completo:

```bash
docker compose down -v
```

---

# Fluxo de Desenvolvimento

1. Criar uma branch de feature.
2. Desenvolver a funcionalidade.
3. Testar a aplicação localmente.
4. Validar os containers Docker.
5. Realizar commit.
6. Enviar para o GitHub.
7. Realizar merge na branch main.

---

# Próximas Evoluções

- Autenticação com Spring Security
- JWT
- Controle de perfis e permissões
- Dashboard financeiro
- Relatórios
- Testes automatizados
- CI/CD com GitHub Actions
- Deploy em nuvem

---

# Autor

Desenvolvido por:

**Pablo Alberto Centurion Leguizamon Junior**

Projeto acadêmico desenvolvido para estudo de:

- Java
- Spring Boot
- Angular
- Docker
- MySQL
- Arquitetura de Software
- DevOps