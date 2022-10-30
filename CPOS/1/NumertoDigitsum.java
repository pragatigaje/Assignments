import java.util.Scanner;

class NumbertoDigitsum{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int a = sc.nextInt();
	int d1, d2, d3, d4, sum=0;
	d1= a%10;
	a= a/10;
	d2= a%10;
	a= a/10;
	d3= a%10;
	a= a/10;
	d4= a%10;
	
	sum = d1+d2+d3+d4;
	System.out.println("The sum of number is "+sum);
}
}