package org.javacream.books.warehouse.decorators;

import java.util.HashMap;
import java.util.Map;

import org.javacream.books.warehouse.api.BookException;
import org.javacream.util.notification.Action;
import org.javacream.util.notification.NotificationBus;

public class NotifyingBooksService  extends BaseBooksService{

	private NotificationBus notificationBus;

	public void setNotificationBus(NotificationBus notificationBus) {
		this.notificationBus = notificationBus;
	}

	@Override
	public void deleteBookByIsbn(String isbn) throws BookException {
		super.deleteBookByIsbn(isbn);
		Map<String, Object> payload = new HashMap<>();
		payload.put("isbn", isbn);
		notificationBus.publish(new Action("book.deleted", payload));
	}
	
}
