package collection;

import java.util.ArrayList;
import java.util.Iterator;

//Wap to read all elements in arraylist by using an iterator.
public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("pune");
		al.add("ytl");
		al.add("amt");
		al.add("mumbai");
		
		Iterator<String> itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
}
