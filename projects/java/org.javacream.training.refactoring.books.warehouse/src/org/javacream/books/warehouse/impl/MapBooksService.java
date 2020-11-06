package org.javacream.books.warehouse.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.javacream.books.isbngenerator.api.IsbnGeneratorService;
import org.javacream.books.warehouse.api.Book;
import org.javacream.books.warehouse.api.BookCreator;
import org.javacream.books.warehouse.api.BookException;
import org.javacream.books.warehouse.api.BooksService;
import org.javacream.store.api.StoreService;

public class MapBooksService implements BooksService {

	private IsbnGeneratorService isbnGenerator;// = BooksWarehouseApplicationContext.randomIsbnGenerator();//NEVER!!!!
	private StoreService storeService;
	private Map<Set<String>, BookCreator> bookCreators;

	public void setBookCreators(Map<Set<String>, BookCreator> bookCreators) {
		this.bookCreators = bookCreators;
	}

	public void setStoreService(StoreService simpleStoreService) {
		this.storeService = simpleStoreService;
	}

	public void setIsbnGeneratorService(IsbnGeneratorService isbnGenerator) {
		this.isbnGenerator = isbnGenerator;
	}

	public MapBooksService() {

	}

	private Map<String, Book> books;

	{
		books = new HashMap<String, Book>();
	}

	@Override
	public String newBook(String title, Map<String, Object> options) throws BookException {
		String isbn = isbnGenerator.createIsbn();
		BookCreator bookCreator = bookCreators.get(options.keySet());
		if (bookCreator == null) {
			throw new IllegalArgumentException("invalid options: " + options);
		}
		Book book = bookCreator.create(isbn, title, options);
		books.put(isbn, book);
		return isbn;
	}

	@Override
	public Book findBookByIsbn(String isbn) throws BookException {
		Book result = (Book) books.get(isbn);
		if (result == null) {
			throw new BookException(BookException.BookExceptionType.NOT_FOUND, isbn);
		}
		int stock = storeService.getStock("books", isbn);
		result.setAvailable(stock > 0);
		return result;
	}

	@Override
	public Book updateBook(Book bookDetailValue) throws BookException {

		if (bookDetailValue.getPrice() <= 0) {
			throw new BookException(BookException.BookExceptionType.CONSTRAINT, "price <= 0");
		}

		Book value = books.get(bookDetailValue.getIsbn());
		value.setTitle(bookDetailValue.getTitle());
		value.setPrice(bookDetailValue.getPrice());
		value.setAvailable(bookDetailValue.isAvailable());
		return value;
	}

	@Override
	public void deleteBookByIsbn(String isbn) throws BookException {
		Object result = books.remove(isbn);
		if (result == null) {
			throw new BookException(BookException.BookExceptionType.NOT_DELETED, isbn);
		}
	}

	@Override
	public Collection<Book> findAllBooks() {
		return (Collection<Book>) new ArrayList<Book>(books.values());
	}
}
