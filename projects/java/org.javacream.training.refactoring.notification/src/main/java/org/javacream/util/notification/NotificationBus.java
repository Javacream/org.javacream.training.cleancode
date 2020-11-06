package org.javacream.util.notification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NotificationBus {
	private static final Set<ActionHandler> DEFAULT = new HashSet<>();
	private Map<String, Set<ActionHandler>> subscriptions = new HashMap<>();
	
	public void publish(Action action) {
		subscriptions.getOrDefault(action.getType(), DEFAULT).forEach(actionHandler -> actionHandler.handleAction(action.getPayload()));
	}

	public void subscribe(String actionType, ActionHandler actionHandler) {
		Set<ActionHandler> handlers = subscriptions.getOrDefault(actionType, new HashSet<ActionHandler>());
		subscriptions.put(actionType, handlers);
		handlers.add(actionHandler);
	}

}
