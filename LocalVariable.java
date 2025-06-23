package kalaiautomationdeveloper;

public class LocalVariable {
     
	int a= 5;
	int b= 5;
	int c;
	static int d = 2;
	
	
	public static void main(String[] args) {
		LocalVariable obj = new LocalVariable();
		obj.addition();
		obj.multiple();
	
	}
    public void addition( ) {
     c = a+b;
    System.out.println(c);
    c=c+4;
    System.out.println(c);
    c=c*4;
    System.out.println(c);
    System.out.println(d);
    
    }
    public void multiple() {
    c = a*b;
    System.out.println(c);
        
    }
}




