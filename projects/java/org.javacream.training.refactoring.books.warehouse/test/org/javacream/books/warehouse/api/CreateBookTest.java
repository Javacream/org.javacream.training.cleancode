package org.javacream.books.warehouse.api;

import java.util.HashMap;

import org.javacream.books.warehouse.BooksWarehouseApplicationContext;
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
public class CreateBookTest {

	private BooksService booksService;

	@Before
	public void init() {
		booksService = BooksWarehouseApplicationContext.booksService();
	}

	@Test
	public void createBook() throws BookException {
		String isbn = booksService.newBook("TEST", new HashMap<String, Object>());
		Book book = booksService.findBookByIsbn(isbn);
		Assert.assertTrue(book.getClass() == Book.class);

	}

	@Test
	public void createSchoolBook() throws BookException {
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put("subject", "Physics");
		options.put("year", 10);
		String isbn = booksService.newBook("TEST", options);
		Book book = booksService.findBookByIsbn(isbn);
		Assert.assertTrue(book.getClass() == SchoolBook.class);

	}

	@Test
	public void createSpecialistBook() throws BookException {
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put("topic", "Very Special");
		String isbn = booksService.newBook("TEST", options);
		Book book = booksService.findBookByIsbn(isbn);
		Assert.assertTrue(book.getClass() == SpecialistBook.class);

	}

	@Test(expected = Exception.class)
	public void createBookFailsNullOptions() throws BookException {
		booksService.newBook("TEST", null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createBookFailsUnsupportedOptions() throws BookException {
		HashMap<String, Object> options = new HashMap<>();
		options.put("this", 0);
		options.put("that", 0);
		booksService.newBook("TEST", options);
	}

}
