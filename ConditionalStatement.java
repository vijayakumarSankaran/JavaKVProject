package kalaiautomationdeveloper;

public class ConditionalStatement {

	public static void main(String[] args) {
//		int a= 10;
//		int b= 20;
//		int c= 30;
//		if(a>b) {
//		    System.out.println("apple");	   
//		}
//		else if(a>c) {
//			System.out.println("banana");
//		}
//		else if(b>c) {
//		    System.out.println("cat");	
//		}
//		else if(c>b || c<a) {
//		    System.out.println("dog");	
//		}
//		
//		else {
//			System.out.println("false");
//		}
//	multiple condition checked to switch
		
		int age = 18;
		switch (age) {
		case 1:
			System.out.println("ur not elig to vote");
		break;
		case 17:
			System.out.println("ur not elig to vote");
		break;
		case 18:
			System.out.println("ur elig to vote");
		break;
		default:
			System.out.println("server error");
		}
		
			
		String bank = "axis";
		switch (bank) {
		case "axis":
			System.out.println("amount debited from axis");
		break;
		case "hdfc":
			System.out.println("amount debited from hdfc");
		break;
		case "idfc":
			System.out.println("amount debited from idfc");
		break;
		default:
			System.out.println("cash on delivery");	
				
		}
		
	}
}
