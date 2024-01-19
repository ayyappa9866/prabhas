package statickeyword;
public class StaticVariableExample {
	public static String name;
	public static int rollNo = input();
	static {
		System.out.println("I am in Static Block");
		name = "Prabhas";
	}
	public static void main(String[] args) {
		System.out.println("I am in Main Method");
		System.out.println("Id is : "+rollNo);
		System.out.println("Name is :"+name);
	}
	private static int input() {	
		System.out.println("I am in Static Method");
		return 1;
	}

}
