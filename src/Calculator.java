import java.util.Scanner;
public class Calculator{
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,selection;
		//capturing user entered values
		System.out.println("please enter any two digits:");
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println("enter your selection and press enter:");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		//capturing user selection
		selection=scan.nextInt();
		while(selection>4) {
			System.out.println("please enter the correct selection:");
			selection=scan.nextInt();
		}
		
		Calculator argha =new Calculator();
		if(selection==1) {
			c=argha.add(a,b);
			System.out.println("your answer is "+c);
		}else if(selection==2) {
			c=argha.sub(a,b);
			System.out.println("your answer is "+c);
		}else if(selection==3) {
			c=argha.mul(a,b);
			System.out.println("your answer is "+c);
		}else if(selection==4) {
			c=argha.div(a,b);
			System.out.println("your answer is "+c);
		}
		 
	}	
		
		
	

	public static int add(int x, int y) {
		int z;
		z=x+y;
		return z;
	}
	public int sub(int x, int y) {
		int z;
		z=x-y;
		return z;
	}
	public int mul(int x, int y) {
		int z;
		z=x*y;
		return z;
	}
	public int div(int x, int y) {
		int z;
		z=x/y;
		return z;
	}
}