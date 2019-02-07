package collection;

import java.util.ArrayList;

//program for display arraylist and its operation

public class Arraylist2 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("java");
		al.add("php");
		al.add("python");
		al.add("vb.net");
		System.out.println(al);
		
		System.out.println("Element at index 1" +al.get(1));
		System.out.println(al.contains("java"));
		al.add(2,"play");
        System.out.println(al);	
        System.out.println(al.isEmpty());
        System.out.println(al.indexOf("vb.net"));
        System.out.println("size of the arraylist is" +al.size());
	}
}
