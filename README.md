# portfolio-api
Portfolio API (Spring Boot Backend)
A backend REST API built using Java Spring Boot to power a personal portfolio.
This project demonstrates backend development skills including API design, database integration, and clean architecture.

Project Purpose
This project was created to:
Practice Java backend development
Learn and apply Spring Boot
Build a real-world REST API
Showcase skills through a GitHub portfolio project
Maintain consistent commits and version control

Tech Stack
Language: Java
Framework: Spring Boot
Database: MySQL
ORM: Spring Data JPA
Build Tool: Maven
IDE: IntelliJ IDEA (Community Edition)

Features
RESTful API endpoints
CRUD operations (Create, Read, Update, Delete)
Database integration with MySQL
Layered architecture:
Controller
Service
Repository
Model (Entity)
Exception handling
Clean and scalable project structure

Project Structure
portfolio-api/
│
├── src/
│   ├── main/
│   │   ├── java/com/portfolio/api/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── model/
│   │   │   └── PortfolioApiApplication.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │
│   └── test/
│
├── pom.xml
└── README.md

Database Setup
Install MySQL
Create a database:
CREATE DATABASE portfolio_db;
Update your application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/portfolio_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Running the Application
Clone the repository:
git clone https://github.com/YOUR_USERNAME/portfolio-api.git
cd portfolio-api
Run the app:
./mvnw spring-boot:run
or run directly from IntelliJ.

API Endpoints (Example)
Method	Endpoint	Description
GET	/api/projects	Get all projects
GET	/api/projects/{id}	Get project by ID
POST	/api/projects	Create new project
PUT	/api/projects/{id}	Update project
DELETE	/api/projects/{id}	Delete project

Future Improvements
Add authentication (JWT)
Deploy API (AWS / Railway / Render)
Connect with frontend (React)
Add pagination & filtering
Write unit and integration tests

Author

Rishabh Tyagi
Masters of Applied Computing
University of Windsor

Final Note
This is an evolving project — new features and improvements will be added regularly as I continue learning and building in Java and Spring Boot.
