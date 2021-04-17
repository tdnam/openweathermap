package serializer;

import java.lang.reflect.Type;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SerializeJson implements SerializeStrategy {

	private Gson gson;

	public SerializeJson() {
		this.gson = new GsonBuilder().setPrettyPrinting().create();
	}

	public SerializeJson(ExclusionStrategy exclusionStrategy) {
		this.gson = new GsonBuilder().setExclusionStrategies(exclusionStrategy).setPrettyPrinting().create();
	}

	public <T> String serialize(T object) {
		return gson.toJson(object);
	}

	public <T> T deserialize(String content, Class<T> classType) {
		return gson.fromJson(content, classType);
	}

	public <T> String serialize(T object, Type classType) {
		return gson.toJson(object, classType);
	}
}
