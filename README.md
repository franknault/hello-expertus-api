# hello-expertus-api
Restful API Hello World

## What it does?

The API shares a endpoint "/message" with a query parameter "?language=" according to their ISO 639-1 codes. It sends the default phrase "Hello, Expertus!" according to the language asked.

## How to use it?

To compile and execute the project, you'll need :

1. Maven;
2. Java 1.8 +;
3. PostgresSQL 9.4.

To run the API : 

1. Fork or get a local version of the source code;
2. Open your favorite command line env;
3. Install dependancies with : mvn clean install
4. Change "application.properties" according to your PostgresSQL installation
4a. Run the jar directly with : java -jar <the-jar-name>.jar / Run the projet with : mvn spring-boot:run

## Verify the API status

1. Access your local API with your browser or Postman at : localhost:8080/api/message?language=en

## Live version

The app is deployed on Heroku : https://hello-expertus-api.herokuapp.com/api/message?language=en
