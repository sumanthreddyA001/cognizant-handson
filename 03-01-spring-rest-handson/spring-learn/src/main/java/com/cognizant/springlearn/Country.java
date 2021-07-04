package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public String code;
	public String name;
	public Country() {
		LOGGER.debug("Inside Country Constructor");
	}
	public String getCode() {
		LOGGER.debug("in getCode method");
		return code;
	}
	public void setCode(String code) {
		LOGGER.debug(" in setCode method");
		this.code = code;
	}
	public String getName() {
		LOGGER.debug("in getName method");
		return name;
	}
	public void setName(String name) {
		LOGGER.debug("in setName method");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
	
}
