package kalaiautomationdeveloper;

public class JavaBasics {

	public static void main(String[] args) {
		System.out.println("hello");
		// Object creation
		JavaBasics obj = new JavaBasics();  // new keyword (Allocate the memory)
		obj.addition();
//		obj.subtraction();
//		obj.multiple();   // Call by Reference
//		obj.division(15, 3);  // Call by Value
	}
	public void addition() {  // Method without arguments or parameters
		int a = 10;  // 2 bytes
		int b = 20;
		int c = a+b;
		System.out.println("add "+c);
	}
	
//	public void subtraction() {
//		int a = 50;
//		int b = 20;
//		int c = a-b;
//		System.out.println("sub "+c);
//	}
//	public void multiple() {
//		int a = 50;
//		int b = 2;
//		int c = a*b;
//		System.out.println("Mul "+c);
//	}	
//	
//	public void division(int a, int b) {  // Method with arguments or parameters
//		int c = a/b;
//		System.out.println("Div "+c);
//	}	
//	
	
}
