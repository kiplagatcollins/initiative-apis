# Initiative Apis

[![Build Status](https://travis-ci.org/your-username/spring-boot-sample.svg?branch=master)](https://travis-ci.org/your-username/spring-boot-sample)
[![Coverage Status](https://coveralls.io/repos/github/your-username/spring-boot-sample/badge.svg?branch=master)](https://coveralls.io/github/your-username/spring-boot-sample?branch=master)
[![License](https://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

This is a sample Spring Boot application for initiatives apis.

## Requirements

To build and run this application, you need the following:

- JDK 17 or later
- Maven 3

## Running the Application Locally

There are several ways to run a Spring Boot application locally:

1. Execute the `main` method in the `com.coki.initiative.InitiativeApplication` class from your IDE.
   
   or
   
2. Use the Spring Boot Maven plugin. Open a terminal in the project directory and run the following command:

   ```shell
   mvn spring-boot:run
   

The application will start and be accessible at `http://localhost:8080`.

## Building the Application

To build the application, open a terminal in the project directory and run the following command:

```shell
mvn clean package
```

This will compile the application and package it into an executable JAR file.

## Running Tests

To run the tests for this application, use the following command:

```shell
mvn test
```

## Docker Support

To build a Docker image of the application, you need Docker installed on your machine. Run the following command in the project directory:

```shell
docker build -t initiatives-api .
```

To run the Docker container, execute the following command:

```shell
docker run -p 8080:8080 initiatives-api
```

## Contributing

Contributions are welcome! Please follow these steps to contribute to the project:

1. Fork the repository.
2. Create a new branch for your feature/bug fix.
3. Commit your changes and push the branch to your fork.
4. Submit a pull request with a detailed description of your changes.

## License

This project is licensed under the Apache License 2.0. See the [LICENSE](LICENSE) file for details.