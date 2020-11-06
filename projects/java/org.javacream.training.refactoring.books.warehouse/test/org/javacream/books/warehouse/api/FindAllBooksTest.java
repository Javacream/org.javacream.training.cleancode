package org.javacream.books.warehouse.api;

import org.javacream.books.warehouse.BooksWarehouseApplicationContext;
import org.javacream.books.warehouse.impl.MapBooksService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Dr. Rainer Sawitzki
 * @company Javacream
 * @mailto training@rainer-sawitzki.de
 * 
 */
public class FindAllBooksTest {

	private BooksService booksService = BooksWarehouseApplicationContext.booksService();

	@Before
	public void init() {
		booksService = new MapBooksService();

	}

	@Test
	public void findBookAllBooks() {
		Assert.assertNotNull(booksService.findAllBooks());
	}

}
