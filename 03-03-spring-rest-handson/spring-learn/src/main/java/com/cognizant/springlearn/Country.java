package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	public String code;
	public String name;
	public Country() {
		LOGGER.debug("In Country method");
	}
	public String getCode() {
		LOGGER.debug("In getCode method");
		return code;
	}
	public void setCode(String code) {
		LOGGER.debug("In setCode method");
		this.code = code;
	}
	public String getName() {
		LOGGER.debug("In getName method");
		return name;
	}
	public void setName(String name) {
		LOGGER.debug("In setName method");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
	
}
