package org.javacream.util.notification;

import java.io.Serializable;
import java.util.Map;

public class Action implements Serializable{

	private static final long serialVersionUID = 1L;

	private String type;
	private Map<String, Object> payload;
	@Override
	public String toString() {
		return "Action [type=" + type + ", payload=" + payload + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((payload == null) ? 0 : payload.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Action other = (Action) obj;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	public String getType() {
		return type;
	}
	public Map<String, Object> getPayload() {
		return payload;
	}
	public Action(String type, Map<String, Object> payload) {
		super();
		this.type = type;
		this.payload = payload;
	}
}
