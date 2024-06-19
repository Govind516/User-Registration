# User Registration and Fetch API

This Spring Boot application provides RESTful API endpoints for user registration and user details fetching using PostgreSQL as the database.

## Requirements

- Java 11 or later
- Spring Boot
- PostgreSQL

## Setup

1. Clone the Repository:
    ```sh
    git clone https://github.com/Govind516/User-Registration/.git
    cd User-Registration
    ```

2. Update Application Properties:
    - Open the `src/main/resources/application.properties` file.
    - Update the PostgreSQL database URL, username, and password:
        ```properties
        spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
        spring.datasource.username=your_username
        spring.datasource.password=your_password
        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
        ```

3. Build and Run the Application:
    - Use Maven to build and run the application:
        ```sh
        mvn clean install
        mvn spring-boot:run
        ```

## API Endpoints

- **Register User**
    - Endpoint: `/api/user/register`
    - Method: `POST`
    - Request Body: JSON with `username`, `email`, and `password`.
    - Response: Success message or error message.

- **Fetch User Details**
    - Endpoint: `/api/user/fetch`
    - Method: `GET`
    - Query Parameter: `username`
    - Response: User details or error message.

## Screenshots

<img src="https://github.com/Govind516/User-Registration/assets/102366719/0be685b4-fe22-4a30-9c74-fee1e533afaf.png" width="45%" height="45%" alt="Register User">

<img src="https://github.com/Govind516/User-Registration/assets/102366719/ed10ad0e-f6f4-4eb6-b88e-edad8fa8874a.png" width="44%" height="44%" alt="Fetch User Details">
