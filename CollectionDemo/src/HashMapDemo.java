import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class HashMapDemo {
	public static void Hash(){
	HashMap<Integer, Associate> associates=new HashMap<>();
    associates.put(111, new Associate(111, 16758, "Dravid"));
    associates.put(112, new Associate(102, 1671, "Rahul"));
    associates.put(113, new Associate(106, 16751, "Dra"));
    
    
    TreeMap<Integer, Associate> t=new TreeMap<>();
    t.putAll(associates);
    for (Map.Entry e:t.entrySet()){
    	System.out.println(e.getValue());
    }
    
    System.out.println(t);
    
    
 }
}