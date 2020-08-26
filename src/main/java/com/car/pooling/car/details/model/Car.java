package com.car.pooling.car.details.model;

/**
 * The Class Car.
 */
public class Car {	
	
	/** The name. */
	private String name;

	/** The co2 emission value. */
	private short co2;

	/** The engine power in KW. */
	private short enginePower;

	/** The fin. */
	private String FIN;
	
	/** The base price. */
	private double basePrice;
	
	/** The location. */
	private String location;

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
	public String getFIN() {
		return FIN;
	}

	/**
	 * Sets the fin.
	 *
	 * @param fIN the new fin
	 */
	public void setFIN(String fIN) {
		FIN = fIN;
	}

	/**
	 * Gets the base price.
	 *
	 * @return the base price
	 */
	public double getBasePrice() {
		return basePrice;
	}

	/**
	 * Sets the base price.
	 *
	 * @param basePrice the new base price
	 */
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [name=" + name + ", co2=" + co2 + ", enginePower=" + enginePower + ", FIN=" + FIN + ", basePrice="
				+ basePrice + ", location=" + location + "]";
	}
	
	
}
