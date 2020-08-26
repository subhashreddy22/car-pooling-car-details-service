# car-pooling-car-details-service
## Description

Retrieves the car details and car price details based on the input carName and FIN respectively

```java
CarDetails getCarDetails(@RequestParam String carName)
```
1. Receives carName as input.
2. Based on the carName input the car is retrieved.
3. CarDetails object is constructed and returned in the output.

```java
CarPriceDetails getCarPriceDetails(@RequestParam String FIN)
```
1. Receives FIN as input.
2. Based on the FIN input the car is retrieved.
3. CarPriceDetails object is constructed and returned in the output.

### Endpoints

>/car/pooling/car/details GET

>/car/pooling/car/price GET

### Request Data

#### URI: /car/pooling/car/details GET

> **Request**

```json
	http://localhost:8082/car/pooling/car/details?carName=AMG S 63 Cabrio
```

> **Response**

```json
	{"name":"AMG S 63 Cabrio","co2":263,"enginePower":336,"FIN":"9753198"}
```

#### URI: /car/pooling/car/price GET

> **Request**

```json
	http://localhost:8082/car/pooling/car/price?FIN=9753198
```

> **Response**

```json
	{"basePrice":450.91,"location":"Germany","enginePower":336}
```

## Built with
* Maven
* Spring Boot

## Prerequisites
You need to have installed

 - Java 8
 - Maven
 - STS
 
## Deployment
On STS right click on project -> Run As -> Spring Boot App

## Running JUnit tests
On STS right click on project -> Run As -> Maven Test
