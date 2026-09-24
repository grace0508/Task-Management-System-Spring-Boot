# Task Management System

A **Role-Based Task Management System** developed using **Spring Boot and MySQL**. The system is designed to help supervisors assign and manage tasks while allowing users to view and update their assigned tasks.

## 📌 Project Overview

The Task Management System provides a centralized platform for managing daily and monthly tasks. It supports **role-based access**, allowing different users to perform different operations based on their roles.

Supervisors can create, assign, update, and delete tasks for their subordinates, while subordinates can view their assigned tasks and update their task status.

The system also provides task priorities, due dates, descriptions, and status-based task organization.

## ✨ Features

### 🔐 Authentication & Authorization

* User registration and login
* Role-based access control
* Secure authentication using Spring Security
* Different functionalities based on user roles

### 👨‍💼 Supervisor Features

* Create tasks
* Assign tasks to subordinates
* Update tasks
* Delete tasks
* Set task priority
* Set task due dates
* Add task descriptions
* View assigned tasks

### 👨‍💻 Subordinate Features

* View assigned tasks
* View daily tasks
* View monthly tasks
* View task details
* Update task status
* View pending tasks
* View completed tasks

### 📋 Task Management

* Create, read, update, and delete tasks
* Task priority levels:

  * High
  * Medium
  * Low
* Task descriptions
* Due dates
* Pending task management
* Completed task management
* Date-based task viewing

## 🛠️ Technologies Used

| Technology         | Purpose                        |
| ------------------ | ------------------------------ |
| Java               | Programming Language           |
| Spring Boot        | Backend Framework              |
| Spring MVC         | Web & REST API Development     |
| Spring Data JPA    | Database Access                |
| Hibernate          | ORM                            |
| Spring Security    | Authentication & Authorization |
| MySQL              | Database                       |
| Maven              | Dependency Management          |
| Lombok             | Reducing Boilerplate Code      |
| Jakarta Validation | Input Validation               |
| Swagger / OpenAPI  | API Documentation              |
| IntelliJ IDEA      | Development Environment        |

## 🏗️ Project Architecture

The application follows a layered architecture:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

### Controller Layer

Handles HTTP requests and provides REST API endpoints.

### Service Layer

Contains the application's business logic.

### Repository Layer

Communicates with the MySQL database using Spring Data JPA.

### Entity Layer

Represents the database tables and their relationships.

## 📂 Project Structure

```text
taskmanagementsystem
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── ...
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── .gitignore
```

## 🗄️ Database

The application uses **MySQL** as its database.

Create the database using:

```sql
CREATE DATABASE taskmanagementdb;
```

Configure your database connection in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskmanagementdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

> **Note:** Do not upload your actual MySQL password or other sensitive credentials to GitHub.

## 🚀 How to Run the Project

### 1. Clone the Repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### 2. Open the Project

Open the cloned project in **IntelliJ IDEA**.

### 3. Configure MySQL

Make sure MySQL is installed and running.

Create the database:

```sql
CREATE DATABASE taskmanagementdb;
```

### 4. Configure Database Credentials

Update the following properties according to your local MySQL configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskmanagementdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

### 5. Install Dependencies

Since the project uses Maven, the required dependencies will be downloaded automatically from `pom.xml`.

### 6. Run the Application

Run the main Spring Boot application class from IntelliJ IDEA.

The application will start on the configured port.

## 📡 API Documentation

The project uses **Swagger/OpenAPI** for API documentation and testing.

After starting the application, open the Swagger UI using the Swagger URL configured for the project.

Swagger provides an interactive interface for viewing and testing the available REST APIs.

## 📊 Task Priorities

The system supports three task priority levels:

```text
HIGH
MEDIUM
LOW
```

This allows tasks to be organized according to their importance.

## 📅 Task Management

Tasks can be managed based on dates, allowing users to view:

* Daily tasks
* Monthly tasks
* Pending tasks
* Completed tasks

Users can also view task information such as:

* Task title
* Description
* Priority
* Due date
* Assigned user
* Task status

## 🔒 Security

Spring Security is used to provide authentication and authorization.

The system uses role-based access to control which operations different users can perform.

Sensitive configuration information such as passwords should be stored locally and should not be committed to the Git repository.

## 🔮 Future Improvements

Possible future enhancements include:

* Email notifications for assigned tasks
* Task reminder notifications
* Improved dashboard and statistics
* Task progress tracking
* File attachments
* Advanced task search and filtering
* Calendar-based task management
* Cloud deployment
* Improved user interface

## 🎯 Learning Objectives

This project was developed to gain practical experience in:

* Spring Boot application development
* REST API development
* Spring Data JPA
* Hibernate
* MySQL database integration
* Spring Security
* Role-based authorization
* CRUD operations
* Input validation
* Maven dependency management
* Swagger/OpenAPI
* Backend application architecture

## 👩‍💻 Author

**Nitsa Salu**


## 📜 License

This project was developed for **educational and academic purposes**.
