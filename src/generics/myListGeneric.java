package generics;

import java.util.List;

public class myListGeneric<T> {
	
	private List<T> values;
	
	void add(T value) {
		values.add(value);
	}
	
	void remove(T value) {
		values.remove(value);
		
	}
	
	T get(int index) {
		return values.get(index);
	}

	public static void main(String[] args) {
		myListGeneric<String> myListString= new myListGeneric<String>();
		
		myListString.add("value 1");
		
		myListString.add("value 2");
		
		myListGeneric<Integer> myListInteger= new myListGeneric<Integer>();
		
		myListInteger.add(1);
		myListInteger.add(2);

		

	}

}
