package oops;

public class PolymorphismOverriding extends PolymorphismParent {
	
	public static void main(String[] args) {
		PolymorphismOverriding obj = new PolymorphismOverriding();
		obj.car();
	}
	
	public void car() {
        System.out.println("Mercedes");
    }
	
	
}
	

