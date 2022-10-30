import java.util.Scanner;

class NumbertoDigit{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int a = sc.nextInt();
	int d1, d2, d3, d4;
	d1= a%10;
	a= a/10;
	d2= a%10;
	a= a/10;
	d3= a%10;
	a= a/10;
	d4= a%10;
		
	System.out.println("Digits are "+d1+" "+d2+" "+d3+" "+d4);
}
}