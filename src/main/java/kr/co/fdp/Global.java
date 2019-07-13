package kr.co.fdp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Global {
	
	private HashMap<String, Object> container = new HashMap<String, Object>();
	
	public static void init() {
		Properties properties = new Properties();
		
		try (InputStream is = new FileInputStream("/C:/system.properties")) {
			properties.load(is);
			properties.entrySet().forEach(prop -> {
				System.out.println("[Global] " + prop.getKey() + " :: " + prop.getValue());
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Global Properties Initilizing Failed");
		}
		
	}
	
	public int size() {
		return container.size();
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return container.isEmpty();
	}
	public Object get(Object key) {
		return container.get(key);
	}
	public boolean containsKey(Object key) {
		return container.containsKey(key);
	}
	public Object put(String key, Object value) {
		return container.put(key, value);
	}
	public void putAll(Map<? extends String, ? extends Object> m) {
		container.putAll(m);
	}
	public Object remove(Object key) {
		return container.remove(key);
	}
	public void clear() {
		container.clear();
	}
	public boolean containsValue(Object value) {
		return container.containsValue(value);
	}
	public Set<String> keySet() {
		return container.keySet();
	}
	public Collection<Object> values() {
		return container.values();
	}
	public Set<Entry<String, Object>> entrySet() {
		return container.entrySet();
	}
	public Object getOrDefault(Object key, Object defaultValue) {
		return container.getOrDefault(key, defaultValue);
	}
	public Object putIfAbsent(String key, Object value) {
		return container.putIfAbsent(key, value);
	}
	public boolean remove(Object key, Object value) {
		return container.remove(key, value);
	}
	public boolean replace(String key, Object oldValue, Object newValue) {
		return container.replace(key, oldValue, newValue);
	}
	public Object replace(String key, Object value) {
		return container.replace(key, value);
	}
	public Object computeIfAbsent(String key, Function<? super String, ? extends Object> mappingFunction) {
		return container.computeIfAbsent(key, mappingFunction);
	}
	public Object computeIfPresent(String key,
			BiFunction<? super String, ? super Object, ? extends Object> remappingFunction) {
		return container.computeIfPresent(key, remappingFunction);
	}
	public Object compute(String key, BiFunction<? super String, ? super Object, ? extends Object> remappingFunction) {
		return container.compute(key, remappingFunction);
	}
	public Object merge(String key, Object value,
			BiFunction<? super Object, ? super Object, ? extends Object> remappingFunction) {
		return container.merge(key, value, remappingFunction);
	}
	public void forEach(BiConsumer<? super String, ? super Object> action) {
		container.forEach(action);
	}
	public void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> function) {
		container.replaceAll(function);
	}
	public Object clone() {
		return container.clone();
	}
	
}
