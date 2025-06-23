package oops;

public class IneritanceOne extends  IneritanceThree{

	public static void main(String[] args) {
		IneritanceOne obj = new IneritanceOne();
		obj.addition();
		obj.subtraction();
		obj.name();
		obj.multiple();
		
     
	}
     public void multiple () {
    	 System.out.println(" This class from child");
     }
}
