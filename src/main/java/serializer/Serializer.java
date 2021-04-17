package serializer;
import java.lang.reflect.Type;

public abstract class Serializer {
	
	public String toJSON() {
		return new SerializeJson().serialize(this);
	}
	
	public static <T> T jsonToObject(String content, Class<T> classType) {
		return new SerializeJson().deserialize(content, classType);
	}
	
	public static <T> String toJSON(T object, Type classType) {
		return new SerializeJson().serialize(object, classType);
	}
}
