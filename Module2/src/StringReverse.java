import java.util.ArrayList;
import java.util.Collections;


public class StringReverse {
	
	public static void main(String[] args) {
		int a[]={12,23,96,45};
		reverse(a);
		
	
	}
	
public static Object reverse(int a[]){
		
	ArrayList<StringBuilder>list=new ArrayList<>();
	for (int i = 0; i < a.length; i++) {
		list.add(new StringBuilder(Integer.toString(a[i])));
	}
	for (int i = 0; i < list.size(); i++) {
		list.set(i, list.get(i).reverse());
	}
	ArrayList<String> str=new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
		str.add(new String(list.get(i)));
		}
		Collections.sort(str);
	
		Object b[]=str.toArray();
		for (int i = 0; i < b.length; i++) 
			System.out.println(b[i]);
			return b;
	}
}

