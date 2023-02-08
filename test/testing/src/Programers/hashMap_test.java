package Programers;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

public class hashMap_test {

	public hashMap_test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//
		HashMap<Integer, Integer> hm= new HashMap<>();
		
		for (int i = 1; i<10; i++) {
			hm.put(i, i*10);
		}
		for (int i = 1; i<10; i++) {
			System.out.println(hm.get(i));
			hm.put(i,(Integer)(hm.get(i))*2);
		}
		for (int i= 1;i<10;i++) {
			System.out.println(hm.get(i));
		}
		HashMap<Integer, Integer> change= new HashMap<>();
		for (int key : hm.keySet()) {
			change.put(hm.get(key), key);
		}
		System.out.println(change.toString());
	}
}
