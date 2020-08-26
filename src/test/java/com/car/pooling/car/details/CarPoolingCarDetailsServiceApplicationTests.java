package com.car.pooling.car.details;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.util.NestedServletException;

/**
 * The Class CarPoolingCarDetailsServiceApplicationTests.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class CarPoolingCarDetailsServiceApplicationTests {

	/** The context. */
	@Autowired
	private WebApplicationContext context;

	/** The mock mvc. */
	private MockMvc mockMvc;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	/**
	 * Context loads.
	 */
	@Test
	public void contextLoads() {

	}

	/**
	 * Given carName
	 * When car is present with given name
	 * Then return the car details
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void getCarDetailsTest1() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/car/pooling/car/details").param("carName", "AMG S 63 Cabrio"))
		.andDo(MockMvcResultHandlers.print())		
		.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	}
	
	/**
	 * Given carName
	 * When car is present with given name
	 * Then return the car details
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void getCarDetailsTest2() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/car/pooling/car/details").param("carName", "AMG C 63 S"))
		.andDo(MockMvcResultHandlers.print())		
		.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	}
	
	/**
	 * Given carName
	 * When car is present with given name
	 * Then return the car details
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void getCarDetailsTest3() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/car/pooling/car/details").param("carName", "AMG E 53"))
		.andDo(MockMvcResultHandlers.print())		
		.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	}
	
	/**
	 * Given carName
	 * When car is present with given name
	 * Then return the car details
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void getCarDetailsTest4() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/car/pooling/car/details").param("carName", "AMG G 63"))
		.andDo(MockMvcResultHandlers.print())		
		.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	}
	
	/**
	 * Given carName
	 * When car is present with given name
	 * Then return the car details
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void getCarDetailsTest5() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/car/pooling/car/details").param("carName", "AMG S 65 Coupe"))
		.andDo(MockMvcResultHandlers.print())		
		.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	}
	
	/**
	 * Given carName
	 * When car is not present with given name
	 * Then throw exception
	 *
	 * @throws Exception the exception
	 */
	@Test(expected = NestedServletException.class)
	public void getCarDetailsTest6() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/car/pooling/car/details").param("carName", "AMG S 65 Coup"));
	}
	
	/**
	 * Given FIN
	 * When car is present with given FIN
	 * Then return the car price details
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void getCarPriceTest1() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/car/pooling/car/price").param("FIN", "9753198"))
		.andDo(MockMvcResultHandlers.print())		
		.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	}
	
	/**
	 * Given FIN
	 * When car is present with given FIN
	 * Then return the car price details
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void getCarPriceTest2() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/car/pooling/car/price").param("FIN", "5301187"))
		.andDo(MockMvcResultHandlers.print())		
		.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	}
	
	/**
	 * Given FIN
	 * When car is present with given FIN
	 * Then return the car price details
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void getCarPriceTest3() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/car/pooling/car/price").param("FIN", "8830025"))
		.andDo(MockMvcResultHandlers.print())		
		.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	}
	
	/**
	 * Given FIN
	 * When car is present with given FIN
	 * Then return the car price details
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void getCarPriceTest4() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/car/pooling/car/price").param("FIN", "6169477"))
		.andDo(MockMvcResultHandlers.print())		
		.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	}
	
	/**
	 * Given FIN
	 * When car is present with given FIN
	 * Then return the car price details
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void getCarPriceTest5() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/car/pooling/car/price").param("FIN", "3901185"))
		.andDo(MockMvcResultHandlers.print())		
		.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	}
	
	/**
	 * Given FIN
	 * When car is not present with given FIN
	 * Then throw exception
	 *
	 * @throws Exception the exception
	 */
	@Test(expected = NestedServletException.class)
	public void getCarPriceTest6() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/car/pooling/car/price").param("FIN", "123456"));
	}

}
