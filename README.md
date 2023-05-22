# Java Spring Spotify API Project
This project is a Java Spring application that demonstrates the usage of the Spotify API. It is developed as part of the PUE Training Course for Java 11 certification.

## Requirements
To run this application, you need the following requirements:

* Java 17 or higher
* Maven build tool
* Spotify developer account and API credentials

## Project Structure
*  `codepressed.spotify.controller`: Contains the REST Controllers
   responsible of API endpoints.
*  `codepressed.spotify.repository`: Contains the Repostiroy interfaces
   and implementations for interacting with data source.
*  `codepressed.spotify.model`: Contains the Entity classes
*  `codepressed.spotify.service`: Contains the service interfaces defining
   the business logic and operations
*  `codepressed.spotify.service.impl`: Contains the implementation classes
for the service interfaces.


## Dependencies
This project uses the following dependencies:
* Spring Boot Starter Web
* Spring Boot  Data JPA
* Spring Boot Starter Test
* Mysql Connector J
* Lombok