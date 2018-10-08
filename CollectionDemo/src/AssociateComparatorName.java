import java.util.Comparator;


public class AssociateComparatorName implements Comparator<Associate> {

	@Override
	public int compare(Associate o, Associate p) {
		return o.getSalary()-p.getSalary();
	}
	

}
