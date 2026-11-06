# CICDPipelineHandson

A simple Java 17 + Spring Boot project for CI/CD practice. No database is used.

## Requirements
- JDK 17
- Maven 3.6.3+ (or use Maven from your IDE)

## Run locally
```bash
mvn clean test
mvn spring-boot:run
```

## API endpoints
- `GET http://localhost:8080/`
- `GET http://localhost:8080/api/message`
- `GET http://localhost:8080/health`
- `GET http://localhost:8080/actuator/health`

## Build JAR
```bash
mvn clean package
```

## Build and run Docker image
```bash
docker build -t cicdpipelinehandson .
docker run -p 8080:8080 cicdpipelinehandson
```
