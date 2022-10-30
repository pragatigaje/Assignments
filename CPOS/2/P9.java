class P9{
	public static void main(String [] args){
	
	char a=65;
	
	for (int i=0; i<5; i++)
	{
		for (int j=4; j>=i; j--)
		{
			System.out.print(" ");
		}
		
		for (int k=0; k<=i; k++)
		{
			System.out.print((char) (a+k)+" ");
			
		}
			
		System.out.println();
		
	}
	}
	
}