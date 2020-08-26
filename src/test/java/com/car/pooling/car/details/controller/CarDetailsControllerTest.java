package com.car.pooling.car.details.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.car.pooling.car.details.config.ApplicationProperties;
import com.car.pooling.car.details.model.Car;
import com.car.pooling.car.details.model.CarDetails;
import com.car.pooling.car.details.model.CarPriceDetails;

/**
 * The Class CarDetailsControllerTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class CarDetailsControllerTest {

	/** The properties. */
	@Mock
	private ApplicationProperties properties;

	/** The controller. */
	@InjectMocks
	private CarDetailsController controller;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		Car car1 = new Car();
		car1.setName("car1");
		car1.setFIN("FIN1");
		car1.setBasePrice(123);
		Car car2 = new Car();
		car2.setName("car2");
		car2.setFIN("FIN2");
		car2.setBasePrice(456);
		when(properties.getCarDetailsList()).thenReturn(Arrays.asList(car1, car2));
	}
	
	/**
	 * Given carName
	 * When carName is car1
	 * The return carDetails.
	 *
	 */
	@Test
	public void getCarDetailsTest1() {
		CarDetails carDetails = controller.getCarDetails("car1");
		assertThat(carDetails.getFin(), is("FIN1"));
	}
	
	/**
	 * Given carName
	 * When carName is car2
	 * The return carDetails.
	 *
	 */
	@Test
	public void getCarDetailsTest2() {
		CarDetails carDetails = controller.getCarDetails("car2");
		assertThat(carDetails.getFin(), is("FIN2"));
	}
	
	/**
	 * Given FIN
	 * When FIN is FIN1
	 * The return carPriceDetails.
	 *
	 */
	@Test
	public void getCarPriceDetailsTest1() {
		CarPriceDetails carPriceDetails = controller.getCarPriceDetails("FIN1");
		assertThat(carPriceDetails.getBasePrice(), is(123.0));
	}
	
	/**
	 * Given FIN
	 * When FIN is FIN2
	 * The return carPriceDetails.
	 *
	 */
	@Test
	public void getCarPriceDetailsTest2() {
		CarPriceDetails carPriceDetails = controller.getCarPriceDetails("FIN2");
		assertThat(carPriceDetails.getBasePrice(), is(456.0));
	}
	
	
}
