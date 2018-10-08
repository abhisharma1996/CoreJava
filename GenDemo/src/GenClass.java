
public class GenClass<T> {

	 T ref1,ref2;

	public GenClass(T ref1, T ref2) {
		super();
		this.ref1 = ref1;
		this.ref2 = ref2;
	}

	public T getRef1() {
		return ref1;
	}

	public void setRef1(T ref1) {
		this.ref1 = ref1;
	}

	public T getRef2() {
		return ref2;
	}

	public void setRef2(T ref2) {
		this.ref2 = ref2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	
}
