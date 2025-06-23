package kalaiautomationdeveloper;

public class Variable {

	public static void main(String[] args) {
		int a = 2147483647;
		System.out.println(a);
		
        float b = 2147483648.12f;
        System.out.println(b);
        
        float c = 1.2f;
        System.out.println(c);
        
        double d = 7540000000.1;
        System.out.println(d);
        
        double e = 4.1;
        System.out.println(e);
        
        char f = 'a';
        System.out.println(f);
        
        String g = "12";
        System.out.println(g);
        
        boolean h = true;
        System.out.println(h);
        boolean k = false;
        
        
        int i = 10;
       final  int j = 12;
        
        if (i>j) {
        	System.out.println(h);
        }
        else {
        	System.out.println(k);
        	
        }
            System.out.println(i); 
            System.out.println(j); 
    //        j=j+5; not passible bez  j value final
            i=i+10;      
        
	}

}
