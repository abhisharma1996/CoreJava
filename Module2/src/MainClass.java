import com.cg.person.exceptions.FirstNameNullException;
import com.cg.person.exceptions.LastNameNullException;

public class MainClass {
	public static void main(String[] args)  {
		PersonClass obj=null;
		try {
			obj = new PersonClass("Divya", "", Gender.M);
		} catch (FirstNameNullException e) {
			
			e.printStackTrace();
		} catch (LastNameNullException e) {
			
			e.printStackTrace();
		}
		finally{
//	    obj.setPhno(obj.phoneEntry());
//	    obj.display();
			System.out.println("hello");
		}
}

}
