class Py2{
	public static void main(String [] args){
	
	
	for (int i=0; i<=9; i++)
	{
		for (int j=8; j>=i; j--)
		{
			System.out.print(" ");
		}
		for (int k=1; k<=i; k++)
		{
			System.out.print(k+" ");
		}
		System.out.println();
	}
		System.out.println("------------------");
	}
	
}