package org.javacream.store.impl;

import java.util.Map;

import org.javacream.store.api.StoreService;
import org.javacream.util.notification.NotificationBus;

public class SimpleStoreService implements StoreService {
	private int stock;

	public void setNotificationBus(NotificationBus notificationBus) {
		notificationBus.subscribe("book.deleted", this::bookDeleted);
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public int getStock(String category, String id) {
		// retrieve stock from external service, e.g. web service call...
		return stock;
	}

	public void bookDeleted(Map<String, Object> payload) {
		System.out.println("Detected Book Deletion for " + payload);
	}
}
