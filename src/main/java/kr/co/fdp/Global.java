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
	
	private static HashMap<String, Object> container = new HashMap<String, Object>();
	
	static {
		Properties properties = new Properties();
		try (InputStream is = new FileInputStream((String) System.getenv(Global.getSystemEnvName()))) {
			properties.load(is);
			properties.entrySet().forEach(prop -> {
				container.put(prop.getKey().toString(), prop.getValue());
				System.out.println("[Global] " + prop.getKey() + " :: " + prop.getValue());
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Global Properties Initilizing Failed");
		}
	}
	public static String getSystemEnvName() {
		return "FDP_PROPERTIES";
	}
	public static int size() {
		return container.size();
	}
	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		return container.isEmpty();
	}
	public static Object get(Object key) {
		return container.get(key);
	}
	public static boolean containsKey(Object key) {
		return container.containsKey(key);
	}
	public static Object put(String key, Object value) {
		return container.put(key, value);
	}
	public static void putAll(Map<? extends String, ? extends Object> m) {
		container.putAll(m);
	}
	public static Object remove(Object key) {
		return container.remove(key);
	}
	public static void clear() {
		container.clear();
	}
	public static boolean containsValue(Object value) {
		return container.containsValue(value);
	}
	public static Set<String> keySet() {
		return container.keySet();
	}
	public static Collection<Object> values() {
		return container.values();
	}
	public static Set<Entry<String, Object>> entrySet() {
		return container.entrySet();
	}
	public static Object getOrDefault(Object key, Object defaultValue) {
		return container.getOrDefault(key, defaultValue);
	}
	public static Object putIfAbsent(String key, Object value) {
		return container.putIfAbsent(key, value);
	}
	public static boolean remove(Object key, Object value) {
		return container.remove(key, value);
	}
	public static boolean replace(String key, Object oldValue, Object newValue) {
		return container.replace(key, oldValue, newValue);
	}
	public static Object replace(String key, Object value) {
		return container.replace(key, value);
	}
	public static Object computeIfAbsent(String key, Function<? super String, ? extends Object> mappingFunction) {
		return container.computeIfAbsent(key, mappingFunction);
	}
	public static Object computeIfPresent(String key,
			BiFunction<? super String, ? super Object, ? extends Object> remappingFunction) {
		return container.computeIfPresent(key, remappingFunction);
	}
	public static Object compute(String key, BiFunction<? super String, ? super Object, ? extends Object> remappingFunction) {
		return container.compute(key, remappingFunction);
	}
	public static Object merge(String key, Object value,
			BiFunction<? super Object, ? super Object, ? extends Object> remappingFunction) {
		return container.merge(key, value, remappingFunction);
	}
	public static void forEach(BiConsumer<? super String, ? super Object> action) {
		container.forEach(action);
	}
	public static void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> function) {
		container.replaceAll(function);
	}
	public Object clone() {
		return container.clone();
	}
	
}
