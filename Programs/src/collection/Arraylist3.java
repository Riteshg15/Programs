package collection;

import java.util.ArrayList;
import java.util.List;

//program for to add all elements of a list to arraylist

public class Arraylist3 {
	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("first");
	al.add("second");
	al.add("third");
	al.add("fourth");
	System.out.println("Actual arraylist"+al);
	
	List<String> list=new ArrayList<>();
	list.add("one");
	list.add("two");
	
	al.addAll(list);
	System.out.println("\n After copy Arraylist:" +al);
	
	}
}
