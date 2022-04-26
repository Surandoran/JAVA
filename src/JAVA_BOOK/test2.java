package JAVA_BOOK;

import java.util.*;

public class test2{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		Map<String, Integer> fruits = new HashMap<>();
		fruits.put("apple", sc.nextInt());
		fruits.put("banana", 2);
		fruits.put("kiwi", 3);
		System.out.println("fruits: " + fruits);
		System.out.println("is empty? " + fruits.isEmpty());

		fruits.clear();
		System.out.println("fruits: " + fruits);
		System.out.println("is empty? " + fruits.isEmpty());

// fruits: {banana=2, apple=1, kiwi=3}
// is empty? false
// fruits: {}
// is empty? true
	}

}
