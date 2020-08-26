package com.car.pooling.car.details.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.car.pooling.car.details.config.ApplicationProperties;
import com.car.pooling.car.details.model.Car;
import com.car.pooling.car.details.model.CarDetails;
import com.car.pooling.car.details.model.CarPriceDetails;

/**
 * The Class CarDetailsController.
 */
@RestController
public class CarDetailsController {
	
	/** The Constant LOGGER to log the data. */
	private static final Logger LOGGER = LoggerFactory.getLogger(CarDetailsController.class);
	
	/**
	 * The properties.
	 * This autowires the properties from application.yml to this class.
	 * 
	 */
	@Autowired
	private ApplicationProperties properties;

	/**
	 * Gets the car details.
	 * Receives carName as input
	 * Returns the Car Details like name, co2, enginePower, FIN
	 * 
	 * This a GET method with URI /car/pooling/car/details
	 * Please refer README.md for further info
	 * 
	 * @param carName the car name
	 * @return the car details
	 */
	@GetMapping(value = "/car/pooling/car/details", produces = MediaType.APPLICATION_JSON_VALUE)
	public CarDetails getCarDetails(@RequestParam String carName) {
		// filters the car based on the carName and retrieves it
		Car car = properties.getCarDetailsList().stream().filter(carDetail -> carDetail.getName().equals(carName))
				.findFirst().orElse(null);
		// logs the car details
		LOGGER.info("The retrievd car details are {}", car);
		// constructs CarDetails object and returns it as output
		return new CarDetails(car.getName(), car.getCo2(), car.getEnginePower(), car.getFIN());
	}

	/**
	 * Gets the car price details.
	 * Receives FIN as input
	 * Returns the Car Price Details like basePrice, location, enginePower
	 * 
	 * This a GET method with URI /car/pooling/car/price
	 * Please refer README.md for further info
	 * 
	 * @param FIN the fin
	 * @return the car price details
	 */
	@GetMapping(value = "/car/pooling/car/price", produces = MediaType.APPLICATION_JSON_VALUE)
	public CarPriceDetails getCarPriceDetails(@RequestParam String FIN) {
		// filters the car based on the FIN and retrieves it
		Car car = properties.getCarDetailsList().stream().filter(carDetail -> carDetail.getFIN().equals(FIN))
				.findFirst().orElse(null);
		// logs the retrieved car price details
		LOGGER.info("The retrievd car price details are {}", car);
		// constructs a CarPriceDetails object and returns it as output
		return new CarPriceDetails(car.getBasePrice(), car.getLocation(), car.getEnginePower());
	}
}
