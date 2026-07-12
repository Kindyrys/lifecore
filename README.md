# LifeCore

LifeCore is a Java Spring Boot pet project created as a portfolio project for Junior Java Developer positions.

The goal of the application is to help users manage personal productivity in one place:

- personal finances;
- tasks;
- habits;
- daily and monthly dashboard overview.

This project is developed step by step as a learning project focused on clean backend architecture, Spring Boot, PostgreSQL, REST API and practical Java development.

---

## Project status

🚧 In development

Current stage:

- Spring Boot project created
- PostgreSQL database configured
- GitHub repository connected
- Project documentation added
- Base backend structure in progress

---

## Tech stack

Current stack:

- Java 17
- Spring Boot
- Maven
- PostgreSQL
- Spring Data JPA
- Spring Security
- Thymeleaf
- Bootstrap
- Git
- GitHub
- IntelliJ IDEA

Planned:

- REST API
- DTO layer
- Unit tests
- Integration tests
- Docker
- Deployment
- PWA / frontend improvements

---

## Main modules

### Finance module

Planned features:

- add income
- add expenses
- manage categories
- calculate income, expenses and balance
- monthly statistics

### Task manager

Planned features:

- create tasks
- set deadline
- set priority
- change status: TODO, IN_PROGRESS, DONE
- filter tasks by status and priority

### Habit tracker

Planned features:

- create habits
- mark habits as completed
- view completion history
- calculate streak

### Dashboard

Planned features:

- monthly balance overview
- today tasks
- today habits
- progress summary

---

## Architecture

The project follows a modular monolith approach.

Main backend flow:

```text
Request
↓
Controller
↓
Service
↓
Repository
↓
Database
↓
Response