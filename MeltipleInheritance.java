package oops;

public class MeltipleInheritance implements InterfaceOne,InterfaceTwo{

	public static void main(String[] args) {
		MeltipleInheritance obj = new MeltipleInheritance ();
		obj.addition();
		obj.subtraction();
		
	}

	@Override
	public void subtraction() {
     System.out.println("subtraction method");

		
	}

	@Override
	public void addition() {

		System.out.println("addition method");
		
	}

}
