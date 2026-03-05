# Bank Application System

# Project Overview
This is a simple Bank Application built using Spring Boot. The application allows users to 
- Create bank accounts
- View account details
- Deposit money and Withdraw money then get updated balance. <br>
The project demonstrates REST API development, database integration, and Swagger API documentation.

# Technologies Used
- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Swagger / OpenAPI
- Postman

# Project Structure
```
src/main/java/com/bankapplication
│
├── controller   -> Handles API requests 
├── service      -> Contains Business Logic
├── repository   -> Database operations
├── entity       -> Database Entities
├── mapper       -> Converts Entity objects to DTO and DTO to Entity
|── config       -> Configuration classes

src/main/resources
│
├── application.properties ->Stores application configuration like database settings.  
├── swagger.yaml           -> Defines Swagger Api   
```
# Database Configurationn
Database: PostgreSQL
```
spring.datasource.url=jdbc:postgresql://localhost:5432/db_name
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```
# API Endpoints

| Method | Endpoint                               | Description       |
| ------ | ------------------                     | ----------------- |
| POST   | /bank/account                          | Create account    |
| GET    | /bank/account                          | Get all accounts  |
| GET    | /bank/account/{id}                     | Get account by ID |
| PUT    | /bank/account/deposit/{accountNumber)  | Deposit money     |
| PUT    | /bank/account/withdraw/{accountNumber) | Withdraw money    |

