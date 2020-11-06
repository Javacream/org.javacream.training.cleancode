package org.javacream.books.isbngenerator.api;

import org.javacream.books.warehouse.BooksWarehouseApplicationContext;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsbnGeneratorNextIsbnTest {

	private IsbnGeneratorService isbnGenerator;

	@Before
	public void initTest() {
		isbnGenerator = BooksWarehouseApplicationContext.isbnGeneratorService();
	}

	@Test
	public void creates_an_isbn() {
		String isbn = isbnGenerator.createIsbn();
		Assert.assertNotNull(isbn);

	}

	@Test
	public void creates_unique_isbns() {
		String isbn1 = isbnGenerator.createIsbn();
		String isbn2 = isbnGenerator.createIsbn();
		Assert.assertNotEquals(isbn1, isbn2);

	}


}
