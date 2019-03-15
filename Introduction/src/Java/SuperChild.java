package Java;

public class SuperChild extends SuperParent {

	String Name = "Wyde";

	public SuperChild() {
		super(); // Always Super constructor should be in the 1st line in the definition of child
					// constructor
		System.out.println("Child Constructor is invoked");
	}

	public void GetStringData() {
		System.out.println(Name);
		System.out.println(super.Name);
	}

	public void GetData() {
		super.GetData();
		System.out.println("Fetching data from Super Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild sc = new SuperChild();
		sc.GetData();
		sc.GetStringData();
	}

}
