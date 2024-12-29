package myy02.generic_interface;

public class CustomPair<K,V> implements Pair<K,V>{
	private K key;
	private V value;
	public CustomPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}

}
