import java.util.Scanner;

class swap{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Before Swap : a= "+a+" b= "+b);
	a= a+b;
	b= a-b;
	a= a-b;
	System.out.println("After Swap : a= "+a+" b= "+b);
}
}