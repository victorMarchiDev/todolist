# 📝 To-Do List API

Esta é uma API RESTful de lista de tarefas (To-Do List) desenvolvida em Java com Spring Boot. A API permite criar, ler, atualizar e excluir tarefas, facilitando o gerenciamento de listas de tarefas de forma simples e eficiente.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3** (Spring Web, Spring Data JPA)
- **Banco de Dados H2** (para ambiente de desenvolvimento/teste)
- **Maven** (para gerenciamento de dependências)
  
## ✨ Funcionalidades

- **➕ Criar Tarefa**: Adiciona uma nova tarefa com título, descrição e status.
- **📋 Listar Tarefas**: Retorna todas as tarefas registradas.
- **🔍 Buscar Tarefa por ID**: Retorna uma tarefa específica com base em seu ID.
- **✏️ Atualizar Tarefa**: Permite atualizar os detalhes de uma tarefa.
- **🗑️ Excluir Tarefa**: Remove uma tarefa específica pelo ID.

## ⚙️ Pré-requisitos

- **Java 17** ou superior
- **Maven 3.8** ou superior

## 📡 Endpoints da API

| Método | Endpoint           | Descrição                     |
|--------|---------------------|-------------------------------|
| POST   | `/todo/create`       | ➕ Cria uma nova tarefa       |
| GET    | `/todo/tasks`       | 📋 Retorna todas as tarefas   |
| GET    | `/todo/{id}`        | 🔍 Retorna uma tarefa específica |
| PUT    | `/todo/{id}`        | ✏️ Atualiza uma tarefa        |
| DELETE | `/todo/{id}`        | 🗑️ Exclui uma tarefa          |

