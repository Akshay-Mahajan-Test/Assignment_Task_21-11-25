# Java Hybrid Automation Framework - Registration & Profile

This is a runnable skeleton for the Java-based hybrid automation framework (Web + Mobile + API + DB).
It contains core classes, sample tests, and CI config to get you started.

## How to run (locally)
1. Install Java 11 and Maven.
2. Start Selenium Grid and Appium (or use docker-compose included).
3. Edit `src/main/resources/config.properties` to point to your staging endpoints and DB.
4. Run `mvn -B -DskipTests=true clean package` then `mvn test`.

## Contents
- `pom.xml` - Maven build file
- `testng.xml` - TestNG suite
- `Jenkinsfile` - Example CI pipeline
- `docker-compose.yml` - Selenium Grid + Appium services
- `src/main/java/...` - framework classes and page objects
- `src/test/java/...` - sample tests

