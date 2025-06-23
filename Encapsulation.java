package oops;

public class Encapsulation {
	private String name;
	private int age;
	
//	public Encapsulation (String name, int age){
//		this.name = name;
//		this.age = age;
//	}
	
	public void  setName (String name ) {
	this.name = name;	
	}
	
	public void setAge (int age) {
		this.age = age;	
    }
	
	public String getName () {
		return name;	
		}
	
	public int getAge () {
		return age;	
		}
	
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("vijay");
	    obj.setAge(15);
		System.out.println(obj.getName());
	    System.out.println(obj.getAge());
	 //   Encapsulation obj1 = new Encapsulation("vijay", 15);
	    
//	    System.out.println(obj1.getName());
//	    System.out.println(obj1.getAge());
	    
	}

}
