package oops;

public class AbstractMain  extends AbstractClass {

	public static void main(String[] args) {
		AbstractMain obj = new AbstractMain();
		obj.engineRepair();
		obj.mirrorAdjustment();
	}

	@Override
	public void engineRepair() {
		System.out.println(" engine repair from child");
		
	}

}
