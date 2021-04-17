package serializer;

import java.lang.reflect.Type;

public interface SerializeStrategy {
	public <T> String serialize(T object); 
	public <T> String serialize(T object, Type classType); 
	public <T> T  deserialize(String content, Class<T> classType);
}