# Pearson Practical Test

This project was created as the solution for the Practical Test of Pearson Lanka.

#### This back-end was created using Spring Boot framework.

### To run this application in your machine

1. Clone this repository.
2. Open project with your favourite IDE.
3. Install all the maven dependencies.
4. Now you are good to go.

### Exposed REST end-points
> - To retrieve all countries send a GET request to:
> http://localhost:8080/rest/v2/all

> - To retrieve a specific country send a GET request with country id to:
> http://localhost:8080/rest/v2/country/`101`

> - To insert new record send a POST request payload to:
> http://localhost:8080/rest/v2/add

> - To update existing record send a PUT request payload to:
> http://localhost:8080/rest/v2/update

> - To delete specific record send a DELETE request with country id to:
> http://localhost:8080/rest/v2/delete/`101`

> - To delete all records send a DELETE request to:
> http://localhost:8080/rest/v2/deleteall

---

#### Use this JSON object to start testing with POST request
```
{
    "name": "Japan",
    "president": "Yoshihide Suga",
    "capital": "Tokyo"
}
```

#### Please find the Angular front-end below
Front-end: https://github.com/shamoda/countries-app-frontend

---