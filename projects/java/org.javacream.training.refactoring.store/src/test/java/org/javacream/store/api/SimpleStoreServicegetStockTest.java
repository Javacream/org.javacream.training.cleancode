package org.javacream.store.api;

import org.javacream.store.impl.SimpleStoreService;
import org.junit.Before;
import org.junit.Test;

public class SimpleStoreServicegetStockTest {
	private StoreService storeService;

	@Before
	public void init() {
		storeService = new SimpleStoreService();
	}

	@Test
	public void testStoreService() {
		storeService.getStock("book", "id");
	}
}
