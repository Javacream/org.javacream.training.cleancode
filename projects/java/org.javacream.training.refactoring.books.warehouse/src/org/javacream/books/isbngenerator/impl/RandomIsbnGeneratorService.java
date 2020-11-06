package org.javacream.books.isbngenerator.impl;

import org.javacream.books.isbngenerator.api.IsbnGeneratorService;

public class RandomIsbnGeneratorService implements IsbnGeneratorService{
	private String prefix;
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	@Override
	public String createIsbn() {
		return prefix + Math.random();
	}

	
}