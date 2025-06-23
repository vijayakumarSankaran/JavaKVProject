package oops;

public class PolymorphismOverloading {

	public static void main(String[] args) {
		PolymorphismOverloading obj = new PolymorphismOverloading();
		obj.addition("String1");
		

	}
    public void addition() {
    	System.out.println("addition without parameter");
    	
    }
    public void addition( int a) {
    	System.out.println("addtition with 1 int "+ a);
    }
    public void addition(int a,int b) {
    	System.out.println("addtition with 2 int "+ a +b);
    }
    public void addition(String a) {
    	System.out.println("addtition with 1string "+ a);
    }
    public void addition(String a,int b) {
    	System.out.println("addtition with 1string 1int "+ a + b);
    }
}
