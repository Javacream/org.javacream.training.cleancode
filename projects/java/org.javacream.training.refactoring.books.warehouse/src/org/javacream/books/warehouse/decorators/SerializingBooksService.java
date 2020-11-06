package org.javacream.books.warehouse.decorators;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang3.SerializationUtils;
import org.javacream.books.warehouse.api.Book;
import org.javacream.books.warehouse.api.BookException;

public class SerializingBooksService  extends BaseBooksService{

	@Override
	public Book findBookByIsbn(String isbn) throws BookException {
		Book book = delegate.findBookByIsbn(isbn);
		return SerializationUtils.clone(book);
	}

	@Override
	public Book updateBook(Book bookDetailValue) throws BookException {
		Book toUpdate = SerializationUtils.clone(bookDetailValue);
		Book updated = delegate.updateBook(toUpdate);
		return SerializationUtils.clone(updated);
	}

	@Override
	public Collection<Book> findAllBooks() {
		ArrayList<Book> result = new ArrayList<>(delegate.findAllBooks());
		return SerializationUtils.clone(result);
	}

	
}
