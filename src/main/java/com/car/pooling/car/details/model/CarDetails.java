package com.car.pooling.car.details.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class CarDetails.
 */
public class CarDetails {

	/** The name. */
	private String name;

	/** The co2 emission value. */
	private short co2;

	/** The engine power in KW. */
	private short enginePower;

	/** The fin. */
	@JsonProperty("FIN")
	private String fin;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the co 2.
	 *
	 * @return the co 2
	 */
	public short getCo2() {
		return co2;
	}

	/**
	 * Sets the co 2.
	 *
	 * @param co2 the new co 2
	 */
	public void setCo2(short co2) {
		this.co2 = co2;
	}

	/**
	 * Gets the engine power.
	 *
	 * @return the engine power
	 */
	public short getEnginePower() {
		return enginePower;
	}

	/**
	 * Sets the engine power.
	 *
	 * @param enginePower the new engine power
	 */
	public void setEnginePower(short enginePower) {
		this.enginePower = enginePower;
	}

	/**
	 * Gets the fin.
	 *
	 * @return the fin
	 */
	public String getFin() {
		return fin;
	}

	/**
	 * Sets the fin.
	 *
	 * @param fin the new fin
	 */
	public void setFin(String fin) {
		this.fin = fin;
	}

	/**
	 * Instantiates a new car details.
	 *
	 * @param name        the name
	 * @param co2         the co 2
	 * @param enginePower the engine power
	 * @param fin         the fin
	 */
	public CarDetails(String name, short co2, short enginePower, String fin) {
		super();
		this.name = name;
		this.co2 = co2;
		this.enginePower = enginePower;
		this.fin = fin;
	}

}
