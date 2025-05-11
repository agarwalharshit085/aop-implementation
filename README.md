# AOP Implementation in Spring Boot

This is a simple Spring Boot application demonstrating Aspect-Oriented Programming (AOP) to log method executions in a service class. The application uses `@Aspect` to log the execution of methods in the `Hello_Service` class and the `AopPrintController` class.

## Features
- Demonstrates the use of Spring AOP for logging.
- Uses `@Before` and `@After` annotations for logging method execution before and after the actual method.
- REST API endpoint `/aop` that triggers the AOP logging and prints a welcome message.

## Technologies Used
- **Spring Boot**: Framework used to create the REST application.
- **Spring AOP**: Used to log method execution before and after calling service methods.
- **Java**: Programming language used for building the application.

## Prerequisites
Before running the project, ensure you have the following installed:
- **Java 11 or higher**
- **Maven** (or use Spring Boot's embedded Maven plugin)

## Running the Application

To run the application locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/agarwalharshit085/aop-implementation.git
