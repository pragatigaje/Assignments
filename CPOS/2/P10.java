class P10{
	public static void main(String [] args){
	
	char e=70;
	int c=0;
	for (int i=0; i<5; i++)
	{
		for (int j=4; j>i; j--)
		{
			System.out.print("*");
		}
		
		for (int k=1; k>=i; k++)
		{
			System.out.print((char) (e-c)+" ");

		}
			
		System.out.println();
	
		
	}
	}
	
}
