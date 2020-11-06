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
public class DeleteBookTest {

	private BooksService booksService;
	private String ISBN;
	private static final String WRONG_ISBN = "##ISBN##";
	@Before
	public void init() {
		booksService = BooksWarehouseApplicationContext.booksService();
		try {
			ISBN = booksService.newBook("TEST", new HashMap<String, Object>());
		} catch (BookException e) {
			throw new RuntimeException(e.getMessage());
		}

	}

	@Test
	public void deleteBookByIsbnOk() throws BookException {
		Book book = booksService.findBookByIsbn(ISBN);
		booksService.deleteBookByIsbn(ISBN);
		Assert.assertFalse(booksService.findAllBooks().contains(book));
	}

	@Test(expected = BookException.class)
	public void deleteBookByIsbnWrong() throws BookException {
		booksService.deleteBookByIsbn(WRONG_ISBN);
	}


}
