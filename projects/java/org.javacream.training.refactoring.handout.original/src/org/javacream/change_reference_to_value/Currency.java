package org.javacream.change_reference_to_value;

import java.util.HashMap;

public class Currency {

	private String code;

	private static HashMap<String, Currency> currencies;
	
	static{
		currencies = new HashMap<String, Currency>();
		currencies.put("EUR", new Currency("EUR"));
		currencies.put("USD", new Currency("USD"));
		
	}
	private Currency(String code) {
		super();
		this.code = code;
	}

	public String getCode() {
		return code;
	}
	
	public static Currency getCurrency(String code){
		return currencies.get(code);
	}
}
