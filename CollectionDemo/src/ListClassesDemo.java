import java.util.ArrayList;
import java.util.Collections;


public class ListClassesDemo {
	public static void arrayListClassWork(){
		ArrayList<String> name=new ArrayList<>();
		name.add("Chavo");
		name.add("Eddie");
		name.add("Panku");
		name.add("Ricky");
		
		
		//searching
		System.out.println(name.contains("Panku"));
		System.out.println(name.indexOf("Eddie"));
		
		//sorting
		Collections.sort(name);
		System.out.println(name);
		
		//iteration
		for (String str : name) {
			System.out.println(str);
		}
	}
}
