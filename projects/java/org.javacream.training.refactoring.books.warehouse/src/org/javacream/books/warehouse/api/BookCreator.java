package org.javacream.books.warehouse.api;

import java.util.Map;

@FunctionalInterface
public interface BookCreator {

	public Book create(String isbn, String title, Map<String, Object> options);
}
