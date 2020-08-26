package com.car.pooling.car.details.config;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.car.pooling.car.details.model.Car;

/**
 * The Class ApplicationProperties to read values form properties.
 */
@Component
@ConfigurationProperties
public class ApplicationProperties {

	/** The Constant LOGGER to log the data. */
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationProperties.class);

	/** 
	 * The car details list.
	 * This is list of Car objects
	 * Each car object consists of the car details
	 */
	private List<Car> carDetailsList;

	/**
	 * Gets the car details list.
	 *
	 * @return the car details list
	 */
	public List<Car> getCarDetailsList() {
		return carDetailsList;
	}

	/**
	 * Sets the car details list.
	 *
	 * @param carDetailsList the new car details list
	 */
	public void setCarDetailsList(List<Car> carDetailsList) {
		this.carDetailsList = carDetailsList;
	}

	/**
	 * Post construct.
	 * 
	 * To log the carDetailsList on console
	 */
	@PostConstruct
	private void postConstruct() {
		LOGGER.info("CarDetailsList {}", carDetailsList);
	}
}
