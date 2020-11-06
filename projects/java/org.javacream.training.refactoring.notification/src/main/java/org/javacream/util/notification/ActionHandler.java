package org.javacream.util.notification;

import java.util.Map;

@FunctionalInterface
public interface ActionHandler {

	public void handleAction(Map<String, Object> payload);
}
