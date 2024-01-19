package statickeyword;
public class StaticBlockExample {
	public static void main(String[] args) {		
		System.out.println("I Am in Main Method");
	}
	static {
		System.out.println("I am in Static Block-1");
	}
	static {
		System.out.println("I am in Static Block-2");
	}
}
