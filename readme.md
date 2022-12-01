# Foo Reactive - Spring Boot application

The purpose of this project is to demonstrate how we can
use [Spring WebFlux](https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html) to create
a foo reactive web application that will emit data like foo resource with id and name every second.

# How to build and run

project can be compiled with JDK 8.

To compile just do `mvn clean package`.

## Prerequisites

* JAVA 8 should be installed
* Maven 3+

## Technologies
Project is created with:
* Java 8
* Maven 3+
* Spring boot 

To run the application execute the following:

```
mvn spring-boot:run
```

The server will start at <http://localhost:8080>.
After log in we can call <http://localhost:8080/foo> and <http://localhost:8080/admin/foo> rest apis, based on user permission it will return data. 

We can test application through chrome with above url then do log in with below credentials based on role and hit below two endpoint that mention in exploring the Rest APIs.
We can do log out with <http://localhost:8080/logout> url.

### Credentials:

* #### User

   username: user

   password: password

* #### admin

  username: admin

  password: password

## Exploring the Rest APIs

The application contains the following REST APIs

```
1. GET /foo - Get data with id and name that emit every second for user and admin
2. GET /admin/foo - Get data with id and name that emit every second for admin only.
```

Urls of above REST APIs.

1. GET /foo - <http://localhost:8080/foo>
2. GET /admin/foo - <http://localhost:8080/admin/foo>


