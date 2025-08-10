# Quote Generator

A simple web application to generate and manage quotes.

## Features

- Get a random quote.
- Add a new quote.

## Technologies Used

- Java 17
- Spring Boot
- Maven
- HTML/CSS/JavaScript (for the frontend)

## Setup and Usage

1. Clone the repository.
2. Navigate to the `generator` directory:
   ```bash
   cd generator
   ```
3. Run the application using Maven:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Open the `generator/src/main/Frontend/index.html` file in your web browser.

## API Endpoints

- `GET /quote/test`: Returns a random quote.
- `POST /quote/add`: Adds a new quote.

  **Request Body Example:**
  ```json
  {
    "name": "A new quote",
    "price": 123.45
  }
  ```
