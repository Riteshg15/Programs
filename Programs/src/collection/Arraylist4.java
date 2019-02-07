package collection;

import java.util.ArrayList;
import java.util.List;

//ArrayList containsAll list elements or not.
public class Arraylist4 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("random");
		//System.out.println("Actual arraylist"+al);
		
		List<String> list=new ArrayList<>();
		list.add("second");
		list.add("random");
		System.out.println("Arraylist containsAll list elements:"+al.containsAll(list));
		list.add("one");
		System.out.println("Arraylist containsAll list elements :"+al.containsAll(list));
		
	}
}
