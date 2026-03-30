# Console Calculator App

## Project Description
A Java-based console calculator application that performs basic and advanced mathematical operations. This project serves as a portfolio piece demonstrating Git version control workflows and Maven build automation.

## How to Build and Run
This project uses Maven for build automation. Ensure you have Java 17+ and Maven installed.

1. **Build the project:** Run `mvn clean install` to compile the code, run tests, and generate the JAR file in the `target/` directory.
2. **Run tests only:** Run `mvn test`.
3. **Execute the application:** `java -cp target/calculator-1.0-SNAPSHOT.jar com.example.Main`

## Build Tool
**Maven** was chosen for this project because of its strict, standardized lifecycle and excellent dependency management through the `pom.xml`. It makes versioning straightforward using properties.

## Git Concepts Demonstrated
* Feature branching (`feature/`, `bugfix/`)
* Meaningful, imperative commit messages
* Three-way merges