package org.javacream.books.warehouse.impl.decorators;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang3.SerializationUtils;
import org.javacream.books.warehouse.api.Book;
import org.javacream.books.warehouse.api.BookException;
import org.javacream.books.warehouse.impl.MapBooksService;

public class SerializingMapBooksService extends MapBooksService {

	@Override
	public Book findBookByIsbn(String isbn) throws BookException {
		Book book = super.findBookByIsbn(isbn);
		return SerializationUtils.clone(book);
	}

	@Override
	public Book updateBook(Book bookDetailValue) throws BookException {
		Book toUpdate = SerializationUtils.clone(bookDetailValue);
		Book updated = super.updateBook(toUpdate);
		return SerializationUtils.clone(updated);
	}

	@Override
	public Collection<Book> findAllBooks() {
		ArrayList<Book> result = new ArrayList<>(super.findAllBooks());
		return SerializationUtils.clone(result);
	}

}
